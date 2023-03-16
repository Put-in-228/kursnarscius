package lt.kvk.i17.chursin_jevgenij.application.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello!";
    }

    @PostMapping("/send")
    public void postMethod() {
        return;
    }
}
