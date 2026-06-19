public class Binarysearch{
    public static void main(String[] args){
        double[] prices ={1250, 1129.4, 1239.6, 1250.8};
        insertionSort(prices);
        System.out.println("Sorted Prices(Insertion");
        for(double p: prices)
            System.out.println(p);
        int index = binarySearch(prices, 1250);
        System.out.println("1250 found at index:" + index);
    }
    public static void insertionSort(double[] arr){
        for(int i=1; i< arr.length-1; i++){
            double key = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]> key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1]= key;
        }

    }
    public static int binarySearch(double[] arr, double target){
        int low =0;
        int high= arr.length-1;

        while(low<= high){
            int mid = low + (high-low)/2;

            if(arr[mid] == target) return mid;
            if(arr[mid]> target) low = mid+1;
            else high = mid-1;
        }
        return -1;
    }
}