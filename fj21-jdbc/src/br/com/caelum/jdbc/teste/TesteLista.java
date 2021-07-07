package br.com.caelum.jdbc.teste;

import java.util.List;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;

public class TesteLista {

	public static void main(String[] args) {
		ContatoDao dao = new ContatoDao();
		Contato contatoRemove = new Contato();
		
		List<Contato> contatos = dao.getLista();
		
		for (Contato contato : contatos) {
			System.out.println("Nome: " + contato.getNome());
			System.out.println("Email: " + contato.getEmail());
			System.out.println("Endereço: " + contato.getEndereco());
			System.out.println("Data de Nascimento: " +
			contato.getDataNascimento().getTime() + "\n");
		}
		Long id = (long) 1;
		contatoRemove.setId(id);
		dao.remove(contatoRemove);
		
		List<Contato> contatosDepois = dao.getLista();
		
		for (Contato contatoD : contatosDepois) {
			System.out.println("Nome: " + contatoD.getNome());
			System.out.println("Email: " + contatoD.getEmail());
			System.out.println("Endereço: " + contatoD.getEndereco());
			System.out.println("Data de Nascimento: " +contatoD.getDataNascimento().getTime() + "\n");
		}

	}

}
