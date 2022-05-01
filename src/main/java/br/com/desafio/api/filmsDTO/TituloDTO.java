package br.com.desafio.api.filmsDTO;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class TituloDTO {

    private String id;
    private String title;
    private Integer version;

}
