import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter the number of stars :");
        int n = sc.nextInt();

        for (int row = 1; row <= n; row++) {
            for (int col = 5; col <= n; col++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}
