public class SortColors 
{
        public static void sortColors(int[] nums) 
        {
            int low = 0;
            int mid=0;
            int high = nums.length -1;
    
            while(mid < high)
            {
                if(nums[mid] == 0)
                {
                    low++;
                    mid++;
                }
                else if(nums[mid] == 1)
                {
                    mid++;
                }
                else
                {
                    int temp = nums[mid];
                    nums[mid] = nums[high];
                    nums[high] = temp;
                    high = high-1;
                }
            }
    
            for(int k = 0; k<nums.length; k++)
            {
                System.out.print(nums[k] +" ");
            }
        }    
    
    public static void main(String[] args) 
    {
        int a[] = {2,0,2,1,1,0};
        sortColors(a);
    }    
}
