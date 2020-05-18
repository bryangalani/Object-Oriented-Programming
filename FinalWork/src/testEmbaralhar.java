import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testEmbaralhar {

	@Test
	void testEmbaralhar01() {
		Embaralhador emb1 = new Embaralhador01();
		assertEquals("etleemo",emb1.embaralhar("omelete"));
	}
	
	@Test
	void testEmbaralhar02() {
		Embaralhador emb2 = new Embaralhador02();
		assertEquals("moletee",emb2.embaralhar("omelete"));
	}

}
