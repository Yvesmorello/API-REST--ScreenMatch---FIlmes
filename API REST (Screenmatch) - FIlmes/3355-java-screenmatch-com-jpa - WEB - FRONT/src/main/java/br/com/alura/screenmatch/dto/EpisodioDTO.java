package br.com.alura.screenmatch.dto;

import com.fasterxml.jackson.annotation.JsonAlias;

public record EpisodioDTO( Integer temporada,
                           Integer numeroEpisodio,
                           String titulo){
}
