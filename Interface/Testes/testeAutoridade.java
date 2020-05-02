import static org.junit.Assert.*;

import org.junit.Test;

public class testeAutoridade {
	
	@Test
	public void testInformal() {		
		FormatadorNome informal = new Informal();

		Autoridade autoridade = new Autoridade ("Jorgin", "Tagarela", informal);
		
		assertEquals("Jorgin", autoridade.getTratamento());
	}
	
	@Test
	public void testRespeitoso() {
		FormatadorNome respeitoso = new Respeitoso("MASCULINO");
		FormatadorNome respeitosa = new Respeitoso("F");

		Autoridade autoridade = new Autoridade ("Joao", "Marcos", respeitoso);
		Autoridade autoridade2 = new Autoridade ("Marcela", "Barros", respeitosa);


		assertEquals("Sr. Marcos", autoridade.getTratamento());
		assertEquals("Sra. Barros", autoridade2.getTratamento());
	}
	
	@Test
	public void testComTitulo() {
		FormatadorNome ComTitulo = new ComTitulo("Magnifico");
		
		Autoridade autoridade = new Autoridade ("Joao", "Marcos", ComTitulo);

		assertEquals("Magnifico Joao Marcos", autoridade.getTratamento());
	}

}
