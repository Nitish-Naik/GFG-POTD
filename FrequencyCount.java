import java.util.Arrays;
import java.util.HashMap;

/**
 * FrequencyCount
 */
public class FrequencyCount {
    public static void frequencyCount(int arr[], int n, int p)
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }
        for(int i=0;i<n;i++){
            if(map.get(i+1) != null)
                arr[i] = map.get(i+1);
            else
                arr[i] = 0;
        }
        String a = Arrays.toString(arr);
        System.out.println(a);  
    }
    public static void main(String[] args) {

        int arr[] = {3, 3, 3, 3};
        int n = arr.length;
        int p = 3;
        
        frequencyCount(arr, n, p);
    }
}