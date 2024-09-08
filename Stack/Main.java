//https://www.geeksforgeeks.org/data-structures/

public class Main {
    public static void main(String[] args) {
        
        int [] arr = {2,1,3,4,5};


        for (int i = 0; i < arr.length; i++){
            boolean swapped = false;
            for (int j = 0; j < arr.length-i-1; j++){
                if(arr[j] > arr[j+1]){
                    swapped = true;
                    int tem = arr [j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tem;
                }
            }
            if(!swapped){
                System.out.println("broken");
                break;
            }
        }

        for(int num : arr){
            System.out.print(num);
        }
    }


}