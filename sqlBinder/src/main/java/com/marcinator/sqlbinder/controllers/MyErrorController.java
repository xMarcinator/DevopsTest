package com.marcinator.sqlbinder.controllers;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyErrorController implements ErrorController {
    @RequestMapping("/error")
    public @ResponseBody String handleError(HttpServletRequest request) {
        System.out.println("Error: " + request.getAttribute("javax.servlet.error.status_code"));
        //do something like logging
        return request.getAttribute(RequestDispatcher.FORWARD_REQUEST_URI).toString();
    }
}
