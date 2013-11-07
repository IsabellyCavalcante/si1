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
		assertEquals("zero", num.porExtenso("0"));
		assertEquals("um", num.porExtenso("1"));
		assertEquals("dois", num.porExtenso("2"));
		assertEquals("tres", num.porExtenso("3"));
		assertEquals("quatro", num.porExtenso("4"));
		assertEquals("cinco", num.porExtenso("5"));
		assertEquals("seis", num.porExtenso("6"));
		assertEquals("sete", num.porExtenso("7"));
		assertEquals("oito", num.porExtenso("8"));
		assertEquals("nove", num.porExtenso("9"));
		assertEquals("dez", num.porExtenso("10"));
		assertEquals("onze", num.porExtenso("11"));
		assertEquals("doze", num.porExtenso("12"));
		assertEquals("treze", num.porExtenso("13"));
		assertEquals("quatorze", num.porExtenso("14"));
		assertEquals("quinze", num.porExtenso("15"));
		assertEquals("dezesseis", num.porExtenso("16"));
		assertEquals("dezessete", num.porExtenso("17"));
		assertEquals("dezoito", num.porExtenso("18"));
		assertEquals("dezenove", num.porExtenso("19"));

	}

	@Test
	public void testVazio() {
		assertEquals("", "");
	}
}