package org.Ultima.domain.entities;

public class Produto {
    private int id;
    private double preco;
    private String nomeDoProduto;

    public Produto(){}
    public Produto(double peco, String nomeDoProduto) {
        this.preco = preco;
        this.nomeDoProduto = nomeDoProduto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNomeDoProduto() {
        return nomeDoProduto;
    }

    public void setNomeDoProduto(String nomeDoProduto) {
        this.nomeDoProduto = nomeDoProduto;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", preco=" + preco +
                ", nomeDoProduto='" + nomeDoProduto + '\'' +
                '}';
    }
}
