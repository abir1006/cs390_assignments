
public class Prog6 {
    static int min(int[] arrayOfInts){
        if (arrayOfInts.length == 0) {
            return 0;
        }
        int minValue = arrayOfInts[0];
        for (int i=1; i<arrayOfInts.length; i++) {
            if (arrayOfInts[i] < minValue) {
                minValue = arrayOfInts[i];
            }
        }
        return minValue;
    }
    public static void main(String[] args) {
     int[] arrayOfInts = {2, -21, 3, 45, 0, 12, 18, 6, 3, 1, 0, -22};
     System.out.println(min(arrayOfInts));
    }
}
