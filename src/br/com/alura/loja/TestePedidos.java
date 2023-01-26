package br.com.alura.loja;

import java.math.BigDecimal;
import java.util.Arrays;

import br.com.alura.loja.pedido.EmitirNotaFiscal;
import br.com.alura.loja.pedido.EnviarEmailPedido;
import br.com.alura.loja.pedido.GeraPedido;
import br.com.alura.loja.pedido.GeraPedidoHandler;
import br.com.alura.loja.pedido.SalvarPedidoNoBancoDeDados;

public class TestePedidos {

	public static void main(String[] args) {

		String cliente = "Hakney Lima";
		BigDecimal valorOrcamento = new BigDecimal("300");
		int quantidadeItens = Integer.parseInt("2");
		GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
		GeraPedidoHandler handler = new GeraPedidoHandler(
				Arrays.asList(
						new SalvarPedidoNoBancoDeDados(),
						new EnviarEmailPedido(),
						new EmitirNotaFiscal()
						)
				);
		handler.execute(gerador);
	}

}
