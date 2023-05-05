package com.nttdata.utils;


import com.nttdata.Variables.Produto;

public class CalculaValorTotaldeProdutos {
    public static double calculaValorTotal(Produto produto) {
        double quantidade = Double.parseDouble(produto.getQuantidade());

        double valorProduto = Double.parseDouble(SomenteDigitos.somenteDigitos(produto.getValor()));
        double valorTotal = quantidade*valorProduto;
        return valorTotal;
    }
}