package dev.unscrud.desconto;

import java.math.BigDecimal;

import dev.unscrud.orcamento.Orcamento;

public class SemDesconto extends Desconto {

  public SemDesconto() {
    super(null);
  }

  @Override
  public BigDecimal calcular(Orcamento orcamento) {
    return BigDecimal.ZERO;
  }

}
