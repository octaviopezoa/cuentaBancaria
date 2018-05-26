package cuentaBancaria;

import java.util.Scanner;;

public class Principal {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Cuenta cuenta1 = new Cuenta("octavio");
		Cuenta cuenta2 = new Cuenta("Dario", 300);
		System.out.println(cuenta2);
		
		//Ingresamos dinero
		//cuenta1.ingresar(300);
		System.out.println("ingrese dinero cuenta 1");
		cuenta1.ingresar(Double.parseDouble(sc.nextLine()));
		
		System.out.println("ingrese dinero cuenta 2");
		cuenta2.ingresar(Double.parseDouble(sc.nextLine()));
		
		//Retiramos dinero
		cuenta1.retirar(200);
		cuenta2.retirar(100);
		
		System.out.println(cuenta1);
		System.out.println(cuenta2);
		
	}
}
