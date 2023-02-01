package br.com.alura.loja.orcamento;

import java.math.BigDecimal;

import br.com.alura.loja.Orcavel;

public class ItemOrcamento implements Orcavel{

	private BigDecimal valor;

	public ItemOrcamento(BigDecimal valor) {
		super();
		this.valor = valor;
	}

	public BigDecimal getValor() {
		return valor;
	}
	
}
