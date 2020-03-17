/*
Fazer um programa para ler um n�mero inteiro N e os dados 
(nome e pre�o) de N Produtos. 
Armazene os N produtos em um vetor. 
Em seguida,mostrar o pre�o m�dio dos produtos.
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
		
		//Define o tamanho do vetor 
		System.out.printf("Digite o tamanho do Vetor:");
		
		int n = sc.nextInt();
		//Instanciando o vetor 
		Produto[] vetor = new Produto[n];
		
		//entrada dos valores
		for(int i=0; i< n; i++)
		{
			sc.nextLine();
			System.out.println("Nome: ");
			String nome  = sc.nextLine();
			System.out.print("Pre�o: ");
			double preco = sc.nextDouble();
			
			vetor[i] = new Produto(nome, preco);
 		}
		
		//Soma o preco dos produtos 
		double soma = 0;
		for(int i = 0; i < n;i++) 
		{
			soma += vetor[i].getPreco();
		}
		
		//Imprime o resultado e calcula a media de preco
		System.out.printf("O Pre�o medio dos produtos:" + (soma)/n);
		
	
		sc.close();
		
	}
}
