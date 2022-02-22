package Parser;
import java.util.ArrayList;
import java.util.Arrays;

import Parser.*;

public class MainParser {

	static Tokenizer token;
	
	public static void main(String[] args) {
		Tokenizer token = new Tokenizer();
		Gramatica grammar = new Gramatica();
		
		System.out.println("----	Proyecto 0	----");
		System.out.println("----	Lenguajes y Maquinas	----");
		
		token.InputReciever();
		
		ArrayList<String[]> InptRecieved = token.getTokens();
		System.out.println(InptRecieved.toString());
		grammar.grammaticLanding(InptRecieved);
		
	}

}
