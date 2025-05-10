
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter any three digit number");
    
    //int firstdigit= sc.nextInt();
    //int lastdigit= sc.nextInt();
    //int number = sc.nextInt();

               int number = sc.nextInt();

    int firstdigit = number/100;
    int middledigit = (number / 10) % 10;
    int lastdigit  = number%10;
    
    int combine= firstdigit+lastdigit+middledigit;
    System.out.println(combine);
    }
}

