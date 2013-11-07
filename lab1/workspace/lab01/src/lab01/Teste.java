package lab01;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Teste {
	private Numero num;

	@Before
	public void inicializa() {
		num = new Numero();
	}

	@Test
	public void test1A19() {
		String[] numExtenso = { "zero", "um", "dois", "tres", "quatro",
				"cinco", "seis", "sete", "oito", "nove", "dez", "onze", "doze",
				"treze", "quatorze", "quinze", "dezesseis", "dezessete",
				"dezoito", "dezenove" };

		for (int i = 0; i < 20; i++) {
			assertEquals(numExtenso[i], num.porExtenso(String.valueOf(i)));
		}

	}

	@Test
	public void testExcecao() {
		assertEquals("", "");
		assertEquals("Informe um numero", num.porExtenso("shdh"));
		assertEquals("Informe um numero", num.porExtenso("s2"));
		assertEquals("Informe um numero", num.porExtenso("12o"));
		assertNotEquals("Informe um numero", num.porExtenso("12o"));
	}
}