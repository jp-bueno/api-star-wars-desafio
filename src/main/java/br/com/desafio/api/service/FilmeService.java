package br.com.desafio.api.service;

import br.com.desafio.api.client.StarWarsClient;
import br.com.desafio.api.entity.FilmeEntity;
import br.com.desafio.api.filmsDTO.ResponseClientDTO;
import br.com.desafio.api.repository.FilmeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FilmeService {

    @Autowired
    StarWarsClient starWarsClient;

    @Autowired
    FilmeRepository starWarsRepository;

    public String teste() {
        ResponseEntity<ResponseClientDTO> teste = starWarsClient.responseClientDTO();
        return "Teste";
    }

    //findall
    public List<FilmeEntity> buscarFilme(){
        return starWarsRepository.findAll();
    }

    //findById
    public FilmeEntity buscarFilmePorId(Integer episode_id){
        Optional<FilmeEntity> obj = starWarsRepository.findById(episode_id);
        return obj.get();
    }

    //PUT
    public FilmeEntity atualizarFilme(Integer episode_id, FilmeEntity obj) {
        FilmeEntity newObj = findById(episode_id);
        updateData(newObj, obj);
        return starWarsRepository.save(newObj);
    }

    //carregarFilme
    //o método que vai chamar o feign quando a aplicação subir: para gravar na memória
}
