package oppg2;

public class ProducerConsumer {

    public static void main(String[] args) {
        Rutsjebane rutsjebane = new Rutsjebane();

        Kokk k1 = new Kokk(rutsjebane, 1);
        Kokk k2 = new Kokk(rutsjebane, 2);
        Kokk k3 = new Kokk(rutsjebane, 3);


        Servitor c1 = new Servitor(rutsjebane, 1);
        Servitor c2 = new Servitor(rutsjebane, 2);


        k1.start();
        k2.start();
        k3.start();

        c1.start();
        c2.start();

    }
}
