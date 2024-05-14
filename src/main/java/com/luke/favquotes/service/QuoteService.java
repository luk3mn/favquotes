package com.luke.favquotes.service;

import com.luke.favquotes.dto.QuoteDTO;
import com.luke.favquotes.model.Quote;
import com.luke.favquotes.repository.QuoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class QuoteService {

    @Autowired
    private QuoteRepository quoteRepository;

    public QuoteDTO getQuote() {
        Quote quote = quoteRepository.findRandomQuote();
        return new QuoteDTO(quote.getTitle(), quote.getQuote(), quote.getCharacter(), quote.getPoster());
    }

}
