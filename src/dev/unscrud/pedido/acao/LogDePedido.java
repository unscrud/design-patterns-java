package dev.unscrud.pedido.acao;

import dev.unscrud.pedido.Pedido;

public class LogDePedido implements AcaoAposGerarPedido {

  @Override
  public void executarAcao(Pedido pedido) {
    System.out.println("Pedido foi gerado: " + pedido);
  }

}
