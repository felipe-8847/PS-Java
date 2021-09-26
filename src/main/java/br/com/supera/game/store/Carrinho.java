package br.com.supera.game.store;


public class Carrinho {
	
		
	public double calcCarrinho (Product obj) {
		
		 double total = 0;
		 double subTotal = 0;	
		 double frete = 0;

		if (obj != null) {
			subTotal = subTotal + obj.getPrice();
			frete = frete + 10;
		}
		
		if (subTotal >= 250) {
			frete = 0;
		}
		
		return total = subTotal + frete;
	}
	
}
