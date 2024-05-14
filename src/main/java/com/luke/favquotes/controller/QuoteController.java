package com.luke.favquotes.controller;

import com.luke.favquotes.dto.QuoteDTO;
import com.luke.favquotes.service.QuoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuoteController {

    @Autowired
    private QuoteService quoteService;

    @GetMapping("/series/frases")
    public QuoteDTO getQuote() {
        return quoteService.getQuote();
    }
}
