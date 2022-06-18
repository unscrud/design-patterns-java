package dev.unscrud.situacao;

import java.math.BigDecimal;

import dev.unscrud.orcamento.Orcamento;
import dev.unscrud.orcamento.SituacaoOrcamento;

public class EmAnalise extends SituacaoOrcamento {
  @Override
  public BigDecimal calcularValorDescontoExtra(Orcamento orcamento) {
    return orcamento.getValor().multiply(new BigDecimal("0.05"));
  }

  public void aprovar(Orcamento orcamento) {
    orcamento.setSituacao(new Aprovado());
  }

  public void repovar(Orcamento orcamento) {
    orcamento.setSituacao(new Reprovado());
  }
}
