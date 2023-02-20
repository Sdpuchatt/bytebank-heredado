package paquetito;

public class Cliente {
	String nombre;
	String numeroIdentidad;
	String profesion;
	
	public Cliente(String nombre, String numeroIdentidad,String profesion) {
		this.nombre = nombre;
		this.numeroIdentidad = numeroIdentidad;
		this.profesion = profesion;
	}
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getNumeroIdentidad() {
		return numeroIdentidad;
	}


	public void setNumeroIdentidad(String numeroIdentidad) {
		this.numeroIdentidad = numeroIdentidad;
	}


	public String getProfesion() {
		return profesion;
	}


	public void setProfesion(String profesion) {
		this.profesion = profesion;
	}


	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", numeroIdentidad=" + numeroIdentidad + ", profesion=" + profesion + "]";
	}
}
