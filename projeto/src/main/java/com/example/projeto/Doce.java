package com.example.projeto;

public class Doce implements Padaria {

    public String tipoPedido;

    public Doce() {
    }

    public Doce(String tipoPedido) {
        this.tipoPedido = tipoPedido;
    }

    public String getTipoPedido() {
        return tipoPedido;
    }

    @Override
    public String getPedido() {
        return null;
    }

    public String getNomePedido() {
        return "Doce";
    }
}
