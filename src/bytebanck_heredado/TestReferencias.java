package bytebanck_heredado;

public class TestReferencias {
	public static void main(String[] args) {
		//el elemento mas generico puede ser adapatado al mas especifico
		Funcionario funcionario = new Gerente();
		funcionario.setNombre("Diego");
		
		Gerente gerente = new Gerente();
		gerente.setNombre("Jimena");
		
		funcionario.setSalario(2000);
		gerente.setSalario(10000);
		
		gerente.iniciarSesion("sdfsfsdf");
	}

}
