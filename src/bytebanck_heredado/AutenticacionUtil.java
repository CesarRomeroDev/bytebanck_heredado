package bytebanck_heredado;

public class AutenticacionUtil {
	
	private String clave;
	
	public boolean iniciarSesion(String clave) {
		if(this.clave == clave) {
			return true;
		}
		return false;
	}
	
	public void setClave(String clave) {
		this.clave = clave;
	}
}
