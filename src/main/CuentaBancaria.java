package main;

public class CuentaBancaria {
	
	private int nrocuenta;
	private String nombreCuenta;
	private EstrategiaInteres estrategiaInteres;
	private double saldo;
	private double transferencia;

	
	public CuentaBancaria(double transferencia) {
		this.transferencia = transferencia;
	}
	
	public CuentaBancaria(int nrocuenta, String nombreCuenta, double saldo, double transferencia) {
		super();
		this.nrocuenta = nrocuenta;
		this.nombreCuenta = nombreCuenta;
		this.saldo = saldo;
		this.transferencia = transferencia;
	}
	
	public CuentaBancaria(int nrocuenta, String nombreCuenta, double saldo) {
		super();
		this.nrocuenta = nrocuenta;
		this.nombreCuenta = nombreCuenta;
		this.saldo = saldo;
	}

	public void setEstrategiaInteres(EstrategiaInteres estrategiaInteres) {
	 this.estrategiaInteres = estrategiaInteres;
	}
	
	public double calcularInteres() {
	 if (estrategiaInteres == null) {
	     throw new IllegalStateException("No se ha establecido una estrategia de interés.");
	 }
	 return estrategiaInteres.calcularInteres(transferencia);
	}

	@Override
	public String toString() {
		return "CuentaBancaria [Nro cuenta=" + nrocuenta + ", Nombre Cuenta=" + nombreCuenta + ", Saldo=" + saldo + "]";
	}
	
	
	public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Depósito exitoso. Nuevo saldo: " + saldo);
        } 
		else {
            System.out.println("Cantidad insuficiente"); 
		} 
	}
	
	
	public void transferir(CuentaBancaria destino, double cantidad, double intereses) {
        if (cantidad > 0 && saldo >= cantidad) {
        	saldo -= cantidad+intereses;
            destino.depositar(cantidad);
            System.out.println("Transferencia exitosa");
        }
	}


}