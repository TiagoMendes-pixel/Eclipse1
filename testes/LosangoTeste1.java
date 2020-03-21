package testes;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import exercicio01.Losango;;

class LosangoTeste1 {
	
	Losango losango;
	
	@BeforeEach
	void preparacao () {
		
		losango = new Losango (7, 0);
	}
	
	@Test
	void test_calcular_area() {
		double resultado = losango.area();
		assertEquals (4, 0);
		
	}
	
	@Test
	void test_calcular_perimetro() {
		double resultado = losango.perimetro();
		assertEquals (4, resultado);
	}
	
	@AfterEach
	void limpando() {
		
		losango = null;
	}

}
