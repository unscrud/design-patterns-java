package dev.unscrud.orcamento;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import dev.unscrud.situacao.EmAnalise;
import dev.unscrud.situacao.Finalizado;

public class Orcamento implements Orcavel {
  private BigDecimal valor;
  private List<Orcavel> itens;
  private SituacaoOrcamento situacao;

  public Orcamento() {
    this.valor = BigDecimal.ZERO;
    this.itens = new ArrayList<>();
    this.situacao = new EmAnalise();
  }

  public void adicionarItem(Orcavel item) {
    this.valor = valor.add(item.getValor());
    this.itens.add(item);
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
    try {
      Thread.sleep(2000);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
    return valor;
  }

  public int getQuantidadeItens() {
    return itens.size();
  }

  public boolean isFinalizado() {
    return this.situacao instanceof Finalizado;
  }
}