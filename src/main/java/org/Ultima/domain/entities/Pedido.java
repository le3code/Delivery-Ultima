package org.Ultima.domain.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {

    private int id;
    private String nomeDocliente;
    private Date dataCriacao;
    private Date dataDaEntrega;
    private EnumPedido estatusPedido;

    public Pedido() {}

    public Pedido(String nomeDocliente, Date dataCriacao, Date dataDaEntrega, EnumPedido estatusPedido) {

        this.nomeDocliente = nomeDocliente;
        this.dataCriacao = dataCriacao;
        this.dataDaEntrega = dataDaEntrega;
        this.estatusPedido = estatusPedido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeDocliente() {
        return nomeDocliente;
    }

    public void setNomeDocliente(String nomeDocliente) {
        this.nomeDocliente = nomeDocliente;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public Date getDataDaEntrega() {
        return dataDaEntrega;
    }

    public void setDataDaEntrega(Date dataDaEntrega) {
        this.dataDaEntrega = dataDaEntrega;
    }

    public EnumPedido getEstatusPedido() {
        return estatusPedido;
    }

    public void setEstatusPedido(EnumPedido estatusPedido) {
        this.estatusPedido = estatusPedido;
    }

    // ------------------ metodos -----------------------------

    public


}
