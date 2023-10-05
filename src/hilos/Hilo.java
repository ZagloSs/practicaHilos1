package hilos;

import java.util.ArrayList;
import java.util.Random;

public class Hilo extends Thread {

	private ArrayList<Integer> listaCara;
	private ArrayList<Integer> listaCruz;
	
	public Hilo(ArrayList<Integer> listaCara, ArrayList<Integer> listaCruz) {
		super();
		this.listaCara = listaCara;
		this.listaCruz = listaCruz;
	}



	public void run() {
		Random r = new Random();
		int numRand = r.nextInt(2);
		if(numRand == 0) {
			synchronized (listaCruz) {
				listaCruz.add(numRand);
			}
			
		}else {
			synchronized (listaCruz) {
				listaCara.add(numRand);
			}
			
		}
	}
	
}
