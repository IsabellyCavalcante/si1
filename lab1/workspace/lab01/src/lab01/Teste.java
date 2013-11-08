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
			try {
				assertEquals(numExtenso[i], num1.porExtenso(String.valueOf(i)));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

	@Test
	public void testExcecao() {
		assertEquals("", "");
		try {
			assertEquals("Informe um numero", num1.porExtenso("shdh"));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			assertEquals("Informe um numero", num1.porExtenso("s2"));
		} catch (Exception e) {
			System.out.println(e.getMessage());

		}
		try {
			assertEquals("Informe um numero", num1.porExtenso("12o"));
		} catch (Exception e) {
			System.out.println(e.getMessage());

		}
		
		try {
			assertNotEquals("Informe um numero", num1.porExtenso("12"));
		} catch (Exception e) {
			System.out.println(e.getMessage());

		}
	}
}