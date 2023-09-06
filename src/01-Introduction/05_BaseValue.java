import java.util.*;

class BaseValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Binary Number: ");

        sc.useRadix(2);
        int x = sc.nextInt();

        System.out.println("Decimal Number : " + x);
    }
}