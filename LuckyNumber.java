import java.util.ArrayList;
import java.util.Arrays;

public class LuckyNumber 
{
    public static int findLucky(int[] arr) 
    {
        Arrays.sort(arr);
        ArrayList<Integer> ans = new ArrayList<>();
        int max = arr[arr.length-1];
        int freq[] = new int[max+1];
        for(int i=0; i<arr.length; i++)
        {
            freq[arr[i]]++;
        }
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] == freq[arr[i]])
            {
                ans.add(arr[i]);
            }
        }

        if(ans.size() == 0)
        {
            return -1;
        }
        return ans.get(ans.size()-1);
    }
    public static void main(String[] args) {
        int arr[] = {2,2,3,4};
        System.out.println(findLucky(arr));
    }
}    
