package dev.unscrud.pedido;

import java.time.LocalDateTime;

import dev.unscrud.orcamento.Orcamento;

public class GeraPedidoHandler {

  // construtor com injecao de dependencias, repository, service...

  public void executa(GeraPedido dados) {
    Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidadeItens());
    Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);
    System.out.println(pedido.toString());
    System.out.println("Salvar pedido no banco de dados");
    System.out.println("Enviar email com os dados do novo pedido");
  }
}
