package com.baeldung.spring.cloud.springcloudcontractproducer.controller;


import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.Min;
import java.util.Optional;

@RestController
@Validated
public class EvenOddController {

    @GetMapping("/validate/prime-number")
    public String isNumberPrime(@RequestParam(required = false, name = "number") Optional<@Min(1) Integer> number) {
        return number.map(n -> n % 2 == 0 ? "Even" : "Odd")
                .orElse("Null");
    }
}
