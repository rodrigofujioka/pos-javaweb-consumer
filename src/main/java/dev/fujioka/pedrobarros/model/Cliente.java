package dev.fujioka.pedrobarros.model;


import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class Cliente implements Serializable {

    private Integer id;

    private String nome;

    private String cpf;

}