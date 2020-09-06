package oppg2;

public class Servitor extends Thread {

    private final int number;
    private final Rutsjebane rutsjebane;

    public Servitor(Rutsjebane rutsjebane, int number) {
        this.rutsjebane = rutsjebane;
        this.number = number;
    }

    public void run() {
        int value = 0;

        for (int i = 0; i < 1000; i++) {
            try {
                sleep((long) (Math.random() * 2000) + 4000);


            } catch (InterruptedException e) {

            }

            try {
				rutsjebane.taAvBurger(this);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
    }

    @Override
    public String toString() {
        return "Servitør" + number;
    }
}