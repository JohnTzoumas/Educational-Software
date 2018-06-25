package com.atl.edusoftware.web.controller

import com.atl.edusoftware.business.Implementation.QuizServiceImpl
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping

import javax.servlet.http.HttpServletRequest

@Controller
@RequestMapping(value = "/test")
class TestController {

    @Autowired
    private QuizServiceImpl quizService

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
