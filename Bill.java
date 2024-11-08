import java.util.*;

public class Bill {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter pen price");
        float pen = sc.nextFloat();
        System.out.println("enter pencil price");
        float pencil = sc.nextFloat();
        System.out.println("enter eraser price");
        float eraser = sc.nextFloat();
        float bill = pen + pencil + eraser;

        System.out.println("your bill is :" + bill);
    }

}
