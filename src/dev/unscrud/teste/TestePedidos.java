package dev.unscrud.teste;

import java.math.BigDecimal;
import java.security.GeneralSecurityException;
import java.time.LocalDateTime;

import dev.unscrud.orcamento.Orcamento;
import dev.unscrud.pedido.GeraPedido;
import dev.unscrud.pedido.Pedido;

public class TestePedidos {
  public static void main(String[] args) {
    String cliente = args[0];
    BigDecimal valorOrcamento = new BigDecimal(args[1]);
    int quantidadeItens = Integer.parseInt(args[2]);

    GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
    gerador.executa();
  }
}
