package com.zhujun.learnspringboot;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
public class ParaController {

    @GetMapping("/noannotation")
    public User noAnnotation(User user) {
        return user;
    }

    @GetMapping("/requestparam")
    public User requestParam(@RequestParam String name, @RequestParam int age) {
        User user = new User();
        user.setName(name);
        user.setAge(age);
        return user;
    }

    @GetMapping("/pathvariable/{name}/{age}")
    public User pathVariable(@PathVariable String name, @PathVariable int age) {
        User user = new User();
        user.setName(name);
        user.setAge(age);
        return user;
    }

    @PostMapping("/requestbody")
    public User requestBody(@RequestBody @Valid User user) {
        return user;
    }
}
