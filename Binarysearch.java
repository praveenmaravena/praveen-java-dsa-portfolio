public class Binarysearch {

    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,6,7,8,9,10};

        int target = 7;

        int result = binarySearch(array, target);

        if(result != -1){
            System.out.println(target + " found at index " + result);
        } else {
            System.out.println(target + " not found");
        }
    }

    public static int binarySearch(int[] array, int target){

        int low = 0;
        int high = array.length - 1;

        while(low <= high){

            int middle = low + (high - low) / 2;

            if(array[middle] > target){
                high = middle - 1;
            }
            else if(array[middle] < target){
                low = middle + 1;
            }
            else{
                return middle;
            }
        }

        return -1;
    }
}