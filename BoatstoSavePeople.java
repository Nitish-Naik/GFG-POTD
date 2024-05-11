import java.util.*;
public class BoatstoSavePeople {
    public static void main(String[] args) {
        int a[] = {3,5,3,4};
        Arrays.sort(a);
        int count = 0;
        for(int i=0; i<a.length; i++) {
            if(a[i] == 5) {
                count++;
            }
            else if(a[i] > 5) {
                count++;
            }
            else {
                int j=i;
                int sum = 0;
                while (sum < 5) {
                    count++;
                    sum += a[j++];
                    if(sum > 5) {
                        sum = 0;
                        i=j;
                        break;
                    }
                }

            }
        }
        System.out.println(count);
    }
}
