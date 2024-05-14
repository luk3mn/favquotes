package com.luke.favquotes.dto;

import com.fasterxml.jackson.annotation.JsonAlias;

public record QuoteDTO(
        String titulo,
        String frase,
        String personagem,
        String poster
) {
}
