package Teste;

import static org.junit.Assert.*;

import org.junit.Test;

import Model.Pessoa;

public class PessoaTest {

	@Test
	public void testId() {
		
		int id = 123;
		int idade = 28;
		String nome = "Gleidson";
		String cpf = "05545285245";
		String email = "testando@gmail.com";	
		String telefone = "79985968574";
		
		Pessoa pessoaTest = new Pessoa(id, idade, nome, cpf, email, telefone);
		
		int testGetID = pessoaTest.getId();
		assertTrue(id == testGetID);
	}
	
	@Test
	public void testEmail() {
		
		int id = 123;
		int idade = 28;
		String nome = "Gleidson";
		String cpf = "05545285245";
		String email = "testando@gmail.com";	
		String telefone = "79985968574";
		
		Pessoa pessoaTest = new Pessoa(id, idade, nome, cpf, email, telefone);
		
		String testGetEmail = pessoaTest.getEmail();
		assertTrue(email == testGetEmail);
	}

}
