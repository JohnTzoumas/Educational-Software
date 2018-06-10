package com.atl.edusoftware.web

import com.atl.edusoftware.business.services.QuizService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping


@Controller
@RequestMapping(value = "/test")
class TestController {

    @Autowired
    private QuizService quizService

    @GetMapping("/list")
    String getTest(Model model){
        def list = quizService.findAll()
        model.addAttribute('questions',list)
        return "testList"
    }
}
