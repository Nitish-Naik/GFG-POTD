import java.util.*;
public class CommonInArrays {
    public static List<Integer> commonElements(List<Integer> arr1, List<Integer> arr2, List<Integer> arr3) {
        Set<Integer> set1 = new HashSet<>(arr1);
        Set<Integer> set2 = new HashSet<>(arr2);
        Set<Integer> set3 = new HashSet<>(arr3);
        
        set1.retainAll(set2);
        set1.retainAll(set3);
        List<Integer> common = new ArrayList<>(set1);
        Collections.sort(common);
        return common;

    }
    public static void main(String[] args) {
        List<Integer> arr1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> arr2 = Arrays.asList(4, 5, 6, 7, 8);
        List<Integer> arr3 = Arrays.asList(1, 2, 3, 4, 5);
        CommonInArrays commonInArrays = new CommonInArrays();
        List<Integer> common = commonInArrays.commonElements(arr1, arr2, arr3);
        System.out.println(common);
    }
}