package dev.unscrud.orcamento;

import java.math.BigDecimal;

import dev.unscrud.situacao.EmAnalise;
import dev.unscrud.situacao.Finalizado;

public class Orcamento {
  private BigDecimal valor;
  private int quantidadeItens;
  private SituacaoOrcamento situacao;

  public Orcamento(BigDecimal valor, int quantidadeItens) {
    this.valor = valor;
    this.quantidadeItens = quantidadeItens;
    this.situacao = new EmAnalise();
  }

  public void aplicarDescontoExtra() {
    BigDecimal valorDoDescontoExtra = this.situacao.calcularValorDescontoExtra(this);
    this.valor = this.valor.subtract(valorDoDescontoExtra);
  }

  public void aprovar() {
    this.situacao.aprovar(this);
  }

  public void reprovar() {
    this.situacao.repovar(this);
  }

  public void finalizar() {
    this.situacao.finalizar(this);
  }

  public SituacaoOrcamento getSituacao() {
    return situacao;
  }

  public void setSituacao(SituacaoOrcamento situacao) {
    this.situacao = situacao;
  }

  public BigDecimal getValor() {
    return valor;
  }

  public int getQuantidadeItens() {
    return quantidadeItens;
  }

  public boolean isFinalizado() {
    return this.situacao instanceof Finalizado;
  }
}