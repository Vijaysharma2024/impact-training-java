import java.util.Scanner;

 
public class numbers{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter any four digit number");
    
   // int firstdigit= sc.nextInt();
   // int lastdigit= sc.nextInt();
           int number = sc.nextInt();

    
    int firstdigit = number/1000;
    int lastdigit  = number%10;
    
    int combine= firstdigit+lastdigit;
    System.out.println(combine);


        
    }
}

