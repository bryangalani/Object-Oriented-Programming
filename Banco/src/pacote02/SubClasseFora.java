package pacote02;
import pacote01.Referencia;

public class SubClasseFora extends Referencia{

	void testeAcesso() {//sobrescrevendo o metodo
		//modificadorDefault= 0; erro
		//modificadorPrivado = 0; erro
		modificadorPublico = 0;
		modificadorProtegido=0;

	}
	
	private void testOfOverride() {
		System.out.println("hello");
	}
	
}
