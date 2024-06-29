package main;


public class Main {
	public static void main(String[] args) {
		
		double importeTransferencia = 20000;
		
		CuentaBancaria cuenta1 = new CuentaBancaria(101,"Juan Morales", 100000, importeTransferencia); //Cuenta Origen
		cuenta1.setEstrategiaInteres(new EstrategiaCCPesos());
		
		CuentaBancaria cuenta2 = new CuentaBancaria(102,"Maria Perez", 100000); //Cuenta Destino
		
		double transferenciainteres = cuenta1.calcularInteres();

		cuenta1.transferir(cuenta2, importeTransferencia, transferenciainteres);
		
		System.out.println("Interes por transferencia: " + transferenciainteres);
		System.out.println("Origen: "+ cuenta1.toString());
		System.out.println("Destino: "+ cuenta2.toString());
		
	}
}
