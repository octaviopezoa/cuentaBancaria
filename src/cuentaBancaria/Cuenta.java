package cuentaBancaria;

public class Cuenta {
	//Atributos
	private String titular;
	private double cantidad;
	
	//Constructores
	public Cuenta(String titular) {
		super();
		this.titular = titular;
	}

	public Cuenta(String titular, double cantidad) {
		super();
		this.titular = titular;
		
		if (cantidad<0) {
			this.cantidad=0;
		} else {
			this.cantidad = cantidad;
		}
	
		
		
		
	}
	
	//Metodos
	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
	
	public void ingresar(double cantidad) {
		if (cantidad>0) {
			this.cantidad+=cantidad;
		}
	}
	
	public void retirar(double cantidad) {
		if (this.cantidad-cantidad<0) {
			this.cantidad=0;
		} else {
			this.cantidad-=cantidad;
		}
	}

	@Override
	public String toString() {
		return "el titular " + titular + ", tiene " + cantidad + " euros en la cuenta";
	}	
	
}
