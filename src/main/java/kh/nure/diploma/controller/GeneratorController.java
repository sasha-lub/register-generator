package kh.nure.diploma.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GeneratorController {

    @GetMapping
    public String startPage() {
        return "welcome";
    }

    @PostMapping
    @RequestMapping("/generate")
    public String generate(final Model model, @RequestParam final String register) {
        model.addAttribute("message", register);
        return "welcome";
    }

}
