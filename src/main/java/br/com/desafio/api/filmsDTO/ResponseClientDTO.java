package br.com.desafio.api.filmsDTO;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Data
@Getter
@Setter
public class ResponseClientDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer count;
    private Integer next;
    private Integer previous;
    private List<FilmesDTO>  results;
}
