package com.example.iskam6;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class Controller66 {
    @GetMapping("/print-numbers")
    public String calcNumbers(Model model, @RequestParam(value = "n", defaultValue = "20") int n) {
        List<Integer> numbers = new ArrayList<>();
        for (int j = 0; j <= n; j++)
            numbers.add(j);
        model.addAttribute("numbers", numbers);
        return "calculation";
    }
}