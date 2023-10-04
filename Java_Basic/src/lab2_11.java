import java.util.Scanner;

public class lab2_11 {

    public static void main(String[] args) {
        int money , increase = 0;
        Scanner input = new Scanner(System.in);
        String Tpye;
        System.out.print("Input your money : ");
        money = input.nextInt();
        System.out.print("Input your account type (Plaese type A B C or X in uppercase) : ");
        Scanner input2 = new Scanner(System.in);
        Tpye = input2.nextLine();

        if ( Tpye.equals("A")){
            increase = (int) (money * 0.015);
        }
        if ( Tpye.equals("B")){
            increase = (int) (money * 0.020);
        }
        if ( Tpye.equals("C")){
            increase = (int) (money * 0.015);
        }
        if ( Tpye.equals("X")){
            increase = (int) (money * 0.050);
        }
        money = money + increase;
        System.out.println("Your total " + money);

    }
}