import java.util.ArrayList;
import java.util.Arrays;

class SubarrayWithGivenSum
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        // Your code here
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0; i<arr.length; i++)
        {
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[i] + arr[j] == s)
                {
                    ans.add(i);
                    ans.add(j);
                    return ans;
                }
            }
        }
        ans.add(-1);
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,7,5};
        System.out.println(subarraySum(arr, arr.length, 12));
    }
}