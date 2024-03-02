public class Problem2 {
    public static void main(String[] args) {

        int countDigit = countDigit(10000);
        System.out.println(countDigit);

    }

    static int countDigit(int num) {

        if (num <= 0) {
            return 0;
        }
        return countDigit(num / 10) + 1;
    }
}
