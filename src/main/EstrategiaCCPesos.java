package main;

//Estrategias Cuenta Corriente en Pesos
public class EstrategiaCCPesos implements EstrategiaInteres {
	@Override
	public double calcularInteres(double transferencia) {
	   return transferencia * 0.02; //Calculo de intereses para cuentas de CC, 2% de interes
	}
}