import java.util.Scanner;

public class lab2_10 {

    public static void main(String[] args) {
        int salary  = 0 , age , num1 , num2 , bonus = 0;
        Scanner input = new Scanner(System.in);
        String name;
        name = input.nextLine();
        age = input.nextInt();
        num1 = input.nextInt();
        num2 = input.nextInt();
        float weight = input.nextFloat();

        System.out.println("Please insert your name : " + name);
        System.out.println("Please insert your age : " + age);
        System.out.println("Please insert your number of work : " + num1);
        System.out.println("Please insert your number of absent : " + num2);
        System.out.println("Please insert your body weight : " + weight);
        System.out.println("Hi, "+ name);

        if ( 21 < age && age <= 30 ) {
            salary = salary + (((num1*300) - (num2*50)));
        }
        if ( 31 < age && age <= 40 ) {
            salary = salary + (((num1*500) - (num2*50)));
        }
        if ( 41 < age && age <= 50 ) {
            salary = salary + (num1*1000) - (num2*25);
        }
        if ( 51 < age && age <= 60 ) {
            salary = salary + ((num1*300) - (num2*50)) ;
        }
        if ( (10 > weight) && (weight <= 60)  ){
            bonus = salary + 5000 ;
        }
        if ( (61 > weight) && (weight <= 90)  ){
            bonus = (int) (salary + (5000 - (weight-60) * 10));
        }
        System.out.println("Your salary is " + salary + " Bath");
        System.out.println("Your salary and bonus is " + bonus + " Bath");

    }
}