package pacote02;

import pacote01.Referencia;

public class OutraForaPacote {

	void testeAcesso() {
		Referencia r = new Referencia();
		//r.modificadorDefault= 0; erro
		//r.modificadorPrivado = 0; erro
		r.modificadorPublico = 0;
		//r.modificadorProtegido=0; erro

	}
}
