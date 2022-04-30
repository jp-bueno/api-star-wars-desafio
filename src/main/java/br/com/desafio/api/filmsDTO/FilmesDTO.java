package br.com.desafio.api.filmsDTO;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Getter
@Setter
public class FilmesDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private String title;

    private Integer episode_id;

    private String opening_crawl;

    private String director;

    private String producer;

    private LocalDate release_date;

    private List<String> characters;

    private List<String> planets;

    private List<String> starships;

    private List<String> vehicles;

    private List<String> species;

    private LocalDateTime created;

    private LocalDateTime edited;

    private String url;

    private Integer version;

}
