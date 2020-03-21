package testes;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import exercicio01.Circulo;
import exercicio01.Triangulo;

class TrianguloTeste {
	
	Triangulo triangulo;
	
	@BeforeEach
	void preparacao () {
		
		triangulo = new Triangulo (11, 0);
	}
	
	@Test
	void test_calcular_area() {
		double resultado = triangulo.area();
		assertEquals (5, 5);
		
	}
	
	@Test
	void test_calcular_perimetro() {
		double resultado = triangulo.perimetro();
		assertEquals (0, 0);
	}
	
	@AfterEach
	void limpando() {
		
		triangulo = null;
	}

}
