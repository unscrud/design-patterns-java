package dev.unscrud.pedido;

import java.time.LocalDateTime;
import java.util.List;

import dev.unscrud.orcamento.Orcamento;
import dev.unscrud.pedido.acao.AcaoAposGerarPedido;

public class GeraPedidoHandler {

  private List<AcaoAposGerarPedido> acoes;

  public List<AcaoAposGerarPedido> getAcoes() {
    return acoes;
  }

  public GeraPedidoHandler(List<AcaoAposGerarPedido> acoes) {
    this.acoes = acoes;
  }

  public void executa(GeraPedido dados) {
    Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidadeItens());
    Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);
    acoes.forEach(a -> a.executarAcao(pedido));
  }
}
