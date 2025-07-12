public class rectangelZerosOnes {
    // Simple O(n^2) logic for max rectangle in histogram
    public static int maxHistogram(int[] heights) {
        int n = heights.length;
        int maxArea = 0;
        for (int i = 0; i < n; i++) {
            int minHeight = heights[i];
            for (int j = i; j < n; j++) {
                minHeight = Math.min(minHeight, heights[j]);
                int area = minHeight * (j - i + 1);
                maxArea = Math.max(maxArea, area);
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1,0,1,0,1},
            {1,0,1,1,1},
            {1,1,1,1,1},
            {1,0,0,1,0}
        };
        int[] curRow = new int[matrix[0].length];
        int maxArea = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 1) {
                    curRow[j] += 1;
                } else {
                    curRow[j] = 0;
                }
            }
            int curAnswer = maxHistogram(curRow);
            maxArea = Math.max(maxArea, curAnswer);
        }
        
        System.out.println("Maximum area of 1's:"+maxArea);
    }
}
