

import static org.junit.Assert.*;

import org.junit.Test;

public class testeProduto {

	
	@Test
	public void testProduto() {
		Produto p1 = new Produto("Sabonete","A454F",2.50);

		assertEquals("Sabonete", p1.getNome());
		assertEquals("A454F", p1.getCodigo());
		assertEquals(2.5, p1.getPreco());

	}

}
