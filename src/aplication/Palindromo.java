package aplication;

import java.util.Arrays;
import java.util.List;

public class Palindromo {
	private String initialPhrase;
	private String comparisonPhrase;
	private String originalPhrase;
	private boolean isPalindromo;
	public boolean isPalindromo(String phrase) {
		 initialPhrase=phrase;
		 originalPhrase=phrase;
		 comparisonPhrase="";
		 String[] letters= initialPhrase.split("");
		 int inv = letters.length;
		 String[] invertedLetters= new String[inv];
	
		 for (int i=0; i<letters.length;i++) {
		 StringBuilder sb = new StringBuilder();
		 inv--;
				if(!letters.equals(null)) {
					invertedLetters[i]=letters[inv];
					sb.append(invertedLetters[i]);
					comparisonPhrase +=sb.toString();
				
				}
	
			
			
		}
		
		 initialPhrase=phrase.replace(" ", "").toLowerCase();
		comparisonPhrase = comparisonPhrase.replace(" ", "").toLowerCase();
		
		if(comparisonPhrase.equals(initialPhrase)) {
			
			isPalindromo=true;
			
		}else {
			isPalindromo=false;
			
		}
		return isPalindromo;
		


	 
	}
	public String getOriginalPhrase() {
		return originalPhrase;
	}

	public String getInitialPhrase() {
		return initialPhrase;
	}

	public String getComparisonPhrase() {
		return comparisonPhrase;
	}

	public boolean isPalindromo() {
		return isPalindromo;
	}

	public boolean receivePhrase(String phrase) {
		
		return isPalindromo(phrase);
	}

}
