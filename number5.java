import java.util.Scanner;

public class number5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    int first_value = sc.nextInt();
    int last_value =sc.nextInt();
    for(int number=first_value; number<=last_value; number++){
        int digit1=number/10;
        int digit2=number%10;
        int sum=digit1+digit2;
        int product=digit1*digit2;
        if((sum+product)==number){
            System.out.println(number);
        }
    }
    }
}


