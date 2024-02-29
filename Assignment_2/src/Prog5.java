import java.util.Arrays;

public class Prog5 {

    public static int[] combine(int[] a, int[] b) {
        int[] returnArray = new int[a.length + b.length];
        System.arraycopy(a, 0, returnArray, 0, a.length);
        System.arraycopy(b, 0, returnArray, a.length, b.length);
        return returnArray;
    }

    public static void main(String[] args) {
        int[] a = {5,6,-4,3,1};
        int[] b = {3,8,9,11};
        System.out.println(Arrays.toString(combine(a, b)));
    }
}
