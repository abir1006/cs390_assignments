
public class Problem3 {
    public static void main(String[] args) {
        int[] num = {1,2,4,6,22};
        int sum = sumArray(num);
        System.out.println(sum);

    }

    static int sumArray(int[] num) {

        if (num.length == 0) {
            return 0;
        }

        int[] tmp = new int[num.length-1];

        System.arraycopy(num, 1, tmp, 0, tmp.length);

        return num[0] + sumArray(tmp);
    }
}
