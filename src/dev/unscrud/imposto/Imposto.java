package dev.unscrud.imposto;

import java.math.BigDecimal;

import dev.unscrud.orcamento.Orcamento;

public interface Imposto {
  BigDecimal calcular(Orcamento orcamento);
}
