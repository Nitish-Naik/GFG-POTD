import java.util.*;

class SingleNumber {
    public static int getSingle(int arr[]) {
        int n = arr.length;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        // Find the number that appears an odd number of times
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                return entry.getKey();
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int a[] = {8, 8, 7, 7, 6, 6, 1};
        System.out.println(getSingle(a)); 
    }
}
