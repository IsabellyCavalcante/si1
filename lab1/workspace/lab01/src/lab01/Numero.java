package lab01;

import java.util.Hashtable;

public class Numero {
	
	private Hashtable<String, String> numeros = new Hashtable <String, String>();

	public String porExtenso(String num) {
		if (num.equals("")){
			return "";
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