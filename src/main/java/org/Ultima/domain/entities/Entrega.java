package org.Ultima.domain.entities;


import java.text.SimpleDateFormat;
import java.util.Date;


public class Entrega {

    private int id;
    private int idPedido;
    private String nomeDoEntregado;
    private  double valorDaEntrega;
    private String nomeDoRecepto;
    private EnumEntrega estatusEntrtega;
    private String dataAtual;


    public Entrega() {}
    public Entrega(int idPedido, String nomeDoEntregado, double valorDaEntrega, String nomeDoRecepto,
                   EnumEntrega estatusEntrtega) {

        this.idPedido = idPedido;
        this.nomeDoEntregado = nomeDoEntregado;
        this.valorDaEntrega = valorDaEntrega;
        this.nomeDoRecepto = nomeDoRecepto;
        this.estatusEntrtega = estatusEntrtega;
    }


    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public String getNomeDoEntregado() {
        return nomeDoEntregado;
    }

    public void setNomeDoEntregado(String nomeDoEntregado) {
        this.nomeDoEntregado = nomeDoEntregado;
    }

    public double getValorDaEntrega() {
        return valorDaEntrega;
    }

    public void setValorDaEntrega(double valorDaEntrega) {
        this.valorDaEntrega = valorDaEntrega;
    }

    public String getNomeDoRecepto() {
        return nomeDoRecepto;
    }

    public void setNomeDoRecepto(String nomeDoRecepto) {
        this.nomeDoRecepto = nomeDoRecepto;
    }

    public EnumEntrega getEstatusEntrtega() {
        return estatusEntrtega;
    }

    public void setEstatusEntrtega(EnumEntrega estatusEntrtega) {
        this.estatusEntrtega = estatusEntrtega;
    }
    //----------------------------------- METODOS -------------------------







}

