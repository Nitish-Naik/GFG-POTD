import java.util.ArrayList;
import java.util.Collections;

public class SubsetSums {
    public static void main(String[] args) {

        Solution solution = new Solution();
        
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        
        int n = arr.size();
        
        ArrayList<Integer> result = solution.subsetSums(arr, n);
        Collections.sort(result);
        System.out.println("Subset sums: " + result);
    }
}

class Solution {
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int n) {
        ArrayList<Integer> result = new ArrayList<>();
        setSum(arr, n, result, 0, 0);
        return result;
    }
    
    private static void setSum(ArrayList<Integer> arr, int n, ArrayList<Integer> result, int ind, int sum) {
        if(ind == n) {
            result.add(sum);
            return;
        }
        // pick the element 
        setSum(arr, n, result, ind+1, sum+arr.get(ind));
        
        // do not pick the element 
        setSum(arr, n, result, ind+1, sum);
    }
}
