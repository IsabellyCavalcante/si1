package lab01;

public class Numero {

	public Object porExtenso(String num) {
		if (num.equals("0")) {
			return "zero";
		} else if (num.equals("1")) {
			return "um";
		} else {
			return "dois";
		}
	}
}
