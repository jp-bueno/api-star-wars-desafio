package br.com.desafio.api.mapper;

import br.com.desafio.api.entity.FilmeEntity;
import br.com.desafio.api.filmsDTO.FilmesDTO;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.springframework.boot.autoconfigure.jackson.Jackson2ObjectMapperBuilderCustomizer;
import org.springframework.context.annotation.Bean;

import java.util.List;

@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface FilmeMapper {

    FilmeEntity dtoToEntity(FilmesDTO dto);
    FilmesDTO entityToDTO(FilmeEntity entity);

    List<FilmeEntity> dtoToEntityList(FilmesDTO dtoList);
    List<FilmesDTO> entityToDTOList(FilmeEntity entityList);
}


