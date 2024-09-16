package Array;

public class Array {
    public static void main(String[] args) {

        // 1. Initilize, acess and modify an array

        // Declare and initialize an array of integers
        int[] numbers = { 1, 2, 3, 4, 5 };

        // Declare an array and then initialize it
        int[] moreNumbers = new int[5];
        moreNumbers[0] = 10;
        moreNumbers[1] = 20;

        int firstElement = numbers[0]; // Access the first element (1)
        // int thirdElement = numbers[2]; // Access the third element (3)
        System.out.println(firstElement);

        numbers[1] = 20; // Modify the second element to 20
        numbers[4] = 50; // Modify the fifth element to 50


        // 2. Traversing an Array

        // For loop
        for (int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }

        // Enhanced for loop
        for(int num:numbers){
            System.out.println(num);
        }


        // 3. Serching for an element in an array

        int [] numarr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Linear search
        int index = linearSearch(numarr, 3);
        System.out.println("Index of the trget value is:" + index);

        // Binary search
        int index2 = binarySearch(numarr, 11);
        System.out.println("Index of the trget value is:" + index2);

        // 4. Find the leaders in an array
        int[] arr = {16, 17, 4, 3, 5, 2};
        printLeaders(arr);

    }

    // Linear search
    public static int linearSearch(int[] nums, int target){
        for (int i = 0; i <nums.length; i++){
            if (nums[i] == target){
                return i;
            }
        }
        return -1;
    }

    //Binary search
    public static int binarySearch (int[] nums, int target){
        int left = 0;
        int right = nums.length - 1;

        while (left <= right){
            int mid = left + (right - left) / 2;

            if (nums[mid] == target){
                return mid;
            }
            if (nums[mid] < target){
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    // public static int binarySearch (int[] nums, int target){
    //     int length = nums.length;
    //     while (true) {
    //         if (length > nums.length || length < 0 ){
    //             return -1;
    //         }
    //         if (nums[length/2] == target){
    //             return length/2;
    //         }
    //         if(nums[length/2] > target){
    //             length = length/2;
    //             continue;
    //         }
    //         if (nums[length/2] < target){
    //             length = length += length/2;
    //             continue;
    //         }
    //     }
        
    // }

    // Find the leaders in an array
    public static void printLeaders (int[] nums){

        int max = nums[nums.length - 1];
        System.out.println(max);
        for (int i = nums.length -1; i >= 0; i--){
            if (nums[i] > max){
                System.out.println(nums[i]);
                max = nums[i];
            }
        }

    }
}