package main;

import java.util.ArrayList;
import java.util.Scanner;

import hilos.Hilo;

public class Main {

	public static void main(String[] args) {
		ArrayList<Hilo> listaHilos = new ArrayList<Hilo>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Cuantas veces quieres tirar una moneda?");
		int nVecesMoneda = sc.nextInt();
		
		ArrayList<Integer> listaCara = new ArrayList<Integer>();
		ArrayList<Integer> listaCruz = new ArrayList<Integer>();
		
		for(int i = 1 ; i <= nVecesMoneda; i++) {
			listaHilos.add(new Hilo(listaCara, listaCruz));
			
			listaHilos.get(i-1).start();
		}
		
		
		for(Hilo hilos : listaHilos) {
			try {
				hilos.join();
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("Caras = " + listaCara.size());
		System.out.println("Cruces = " + listaCruz.size());
		
		
		
		
		
		 
		
	}

}
