package com.atl.edusoftware.web.controller

import com.atl.edusoftware.business.services.EditService
import com.atl.edusoftware.web.TestRequest
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.servlet.ModelAndView

import javax.servlet.http.HttpServletRequest

@Controller
@RequestMapping(value = '/edit')
class EditController {

    @ModelAttribute("testRequest")
    TestRequest createPendingMerchantsRequest() {
        return new TestRequest()
    }

    @Autowired
    EditService editService

    @GetMapping(value = '/tests')
    String getEditTest() {
        return 'editTest'
    }

    @GetMapping(value = '/theory')
    String getEditTheory() {
        return 'editTheory'
    }

    @PostMapping(value = '/tests')
    ModelAndView addTest(
            @ModelAttribute("testRequest") TestRequest testRequest, Model model, HttpServletRequest request) {
        editService.addTest(testRequest)

        return 'dashboard'
    }

    @PostMapping(value = '/theory')
    String addTheory() {
        return 'dashboard'
    }

}
