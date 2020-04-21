package br.com.codenation.calculadora;


public class CalculadoraSalario {

	public long calcularSalarioLiquido(double salarioBase) {
		if ((Double)salarioBase == null) {
			throw new NullPointerException("O salário não pode ser null");
		}
		if (salarioBase <= 1039.00){
			return Math.round(0.0);
		} else{
			double valorDescontado;
			valorDescontado = calcularInss(salarioBase);
			return Math.round(calcularDescontoIrrf(valorDescontado));
		}
	}

	private double calcularInss(double salarioBase) {
		if (salarioBase <= 1500.00){
			return salarioBase-(salarioBase * 0.08);
		} else if (salarioBase <= 4000.00){
			return salarioBase-(salarioBase * 0.09);
		} else{
			return salarioBase-(salarioBase * 0.11);
		}
	}

	private double calcularDescontoIrrf(double salarioBase) {
		if (salarioBase <= 3000.00) {
			return salarioBase;
		} else if (salarioBase <= 6000.00) {
			return salarioBase-(salarioBase*0.075);
		}
		else{
			return salarioBase-(salarioBase*0.15);
		}
	}
}
