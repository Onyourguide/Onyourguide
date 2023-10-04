import java.util.Scanner;

public class lab2_19 {
    public static void main(String args[]) {
        Scanner tube = new Scanner(System.in);
        int number = tube.nextInt();
        System.out.print(number);
        for(int sign = number; sign > 0;sign--) {
            System.out.print('=');
        }
        System.out.print('+');
    }
}