package dev.unscrud.desconto;

import java.math.BigDecimal;

import dev.unscrud.orcamento.Orcamento;

public class DescontoParaOrcamentoComValorMaiorQueQuinhentos extends Desconto {
  public DescontoParaOrcamentoComValorMaiorQueQuinhentos(Desconto proximo) {
    super(proximo);
  }

  public BigDecimal calcular(Orcamento orcamento) {
    if (orcamento.getValor().compareTo(new BigDecimal("500")) > 0) {
      return orcamento.getValor().multiply(new BigDecimal("0.1"));
    }
    return proximo.calcular(orcamento);
  }
}
