import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;


public class testeCarrinhoDeCompras {
	
	CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
	Produto p1 = new Produto("Sabonete","A454F",2.50);
	Produto p2 = new Produto("Amaciante","A78F9",12.30);
	
	
	@Test
	public void testCarrinho() {
		carrinho.adicionaProduto(p1, 2);
		carrinho.adicionaProduto(p2,3);
		assertEquals(41.90,carrinho.calculaValorTotalDaCompra());
	}

}
