package exercicioObjetos;

import java.util.Locale;
import java.util.Scanner;

public class testeBanco {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		banco conta = new banco();
		
		System.out.println("Digite o número da conta: ");
		conta.setNumConta(sc.nextInt());
		
		conta.abrirConta("cc");;
		
		conta.setDono("Gustavo");
		
		System.out.println("Depositado incial:");
		conta.depositar(sc.nextDouble());
		System.out.println(conta);
		conta.depositar(433);
		System.out.println(conta);
		conta.sacar(100);
		System.out.println(conta);
		conta.pagarMensal();
		
		conta.fecharConta();
		
	}

}
