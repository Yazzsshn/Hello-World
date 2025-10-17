//we are trying to make a code that prints boxes as many as we want
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        System.out.print("How many box do you want to print? :");
        Scanner sc = new Scanner(System.in);
        // were just take the input number about how mant boxes user want to print
        int number = sc.nextInt();
        for(int i = 0; i <number; i++){
            box();
        }
        //this loops runs the box method as many as user want
        System.out.println(number + "\tbox printed.");
        //says how many boxes we print

    }
    public static void box(){
        System.out.println("*-------*");
        System.out.println("|       |");
        System.out.println("|       |");
        System.out.println("*-------*");
    }
    //and this is the method tahat makes the box
    //this code proves that im him
}