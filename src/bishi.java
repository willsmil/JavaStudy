import sun.swing.BakedArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by 18240 on 2017/9/6.
 */
public class bishi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] needs = new int[n];
        for (int i = 0; i < n; i++) {
            needs[i] = scanner.nextInt();
        }
        if (n < m) {
            System.out.println();
        }
    }
}
