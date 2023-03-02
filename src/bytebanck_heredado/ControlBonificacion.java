package bytebanck_heredado;

public class ControlBonificacion {
	private double suma;		//Se va sumando poco a poco 
	
	//QUÉ ES POLIMORFISMO?
	//El polimorfismo es cuando varias clases extienden de la clase madre. 
	
	public double registrarSalario(Funcionario funcionario) {	//cada vez que se registre un nuevo funcionario
		this.suma = funcionario.getBonificacion() + this.suma;	//entonces vamos a recibir la bonificación y la vamos a sumar a la suma actual que ya esta acumulada.
		System.out.println("Calculo actual: " + this.suma);
		return this.suma;
	}
	
	//Se le llama sobre carga de metodo cuando tienes diferentes argumentos.
	
	//public double registrarSalario(Gerente gerente) {	//cada vez que se registre un nuevo Gerente
	//	this.suma = gerente.getBonificacion() + this.suma;	//entonces vamos a recibir la bonificación y la vamos a sumar a la suma actual que ya esta acumulada.
	//	System.out.println("Calculo actual: " + this.suma);
	//	return this.suma;
	//}
	
	//public double registrarSalario(Contador contador) {	//cada vez que se registre un nuevo Gerente
	//	this.suma = contador.getBonificacion() + this.suma;	//entonces vamos a recibir la bonificación y la vamos a sumar a la suma actual que ya esta acumulada.
	//	System.out.println("Calculo actual: " + this.suma);
	//	return this.suma;
	//}
	
}
