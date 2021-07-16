package Teste;

import static org.junit.Assert.*;

import org.junit.Test;

import Model.Veiculo;

public class VeiculoTest {

	@Test
	public void testCategoria() {
		
		int ID = 465;
	    String nome = "Joao";
	    String cor = "Verde";
	    String categoria = "Sedan";
	    Double preco = 45785.00;
		
	    Veiculo veiculoTest = new Veiculo(ID, nome, cor, categoria, preco);
		
		String testGetCategoria = veiculoTest.getCategoria();
		assertTrue(categoria == testGetCategoria);
	}
	
	@Test
	public void testID() {
		
		int ID = 465;
	    String nome = "Joao";
	    String cor = "Verde";
	    String categoria = "Sedan";
	    Double preco = 45785.00;
		
	    Veiculo veiculoTest = new Veiculo(ID, nome, cor, categoria, preco);
		
		Double testGetPreco = veiculoTest.getPreco();
		assertTrue(preco == testGetPreco);
	}

}
