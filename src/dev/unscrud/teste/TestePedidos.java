package dev.unscrud.teste;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import dev.unscrud.orcamento.Orcamento;
import dev.unscrud.pedido.Pedido;

public class TestePedidos {
  public static void main(String[] args) {
    Orcamento orcamento = new Orcamento(new BigDecimal("600"), 4);
    String cliente = "Ana Maria";
    LocalDateTime data = LocalDateTime.now();

    Pedido pedido = new Pedido(cliente, data, orcamento);
    System.out.println(pedido.toString());
    System.out.println("Salvar pedido no banco de dados");
    System.out.println("Enviar email com os dados do novo pedido");
  }
}
