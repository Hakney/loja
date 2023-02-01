package br.com.alura.loja;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import br.com.alura.loja.orcamento.ItemOrcamento;
import br.com.alura.loja.pedido.EmitirNotaFiscal;
import br.com.alura.loja.pedido.EnviarEmailPedido;
import br.com.alura.loja.pedido.GeraPedido;
import br.com.alura.loja.pedido.GeraPedidoHandler;
import br.com.alura.loja.pedido.SalvarPedidoNoBancoDeDados;

public class TestePedidos {

	public static void main(String[] args) {

		String cliente = "Hakney Lima";
		List<Orcavel> itens = new ArrayList<Orcavel>();
		itens.add(new ItemOrcamento(BigDecimal.TEN));
		GeraPedido gerador = new GeraPedido(cliente, itens);
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
