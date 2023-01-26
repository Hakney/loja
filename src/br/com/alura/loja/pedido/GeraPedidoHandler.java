package br.com.alura.loja.pedido;

import java.time.LocalDateTime;

import br.com.alura.loja.orcamento.Orcamento;

public class GeraPedidoHandler {

	public GeraPedidoHandler() {
		
	}
	
	public void execute(GeraPedido dados) {
		Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidadeItens());
		String cliente = dados.getCliente();
		Pedido pedido = new Pedido(cliente, LocalDateTime.now(), orcamento);
		
		System.out.println("Salvar pedido no banco");
		System.out.println("Enviar email com dados do novo pedido");
	}
}
