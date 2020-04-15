public class Paciente {
	double peso;
	double altura;
	
	Paciente(double peso, double altura){
		this.altura = altura;
		this.peso = peso;
	}
	
	double calcularIMC() {
		return peso/(altura*altura);
	}
	
	String diagnostico() {
		double imc = calcularIMC();
		
		if(imc < 16.00) {
			return "Baixo peso muito grave";
		}else if(imc>=16.00 && imc <17.00 ){
			return "Baixo peso grave";
		}else if(imc>=17.00 && imc < 18.50) {
			return "Baixo peso";
		}else if(imc>=18.50 && imc<25.00) {
			return "Peso normal";
		}else if(imc>=25.00 && imc <30.00) {
			return "Sobrepeso";
		}else if(imc>= 30.00 && imc<35.00) {
			return "Obesidade grau 1";
		}else if(imc>=35.00 && imc <40.00) {
			return "Obesidade grau 2";
		}else {
			return"Obesidade grau 3 (obesidade mórbida)";
		}		
	}
}
