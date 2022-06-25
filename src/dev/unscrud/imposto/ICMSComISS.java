package dev.unscrud.imposto;

import java.math.BigDecimal;

import dev.unscrud.orcamento.Orcamento;

public class ICMSComISS implements Imposto {

  @Override
  public BigDecimal calcular(Orcamento orcamento) {
    BigDecimal icms = new ICMS().calcular(orcamento);
    BigDecimal iss = new ISS().calcular(orcamento);
    return icms.add(iss);
  }

}
