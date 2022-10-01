public class Main {

    public static void main(String[] args) {

        Fighter f1 = new Fighter("Muhammed Ali",100,20,100,50);
        Fighter f2 = new Fighter("George Foreman",100,10,95,30);

        Ring r1 = new Ring(f1,f2,80,120);
        r1.run();
    }
}
