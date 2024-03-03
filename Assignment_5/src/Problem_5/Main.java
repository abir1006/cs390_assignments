package Problem_5;

public class Main {
    public static void main(String[] args) {

        Computer computer1 = new Computer("Apple", "M2", 16, 3.9);
        Computer computer2 = new Computer("Apple", "M1", 16, 3.5);
        Computer computer3 = new Computer("Dell", "i7", 8, 2.8);

        System.out.println("Are computer1 and computer2 equal? " + computer1.equals(computer2));
        System.out.println("Are computer1 and computer3 equal? " + computer1.equals(computer3));


        System.out.println("Hash code of computer1: " + computer1.hashCode());
        System.out.println("Hash code of computer2: " + computer2.hashCode());
        System.out.println("Hash code of computer3: " + computer3.hashCode());

        if (computer1.equals(computer2) && computer1.hashCode() == computer2.hashCode()) {
            System.out.println("Equal computer");
        }

    }
}
