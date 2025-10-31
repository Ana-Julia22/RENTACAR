package br.com.unipaulistana.rentacar.backend.presentation;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/helloService")
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
         return "Hello World!";
    }
}