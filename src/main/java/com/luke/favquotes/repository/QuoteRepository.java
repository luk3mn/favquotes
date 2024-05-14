package com.luke.favquotes.repository;

import com.luke.favquotes.model.Quote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface QuoteRepository extends JpaRepository<Quote, Long> {
    @Query("SELECT q FROM Quote q ORDER BY function('RANDOM') LIMIT 1")
    Quote findRandomQuote();
}
