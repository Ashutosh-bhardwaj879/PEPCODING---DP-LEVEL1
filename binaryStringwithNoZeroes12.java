import java.util.*;

class binaryStringwithNoZeroes12 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int old_count_of_one = 1;
        int old_count_of_zero = 1;
        for (int i = 2; i <= n; i++) {
            int new_count_of_zero = old_count_of_one;
            int new_count_of_one = old_count_of_one + old_count_of_zero;

            old_count_of_one = new_count_of_one;
            old_count_of_zero = new_count_of_zero;
        }
        System.out.println(old_count_of_one + old_count_of_zero);
        scn.close();
    }
}
