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

import javax.servlet.http.HttpServletRequest


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

    @PostMapping("/list")
    String getResults(HttpServletRequest request){
        def count = 0
        request.getParameterMap().each {k ->  if(k.value[0] == "true"){
            count++
            print count} }
        return "testList"
    }
}
