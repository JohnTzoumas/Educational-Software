package com.atl.edusoftware.business.services

import com.atl.edusoftware.commons.Maps
import com.atl.edusoftware.data.model.Logs
import com.atl.edusoftware.data.repository.LogsRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class LogsService {

    @Autowired
    LogsRepository logsRepository

    void insertOrUpdateOnLogs(Logs log) {
        /**
         * If there is a previous log with same chapter and user id,
         * Pass the log id to our new log and save(update) the old log.
         * Else save(insert) a new log for this user and chapter.
         * **/
        if (logsRepository.findByUserIdAndChapterId(log.userId, log.chapterId)) {
            log.Id = logsRepository.findByUserIdAndChapterId(log.userId, log.chapterId).id
        }
        logsRepository.save(log)
    }

    /**
     * We check three cases.
     * 1.Below 50%.
     * 2.Below average score for the chapter.
     * 3.Above average score for the chapter.
     * **/
    String compareResults(int chapterId, double result) {
        Double totalAveragePerChapter = logsRepository?.findTotalAveragePerChapter(chapterId)
        String message = ""
        def chapterName = Maps.CHAPTERS[chapterId]

        if (result < 50) {
            message += "You definetely need to study the theory of $chapterName ."
        } else if (result < 75) {
            message += "You still have some fields that can be improved by checking the theory of $chapterName !"
        } else {
            message += "Great Job!!You are close to a perfect score !"
        }

        if (result < totalAveragePerChapter && totalAveragePerChapter) {
            message += "You score less than the other participants!"
        } else if (totalAveragePerChapter) {
            message += "You score more than the average user keep up the good work !"
        }
        return message
    }

}
