import java.util.*;
public class Prog3 {

    static String[] removeDups(String[] inputArr) {


        String[] newArray = new String[inputArr.length];
        int size = 0;
        for (int i = 0; i < inputArr.length-1; i++) {
            int inserted = 0;
            for(int j = 0; j < newArray.length-1; j++) {

                if ( inputArr[i] == newArray[j]) {
                    inserted = 1;
                }
            }

            if (inserted == 0) {
                newArray[size++] = inputArr[i];
            }

        }

        String[] returnArr = new String[size];

        for (int k = 0; k<size; k++) {
            returnArr[k] = newArray[k];
        }

        return returnArr;
    }

    public static void main(String[] args) {
        String[] inputArray = {"horse", "dog", "cat", "horse", "dog"};
        System.out.println(Arrays.toString(removeDups(inputArray)));
    }


}
