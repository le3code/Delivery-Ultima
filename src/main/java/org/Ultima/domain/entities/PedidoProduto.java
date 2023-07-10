package org.Ultima.domain.entities;

public class PedidoProduto {

    private int id;
    private int idProduto;
    private int iDpedido;
    private int qtdProduto;
    public PedidoProduto(){}
    public PedidoProduto(int id, int idProduto, int iDpedido, int qtdProduto) {
        this.id = id;
        this.idProduto = idProduto;
        this.iDpedido = iDpedido;
        this.qtdProduto = qtdProduto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public int getiDpedido() {
        return iDpedido;
    }

    public void setiDpedido(int iDpedido) {
        this.iDpedido = iDpedido;
    }

    public int getQtdProduto() {
        return qtdProduto;
    }

    public void setQtdProduto(int qtdProduto) {
        this.qtdProduto = qtdProduto;
    }

    @Override
    public String toString() {
        return "PedidoProduto{" +
                "id=" + id +
                ", idProduto=" + idProduto +
                ", iDpedido=" + iDpedido +
                ", qtdProduto=" + qtdProduto +
                '}';
    }
}


