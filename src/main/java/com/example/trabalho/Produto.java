package com.example.trabalho;

public class Produto {

    private String descricao;

    private int idProduto;

    private int valorUnitario;


    public Produto (){
        idProduto = idProduto +1;
    }

    public String getDescricao(){
        return descricao;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public int getIdProduto(){
        return idProduto;
    }

    public void setIdProduto(int idProduto){
        this.idProduto = idProduto;
    }

    public int getValorUnitario(){
        return valorUnitario;
    }

    public void setValorUnitario(int valorUnitario){
        this.valorUnitario = valorUnitario;
    }
}
