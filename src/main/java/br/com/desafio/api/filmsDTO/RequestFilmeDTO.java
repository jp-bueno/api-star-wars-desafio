package br.com.desafio.api.filmsDTO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class RequestFilmeDTO {
    //USAR PARA ALTERAR A DESCRIÇÃO

    @JsonProperty("descricao")
    private String descricao;

}
