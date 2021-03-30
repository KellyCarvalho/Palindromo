package aplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
	
	Palindromo palindromo = new Palindromo();
	Scanner sc = new Scanner(System.in);
	System.out.println("Coloque uma frase para comparar");
	
	if(palindromo.receivePhrase(sc.nextLine())) {
		System.out.println("É um Palíndromo");
		System.out.println("Original: "+palindromo.getOriginalPhrase());
		System.out.println("Frase Inicial: "+palindromo.getInitialPhrase());
		System.out.println("Frase Final: "+palindromo.getComparisonPhrase());
	}else {
		System.out.println("Não é um Palíndromo");
		System.out.println("Original: "+palindromo.getOriginalPhrase());
		System.out.println("Frase Inicial: "+palindromo.getInitialPhrase());
		System.out.println("Frase Final: "+palindromo.getComparisonPhrase());
	}
	

	}

}
