package com.mycompany.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class ApiController {

    @GetMapping("/api/hello")
    public Response hello() {
        //return "Hello World REST API. The current time is: " + new Date();
        return new Response("Hello World Rest API");
    }

}
