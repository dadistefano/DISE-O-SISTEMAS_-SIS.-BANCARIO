package main;


//Estrategias Cuenta Caja de ahorro en Pesos
public class EstrategiaCAPesos implements EstrategiaInteres {
	@Override
	public double calcularInteres(double transferencia) {
	   return transferencia * 0.01; //Calculo de intereses para cuentas de CA, 1% de interes
	}
}
