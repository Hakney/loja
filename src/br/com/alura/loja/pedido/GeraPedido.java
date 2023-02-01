package br.com.alura.loja.pedido;

import java.util.List;

import br.com.alura.loja.Orcavel;

public class GeraPedido {

	private String cliente;
	private List<Orcavel> itens;
	
	public GeraPedido(String cliente, List<Orcavel> itens) {
		super();
		this.cliente = cliente;
		this.itens = itens;
	}

	public String getCliente() {
		return cliente;
	}

	public List<Orcavel> getQuantidadeItens() {
		return itens;
	}
	
	
}
