package oppg2;

import java.util.ArrayDeque;
import java.util.Queue;


public class Rutsjebane {
	

    private final Queue<Burger> burgere = new ArrayDeque<>();

    public synchronized void leggPaaBurger(Kokk kokk, Burger burger) throws InterruptedException {
       while(burgere.size() == 5) {
    	   wait();
    	   System.out.println("Rutsjebanen er full! Venter på servitør.");
       }
       notifyAll();
        burgere.add(burger);
        System.out.printf("%s legger på burger%s => %s\n", kokk, burger, burgere);
    }

    public synchronized void taAvBurger(Servitor servitor) throws InterruptedException {
    	while(burgere.size() == 0) {
    		wait();
    		System.out.println("Rutsjebanen er tom! Venter på kokk.");
    	}
    	notifyAll();
        if (!burgere.isEmpty()) {
        	
            Burger burger = burgere.remove();
            System.out.printf("%s tar av burgere%s <= %s\n", servitor, burger, burgere);
        }
    }
}
