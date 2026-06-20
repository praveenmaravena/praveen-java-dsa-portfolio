public class Assignment6 {

    public static void main(String[] args) {

        double[] prices = {1250.75, 980.50, 1420.00, 1150.25};

        // Sorting the prices
        bubbleSort(prices);

        System.out.println("Sorted Prices:");
        for (double p : prices) {
            System.out.println(p);
        }

        // Searching = for a price
        int index = binarySearch(prices, 1250.75);

        System.out.println("1250.75 found at index: " + index);

        // Compound Interest using Recursion
        System.out.println("Future Value after 4 years: "
                + compoundInterest(10000, 4));
    }

    // Bubble Sort techinque
    public static void bubbleSort(double[] array) {

        for (int i = 0; i < array.length - 1; i++) {

            for (int j = 0; j < array.length - i - 1; j++) {

                if (array[j] > array[j + 1]) {

                    double temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                }
            }
        }
    }

    // Binary Search,searching the required element
    public static int binarySearch(double[] array, double target) {

        int low = 0;
        int high = array.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (array[mid] == target) {
                return mid;
            }

            if (array[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }

    // Compound Interest using Recursion (20% growth)
    public static double compoundInterest(double principal, int years) {

        if (years == 0) {
            return principal;
        }

        return compoundInterest(principal * 1.20, years - 1);
    }
}