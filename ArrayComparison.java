import java.util.Scanner;

public class ArrayComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter size of first array: ");
        int n1 = scanner.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter elements of first array:");
        for (int i = 0; i < n1; i++) arr1[i] = scanner.nextInt();

        System.out.print("Enter size of second array: ");
        int n2 = scanner.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter elements of second array:");
        for (int i = 0; i < n2; i++) arr2[i] = scanner.nextInt();

        if (n1 == n2 && sum(arr1) == sum(arr2)) 
            System.out.println("same");
        else 
            System.out.println("not same");

        scanner.close();
    }

    private static int sum(int[] arr) {
        int total = 0;
        for (int num : arr) total += num;
        return total;
    }
}
