package br.com.alura.loja.pedido;

public class SalvarPedidoNoBancoDeDados implements AcoesAposGerarPedido {

	public void executarAcao(Pedido pedido) {
		System.out.println("Salvar pedido no banco");
	}
}
