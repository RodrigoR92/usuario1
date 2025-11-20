package com.rodrigo.usuario.business.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EnderecoDTO {

    private String rua;
    private Integer numero;
    private String complemento;
    private String cidade;
    private String estado;
    private String cep;


}
