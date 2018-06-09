package com.atl.edusoftware.web

import com.atl.edusoftware.business.TestService
import com.atl.edusoftware.data.entity.Question
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.ModelMap
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.servlet.ModelAndView

import javax.servlet.http.HttpServletRequest

@Controller
@RequestMapping(value = "/test")
class TestController {

    @Autowired
    private TestService testService

    @GetMapping("/list")
    String getTest(Model model){
        def list = testService.getQuestionByChapter()
        model.addAttribute('questions',list)
        return "testList"
    }
}
