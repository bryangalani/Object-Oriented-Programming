
public class Principal {

	public static void main(String[] args) {

		Pizza pizza1 = new Pizza();
		Pizza pizza2 = new Pizza();
		Pizza pizza3 = new Pizza();
		
		pizza1.adicionaIngrediente("Tomate");
		pizza1.adicionaIngrediente("Queijo");
		pizza1.adicionaIngrediente("Oregano");
		
		pizza2.adicionaIngrediente("Carne");
		pizza2.adicionaIngrediente("Queijo");
		pizza2.adicionaIngrediente("Azeitona");
		pizza2.adicionaIngrediente("Cebola");
		pizza2.adicionaIngrediente("Ovo");
		pizza2.adicionaIngrediente("Presunto");

		
		pizza3.adicionaIngrediente("Queijo");
		pizza3.adicionaIngrediente("Molho");

		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.adicionar(pizza1);
		carrinho.adicionar(pizza2);
		carrinho.adicionar(pizza3);
		
		carrinho.getValorTotal();
		System.out.println("A quantidade de ingredientes utilizados foram: \n" + Pizza.ingredienteTotal);
		
	}

}
