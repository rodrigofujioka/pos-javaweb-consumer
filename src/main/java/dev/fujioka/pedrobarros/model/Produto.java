package dev.fujioka.pedrobarros.model;


import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class Produto implements Serializable {

    private Integer id;

    private String descricao;

    private String cor;



}