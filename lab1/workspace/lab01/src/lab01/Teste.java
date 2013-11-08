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
				"dezoito", "dezenove", "vinte" };

		for (int i = 0; i < 21; i++) {
			try {
				assertEquals(numExtenso[i], num1.porExtenso(String.valueOf(i)));
			} catch (Exception e) {
				fail("laçou exceçao, mas nao devia");
			}
		}

	}

	@Test
	public void testExcecao() {
		assertEquals("", "");
		try {
			num1.porExtenso("shdh");
			fail("nao laçou exceçao");
		} catch (Exception e) {
			assertEquals("Número inválido", e.getMessage());
		}

		try {
			num1.porExtenso("s2");
			fail("nao laçou exceçao");
		} catch (Exception e) {
			assertEquals("Número inválido", e.getMessage());
		}

		try {
			num1.porExtenso("12o");
			fail("nao laçou exceçao");
		} catch (Exception e) {
			assertEquals("Número inválido", e.getMessage());
		}

		try {
			assertEquals("doze", num1.porExtenso("12"));
		} catch (Exception e) {
			fail("laçou exceçao, mas nao devia");

		}

	}

	@Test
	public void test20() {
		String[] numExtenso = { "vinte e um", "vinte e dois", "vinte e tres",
				"vinte e quatro", "vinte e cinco", "vinte e seis",
				"vinte e sete", "vinte e oito", "vinte e nove", };

		for (int i = 0; i < 9; i++) {
			try {
				assertEquals(numExtenso[i],
						num1.porExtenso(String.valueOf(i + 21)));
			} catch (Exception e) {
				fail("laçou exceçao, mas nao devia");
			}
		}
	}

	@Test
	public void test30() {
		String[] numExtenso = { "trinta", "trinta e um", "trinta e dois",
				"trinta e tres", "trinta e quatro", "trinta e cinco",
				"trinta e seis", "trinta e sete", "trinta e oito",
				"trinta e nove", };

		for (int i = 0; i < 10; i++) {
			try {
				assertEquals(numExtenso[i],
						num1.porExtenso(String.valueOf(i + 30)));
			} catch (Exception e) {
				fail("laçou exceçao, mas nao devia");
			}
		}
	}

	@Test
	public void test90() {
		String[] numExtenso = { "noventa", "noventa e um", "noventa e dois",
				"noventa e tres", "noventa e quatro", "noventa e cinco",
				"noventa e seis", "noventa e sete", "noventa e oito",
				"noventa e nove", };

		for (int i = 0; i < 10; i++) {
			try {
				assertEquals(numExtenso[i],
						num1.porExtenso(String.valueOf(i + 90)));
			} catch (Exception e) {
				fail("laçou exceçao, mas nao devia");
			}
		}
	}

	@Test
	public void test100() {
		String[] numExtenso = { "cem", "cento e um", "cento e dois",
				"cento e tres", "cento e quatro", "cento e cinco",
				"cento e seis", "cento e sete", "cento e oito", "cento e nove", };

		for (int i = 0; i < 10; i++) {
			try {
				assertEquals(numExtenso[i],
						num1.porExtenso(String.valueOf(i + 100)));
			} catch (Exception e) {
				fail("laçou exceçao, mas nao devia");
			}
		}
	}

	@Test
	public void test200() {
		String[] numExtenso = { "duzentos", "duzentos e um", "duzentos e dois",
				"duzentos e tres", "duzentos e quatro", "duzentos e cinco",
				"duzentos e seis", "duzentos e sete", "duzentos e oito",
				"duzentos e nove", };

		for (int i = 0; i < 10; i++) {
			try {
				assertEquals(numExtenso[i],
						num1.porExtenso(String.valueOf(i + 200)));
			} catch (Exception e) {
				fail("laçou exceçao, mas nao devia");
			}
		}
	}

	@Test
	public void testAleatorioAte999() {
		try {
			assertEquals("trezentos e noventa", num1.porExtenso("390"));
		} catch (Exception e) {
			fail("laçou exceçao, mas nao devia");
		}
		try {
			assertEquals("cinco", num1.porExtenso("05"));
		} catch (Exception e) {
			fail("laçou exceçao, mas nao devia");
		}
		
		try {
			assertEquals("setecentos e trinta e dois", num1.porExtenso("732"));
		} catch (Exception e) {
			fail("laçou exceçao, mas nao devia");
		}
		
		try {
			assertEquals("setecentos e dois", num1.porExtenso("702"));
		} catch (Exception e) {
			fail("laçou exceçao, mas nao devia");
		}

		try {
			assertEquals("cento e um", num1.porExtenso("101"));
		} catch (Exception e) {
			fail("laçou exceçao, mas nao devia");
		}
	}
}