package dev.unscrud.teste;

import java.math.BigDecimal;
import java.util.Arrays;

import dev.unscrud.pedido.GeraPedido;
import dev.unscrud.pedido.GeraPedidoHandler;
import dev.unscrud.pedido.acao.EnviarEmailPedido;
import dev.unscrud.pedido.acao.SalvarPedidoNoBancoDeDados;

public class TestePedidos {
  public static void main(String[] args) {
    String cliente = "Uns Crud";
    BigDecimal valorOrcamento = new BigDecimal("10");
    int quantidadeItens = 2;

    GeraPedido dadosDoPedido = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
    GeraPedidoHandler handler = new GeraPedidoHandler(
        Arrays.asList(new SalvarPedidoNoBancoDeDados(), new EnviarEmailPedido()));
    handler.executa(dadosDoPedido);
  }
}
