/*
Fazer um programa para ler um número inteiro N e os dados 
(nome e preço) de N Produtos. 
Armazene os N produtos em um vetor. 
Em seguida,mostrar o preço médio dos produtos.
*/
package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidade.Produto;

public class Programa {

	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Digite o tamanho do Vetor:");
		
		int n = sc.nextInt();
		
		Produto[] vetor = new Produto[n];
		
		for(int i=0; i< n; i++)
		{
			sc.nextLine();
			System.out.println("Nome: ");
			String nome  = sc.nextLine();
			System.out.print("Preço: ");
			double preco = sc.nextDouble();
			
			vetor[i] = new Produto(nome, preco);
 		}
		
		double soma = 0;
		for(int i = 0; i < n;i++) 
		{
			soma += vetor[i].getPreco();
		}
		
		System.out.printf("O Preço medio dos produtos:" + (soma)/n);
		
	
		sc.close();
		
	}
}
