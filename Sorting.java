import java.util.Scanner;

public class Sorting1 {

    public static void sort(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
         array[j] = temp;
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        n = sc.nextInt();
        if(n<4)
        {System.out.println("Cannot Sort!");}

        else {
            int[] arr = new int[n];
            System.out.println("Enter the elements: ");
            int i;
            for (i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int j = arr.length / 2;
            for (i = 0; i < arr.length / 2; i++) {
                sort(arr, i, j);
                j++;
            }
            for (i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");

            }
        }
    }
}
