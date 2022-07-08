package br.com.fiap.estudo;

import java.util.Scanner;

public class Imc {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ola, vamos analisar seu IMC! ");
		
		System.out.println(" Nos diga sua altura: ");
		double altura = sc.nextDouble();
		
		System.out.println(" Agora nos diga o seu peso: ");
		double peso = sc.nextDouble();
		
		
		double massa = peso / (altura * altura);
		
		double imc1 = 18.5;
		double imc2 = 25;
		
		if((massa >= imc1) && (massa <= imc2)) {
			System.out.printf(" Parabens!! Você esta com seu peso ideal!"
					+ " seu IMC é %.2f", massa);
		} else {
			System.out.printf(" Sinto muito mas você não esta no peso ideal."
					+ " seu IMC é %.2f", massa);
		} sc.close();
	}

}
