import java.util.Scanner;

public class Pattern18 {
    public static void main(String[] args) {
        System.out.println("Enter a number :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= n - i; k++) {
                System.out.print(count);
            }
            count++;
            System.out.println();
        }
    }
}
