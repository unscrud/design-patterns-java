package dev.unscrud.teste;

import java.math.BigDecimal;

import dev.unscrud.desconto.CalculadoraDeDescontos;
import dev.unscrud.orcamento.Orcamento;

public class TestesDescontos {
  public static void main(String[] args) {
    Orcamento primeiro = new Orcamento(new BigDecimal("200"), 4);
    Orcamento segundo = new Orcamento(new BigDecimal("1000"), 1);
    CalculadoraDeDescontos calculadora = new CalculadoraDeDescontos();
    System.out.println(calculadora.calcular(primeiro));
    System.out.println(calculadora.calcular(segundo));
  }
}