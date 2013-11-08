package lab01;

import java.util.Hashtable;

public class Numero {
	private String centena = "";
	private String dezena = "";
	private String unidade = "";
	private Hashtable<String, String> numeros = new Hashtable<String, String>();
	private String[] alf = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j",
			"k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "x",
			"y", "z", "w" };
	private String[] numExtenso = { "zero", "um", "dois", "tres", "quatro",
			"cinco", "seis", "sete", "oito", "nove", "dez", "onze", "doze",
			"treze", "quatorze", "quinze", "dezesseis", "dezessete", "dezoito",
			"dezenove", "vinte" };

	// private String[] dezenas = {"trinta", "quarenta", "cinquenta",
	// "sessenta",
	// "setenta", "oitenta", "noventa" };

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
		boolean condicao = false;
		
		if(num.length() == 2){
			condicao = true;
			dezena = num.substring(0, 1);
			unidade = num.substring(1);
		}
		if (num.length() == 3){
			centena = num.substring(0, 1);
			dezena = num.substring(1, 2);
			unidade = num.substring(2);
		}
		

		// adiciona no hash
		for (int i = 0; i < 21; i++) {
			if(i < 10){
				numeros.put("0" + String.valueOf(i), numExtenso[i]);
			}
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
		
		//centenas
		numeros.put("100", "cem");
		numeros.put("200", "duzentos");
		numeros.put("300", "trezentos");
		numeros.put("400", "quatrocentos");
		numeros.put("500", "quinhentos");
		numeros.put("600", "seiscentos");
		numeros.put("700", "setecentos");
		numeros.put("800", "oitocentos");
		numeros.put("900", "novecentos");

		if (numeros.containsKey(num)) {
			return numeros.get(num);
		} else if (condicao == true) {
			return dezena(dezena, unidade);
		} else if (condicao == false){
			return centena(centena, dezena, unidade);
		}
		return num;

	}

	private String centena(String cent, String dez, String unid) {
		if (cent.equals("1")) {
			if (dez.equals("0") || dez.equals("1")) {
				return "cento e " + numeros.get(dez + unid);
			}
			return "cento e " + dezena(dez, unid);
		}
		
		if (dez.equals("0") || dez.equals("1")) {
			return numeros.get(cent + "00") + " e " + numeros.get(dez + unid);
		}
		return numeros.get(cent + "00") + " e "+ dezena(dez, unid);
	}

	private String dezena(String dezena, String unidade) {
		if (numeros.containsKey(dezena + unidade)){
			return numeros.get(dezena + unidade);
		}
		return numeros.get(dezena + "0") + " e " + numeros.get(unidade);
	}

	public static void main(String[] args) {
		Numero num = new Numero();
		try {
			System.out.println(num.porExtenso("01"));
			System.out.println(num.porExtenso("1"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}