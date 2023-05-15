//Ameer Ahmed

public class binary_search {

    public static int BinarySearch(int[] arr, int target) {

        //you need 3 pointers in the array. low = the first index, high is the last index, and middle is for your pivot
        // so that you can move the other pointers to find the target number
        int low = 0;
        int high = arr.length - 1;
        int middle;

        //handle the edge case of an empty array
        if(arr.length == 0) {
            System.out.println("The array is empty!");
        }

        //edge case of the target being outside the range of the array
        if(target < arr[low] || target > arr[high] ) {
            System.out.println("The target is outside of the bounds of the array.");
            return -1;
        }

        while(low <= high) {
            middle = (low + high) / 2;

            if(arr[middle] == target) {
                System.out.println("You found the number!");
                return middle;
            }
            else if(arr[middle] > target) {
                System.out.println("The guess was too high.");
                high = middle - 1;
            }
            else {
                System.out.println("The guess was too low.");
                low = middle + 1;
            }
        }
        return -1;
    }
    public static void main (String[] args) {
        int[] arr = {1,3,5,7,9};
        int NumTofind = 1;

        int result = BinarySearch(arr, NumTofind);
        if (result != -1) {
            System.out.println("Number found at index: " + result);
        }
        else {
            System.out.println("The number wasn't found.");
        }
    }
}