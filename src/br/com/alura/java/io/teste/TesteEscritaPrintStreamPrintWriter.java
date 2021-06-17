package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;


public class TesteEscritaPrintStreamPrintWriter {

	public static void main(String[] args) throws IOException {

//		OutputStream fos = new FileOutputStream("lorem2.txt");
//		Writer osw = new OutputStreamWriter(fos); //transformar bytes em caracteres
//		BufferedWriter bw = new BufferedWriter(osw); //juntar vários caracteres que estão dentro de uma linha
		
		
//		BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));

		PrintStream ps = new PrintStream("lorem2.txt");
		
		ps.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
		ps.println();
		ps.println("linha de teste"	);
		
	
		ps.close();
	}

}
