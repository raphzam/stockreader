package com.example.stockreader.controllers;

import com.example.stockreader.services.StockDataService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@AllArgsConstructor
public class HomeController {

    private final StockDataService stockDataService;


    @GetMapping("/")
    public String home(Model model) {

        model.addAttribute("allStockData", stockDataService.getAllStockData());
        return "home";
    }


}
