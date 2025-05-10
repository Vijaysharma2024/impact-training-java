import java.util.Scanner;

public class fabanicconumbers {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        int n =sc.nextInt(); 
        int firstTerm = 0, secondTerm = 1;

        for (int i = 2; i <= n; i++) {
            
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
        System.out.print(firstTerm + " ");
    }
}


    
