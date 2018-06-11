package com.atl.edusoftware.web

import com.atl.edusoftware.business.services.QuizService
import com.atl.edusoftware.data.entity.Answer
import com.atl.edusoftware.data.entity.Question
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.ResponseBody

import javax.servlet.http.HttpServletRequest


@Controller
@RequestMapping(value = "/quiz")
class QuizController {

    @Autowired
    private QuizService quizService

    @GetMapping("/list")
    String getChapterListView(){
        return "chapterList"
    }

    @PostMapping("/list")
    @ResponseBody
    String getResults(HttpServletRequest request){
        def count = 0
        request.getParameterMap().each {k ->  if(k.value[0] == "true"){
            count++} }
        return count
    }

    @GetMapping(value = "/get")
    String getQuizView(Model model,@RequestParam("chapterId") int chapterId){
        model.addAttribute('questions',quizService.getQuizByChapterId(chapterId))
        return "quiz"
    }
}
