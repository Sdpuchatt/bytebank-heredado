package paquetito;

public class Main {
	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario("Sergio","34500492",4500);
		Gerente gerente = new Gerente("Mayra","34406902",9000);
		
		System.out.println(funcionario.getBonificacion());
		System.out.println(gerente.getBonificacion());
	}
}
