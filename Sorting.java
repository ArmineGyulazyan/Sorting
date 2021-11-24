import java.util.Arrays;
import java.util.Scanner;
public class Sorting {

    public static void sort(char[] array, int firstp, int secondp) {
        char temp1 = array[firstp];
        char temp2 = array[firstp + 1];
        array[firstp] = array[secondp];
        array[firstp + 1] = array[secondp + 1];
        array[secondp] = temp1;
        array[secondp + 1] = temp2;
    }

    /** public static void cut(char[] array, int a){
     for (a = array.length-1; a>=0; a--) {
     if(array[a]=='1'){
     a = a-1;
     }
     }
     }**/

    public static boolean isSorted(char[] array, int i) {
        for (i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
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
        int a=array.length-1;
        if(array.length>5) {
            //int a=array.length-1;
            for (i = 1; i <= a-1;/**array.length - 2;**/ i++) {
                System.out.println(Arrays.toString(array));

                if (array[a] == '1') {
                    // cut(array,array.length-1);
                    a = a - 1;
                    if (array[i] == '1') {
                        sort(array, i - 1, a - 1);
                    }
                } else { //array[a]='0'
                    if (array[i + 1] == '1') {
                        sort(array, i, a - 1);
                        a = a - 1;
                    }
                   /** else {
                        sort(array,i-1, a);
                       // a=a-1;
                    }**/
                }
                /**if(array[0]=='1'){
                 sort(array,0,2);
                 }**/
                if (isSorted(array, i)) {
                    System.out.println("Sorted! " + Arrays.toString(array));
                    System.exit(0);
                }
               if(a==4){
                    break;
                }
            }



        }    // estexic heto chi mtnum hajord if-i mej vor tesni a==4y, inchpes uxxel?
        if(array.length == 5 || a==4/**|| array.length == 4**/) {
            for (i = 0; i <= a; i++) {
                System.out.println(Arrays.toString(array));

                if (i == a-1) {
                        if (array[i - 1] == '1' && array[i] == '0' && array[i + 1] == '1') {
                            sort(array, i, i - 3);
                            i = -1;
                        } else if (array[i] == '1' && array[i + 1] == '0') {
                            sort(array, i - 1, i - 3);
                        } else if (array[i] == '0' && array[i + 1] == '1') {
                            sort(array, i - 1, i - 3);
                        } else if (array[i] == '0' && array[i + 1] == '0') {
                            sort(array, i, i - 3);
                        } else if (array[i] == '1' && array[i + 1] == '1') {
                            sort(array, i, i - 2);
                        } else {
                            sort(array, i + 1, i - 3);
                        }
                    } else if (i ==a) {
                        if (array[i - 1] == '0' && array[i] == '1') {
                            sort(array, i - 1, i - 4);
                            i = -1;
                        } else if (array[i - 1] == '1' && array[i] == '0') {
                            sort(array, i - 1, i - 3);
                            i = -1;
                        } else /**if(array[i-1]=='1' && array[i]=='1')**/ {
                            sort(array, i - 2, i - 4);
                        }
                    } else {
                        if (array[i] == '0' && array[i + 1] == '1') {
                            if (i + 1 == a) {
                                if (array[i + 1] == '1') {
                                    sort(array, i - 1, i - 3);
                                } else if (array[i + 1] == '0') {
                                    sort(array, i, i - 3);
                                }
                            } else {
                                if (array[i + 2] == '0') {
                                    if (i + 1 == a-2) {
                                        sort(array, i, i + 2);
                                    } else if (i + 1 == a-3) {
                                        sort(array, i, a-1);
                                    } else if (i + 1 == a-1 && array[i - 1] == '0') {
                                        sort(array, i - 1, i + 1);
                                    } else if (i + 1 == a-1) {
                                        sort(array, i + 1, i - 2);
                                    } else {
                                        sort(array, i, i - 2);
                                    }

                                }
                                if (array[i + 2] == '1') {
                                    if (i + 1 == a-1) {
                                        sort(array, i, i - 2);
                                    } else if (i + 2 == a) {
                                        sort(array, i + 1, i - 2);
                                    } else if (i + 2 == a-2 && array[i + 3] == '1') {
                                        sort(array, i + 1, a - 1);
                                    } else if (i + 2 == a-1) {
                                        sort(array, i + 1, i - 1);
                                    } else {
                                        sort(array, i + 1, a-1);
                                    }
                                }
                            }
                        }
                    }
                if (isSorted(array, i)) {
                    System.out.println("Sorted! " + Arrays.toString(array));
                    System.exit(0);
                }
            }
                /**  if(array.length==4){
                 }**/

            }
        }
    }
