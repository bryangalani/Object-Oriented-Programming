import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.Assert.*;

class testAuthenticator {

	@Test
	void sucessfullyLogin() throws loginException {
		Authenticator a = new Authenticator();
		User u = a.logar("bryan","senha");
		assertEquals("bryan", u.getLogin());
	}

}
