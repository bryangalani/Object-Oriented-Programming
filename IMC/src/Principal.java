public class Principal {

	public static void main(String[] args) {
		
		Paciente Joao = new Paciente(60.00,1.74);
		Paciente Pedro = new Paciente(110.00,1.78);
		Paciente Ana = new Paciente(45.00,1.58);
		
		System.out.println("IMC: " + Joao.calcularIMC()+": " +Joao.diagnostico());
		System.out.println("IMC: " + Pedro.calcularIMC()+": " +Pedro.diagnostico());
		System.out.println("IMC: " + Ana.calcularIMC()+": " +Ana.diagnostico());
	}
}
