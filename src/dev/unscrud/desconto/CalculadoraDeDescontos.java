package dev.unscrud.desconto;

import java.math.BigDecimal;

import dev.unscrud.orcamento.Orcamento;

public class CalculadoraDeDescontos {
  public BigDecimal calcular(Orcamento orcamento) {
    Desconto desconto;
    desconto = new DescontoParaOrcamentoComMaisDeCincoItens(
        new DescontoParaOrcamentoComValorMaiorQueQuinhentos(
            new SemDesconto()));

    return desconto.calcular(orcamento);
  }
}
