
public class Authenticator {

	public User logar(String login, String senha) throws loginException{
	if(login.equals("bryan") && senha.equals("senha")) {
		return new User(login);
	}	
		throw new loginException("User and password not matching", login);
	}
}
