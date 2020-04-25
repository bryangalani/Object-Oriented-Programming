package pacote01;

public class OutraMesmoPacote {

	void testeAcesso() {
		Referencia r = new Referencia();
		r.modificadorDefault= 0;
		//r.modificadorPrivado = 0; erro
		r.modificadorPublico = 0;
		r.modificadorProtegido=0;

	}
	
	public void TestePrivate() {
		Referencia r1 = new Referencia();
		//r1.modificadorPrivado = 0; erro
		Referencia r2 = new Referencia();
		//r2.modificadorPrivado = r1.modificadorPrivado; erro
	}
}
