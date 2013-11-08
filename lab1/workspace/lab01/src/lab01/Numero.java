package lab01;

import java.util.Hashtable;

public class Numero {

	private Hashtable<String, String> numeros = new Hashtable<String, String>();
	private String[] alf = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j",
			"k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "x",
			"y", "z", "w" };
	private String[] numExtenso = { "zero", "um", "dois", "tres", "quatro",
			"cinco", "seis", "sete", "oito", "nove", "dez", "onze", "doze",
			"treze", "quatorze", "quinze", "dezesseis", "dezessete", "dezoito",
			"dezenove", "vinte"}; 
	//private String[] dezenas = {"trinta", "quarenta", "cinquenta", "sessenta",
	//"setenta", "oitenta", "noventa" };

	public String porExtenso(String num) throws Exception {
		// exceçoes
		if (num.equals("")) {
			throw new Exception("");
		}

		for (int i = 0; i < 26; i++) {
			if (num.contains(alf[i])) {
				throw new Exception("Número inválido");
			}
		}

		String dezena = num.substring(0, 1);
		String unidade = num.substring(1);

		// adiciona no hash
		for (int i = 0; i < 21; i++) {
			numeros.put(String.valueOf(i), numExtenso[i]);
		}
		// adiciona as dezenas
		numeros.put("30", "trinta");
		numeros.put("40", "quarenta");
		numeros.put("50", "cinquenta");
		numeros.put("60", "sessenta");
		numeros.put("70", "setenta");
		numeros.put("80", "oitenta");
		numeros.put("90", "noventa");

		if (numeros.containsKey(num)) {
			return numeros.get(num);
		} else {
			return dezena(dezena, unidade);
		}

	}

	private String dezena(String dezena, String unidade) {
		return numeros.get(dezena + "0") + " e " + numeros.get(unidade);
		
	}

	public static void main(String[] args) {
	}

}