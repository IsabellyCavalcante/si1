package lab01;

import java.util.Hashtable;

public class Numero {
	private Hashtable<String, String> numeros = new Hashtable<String, String>();

	public String porExtenso(String num) throws Exception {
		// exceçoes
		if (num.equals("")) {
			throw new Exception("");
		}

		try {
			Integer.parseInt(num);
		} catch (Exception e) {
			throw new Exception("Numero invalido");
		}

		adicionaNoMapa();

		return decompoeNumero(num);

	}

	private String decompoeNumero(String num) throws Exception {
		String resp = "";

		if (num.equals("100")) {
			resp = "cem";

		} else if (numeros.get(num) != null) {
			resp = numeros.get(num);

		} else {
			if (num.length() == 2) {
				if ((num.charAt(0) + "").equals("0")) {
					resp = numeros.get(num.charAt(1) + "");
				} else {
					resp = numeros.get(num.charAt(0) + "0") + " e "
							+ numeros.get(limpaZeroAEsquerda(num.charAt(1) + ""));
				}

			} else if (num.length() == 3) {
				if (num.charAt(0) + "" != "1") {
					resp = numeros.get(num.charAt(0) + "00") + " e "
							+ porExtenso(limpaZeroAEsquerda(num.substring(1)));
				} else {
					resp = "cento e " + porExtenso(limpaZeroAEsquerda(num.substring(1)));
				}

			} else if (num.length() == 4) {

				if (!(num.charAt(0) + "").equals("1")) {
					System.out.println(num.substring(1));
					System.out.println(limpaZeroAEsquerda(num.substring(1)));
					if (numeros.get(num.substring(1)) != null && numeros.get((num.substring(1))).length()2 ) {
						System.out.println(limpaZeroAEsquerda(".-."));
						resp = numeros.get(num.charAt(0) + "000") + " e "
								+ porExtenso(limpaZeroAEsquerda(num.substring(1)));
					} else {
						resp = numeros.get(num.charAt(0) + "") + " mil "
								+ porExtenso(limpaZeroAEsquerda(num.substring(1)));
					}
				} else {
					if (numeros.get(num.substring(1)) != null && numeros.get(num.substring(1)).length() <= 2 ) {
						return "mil e " + porExtenso(limpaZeroAEsquerda(num.substring(1)));
					} else {
						return "mil " + porExtenso(limpaZeroAEsquerda(num.substring(1)));
					}
				}
			}

		}
		return resp;
	}
	
	private String limpaZeroAEsquerda(String numero){

        if (numero.length() > 0) {

                if ((numero.charAt(0)+"").equals("0")) {

                        return limpaZeroAEsquerda(numero.substring(1));
                }
        }

        return numero;

}

	private void adicionaNoMapa() {
		String[] num = { "zero", "um", "dois", "tres", "quatro", "cinco",
				"seis", "sete", "oito", "nove", "dez", "onze", "doze", "treze",
				"quatorze", "quinze", "dezesseis", "dezessete", "dezoito",
				"dezenove", "vinte", "trinta", "quarenta", "cinquenta",
				"sessenta", "setenta", "oitenta", "noventa", "cento",
				"duzentos", "trezentos", "quatrocentos", "quinhentos",
				"seiscentos", "setecentos", "oitocentos", "novecentos", "mil" };

		for (int i = 0; i < 21; i++) {
			numeros.put(String.valueOf(i) + "", num[i]);
		}

		int cont = 30;

		for (int j = 21; j < 29; j++) {
			numeros.put(String.valueOf(cont), num[j]);
			cont += 10;
		}

		cont = 100;

		for (int k = 29; k < 38; k++) {
			cont += 100;
			numeros.put(String.valueOf(cont), num[k]);
		}
	}
}