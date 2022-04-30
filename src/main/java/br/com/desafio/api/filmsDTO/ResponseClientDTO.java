package br.com.desafio.api.filmsDTO;

import com.fasterxml.jackson.annotation.JsonProperty;
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

    @JsonProperty("count")
    private Integer count;

    @JsonProperty("next")
    private Integer next;

    @JsonProperty("previous")
    private Integer previous;

    @JsonProperty("results")
    private List<FilmesDTO>  results;
}
