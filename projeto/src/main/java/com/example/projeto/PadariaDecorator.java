package com.example.projeto;

public abstract class PadariaDecorator implements Padaria {

    private Padaria padaria;
    public String nomePedido;

    public PadariaDecorator(Padaria padaria) {
        this.padaria = padaria;
    }

    public Padaria getPadaria() {
        return padaria;
    }

    public void setPadaria(Padaria padaria) {
        this.padaria = padaria;
    }

    public abstract String getTipo();

    public String getTipoPedido() {
        return this.padaria.getTipoPedido() + "/" + this.getTipoPedido();
    }

    public abstract String getNomePedido();

    public String getPedido() {
        return this.padaria.getPedido() + "/" + this.getNomePedido();
    }

    public void setPedido(String pedido) {
        this.pedido = pedido;
    }
}
