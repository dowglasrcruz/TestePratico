package com.nttdata.utils;


public class SomenteDigitos {
    public static String somenteDigitos(String dado) {
        return dado.replaceAll("[^0-9]+", "");
    }
}