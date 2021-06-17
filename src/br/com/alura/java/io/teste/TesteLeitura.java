package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;


public class TesteLeitura {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("lorem.txt");
		InputStreamReader isr = new InputStreamReader(fis, "UTF-8"); //transformar bytes em caracteres
		BufferedReader br = new BufferedReader(isr); //juntar vários caracteres que estão dentro de uma linha
		
		String linha = br.readLine();

        while(linha != null) {
            System.out.println(linha);
            linha = br.readLine();
        }
				
		br.close();
	}

}
