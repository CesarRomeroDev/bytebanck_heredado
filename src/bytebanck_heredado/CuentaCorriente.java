package bytebanck_heredado;

public class CuentaCorriente extends Cuenta {
	
	public CuentaCorriente( int agencia, int numero ) {
		super( agencia, numero );
	}
	
	@Override //sobreescrito
	public boolean saca(double valor) {
		double comision = 0.2;
		return super.saca(valor + comision);
	}

	@Override
	public void depositar(double valor) {
		// TODO Auto-generated method stub
		
	}
}
