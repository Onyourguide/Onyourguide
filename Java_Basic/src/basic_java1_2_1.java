import java.util.Scanner;
public class basic_java1_2_1 {
    public static void main(String[] args) {
        int x , y;
        Scanner intput = new Scanner(System.in);
        x = intput.nextInt();
        y = x ;

        if ((1 <= x) && (x <= 10)) {
            System.out.println(" x in lange ");
        }
        if ((1 <= y) && (x <= 100)) {
            System.out.println(" y in lange ");
        }

    }
}
