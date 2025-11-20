package com.rodrigo.usuario.infrastructure.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter               //estou usando o lombok
@Setter               //aqui estou usando os get e set sem precisar digitar
@AllArgsConstructor   //aqui seria os construtores com todos os argumentos
@NoArgsConstructor    //aqui sao os construtores sem argumentos
@Entity
@Table(name = "telefone")
@Builder
public class Telefone {
                               //Aqui foi criada uma tabela telefone
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "numero", length = 15)
    private String numero;
    @Column(name = "ddd", length = 3)
    private String ddd;


}
