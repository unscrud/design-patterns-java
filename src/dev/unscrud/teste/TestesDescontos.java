package dev.unscrud.teste;

import java.math.BigDecimal;

import dev.unscrud.desconto.CalculadoraDeDescontos;
import dev.unscrud.orcamento.ItemOrcamento;
import dev.unscrud.orcamento.Orcamento;

public class TestesDescontos {
  public static void main(String[] args) {
    Orcamento primeiro = new Orcamento();
    primeiro.adicionarItem(new ItemOrcamento(new BigDecimal("200")));
    Orcamento segundo = new Orcamento();
    segundo.adicionarItem(new ItemOrcamento(new BigDecimal("1000")));
    Orcamento terceiro = new Orcamento();
    terceiro.adicionarItem(new ItemOrcamento(new BigDecimal("500")));
    CalculadoraDeDescontos calculadora = new CalculadoraDeDescontos();
    System.out.println(calculadora.calcular(primeiro));
    System.out.println(calculadora.calcular(segundo));
    System.out.println(calculadora.calcular(terceiro));
  }
}