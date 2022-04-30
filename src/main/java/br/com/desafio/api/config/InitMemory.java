package br.com.desafio.api.config;

import br.com.desafio.api.client.StarWarsClient;
import br.com.desafio.api.entity.FilmeEntity;
import br.com.desafio.api.filmsDTO.FilmesDTO;
import br.com.desafio.api.filmsDTO.RequestFilmeDTO;
import br.com.desafio.api.filmsDTO.ResponseClientDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InitMemory implements CommandLineRunner {

    @Autowired
    StarWarsClient starWarsClient;

    @Override
    public void run(String... args) throws Exception {
        starWarsClient.responseClientDTO();

        System.out.println("CommandLineRunner");
        System.out.println(starWarsClient);
    }
}
