package dev.unscrud.imposto;

import java.math.BigDecimal;

import dev.unscrud.orcamento.Orcamento;

public class CalculadoraDeImposto {
  public BigDecimal calcular(Orcamento orcamento, Imposto imposto) {
    return imposto.calcular(orcamento);
  }
}