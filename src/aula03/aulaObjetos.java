package aula03;

import java.util.Locale;

public class aulaObjetos {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Caneta c1 = new Caneta();
		c1.modelo = "BIC cristal";
		c1.cor = "Azul";
		//c1.ponta = 0.5;
		c1.carga = 80;
		//c1.tampada = false;
		c1.tampar();
		c1.status();
		c1.rabiscar();
		

	}

}
