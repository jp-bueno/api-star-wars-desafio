package br.com.desafio.api.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Getter
@Setter
public class FilmeEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "epsode_id")
    private Integer epsodeId;

    @Column(name = "title")
    private String title;

    @Column(name = "opening_crawl")
    private String openingCrawl;

    @Column(name = "director")
    private String director;

    @Column(name = "producer")
    private String producer;

    @Column(name = "release_date")
    private LocalDate releaseDate;

    @Column(name = "characters")
    private String characters;

    @Column(name = "starships")
    private String starships;

    @Column(name = "vehicles")
    private String vehicles;

    @Column(name = "species")
    private String species;



}
