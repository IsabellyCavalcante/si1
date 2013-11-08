package lab01;

import java.util.Hashtable;

public class Numero {

	private Hashtable<String, String> numeros = new Hashtable<String, String>();
	private String[] alf = { "a", "b", "c", "d", "e", "f", "g", "h", "i",
			"j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v",
			"x", "y", "z", "w" };
	private String[] numExtenso = { "zero", "um", "dois", "tres", "quatro",
			"cinco", "seis", "sete", "oito", "nove", "dez", "onze", "doze",
			"treze", "quatorze", "quinze", "dezesseis", "dezessete",
			"dezoito", "dezenove", "vinte" };

	public String porExtenso(String num) throws Exception {

		//exceçoes
		if (num.equals("")) {
			throw new Exception("");
		}

		for (int i = 0; i < 26; i++) {
			if (num.contains(alf[i])) {
				throw new Exception("Número inválido");
			}
		}
		//adiciona ate vinte no hash

		for (int i = 0; i < 21; i++) {
			numeros.put(String.valueOf(i), numExtenso[i]);
		}

		return numeros.get(num);

	}

	public static void main(String[] args) {

	}

}