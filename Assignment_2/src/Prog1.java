public class Prog1 {
    public static void main(String[] args) {

        RandomNumbers rn = new RandomNumbers();

        int x = rn.getRandomInt(1,9);
        int y = rn.getRandomInt(3,14);
        double result1 = Math.pow(Math.PI, x);
        double result2 = Math.pow(y, Math.PI);
        System.out.println(result1);
        System.out.println(result2);
    }
}
