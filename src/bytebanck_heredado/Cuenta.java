package bytebanck_heredado;

// los atributos de la clase Cuenta llevan por defecto 0.
public abstract class Cuenta {    //No podemos instancias clases abstractas
	
	protected double saldo;		 //protected nos serve para poder acceder al atributo sin dejar de protegerlo.
	private int agencia;		//private para que nadie trabaje diractamente con el saldo, no modificarlo
	private int numero;
	private Cliente titular = new Cliente();
	
	private static int total = 0;  //usando static nos indica que no es de la instancia, si no de la clase y no va ser alterada
	
	public Cuenta(int agencia, int numero) { 	//retorna nuestro objeto cuenta es un constructor en java
		if (agencia <= 0) {
			System.out.println("no se permite cero");
			this.agencia = 1;		//Indicamos que elnumero de agencia se por defecto uno si es que agregan 0
			this.numero = numero;
			//esto nos permite quitar el cero por defecto que viene en clase.
		}else {
			this.agencia = agencia;
		}
		total++;
		System.out.println("Se van creando " + total + " cuentas.");
	}
	
	public abstract void depositar(double valor);
	 //El metodo depositar se hizo abstract y se quita el cuerpo
	//NO RETORNA VALOR
	//public void depositar(double valor){	//No retorna nada al agregar void
	//	this.saldo+= valor;	//this nos sirve para hacer referencia a los atributos de la clase.
	//}
	
	//RETORNA VALOR
	public boolean retirar(double valor) {
		if ( this.saldo >= valor ) {
			this.saldo-= valor;
			return true;
		}
		return false;
	}
	
	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean transferir(double valor, Cuenta destino) {
		if( this.saldo >= valor ) {
			this.saca(valor);
			destino.depositar(valor);
			return true;
		}
		return false;
	}
	
	public double getSaldo(){		//obtenerSaldo = getSaldo
		return this.saldo;
	}
	
	public int getAgencia() {
		return agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public static int getTotal() {
		return Cuenta.total;  //no lo tenemos a nivel instancia, si no a nivel clase
	}
}
