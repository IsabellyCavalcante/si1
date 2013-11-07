package lab01;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Teste {
	private Numero num1;

	@Before
	public void inicializa() {
		num1 = new Numero(); 
	}

	@Test
	public void test1A19() {
		String[] numExtenso = { "zero", "um", "dois", "tres", "quatro",
				"cinco", "seis", "sete", "oito", "nove", "dez", "onze", "doze",
				"treze", "quatorze", "quinze", "dezesseis", "dezessete",
				"dezoito", "dezenove" };

		for (int i = 0; i < 20; i++) {
			assertEquals(numExtenso[i], num1.porExtenso(String.valueOf(i)));
		}

	}

	@Test
	public void testExcecao() {
		assertEquals("", "");
		assertEquals("Informe um numero", num1.porExtenso("shdh"));
		assertEquals("Informe um numero", num1.porExtenso("s2"));
		assertEquals("Informe um numero", num1.porExtenso("12o"));
		assertNotEquals("Informe um numero", num1.porExtenso("12o"));
	}
}