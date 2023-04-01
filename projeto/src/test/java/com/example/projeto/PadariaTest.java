package com.example.projeto;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PadariaTest {

    @Test
    void deveRetornarDoce() {
        Padaria padaria = new Doce("morango");

        assertEquals("Doce", padaria.getTipoPedido());
    }

    @Test
    void deveRetornarPaoComDoce() {
        Padaria padaria = new Pao(new Doce("morango"));

        assertEquals("doce", padaria.getTipoPedido());
    }

    @Test
    void deveRetornarTipoComBolo() {
        Padaria padaria = new Bolo(new Doce("doce"));

        assertEquals("doce", padaria.getTipoPedido());
    }

    @Test
    void deveRetornarTipoComCafe() {
        Padaria padaria = new Cafe(new Doce("doce"));

        assertEquals("doce", padaria.getTipoPedido());
    }

    @Test
    void deveRetornarTipoComPaoMaisBolo() {
        Padaria padaria = new Pao(new Bolo(new Doce("doce")));

        assertEquals("doce", padaria.getTipoPedido());
    }

    @Test
    void deveRetornarTipoComPaoMaisCafe() {
        Padaria padaria = new Pao(new Cafe(new Doce("doce")));

        assertEquals("doce", padaria.getTipoPedido());
    }

    @Test
    void deveRetornarTipoComBoloMaisCafe() {
        Padaria padaria = new Bolo(new Cafe(new Doce("doce")));

        assertEquals("doce", padaria.getTipoPedido());
    }

    @Test
    void deveRetornarTipoComEstagioMaisBoloMaisCafe() {
        Padaria padaria = new Pao(new Bolo(new Cafe(new Doce("doce"))));

        assertEquals("doce", padaria.getTipoPedido());
    }

    @Test
    void deveRetornarPedido() {
        Padaria padaria = new Doce();

        assertEquals("Doce", padaria.getPedido());
    }

    @Test
    void deveRetornarPedidoComPao() {
        Padaria padaria = new Pao(new Doce());

        assertEquals("Doce/Pao", padaria.getPedido());
    }

    @Test
    void deveRetornarPedidoComBolo() {
        Padaria padaria = new Bolo(new Doce());

        assertEquals("doce/bolo", padaria.getPedido());
    }

    @Test
    void deveRetornarPedidoComCafe() {
        Padaria padaria = new Cafe(new Doce());

        assertEquals("doce/cafe gelado", padaria.getPedido());
    }

    @Test
    void deveRetornarPedidoComPaoMaisBolo() {
        Padaria padaria = new Pao(new Bolo (new Doce()));

        assertEquals("doce/bolo/pao", padaria.getPedido());
    }

    @Test
    void deveRetornarPedidoComPaoMaisCafe() {
        Padaria padaria = new Pao(new Cafe (new Doce()));

        assertEquals("doce/pao/cafe", padaria.getPedido());
    }

    @Test
    void deveRetornarPedidoComBoloMaisCafe() {
        Padaria padaria = new Bolo(new Cafe (new Doce()));

        assertEquals("doce/bolo/cafe", padaria.getPedido());
    }

    @Test
    void deveRetornarTipoComPaoMaisBoloMaisCafe() {
        Padaria padaria = new Pao (new Bolo(new Cafe (new Doce())));

        assertEquals("doce/pao/bolo/cafe", padaria.getPedido());
    }
}
