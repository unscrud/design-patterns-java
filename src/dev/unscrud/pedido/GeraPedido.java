package dev.unscrud.pedido;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import dev.unscrud.orcamento.Orcamento;

public class GeraPedido {
  private String cliente;
  private BigDecimal valorOrcamento;
  private int quantidadeItens;

  public GeraPedido(String cliente, BigDecimal valorOrcamento, int quantidadeItens) {
    this.cliente = cliente;
    this.valorOrcamento = valorOrcamento;
    this.quantidadeItens = quantidadeItens;
  }

  public void executa() {
    Orcamento orcamento = new Orcamento(this.valorOrcamento, this.quantidadeItens);
    Pedido pedido = new Pedido(cliente, LocalDateTime.now(), orcamento);
    System.out.println(pedido.toString());
    System.out.println("Salvar pedido no banco de dados");
    System.out.println("Enviar email com os dados do novo pedido");
  }
}
