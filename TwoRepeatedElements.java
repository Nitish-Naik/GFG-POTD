import java.util.ArrayList;

public class TwoRepeatedElements 
{
    public static int[] twoRepeated(int arr[], int n)
    {
        int count[] = new int[n+1];
        int []a = new int[2];
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0; i<arr.length; i++)
        {
            count[arr[i]]++;
            if(count[arr[i]] == 2)
            {
                ans.add(arr[i]);
            }
        }

        for(int i=0; i<a.length; i++)
        {
            a[i] = ans.get(i);
        }
        return a;
        
    }
    public static void main(String[] args) {
        int arr [] = {1,2,1,3,4,3};
        int a[] = twoRepeated(arr, 4);
        for(int i=0; i<a.length; i++)
        {
            System.out.print(a[i]);
        }
    }    
}
