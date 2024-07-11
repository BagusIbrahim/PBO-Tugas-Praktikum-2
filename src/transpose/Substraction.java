package transpose;

public class Substraction {
    public static int[][] sub(int[][] first, int[][] second) {
        int row = first.length, column = first[0].length;
        int[][] sub = new int[row][column];

        System.out.println("\nSubtract of Matrices:\n");
        for (int r = 0; r < row; r++)
            for (int c = 0; c < column; c++)
                sub[r][c] = first[r][c] - second[r][c];

        Print2dArray.print2dArray(sub);
        return sub;
    }
}


