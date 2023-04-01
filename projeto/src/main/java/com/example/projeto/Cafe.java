package com.example.projeto;

public class Cafe extends PadariaDecorator {

    public Cafe(Cafe cafe) {
        super(cafe);
    }

    public String getTipo() {
        return "Café gelado";
    }

    public String getNomePedido() {
        return "Café";
    }
}
