package lab01;

import java.util.Hashtable;

public class Numero {
	
	private Hashtable<String, String> numeros = new Hashtable <String, String>();

	public String porExtenso(String num) {
		if (num.equals("")){
			return "";
		}
		numeros.put("0", "zero");
		numeros.put("1", "um");
		numeros.put("2", "dois");
		numeros.put("3", "tres");
		numeros.put("4", "quatro");
		numeros.put("5", "cinco");
		numeros.put("6", "seis");
		numeros.put("7", "sete");
		numeros.put("8", "oito");
		numeros.put("9", "nove");
		numeros.put("10", "dez");
		numeros.put("11", "onze");
		numeros.put("12", "doze");
		numeros.put("13", "treze");
		numeros.put("14", "quatorze");
		numeros.put("15", "quinze");
		numeros.put("16", "dezesseis");
		numeros.put("17", "dezessete");
		numeros.put("18", "dezoito");
		numeros.put("19", "dezenove");
		numeros.put("20", "vinte");
		
		return numeros.get(num);
		
	}
	
	public static void main(String[] args) {
		
	}

}