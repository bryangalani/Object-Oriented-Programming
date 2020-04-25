package pacote01;

public class Referencia {

	int modificadorDefault = 0;
	private int modificadorPrivado = 0;
	public int modificadorPublico = 0;
	protected int modificadorProtegido=0;
	
	void testeAcesso() {
		modificadorDefault= 0;
		modificadorPrivado = 0;
		modificadorPublico = 0;
		modificadorProtegido=0;

	}
	public void testPrivate() {
		Referencia r1 = new Referencia();
		r1.modificadorPrivado = 0;
		Referencia r2 = new Referencia();
		r2.modificadorPrivado = r1.modificadorPrivado;
	}	
	

}
