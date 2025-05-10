import java.util.Scanner;

public class trendynumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int firstdigit = n/1000;
        int middledigit = (n / 10) % 10;
        int lastdigit  = n%10;
    if (middledigit%3==0){
        System.out.println("Trendy number");
    }else{
        System.out.println("Not a trendy number");
    }
    }

    }


