package dev.fujioka.pedrobarros.model;


import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class Vendas implements Serializable {

    private Integer id;

    private String idcliente;

    private String idproduto;

    private String datavenda;

}