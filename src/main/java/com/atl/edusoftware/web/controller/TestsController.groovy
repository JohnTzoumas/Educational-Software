package com.atl.edusoftware.web.controller

import com.atl.edusoftware.business.Implementation.TestsServiceImpl
import com.atl.edusoftware.commons.Maps
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.servlet.ModelAndView

@Controller
@RequestMapping(value = "/tests")
class TestsController {

    @Autowired
    TestsServiceImpl testsService

    @GetMapping
    String Tests() {
        return "tests"
    }

    @GetMapping(value = "/chapter")
    ModelAndView getTestsById(@RequestParam("chapterId") int chapterId) {
        ModelAndView modelAndView = new ModelAndView()
        modelAndView.setViewName("quiz")
        modelAndView.addObject('questions', testsService.getQuizByChapterId(chapterId))
        modelAndView.addObject('chapterName', Maps.CHAPTERS[chapterId])
        return modelAndView
    }

//    @Autowired
//    private QuizServiceImpl quizService

//    @GetMapping("/list")
//    String getTest(Model model){
//        def list = quizService.findAll()
//        model.addAttribute('questions',list)
//        return "testList"
//    }
//
//    @PostMapping("/list")
//    String getResults(HttpServletRequest request){
//        def count = 0
//        request.getParameterMap().each {k ->  if(k.value[0] == "true"){
//            count++
//            print count} }
//        return "testList"
//    }
}
