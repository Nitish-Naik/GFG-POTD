

import java.util.HashMap;
import java.util.Map;

public class Toeplitz_matrix {
    public static boolean isToepliz(int mat[][]) {
        Map<Integer, Integer> map = new HashMap<>();
        int m = mat.length, n = mat[0].length;
        
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                int diff = i - j;
                if (map.containsKey(diff)) {
                    if (!map.get(diff).equals(mat[i][j]))
                        return false;
                } else {
                    map.put(diff, mat[i][j]);
                }
            }
        }
        
        return true;
    }

    public static void main(String[] args) {
        int mat[][] = {{6, 7, 8},
                        {4, 6, 3},
                        {1, 4, 6}};

        System.out.println(isToepliz(mat));
    }
}
