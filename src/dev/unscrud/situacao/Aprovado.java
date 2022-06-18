package dev.unscrud.situacao;

import java.math.BigDecimal;

import dev.unscrud.orcamento.Orcamento;
import dev.unscrud.orcamento.SituacaoOrcamento;

public class Aprovado extends SituacaoOrcamento {
  @Override
  public BigDecimal calcularValorDescontoExtra(Orcamento orcamento) {
    return orcamento.getValor().multiply(new BigDecimal("0.02"));
  }

  @Override
  public void finalizar(Orcamento orcamento) {
    orcamento.setSituacao(new Finalizado());
  }
}
