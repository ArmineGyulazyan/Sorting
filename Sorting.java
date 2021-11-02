import java.io.IOException;
import java.util.Arrays;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class SortingFinal {
    public boolean rotateAgain=true;
    public int indexOfNumbersRemained;
    public char[] arr;

    public char[] userInputToCharArray() throws IOException {
        BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
        String reader = userInput.readLine();
        char[] arr = new char[reader.length()];
        arr = reader.toCharArray();
        indexOfNumbersRemained=arr.length;
        return arr;
    }

    public void print(char [] arr){
        for (int i = 0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    public void swap(char [] arr, int refOfFirstPair, int refOfSecondPair){

        char a, b;
        a = arr[refOfFirstPair];
        b = arr[refOfFirstPair+1];
        arr[refOfFirstPair] = arr[refOfSecondPair];
        arr[refOfFirstPair+1] = arr[refOfSecondPair + 1];
        arr[refOfSecondPair] = a;
        arr[refOfSecondPair+1] = b;
    }

    public void tryShorten(char arr[]){
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == '1') {
                System.out.println("Quantity of remined numbers has been decreased, and now it equals:" + (--indexOfNumbersRemained) );
            } else {
                break;
            }
        }
    }
    public void checkIfArrayIsAlreadySorted(){
        boolean thereIsOneInOurArray=false;
        for (int i = 0; i <= indexOfNumbersRemained; i++) {
            if (arr[i] == 1) {
                thereIsOneInOurArray = true;
            }
            if (thereIsOneInOurArray == true) {
                if (arr[i] == 0) {
                    rotateAgain = true;
                    break;
                }
            }
        }
    }
    public void checkIfArrayIsTooShort(){
        if(indexOfNumbersRemained<5){
            rotateAgain=false;
            System.out.println("The array is too short");
        }
    }
    public void main(String args[]) throws IOException {
        //userInputToCharArray(); // *important call this function at first as indexOfNumbersRemained is being initialized here.
        arr = new char[userInputToCharArray().length];
        checkIfArrayIsTooShort();
        while (rotateAgain) {
            checkIfArrayIsAlreadySorted();
            if(rotateAgain == false){
                break;
            }
            tryShorten(userInputToCharArray());
            rotateAgain = false;

            if(indexOfNumbersRemained>5){
                for (int i = 1; i<=indexOfNumbersRemained - 2 ;i++){
                    if(arr[i]==1){
                        rotateAgain = true;
                        swap(arr,i-1,indexOfNumbersRemained - 1);//puts right in front of array
                        break;
                    }
                }
                if(rotateAgain == true){
                    break;
                }
                if (arr[indexOfNumbersRemained - 1]==1){
                    swap(arr,indexOfNumbersRemained - 3,indexOfNumbersRemained - 1);//divides and swaps
                    break;
                }
                if (arr[0]==1){
                    swap(arr,0,2);// simple arrangement
                    break;
                }
            }else{
                for (int i = 0; i < indexOfNumbersRemained - 1; i++) {
                    if (arr[i] == '1' && arr[i + 1] == '1') {
                        rotateAgain = true;
                        if (i + 2 == indexOfNumbersRemained) {
                            if (indexOfNumbersRemained == 5) {
                                swap(arr,i - 1,i+1);

                            } else {
                                swap(arr,i,indexOfNumbersRemained);
                            }
                        } else {
                            swap(arr,i,indexOfNumbersRemained-1);
                        }
                        break;
                    }
                }
                if(rotateAgain == true){
                    break;
                }
                for (int i = 0; i < indexOfNumbersRemained - 1; i++) {
                    if (arr[i] == '0' && arr[i + 1] == '1') {
                        rotateAgain = true;
                        if (i + 2 == indexOfNumbersRemained) {
                            if (i == 2) {
                                swap(arr,i-2,i);
                            } else if (i == 1) {
                                swap(arr,i - 1,i + 2);
                            } else { // i == 0
                                swap(arr,i,i+3);
                            }
                        } else {
                            swap(arr,i,indexOfNumbersRemained - 1);//puts right in front of array
                        }
                        break;
                    }
                }
                if(rotateAgain == true){
                    break;
                }
                if (rotateAgain == false) {
                    rotateAgain = true;

                    if (indexOfNumbersRemained == 1) {
                        swap(arr,0,2);
                        indexOfNumbersRemained += 2;
                        swap(arr,0,3);
                        break;
                    } else if(indexOfNumbersRemained == 2) {
                        swap(arr,1,3);
                        indexOfNumbersRemained += 2;
                        break;
                    }else { //indexOfNumbersRemained > 2
                        swap(arr,0,2);
                        break;
                    }
                }
            }
        }
        print(arr);
        System.out.println("final");
    }
}
