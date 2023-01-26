package br.com.alura.loja.pedido;

public class EnviarEmailPedido implements AcoesAposGerarPedido{

	public void executarAcao(Pedido pedido) {
		System.out.println("Enviar email com dados do pedido");
	}
}
