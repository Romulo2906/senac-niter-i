package app;

import java.util.Scanner;

import modelo.Produto;

public class Aplicativo {
	public static void main(String[]args) {
	    Produto p;
	    
	    p  = new Produto();
	    
		Scanner leitura = new Scanner(System.in);
		
		System.out.print("Código do produto: ");
		p.codigo = leitura.nextInt();
		System.out.print("Nome: ");
		p.nome = leitura.next();
		System.out.print("Quantidade: ");
		p.quantidade = leitura.nextInt();
		System.out.print("Preço: ");
		p.preco = leitura.nextDouble();
		System.out.print("Quantidade de estoque: ");
		p.estoque = leitura.nextInt();
		
		leitura.close();
		
		System.out.println("Os dados informados foram: " +
							"\nCódigo: " + p.codigo +
							"\nNome: " + p.nome +
							"\nQuantidade: " + p.quantidade +
							"\nPreço: " + p.preco +
							"\n\nO produto com desconto é: " + p.geraDesconto());

	}
}
