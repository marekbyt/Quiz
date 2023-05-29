package com.example.mvcspringquiz.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.io.IOException;
import java.io.PrintWriter;

@Controller
public class ExerciseController {

    @RequestMapping(path = "/hello", method = RequestMethod.GET)
    public void sendHello(HttpServletRequest request, HttpServletResponse response) throws IOException {
        final String name = request.getParameter("name");
        final Integer  age = request.getParameter();
        response.setStatus(200);
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html");
        final PrintWriter writer = response.getWriter();
        writer.println("Hi " + name + ", you are " + age + " years old");

    }
}
