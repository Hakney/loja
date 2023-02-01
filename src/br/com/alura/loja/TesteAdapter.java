package br.com.alura.loja;

import java.math.BigDecimal;

import br.com.alura.loja.http.JavaHttpClient;
import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.orcamento.RegistroDeOrcamento;

public class TesteAdapter {

	public static void main(String[] args) {

			Orcamento orcamento = new Orcamento();
			orcamento.aprovar();
			orcamento.finalizar();
			
			RegistroDeOrcamento registroDeOrcamento = new RegistroDeOrcamento(new JavaHttpClient());
			
			registroDeOrcamento.registrar(orcamento);
	}

}
