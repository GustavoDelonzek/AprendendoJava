package aula04;

import java.util.Locale;

public class aulaMetodo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Caneta c1 = new Caneta("NIC", "Amarelo", 0.4);
		c1.status();
	}

}
