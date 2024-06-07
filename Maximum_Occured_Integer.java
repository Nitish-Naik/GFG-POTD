public class Maximum_Occured_Integer {
    public static int maxOccured(int n, int l[], int r[], int maxx) {
        int arr[] = new int[maxx + 2];

        for(int i=0; i<n; i++) {
            arr[l[i]]++;
            arr[r[i]+1]--;
        }

        int maxFreq = arr[0];
        int result = 0;
        for(int i=1; i <= maxx; i++) {
            arr[i] += arr[i-1];
            if(arr[i] > maxFreq) {
                maxFreq = arr[i];
                result = i;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int l[] = {1,4,3,1};
        int r[] = {15,8,5,4};
        int maxx = 15;

        System.out.println(maxOccured(l.length, l, r, maxx));
    }
}

