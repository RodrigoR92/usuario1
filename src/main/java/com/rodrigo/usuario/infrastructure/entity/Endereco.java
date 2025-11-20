package com.rodrigo.usuario.infrastructure.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter               //estou usando o lombok
    @Setter               //aqui estou usando os get e set sem precisar digitar
    @AllArgsConstructor   //aqui seria os construtores com todos os argumentos
    @NoArgsConstructor    //aqui sao os construtores sem argumentos
    @Entity
    @Table(name = "endereco")
    @Builder
    public class Endereco {
                               //Aqui foi criada uma tabela endereço

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        @Column(name = "rua")
        private String rua;
        @Column(name = "numero")
        private Integer numero;
        @Column(name = "complemento", length = 10)
        private String complemento;
        @Column(name = "cidade", length = 150)
        private String cidade;
        @Column(name = "estado", length = 2)
        private String estado;
        @Column(name = "cep", length = 9)
        private String cep;



}
