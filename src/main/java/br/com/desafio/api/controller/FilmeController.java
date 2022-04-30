package br.com.desafio.api.controller;

import br.com.desafio.api.entity.FilmeEntity;
import br.com.desafio.api.filmsDTO.FilmesDTO;
import br.com.desafio.api.filmsDTO.RequestFilmeDTO;
import br.com.desafio.api.filmsDTO.ResponseClientDTO;
import br.com.desafio.api.service.FilmeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*") // usado para receber diversas portas
@RestController
@RequestMapping(value = "/filme")
public class FilmeController {

    @Autowired
    private FilmeService filmeService;

    @GetMapping(path = "/api/status")
    public String check(){
        filmeService.teste();
        return filmeService.teste();
    }

//    //PUT
//    @PutMapping(value = "/{id}")
//    public ResponseEntity<ResponseClientDTO> atualizarFilmes(@PathVariable Integer episode_id, @RequestBody RequestFilmeDTO requestFilmeDTO) {
//        FilmeEntity newObj = filmeService.update(episode_id, requestFilmeDTO);
//        return ResponseEntity.ok().body(newObj);
//    }

    @GetMapping
    public List<FilmeEntity> listarFilme(){
        return filmeService.buscarFilme();
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<FilmesDTO> buscarFilmePorId(Integer episode_id) {
        ResponseEntity<FilmesDTO> obj = filmeService.buscarFilmePorId(episode_id);
        return obj;
    }

}
