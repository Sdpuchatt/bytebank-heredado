package paquetito;

public class Gerente extends Funcionario{
	private int contrasena;
	
	public Gerente() {
		super();
	}
	
	public Gerente(String nombre, String documento, double salario) {
		super(nombre,documento,salario);
	}
	public void setContrasena(int contra) {
		this.contrasena = contra;
	}
	public boolean autenticar(int contra) {
		if(this.contrasena == contra) {
			return true;
		}
		return false;
	}
	@Override
	public double getBonificacion() {
		return super.getSalario() + super.getBonificacion();
	}
}
