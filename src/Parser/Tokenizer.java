package Parser;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.*;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Tokenizer {
	
	Scanner scan = new Scanner(System.in);
	ArrayList<String[]> tokens = new ArrayList<String[]>();
	
	public void Tokenize(ArrayList<String> in) {
		for (String i: in) {
			if (i != null) {
				String[] line = i.replaceAll("\\s+","").split("");
				tokens.add(line);
			}
		}
		System.out.println(tokens.toString());
	}
	
	
	public void InputReciever () {
		
		ArrayList<String> in = new ArrayList<String>();
		System.out.println("----	Por favor, ingrese su comando:	----");
		System.out.println("----	Entre el comando 'END' para terminar la toma de datos.	----");
	
		while (scan.hasNextLine()) {
            String line = scan.nextLine();
            in.add(line);

            if (line != null && line.equalsIgnoreCase("END")) {
                System.out.println("Input: " + in);
                break;
            }
		}

		Tokenize(in);
	}
		

	public ArrayList<String[]> getTokens() {
		return tokens;
	}

	public void setTokens( ArrayList<String[]>  tokens) {
		this.tokens = tokens;
	}

}
