package com.produtos.RestSpringSwager.Models;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name="TB_PRODUTO")//sE NÃO FOR FEITO, O jpa renomeará a tabela  com o nome da classe
public class Produto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)//gera valores automaticamente
    private long id;

    private String nome;

    private int quantidade;

    private BigDecimal valor;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
}
