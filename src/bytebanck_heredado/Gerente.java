package bytebanck_heredado;

public class Gerente extends Funcionario implements Autenticable {
	
	@Override //sobre escritura de metodo
	public double getBonificacion() {
		System.out.println("ejecutando desde gerente");
		return super.getSalario() + super.getSalario() * 0.05;
	}

	@Override
	public boolean iniciarSesion(String clave) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setClave(String clave) {
		// TODO Auto-generated method stub
		
	}
}
