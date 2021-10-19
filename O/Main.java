package Contador_2.O;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Hilo_Incrementador>hilos_Mas = new ArrayList<Hilo_Incrementador>();
		ArrayList<Hilo_Decrementador>hilos_mneos = new ArrayList<Hilo_Decrementador>();
		
		for(long i=0;i<1000000000;i++) {
			hilos_Mas.add(new Hilo_Incrementador());
			hilos_mneos.add(new Hilo_Decrementador());
		}

		for(Hilo_Incrementador a : hilos_Mas) {
			a.start();
		}
		
		
	}

}
