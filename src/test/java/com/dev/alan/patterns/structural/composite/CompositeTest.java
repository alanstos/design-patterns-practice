package com.dev.alan.patterns.structural.composite;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CompositeTest {

    @Test
    public void testSimples(){
        File rj = new File("rio-de-janeiro");
        File minas = new File("minas");
        Directory parana = new Directory("parana");

        Directory brasil = new Directory("brasil");
        brasil.add(rj, minas, parana);

        String detail = brasil.showDetails();
        System.out.println(detail);

        assertTrue(detail.contains("minas"),"tem minas");
        assertTrue(detail.contains("rio"),"tem rio");
        assertTrue(detail.contains("brasil"),"brasil");
    }
}
