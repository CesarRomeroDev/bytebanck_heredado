package bytebanck_heredado;

public class TestSistemaInterno {
	public static void main(String[] args) {
		SistemaInterno sistema = new SistemaInterno();
		Gerente gerente1 = new Gerente();
		Administrador admin1 = new Administrador();
		
		sistema.autentica(gerente1);
		sistema.autentica(admin1);
	}
}
