package dev.unscrud.desconto;

import java.math.BigDecimal;

import dev.unscrud.orcamento.Orcamento;

public class DescontoParaOrcamentoComValorMaiorQueQuinhentos extends Desconto {
  public DescontoParaOrcamentoComValorMaiorQueQuinhentos(Desconto proximo) {
    super(proximo);
  }

  public BigDecimal efetuarCalculo(Orcamento orcamento) {
    return orcamento.getValor().multiply(new BigDecimal("0.1"));
  }

  @Override
  public boolean deveAplicar(Orcamento orcamento) {
    return orcamento.getValor().compareTo(new BigDecimal("500")) > 0;
  }
}
