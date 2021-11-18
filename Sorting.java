import java.util.Arrays;
import java.util.Scanner;


public class Sorting  {

    public static void sort(char[] array, int firstp, int secondp) {
        char temp1 = array[firstp];
        char temp2= array[firstp+1];
        array[firstp] = array[secondp];
        array[firstp+1] = array[secondp+1];
        array[secondp]=temp1;
        array[secondp+1]=temp2;
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

        for (i = 0; i <=array.length-1; i++) {

            System.out.println( Arrays.toString(array));
            if( isSorted(array, i)){

                System.out.println("Sorted! "+ Arrays.toString(array));
                System.exit(0);
            }
            //System.out.println( Arrays.toString(array));

            if(array.length == 5) {

            if(i==array.length-1){

               if(array[i-1]=='0' && array[i]=='1' ){
                      sort(array, i - 1, i - 4);
                   i=0;
                  }
              }
                if(i == array.length-2){

                    if(array[i]=='0' && array[i+1]=='1' && array[i-1]=='1' ) {

                        sort(array, i, i - 3);
                        i=0;
                    }
                    else if(array[i]=='0' && array[i+1]=='1'){
                        sort(array, i - 1, i - 3);
                    }
                    else if(array[i]=='0' && array[i+1]=='0'){
                        sort(array, i, i - 3);
                    }
                    else if(array[i]=='1' && array[i+1]=='1'){
                        sort(array, i-1, i - 3);
                    }
                    else{
                       // sort(array, i - 2, i);
                        sort(array, i + 1, i - 3);
                    }
                }
                else{
                    if (array[i] == '0' && array[i + 1] == '1') {

                        if(i+1 == array.length-1) {
                            if(array[i+1] == '1') {
                                sort(array, i - 1, i - 3);
                            }
                            else if(array[i+1] == '0'){
                                sort(array, i , i - 3);
                            }

                        }

                        else{

                            if(array[i+2]=='0'){
                                if(i+1 == array.length-3){
                                    sort(array, i, i+2);
                                }
                                else if(i+1 == array.length-4){
                                    sort(array,i, array.length-2);
                                }
                                else{   //firsr change correct
                                    sort(array, i, i-2);
                                }
                            }
                            if ( i+2==array.length){
                                if (array[i-1] == '0' ){
                                    sort(array, i-1, i-3);
                                }
                            }
                            if (array[i + 2] == '1') {         //i+2y 6a vercnum, vorn el chka
                                if(i+2==array.length-1){
                                    sort(array, i+1, i-2);
                                }
                                else if(i+2== array.length-3 && array[i+3] == '1'){
                                    sort(array, i+1, array.length-2);
                                }

                                else {
                                    sort(array, i + 1,  array.length-2); }
                            }
                        }
                    }
                }
            }
        }
    }
}
