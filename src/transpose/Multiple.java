package transpose;

public class Multiple {
    public static int[][] mul(int[][] first, int[][] second) {
        int row = first.length, column = first[0].length;
        int[][] mul = new int[row][column];

        System.out.println("\nSubtract of Matrices:\n");
        for (int r = 0; r < row; r++)
            for (int c = 0; c < column; c++)
                mul[r][c] = first[r][c] * second[r][c];

        Print2dArray.print2dArray(mul);
        return mul;
    }
}