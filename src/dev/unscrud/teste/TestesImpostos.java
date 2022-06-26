package dev.unscrud.teste;

import java.math.BigDecimal;

import dev.unscrud.imposto.CalculadoraDeImposto;
import dev.unscrud.imposto.ICMS;
import dev.unscrud.imposto.ISS;
import dev.unscrud.orcamento.ItemOrcamento;
import dev.unscrud.orcamento.Orcamento;

public class TestesImpostos {
  public static void main(String[] args) {
    Orcamento orcamento = new Orcamento();
    orcamento.adicionarItem(new ItemOrcamento(new BigDecimal("300")));
    CalculadoraDeImposto calculadora = new CalculadoraDeImposto();
    System.out.println(calculadora.calcular(orcamento, new ISS(new ICMS(null))));
  }
}