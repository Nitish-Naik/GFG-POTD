import java.util.ArrayList;
import java.util.Arrays;

public class Count_the_element 
{

    public static int[] countElements(int a[], int b[], int n, int query[], int q)
    {
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0; i<query.length; i++)
        {
            // int find=a[query[i]];
            int count = 0;
            for(int j=0; j<b.length; j++)
            {
                if(a[query[i]] >= b[j])
                {
                    count++;
                }
            }
            ans.add(count);
        }

        int finalAns[] = new int[ans.size()];
        for(int i=0; i<ans.size(); i++)
        {
            finalAns[i] = ans.get(i);
        }
        return finalAns;
        
    }

    public static void main(String[] args) {
        int a[] = {1,1,5,5};
        int b[] = {0,1,2,3};
        int query[] = {0,1,2,3};
        int d[] = countElements(a, b, 4, query, 4);
        for(int i=0; i<d.length; i++)
        {
            System.out.println(d[i]);
        }
    }    
}
