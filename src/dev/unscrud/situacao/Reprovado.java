package dev.unscrud.situacao;

import dev.unscrud.orcamento.Orcamento;
import dev.unscrud.orcamento.SituacaoOrcamento;

public class Reprovado extends SituacaoOrcamento {
  @Override
  public void finalizar(Orcamento orcamento) {
    orcamento.setSituacao(new Finalizado());
  }
}
