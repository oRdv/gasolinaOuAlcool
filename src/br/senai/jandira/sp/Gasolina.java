package br.senai.jandira.sp;

import java.util.Scanner;

public class Gasolina {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		
		System.out.println("************************");		
		System.out.println("Gasolina ou Álcool?");
		System.out.println("************************");	
		
		System.out.print("Qual é o preço da gasolina?");
		double gasolina = teclado.nextDouble();
				
		System.out.print("Qual é o preço do álcool?");
		double alcool = teclado.nextDouble();
		
		
		System.out.println("************************");
        
		double result; 
		
		result = gasolina * 0.7;
		
		
		if(result> alcool) {
			
			System.out.println("Olá! A gasolina está mais vantajoso abastecer com a gasolina.");
			
		} else {
			
			System.out.println("É mais vantajoso abastecer com álcool.");
			
		}
	}

}
