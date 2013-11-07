package lab01;

import static org.junit.Assert.*;

import org.junit.Test;

public class Teste {

	@Test
	public void test() {
		Numero num = new Numero();
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
		
	}

}