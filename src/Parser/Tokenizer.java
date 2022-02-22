package Parser;

import java.util.Arrays;
import java.util.regex.*;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Tokenizer {
	
	Scanner scan = new Scanner(System.in);
	String[] tokens;
	
	public void Tokenize(String[] tokens) {
		
	}
	
	
	public String[] InputReciever () {
		
		System.out.println("----	Por favor, ingrese su comando:	----");
		while (scan.hasNextLine())
		{
			String[] tokens = scan.nextLine().replaceAll("\\s+","").split("");
			this.setTokens(tokens);
			System.out.println(Arrays.toString(tokens));
			
		}
		

		return tokens;
	}
		

	public String[] getTokens() {
		return tokens;
	}

	public void setTokens(String[] tokens) {
		this.tokens = tokens;
	}

}
