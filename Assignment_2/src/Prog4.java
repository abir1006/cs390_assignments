import java.util.Arrays;

public class Prog4 {
    public static void main(String[] args) {

        float num1 = 1.27f;
        float num2 = 3.881f;
        float num3 = 9.6f;

        int sum1 = (int) (num1 + num2 + num3);

        int sum2 =  Math.round(num1 + num2 + num3);

        System.out.println(sum1);
        System.out.println(sum2);
    }
}
