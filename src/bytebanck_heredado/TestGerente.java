package bytebanck_heredado;

public class TestGerente {
	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		//diego.setNombre("Diego");
		//diego.setDocumento("43534534453");
		//diego.setSalario(5000);
		
		//Funcionario gerente = new Funcionario();
		gerente.setSalario(6000);
		gerente.setClave("AluraCursos");
		//gerente.setTipo(1);
		
		System.out.println( "Salario Gerente: " + gerente.getSalario() );
		System.out.println( "Bonificacion: " + gerente.getBonificacion() );
		System.out.println(gerente.iniciarSesion("AluraCursos"));
	}
}
