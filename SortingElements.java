import java.util.*;
class SortingElements {
    public static ArrayList<Integer> sortByFreq(int arr[]) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        List<Map.Entry<Integer, Integer>> freqList = new ArrayList<>(freqMap.entrySet());
        freqList.sort((a, b) -> {
            if (a.getValue().equals(b.getValue())) {
                return a.getKey() - b.getKey();
            }
            return b.getValue() - a.getValue();
        });
        ArrayList<Integer> result = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : freqList) {
            for (int i = 0; i < entry.getValue(); i++) {
                result.add(entry.getKey());
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int a[] = {2, 2, 3, 4,4,4};
        System.out.println(sortByFreq(a));
    }
}