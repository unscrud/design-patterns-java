package dev.unscrud;

import java.math.BigDecimal;

import dev.unscrud.imposto.CalculadoraDeImposto;
import dev.unscrud.imposto.TipoImposto;
import dev.unscrud.orcamento.Orcamento;

public class TestesImpostos {
  public static void main(String[] args) {
    Orcamento orcamento = new Orcamento(new BigDecimal("100"));
    CalculadoraDeImposto calculadora = new CalculadoraDeImposto();
    System.out.println(calculadora.calcular(orcamento, TipoImposto.ICMS));
  }
}