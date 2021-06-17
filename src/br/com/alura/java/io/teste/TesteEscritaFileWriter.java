package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class TesteEscritaFileWriter {

	public static void main(String[] args) throws IOException {

//		OutputStream fos = new FileOutputStream("lorem2.txt");
//		Writer osw = new OutputStreamWriter(fos); //transformar bytes em caracteres
//		BufferedWriter bw = new BufferedWriter(osw); //juntar vários caracteres que estão dentro de uma linha
		
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));
		bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
		bw.newLine();
		bw.newLine();
//		fw.write(System.lineSeparator());
//		fw.write(System.lineSeparator());
		bw.write("linha de teste");
		
		bw.close();
	}

}
