package bytebanck_heredado;

//QUE ES UNA CLASE ABSTRACT?
//nos indica que la clase es abstracta es una representacion conseptual y no puede ser instanciada como tal no puede ser representada fisicamente del objeto hijo. 
public abstract class Funcionario {
	private String nombre;
	private String documento;
	private double salario;
	
	private int tipo;
	
	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	//Constructor(Es un metodo de tipo de retorno de la clase funcionario que puede aceptar
	//las variables como parametros de la clase Funcionario)
	public Funcionario() {
		
	}
	
	//get and set de nombre
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre( String nombre ) {
		this.nombre = nombre;
	}
	
	//get and set de documento
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	
	//get and set de salario
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	//Obtener la bonificación del 10% del empleado
	public abstract double getBonificacion();
	//{
	//	return this.salario * 0.05;
	//}
}
