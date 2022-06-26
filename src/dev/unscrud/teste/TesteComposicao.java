package dev.unscrud.teste;

import java.math.BigDecimal;

import dev.unscrud.orcamento.ItemOrcamento;
import dev.unscrud.orcamento.Orcamento;

public class TesteComposicao {
  public static void main(String[] args) {
    Orcamento antigo = new Orcamento();
    antigo.adicionarItem(new ItemOrcamento(new BigDecimal("200")));
    antigo.reprovar();

    Orcamento novo = new Orcamento();
    novo.adicionarItem(new ItemOrcamento(new BigDecimal("500")));
    novo.adicionarItem(antigo);

    System.out.println(novo.getValor());
  }
}
