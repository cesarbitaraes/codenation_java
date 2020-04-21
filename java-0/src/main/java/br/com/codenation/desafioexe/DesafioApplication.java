package br.com.codenation.desafioexe;

import java.util.ArrayList;
import java.util.List;

public class DesafioApplication {

	public static List<Integer> fibonacci() {
		List<Integer> ListaFibonacci = new ArrayList<Integer>();
		ListaFibonacci.add(0);
		ListaFibonacci.add(1);

		int i=1;
		while (ListaFibonacci.get(i)<350){
			ListaFibonacci.add(ListaFibonacci.get(i)+ListaFibonacci.get(i-1));
			i++;
		}

		return ListaFibonacci;
	}

	public static Boolean isFibonacci(Integer a) {
		if (DesafioApplication.fibonacci().contains(a)) {
			return true;
		} else {
			return false;
		}
	}
}