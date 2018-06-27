package com.atl.edusoftware.web.controller

import com.atl.edusoftware.business.Implementation.UserServiceImpl
import com.atl.edusoftware.business.services.LogsService
import com.atl.edusoftware.business.services.TestsService
import com.atl.edusoftware.data.model.Logs
import com.atl.edusoftware.data.model.User
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.security.authentication.AnonymousAuthenticationToken
import org.springframework.security.core.Authentication
import org.springframework.security.core.context.SecurityContextHolder
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.servlet.ModelAndView

import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpSession

@Controller
@RequestMapping(value = "/dashboard")
class DashboardController {
    @Autowired
    private TestsService quizService

    @Autowired
    private UserServiceImpl userService

    @Autowired
    LogsService logsService

    @Autowired
    TestsService testsService

    @GetMapping
    String getDashboardView(HttpSession session) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication()
        if (!(auth instanceof AnonymousAuthenticationToken)) {
            UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal()
            User user = userService.findUserByEmail(userDetails.username)
            session.setAttribute('userId', user.id)
        }
        return "dashboard"
    }

    @PostMapping
    ModelAndView getResults(HttpServletRequest request, HttpSession session) {
        ModelAndView modelAndView = new ModelAndView()

        double result = testsService.getResults(request)
        int chapterId = session.getAttribute('chapterId') as int
        long userId = session.getAttribute('chapterId') as long
        String resultMessage = logsService.compareResults(chapterId, result)
        Logs log = ['chapterId': chapterId, 'studentStats': result, 'userId': userId]

        logsService.insertOrUpdateOnLogs(log)

        modelAndView.setViewName("dashboard")
        modelAndView.addObject('result', result)
        modelAndView.addObject('resultMessage', resultMessage)
        return modelAndView
    }

}
