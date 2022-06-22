package dev.unscrud.teste;

import java.math.BigDecimal;

import dev.unscrud.pedido.GeraPedido;
import dev.unscrud.pedido.GeraPedidoHandler;

public class TestePedidos {
  public static void main(String[] args) {
    String cliente = args[0];
    BigDecimal valorOrcamento = new BigDecimal(args[1]);
    int quantidadeItens = Integer.parseInt(args[2]);

    GeraPedido dadosDoPedido = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
    GeraPedidoHandler handler = new GeraPedidoHandler(/* dependencias */);
    handler.executa(dadosDoPedido);
  }
}
