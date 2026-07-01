package com.example.demo.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController public class MruhController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello MRUH Student!";
    }
    @GetMapping("/trainer")
        public String trainer() {
            return "Java fill stack Training";
        }

    
}


    



