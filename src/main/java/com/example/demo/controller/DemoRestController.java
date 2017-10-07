package com.example.demo.controller;

import com.example.demo.domain.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api",
        produces = MediaType.APPLICATION_JSON_VALUE)
public class DemoRestController {
    private static final Logger LOG = LoggerFactory.getLogger(DemoRestController.class);

    @RequestMapping(value = "/breadcrumb", method = RequestMethod.GET)
    public Response getBreadcrumb() {
        return new Response("Home > Settings > Preferences");
    }

    @RequestMapping(value = "/breadcrumb-string", method = RequestMethod.GET)
    public String getBreadcrumbString() {
        return "Home > Settings > Preferences";
    }

    @GetMapping("/curly")
    public Response getCurly() {
        return new Response("{setting.name}");
    }

    @GetMapping("/multi-curly")
    public Response getMultiCurly() {
        return new Response("Welcome {{{user}}}");
    }

    @GetMapping("/multi-square")
    public Response getMultiSquare() {
        return new Response("Welcome [[{user}]]");
    }
}
