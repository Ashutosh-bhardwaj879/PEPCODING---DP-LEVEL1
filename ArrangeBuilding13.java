import java.util.*;

class ArrangeBuilding13 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        long old_space = 1;
        long old_building = 1;

        for (int i = 2; i <= n; i++) {
            long new_space = old_space + old_building;
            long new_building = old_space;
            old_building = new_building;
            old_space = new_space;
        }
        long total = old_space + old_building;
        total = total * total;
        System.out.println(total);
        scn.close();
    }
}
