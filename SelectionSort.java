public class SelectionSort {

    public static void main(String[] args) {

        int arr[] = {5, 3, 6, 7, 1};
        int n = arr.length;

        // Outer loop for each pass
        for (int i = 0; i < n - 1; i++) {

            // Assume current index has minimum value
            int minIndex = i;

            // Find the minimum element in the unsorted part
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;   // Update index of minimum element
                }
            }

            // Swap the minimum element with the first element of unsorted part
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

        // Print the sorted array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
