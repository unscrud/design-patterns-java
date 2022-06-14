package dev.unscrud.desconto;

import java.math.BigDecimal;

import dev.unscrud.orcamento.Orcamento;

public abstract class Desconto {
  protected Desconto proximo;

  public Desconto(Desconto proximo) {
    this.proximo = proximo;
  }

  public abstract BigDecimal calcular(Orcamento orcamento);
}
