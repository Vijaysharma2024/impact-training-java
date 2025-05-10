import java.util.Scanner;

public class nearestnumber {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
    int num  = sc.nextInt();
    int m= sc.nextInt();

    //Number =num-m;
    
    int lowerboundary = (num/m)*m;
    int upperboundary = lowerboundary+m;
    int distance1=lowerboundary - num;
    int distance2=upperboundary - num;
    //if (q==0){
        //System.out.println("Divisible");
    int result =(distance1<distance2) ? lowerboundary : upperboundary;
     
     System.out.println(result);
    }
    }


