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
				System.out.println(num1.porExtenso(String.valueOf(i + 21)));
				assertEquals(numExtenso[i], num1.porExtenso(String.valueOf(i + 21)));
			} catch (Exception e) {
				fail("laçou exceçao, mas nao devia");
			}
		}
	}
	
	@Test
	public void test30() {
		String[] numExtenso = { "trinta", "trinta e um", "trinta e dois", "trinta e tres",
				"trinta e quatro", "trinta e cinco", "trinta e seis",
				"trinta e sete", "trinta e oito", "trinta e nove", };

		for (int i = 0; i < 10; i++) {
			try {
				System.out.println(num1.porExtenso(String.valueOf(i + 30)));
				assertEquals(numExtenso[i], num1.porExtenso(String.valueOf(i + 30)));
			} catch (Exception e) {
				fail("laçou exceçao, mas nao devia");
			}
		}
	}

}