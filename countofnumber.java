import java.util.Scanner;

public class countofnumber {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number");
    int n =sc.nextInt();
    int m =sc.nextInt();
    
    int count =0;
    
    while(n !=0){
        int r = n%10;
        if(r ==m){
            count+=1;
        }
        n =n/10;
    }
    System.out.println(count);
        
    }
}

