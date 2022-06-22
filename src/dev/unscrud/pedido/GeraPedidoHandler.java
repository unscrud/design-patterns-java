package dev.unscrud.pedido;

import java.time.LocalDateTime;

import dev.unscrud.orcamento.Orcamento;
import dev.unscrud.pedido.acao.EnviarEmailPedido;
import dev.unscrud.pedido.acao.SalvarPedidoNoBancoDeDados;

public class GeraPedidoHandler {

  // construtor com injecao de dependencias, repository, service...

  public void executa(GeraPedido dados) {
    Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidadeItens());
    Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);
    System.out.println(pedido.toString());
    EnviarEmailPedido email = new EnviarEmailPedido();
    email.executa(pedido);
    SalvarPedidoNoBancoDeDados salvar = new SalvarPedidoNoBancoDeDados();
    salvar.executa(pedido);
  }
}
