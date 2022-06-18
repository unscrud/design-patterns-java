package dev.unscrud.orcamento;

import java.math.BigDecimal;

import dev.unscrud.exceptions.DomainException;

public abstract class SituacaoOrcamento {

  public BigDecimal calcularValorDescontoExtra(Orcamento orcamento) {
    return BigDecimal.ZERO;
  }

  public void aprovar(Orcamento orcamento) {
    throw new DomainException("Orcamento nao pode ser aprovado!");
  }

  public void repovar(Orcamento orcamento) {
    throw new DomainException("Orcamento nao pode ser reprovado!");
  }

  public void finalizar(Orcamento orcamento) {
    throw new DomainException("Orcamento nao pode ser finalizado!");
  }
}
