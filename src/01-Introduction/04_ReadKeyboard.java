import java.util.Scanner;

class ReadKeyboard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers: ");
        float x = sc.nextFloat();
        float y = sc.nextFloat();

        float z = x + y;
        System.out.println("Sum of x and y : " + z);
    }
}