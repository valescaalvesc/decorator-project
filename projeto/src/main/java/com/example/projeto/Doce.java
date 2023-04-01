package com.example.projeto;

public class Doce implements PadariaDecorator{

    public String tipoPedido;

    public Doce() {
    }

    public Doce(String tipoPedido) {
        this.tipoPedido = tipoPedido;
    }

    public String getTipoPedido() {
        return tipoPedido;
    }

    public String getNomePedido() {
        return "Doce";
    }
}
