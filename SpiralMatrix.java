import java.util.ArrayList;

/**
 * SpiralMatrix
 */
public class SpiralMatrix {
    public static ArrayList<Integer> spirallyTraverse(int a[][]) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        int top = 0;
        int bottom = a.length-1;
        int left = 0;
        int right = a[0].length-1;
        while(top <= bottom)
        {
            // top 
            for(int i=left; i<=right; i++)
            {
                // System.out.print(a[top][i]+" ");
                result.add(a[top][i]);
            }
            
            top++;
            // right
            for(int j=top; j<=bottom; j++)
            {
                // System.out.print(a[j][right]+" ");
                result.add(a[j][right]);
            }
            right--;
            // bottom
            if(top <= bottom)
            {
                for(int i=right; i>=left; i--)
                {
                    // System.out.print(a[bottom][i]+" ");
                    result.add(a[bottom][i]);
                }
                bottom--;
            }
            
            // left

            if(top <= bottom)
            {

                for(int i=bottom; i>top; i--)
                {
                    // System.out.print(a[i][left]+" ");
                    result.add(a[i][left]);
                }
                left++;
            }
        }

        return result;
    }
    public static void main(String[] args) {
        int matrix[][] = {{1, 2, 3, 4},
                            {5, 6, 7, 8},
                            {9, 10, 11, 12},
                            {13, 14, 15,16}};

        System.out.println(spirallyTraverse(matrix));
    }
}


/*
 * matrix[][] = {{1, 2, 3, 4},
                  [5, 6, 7, 8},
                  [9, 10, 11, 12},
                  [13, 14, 15,16}}
Output: [1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5, 6, 7, 11, 10}
 */