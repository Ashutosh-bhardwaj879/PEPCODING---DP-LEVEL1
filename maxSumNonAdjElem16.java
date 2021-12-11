import java.util.*;

class maxSumNonAdjElem16 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int old_inc = arr[0];
        int old_exc = 0;

        for (int i = 1; i < n; i++) {
            int new_inc = arr[i] + old_exc;
            int new_exc = Math.max(old_inc, old_exc);

            old_inc = new_inc;
            old_exc = new_exc;
        }
        System.out.println(Math.max(old_inc, old_exc));
        scn.close();

    }
}
