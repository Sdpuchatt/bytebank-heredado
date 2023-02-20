package paquetito;

public class Cuenta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	static int cantidadCuentas = 0;
	
	public Cuenta (int agencia, int numero) {
		this.agencia = agencia;
		this.numero = numero;
	}
	public Cuenta(double saldo, int agencia, int numero, Cliente titular) {
		this.saldo = saldo;
		this.agencia = agencia;
		this.numero = numero;
		this.titular = titular;
		cantidadCuentas++;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public int getAgencia() {
		return this.agencia;
	}
	public void setNumero(int numero) {
		if(numero>0) {
			this.numero = numero;			
		}
	}
	public int getNumero() {
		return this.numero;
	}
	public void setTitulat(Cliente titular) {
		this.titular = titular;
	}
	public Cliente getTitular() {
		return this.titular;
	}

	public void depositar(double valor) {
		if(valor>0) {
			this.saldo += valor;
		}
	}

	public boolean retirar(double valor) {
		if (this.saldo >= valor) {
			this.saldo = this.saldo - valor;
			return true;
		}

		return false;
	}

	public boolean tranferir(double valor, Cuenta otraCuenta) {
		if (this.saldo >= valor) {
			this.saldo = this.saldo - valor;
			otraCuenta.depositar(valor);
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "Cuenta [saldo=" + saldo + ", agencia=" + agencia + ", numero=" + numero + ", titular=" + titular + "]";
	}
}
