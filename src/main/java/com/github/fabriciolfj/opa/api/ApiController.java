package com.github.fabriciolfj.opa.api;

import com.github.fabriciolfj.opa.core.LogMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class ApiController {

    @LogMethod
    @GetMapping
    public String hello() {
        return "Hello world";
    }

    @LogMethod
    @GetMapping("/{name}")
    public String params(@PathVariable("name") final String name) {
        return "Hello " + name;
    }
}
