package dev.unscrud.teste;

import java.math.BigDecimal;

import dev.unscrud.http.JavaHttpClient;
import dev.unscrud.orcamento.ItemOrcamento;
import dev.unscrud.orcamento.Orcamento;
import dev.unscrud.orcamento.RegistroDeOrcamento;

public class TesteAdapter {
  public static void main(String[] args) {
    Orcamento orcamento = new Orcamento();
    orcamento.adicionarItem(new ItemOrcamento(BigDecimal.TEN));
    orcamento.aprovar();
    orcamento.finalizar();

    RegistroDeOrcamento registro = new RegistroDeOrcamento(new JavaHttpClient());
    registro.registrar(orcamento);
  }
}
