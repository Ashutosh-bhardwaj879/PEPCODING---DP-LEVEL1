import java.util.*;

class PaintFence19 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();

        int same = k;
        int diff = k * (k - 1);
        int total = same + diff;

        for (int i = 3; i <= n; i++) {
            same = diff * 1;
            diff = total * (k - 1);
            total = same + diff;
        }
        System.out.println(total);
        scn.close();
    }
}
