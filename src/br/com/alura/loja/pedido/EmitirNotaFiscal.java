package br.com.alura.loja.pedido;

public class EmitirNotaFiscal implements AcoesAposGerarPedido{

	public void executarAcao(Pedido pedido) {
		System.out.println("Emitir nota fiscal!");
	}
}
