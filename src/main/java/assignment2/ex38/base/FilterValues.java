package assignment2.ex38.base;

public class FilterValues {

    public String filterEvenNumbers(int[] arr){
        String out = "";

        for (int i=0; i<arr.length; i++){
            if(arr[i]%2 == 0){
                out += arr[i] + " ";
            }
        }
        return out;
    }

    public int[] inputToArray(String input){

        String[] inputArr =  input.trim().split("\\s+");

        int[] out = new int[inputArr.length];

        for(int i=0; i<inputArr.length; i++){
            out[i] = Integer.parseInt(inputArr[i]);
        }
        return out;
    }

    public void printArray(String arr){

        System.out.println("The even numbers are " + arr);
    }
}
