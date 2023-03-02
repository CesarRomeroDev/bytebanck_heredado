package bytebanck_heredado;

public class SistemaInterno {
	
	private String clave = "AluraCursos";
	
	public boolean autentica(Autenticable autenticar) {
		boolean puedeIniciarSesion = autenticar.iniciarSesion(clave);
		if ( puedeIniciarSesion ) {
			System.out.println("Login exitoso");
			return true;
		} else {
			System.out.println("Error en login");
			return false;
		}
	}
}
