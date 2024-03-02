public class Problem1 {

    public static void main(String[] args) {
        int rev = reverseInt(471);
        System.out.println(rev);
    }

    static int reverseInt(int num) {
        if (num >= 0 && num < 10) {
            return num;
        }

        int lastDigit = num % 10;

        int reversed = reverseInt(num / 10);

        return Integer.parseInt(String.valueOf(lastDigit) + String.valueOf(reversed));
    }

}
