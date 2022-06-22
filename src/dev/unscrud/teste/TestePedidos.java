package dev.unscrud.teste;

import java.math.BigDecimal;

import dev.unscrud.pedido.GeraPedido;

public class TestePedidos {
  public static void main(String[] args) {
    String cliente = args[0];
    BigDecimal valorOrcamento = new BigDecimal(args[1]);
    int quantidadeItens = Integer.parseInt(args[2]);

    GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
    gerador.executa();
  }
}
