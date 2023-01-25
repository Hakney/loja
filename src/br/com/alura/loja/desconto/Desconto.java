package br.com.alura.loja.desconto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public abstract class Desconto {

	protected Desconto proximo;

	public abstract BigDecimal calcular(Orcamento orcamento);

		
	public Desconto(Desconto proximo) {
		super();
		this.proximo = proximo;
	}
}
