import java.util.Arrays;
import java.util.Scanner;
public class Sorting {


    public void sort(int[] array) {
        var temp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length - 1; j += 2) {

                if((array[j] * array[j++]) !=0 ) {
                        temp = array[j];
                        array[j] = array[j -= 1];
                        array[j -= 1] = temp;
                    }

                if (array[j] == 1 && array[j++] == 0 || array.length < 4) {
                    System.out.println("No sorting:");
                }
            }
        }
    }
        public static void main (String[] args){
            int n;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number of elements: ");
            n = sc.nextInt();
            System.out.println("Enter the elements: ");
            int[] array = new int[n];
            int i;
            for (i = 0; i < n; i++) {
                array[i] = sc.nextInt();
            }

            var sorter = new Sorting();
            sorter.sort(array);

            System.out.println(Arrays.toString(array));
        }
    }

