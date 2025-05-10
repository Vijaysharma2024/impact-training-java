import java.util.Scanner;

public class harshadnumber2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        
        int firstdigit = n/100;
        int middledigit = (n / 10) % 10;
        int lastdigit  = n%10;
        
        int sum = firstdigit+middledigit+lastdigit;
        
        System.out.println("sum is  : " + sum);
        if(n % sum==0){
            System.out.println("its harshad number ");
        }else{
            System.out.println("not a harshad number");
        }
    }
}
