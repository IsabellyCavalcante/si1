package lab01;

import java.util.Hashtable;

public class Numero {

	private Hashtable<String, String> numeros = new Hashtable<String, String>();
	private String[] alfabeto = { "a", "b", "c", "d", "e", "f", "g", "h", "i",
			"j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v",
			"x", "y", "z", "w" };

	public String porExtenso(String num) throws Exception {

		if (num.equals("")) {
			throw new Exception("");
		}

		for (int i = 0; i < 26; i++) {
			if (num.contains(alfabeto[i])) {
				throw new Exception("Número inválido");
			}
		}

		String[] numExtenso = { "zero", "um", "dois", "tres", "quatro",
				"cinco", "seis", "sete", "oito", "nove", "dez", "onze", "doze",
				"treze", "quatorze", "quinze", "dezesseis", "dezessete",
				"dezoito", "dezenove" };

		for (int i = 0; i < 20; i++) {
			numeros.put(String.valueOf(i), numExtenso[i]);
		}

		return numeros.get(num);

	}

	public static void main(String[] args) {

	}

}