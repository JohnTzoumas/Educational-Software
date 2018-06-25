package com.atl.edusoftware.web.controller

import com.atl.edusoftware.business.Implementation.QuizServiceImpl
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.*

import javax.servlet.http.HttpServletRequest

@Controller
@RequestMapping
class QuizController {

    @Autowired
    private QuizServiceImpl quizService

    @GetMapping("/dashboard")
    String getDashboardView() {
        return "dashboard"
    }

    @PostMapping("/list")
    @ResponseBody
    String getResults(HttpServletRequest request) {
        def count = 0
        request.getParameterMap().each { k ->
            if (k.value[0] == "true") {
                count++
            }
        }
        return count
    }

    @GetMapping(value = "/get")
    String getQuizView(Model model, @RequestParam("chapterId") int chapterId) {
        model.addAttribute('questions', quizService.getQuizByChapterId(chapterId))
        return "quiz"
    }
}
