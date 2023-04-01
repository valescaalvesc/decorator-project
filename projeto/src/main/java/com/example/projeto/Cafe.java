package com.example.projeto;

public class Cafe extends PadariaDecorator {

    public Cafe(Doce cafe) {
        super(cafe);
    }

    public String getTipo() {
        return "Café gelado";
    }

    public String getNomePedido() {
        return "Café";
    }
}
