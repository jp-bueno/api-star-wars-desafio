package br.com.desafio.api.repository;

import br.com.desafio.api.entity.FilmeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FilmeRepository extends JpaRepository<FilmeEntity, Integer> {
//    Optional<FilmeEntity> findByTitle(String title);

    List<FilmeEntity> findAll();
}
