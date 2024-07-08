class SearchInSortedAndRotatedArray {
    int search(int[] arr, int key) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == key) {
                return mid; // Key found
            }

            // Check which part of the array is sorted
            if (arr[left] <= arr[mid]) {
                // Left half is sorted
                if (arr[left] <= key && key < arr[mid]) {
                    right = mid - 1; // Search in the left half
                } else {
                    left = mid + 1; // Search in the right half
                }
            } else {
                // Right half is sorted
                if (arr[mid] < key && key <= arr[right]) {
                    left = mid + 1; // Search in the right half
                } else {
                    right = mid - 1; // Search in the left half
                }
            }
        }

        return -1; // Key not found
    }
}
