public class Principal {
	public static void main(String[] args) {

		Produto p1 = new Produto("Sabonete","A454F",2.50);
		Produto p2 = new Produto("Amaciante","A78F9",12.30);
		Produto p3 = new Produto("Sabonete","B484D",4.0);
		
		ProdutoComTamanho p4 = new ProdutoComTamanho("Blusa","AA45B",40.0,"M");
		ProdutoComTamanho p5 = new ProdutoComTamanho("Sapato","S65GD",100.0,"39");
		ProdutoComTamanho p6 = new ProdutoComTamanho("Blusa","FF75G",69.90,"M");
		ProdutoComTamanho p7 = new ProdutoComTamanho("Blusa","FF75G",69.90,"G");


		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.adicionaProduto(p1, 4);
		carrinho.adicionaProduto(p3, 2);
		carrinho.removeProduto(p1, 3);
		carrinho.adicionaProduto(p4, 3);
		carrinho.adicionaProduto(p6, 2);
		carrinho.removeProduto(p6, 1);
		carrinho.adicionaProduto(p7, 6);
		carrinho.removeProduto(p7, 1);

		
		carrinho.calculaValorTotalDaCompra();
	}
}
