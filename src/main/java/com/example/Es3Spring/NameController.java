package com.example.Es3Spring;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")

public class NameController {

    @GetMapping("/name")
    public String getName(@RequestParam String name) {
        return name;
    }

    @PostMapping("/name")
    public String getNameAlContrario(@RequestParam String name) {
        StringBuilder nameAlContrario = new StringBuilder(name);
        return nameAlContrario.reverse().toString();
    }
}
