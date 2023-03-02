package bytebanck_heredado;

public interface Autenticable {		//Las interfaces no pueden tener metodos implementados ni pueden ser extends a otra clase.
	
	public void setClave(String clave);
	
	public boolean iniciarSesion( String clave );
}
