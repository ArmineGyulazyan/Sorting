import java.util.Arrays;
import java.util.Scanner;


public class Sort1 {

    private char[] array;



    public static void sort(char[] array, int firstp, int secondp) {
        char temp1 = array[firstp];
        char temp2 = array[firstp+1];
        array[firstp] = array[secondp+1];
        array[firstp+1] = array[secondp];
        array[secondp+1]=temp1;
        array[secondp]=temp2;
    }

      public static boolean isSorted(char[] array, int i) {
        for (i = 0; i < array.length-1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }

        }
        return true;
    }

    public static void main (String[] args) {

        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        n = sc.nextInt();

        char[] array = new char[n];
        System.out.println("Enter the elements: ");

        int i;
        for (i = 0; i < n; i++) {

            array[i] = sc.next().charAt(0);
        }
        //int j = array.length ;


        // int j = array.length ;
       /** boolean t = true;

        while(t==true){
            t=false;
        }**/
        for (i = 0; i <=array.length-1; i++) {

            if( isSorted(array, i)){

                System.out.println("Sorted! "+ Arrays.toString(array));
                System.exit(0);
            }

            // else {
            //if(array.length == 5) {
                if (array[i] == '0' && array[i + 1] == '1') {

                    // do not use  j in sort(), use it only when you need to make a change from the end
                     if(array[i+2]=='0'){
                          sort(array, i, i-2);
                     }
                    if ( i+2==array.length){
                        if (array[i-1] == '0' ){
                            sort(array, i-1, i-3);
                        }
                    }
                    if (array[i + 2] == '1') {
                        if(i+2==array.length-1){
                            sort(array, i+1, i-2);
                        }
                        else {
                            sort(array, i + 1, array.length-2);
                        }
                        /**      if(i == 0){
                         sort(arr, i+1,j);
                         }
                         }
                         if (arr[i + 2] == '0') {
                         //sort(arr, i, j);
                         if (arr[j] == '1') {
                         sort(arr, i, j - 1);
                         } else if (arr[j] == '0') {
                         sort(arr, i, j);
                         }
                         //j--;
                         }**/
                        /** if (arr[i - 1] == 1) {
                         if (i == 3) {
                         // sort(arr, )
                         }**/

                    }
                    //   if (arr[i - 1] == 0) {
                    //
                    // }

                    /**else if(arr[i+2]==arr[i+3]) {
                     sort(arr, i, j-1);
                     }**/
                }

            }
        }
        // }//j--;
    }
//}
//System.out.println(Arrays.toString(arr));
/** for (i = 0; i < n; i++) {
 System.out.print(arr[i] + " ");
 }**/
