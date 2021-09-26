package br.com.supera.game.store;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Carrinho carrinho = new Carrinho();
		
		List<Product> lista = new ArrayList<Product>();

		
		lista.add(new Product("felipe",10.00,"teste"));
		lista.add(new Product("alves",10.00,"jljjljl"));

		
		System.out.println(lista);

	}

}
