package Parser;
import java.util.Arrays;

import Parser.*;

public class MainParser {

	static Tokenizer token;
	
	public static void main(String[] args) {
		Tokenizer token = new Tokenizer();
		
		System.out.println("----	Proyecto 0	----");
		System.out.println("----	Lenguajes y Maquinas	----");
		
		token.InputReciever();
		System.out.println(Arrays.toString(token.getTokens()));
		
	}

}
