import java.util.Scanner;
public class lab3_2_1 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Please insert number : ");
            int x = sc.nextInt();
            int num = AddTwo(x);
            System.out.println("The result#1 is "+num);
            num = AddTwo(x+5);
            System.out.println("The result#2 is "+num);
            num = AddTwo(x*3+2);
            System.out.println("The result#3 is "+num);
        } //end main
        public static int AddTwo ( int a ){
            int result = a + 2;
            return result;
        } // end AddTwo
    }//end class}
