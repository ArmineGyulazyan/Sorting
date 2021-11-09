import java.util.Arrays;
import java.util.Scanner;


    public class Sorting {

        private char[] array;

        public void setArray(char[] array) {
            this.array = array;
        }

        public static void sort(char[] array, int i, int j) {
                        char temp1 = array[i];
                        char temp2 = array[i++];
                        array[i] = array[j--];
                        array[i++] = array[j];
                        array[j--]=temp1;
                        array[j]=temp2;
                    }

                    public static void main (String[] args) {
                        int n;
                        Scanner sc = new Scanner(System.in);
                        System.out.println("Enter the number of elements: ");
                        n = sc.nextInt();

                        char[] arr = new char[n];
                        System.out.println("Enter the elements: ");

                        int i;
                        for (i = 0; i < n; i++) {

                            arr[i] = sc.next().charAt(0);
                        }
                        int j = arr.length - 1;
                        for (i = 0; i < arr.length; i++) {
                            if (arr[i] == '0' && arr[i++] == '1') {
                                 if (arr[j -= 2] == 1) {
                                    sort(arr, i++, j);
                                     System.out.println("omg");
                                }
                                else
                                    System.out.println("hey");
                            }

                            //j--;
                        }
                        System.out.println(Arrays.toString(arr));
                        /** for (i = 0; i < n; i++) {
                         System.out.print(arr[i] + " ");

                         }**/
                    }
    }

