

import static org.junit.Assert.*;

import org.junit.Test;

public class testeProdutoComTamanho {

	@Test
	public void testProdutoComTamanho() {
		ProdutoComTamanho p7 = new ProdutoComTamanho("Blusa","FF75G",69.90,"G");

		assertEquals("Blusa", p7.getNome());
		assertEquals("FF75G", p7.getCodigo());
		assertEquals(69.9, p7.getPreco());
		assertEquals("G", p7.getTamanho());

	}
}
