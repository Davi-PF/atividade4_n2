package com.example.atividade4;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Atividade4ApplicationTests {
    @Test
    public void testCriptografarStringHello() {
        assertEquals("72olle", Atividade4Application.encryptThis("Hello"));
    }

    @Test
    public void testCriptografarStringGood() {
        assertEquals("103doo", Atividade4Application.encryptThis("good"));
    }

    @Test
    public void testCriptografarStringHelloWorld() {
        // Teste Hello World :)
        assertEquals("104olle 119drlo", Atividade4Application.encryptThis("hello world"));
    }

    @Test
    public void testCriptografarCaracter() {
        // Teste com um unico caracter
        assertEquals("72", Atividade4Application.encryptThis("H"));
    }

    @Test
    public void testCriptografarStringVazia() {
        // Teste com uma String vazia
        assertEquals("", Atividade4Application.encryptThis(""));
    }

    @Test
    public void testCriptografarStringComCaracteresDispersos() {
        // Teste com String com caracteres dispersos
        assertEquals("72 105 97 116", Atividade4Application.encryptThis("H i a t"));
    }

    @Test
    public void testCriptografarStringComVariasPalavras() {
        // Teste com uma String com varias palavras
        assertEquals("72si 105s 97 116tse", Atividade4Application.encryptThis("His is a test"));
    }

    @Test
    public void testCriptografarStringComAsOutrasValidacoes() {
        // teste com as outras validações integradas
        assertEquals("  84sih 105s  97  116tse  ", Atividade4Application.encryptThis("  This is  a  test  "));
    }
}
