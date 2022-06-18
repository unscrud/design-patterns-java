package dev.unscrud.desconto;

import java.math.BigDecimal;

import dev.unscrud.orcamento.Orcamento;

public class CalculadoraDeDescontos {
  public BigDecimal calcular(Orcamento orcamento) {
    Desconto cadeiaDeDescontos;
    cadeiaDeDescontos = new DescontoParaOrcamentoComMaisDeCincoItens(
        new DescontoParaOrcamentoComValorMaiorQueQuinhentos(
            new SemDesconto()));

    return cadeiaDeDescontos.efetuarCalculo(orcamento);
  }
}
