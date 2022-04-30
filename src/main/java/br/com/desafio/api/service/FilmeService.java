package br.com.desafio.api.service;

import br.com.desafio.api.client.StarWarsClient;
import br.com.desafio.api.entity.FilmeEntity;
import br.com.desafio.api.filmsDTO.FilmesDTO;
import br.com.desafio.api.filmsDTO.ResponseClientDTO;
import br.com.desafio.api.mapper.FilmeMapper;
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

//    @Autowired
//    FilmeMapper filmeMapper;

    public String teste() {
        ResponseEntity<ResponseClientDTO> teste = starWarsClient.responseClientDTO();
        return "Teste";
    }

    //findall
    public List<FilmeEntity> buscarFilme(){
        return starWarsRepository.findAll();
    }

    //findById
    //ResponsseEntity
    public ResponseEntity<FilmesDTO> buscarFilmePorId(Integer episode_id){
        Optional<FilmeEntity> obj = starWarsRepository.findById(episode_id);
 //       return ResponseEntity.ok(filmeMapper.entityToDTO(obj.get()));// usar para transformar dto em entity e entity em dto
        return null;
    }

//    //PUT
//    public FilmeEntity atualizarFilme(Integer episode_id, FilmeEntity obj) {
//        FilmeEntity newObj = findById(episode_id);
//        updateData(newObj, obj);
//        return starWarsRepository.save(newObj);
//    }

    //carregarFilme
    //o método que vai chamar o feign quando a aplicação subir: para gravar na memória
}
