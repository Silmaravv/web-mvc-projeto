package br.senac.tads.dsw.web_mvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class WebMvcApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebMvcApplication.class, args);
    }


    @Controller
    static class HomeController {
        @GetMapping("/")
        public String home() {
            return "redirect:/dados";
        }
    }
}