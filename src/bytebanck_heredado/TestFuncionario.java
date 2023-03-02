package bytebanck_heredado;

public class TestFuncionario {
	public static void main(String[] args) {
		Funcionario cesar = new Contador();
		cesar.setNombre("Cesar");
		cesar.setDocumento("5466476546");
		cesar.setSalario(2000);
		//cesar.setTipo(0);
		
		System.out.println("Salario Funcionario: " + cesar.getSalario());
		System.out.println("Bonificación: " + cesar.getBonificacion());
		
	}
}
