package br.com.desafio.api.filmsDTO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class RequestFilmeDTO {

    @JsonProperty("descricao")
    private String descricao;

}
