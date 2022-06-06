package dev.unscrud.teste;

import java.math.BigDecimal;

import dev.unscrud.imposto.CalculadoraDeImposto;
import dev.unscrud.imposto.ICMS;
import dev.unscrud.orcamento.Orcamento;

public class TestesImpostos {
  public static void main(String[] args) {
    Orcamento orcamento = new Orcamento(new BigDecimal("100"), 3);
    CalculadoraDeImposto calculadora = new CalculadoraDeImposto();
    System.out.println(calculadora.calcular(orcamento, new ICMS()));
  }
}