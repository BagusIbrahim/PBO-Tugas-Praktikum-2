package transpose;

public class Devided {
    public static int[][] dev(int[][] first, int[][] second) {
        int row = first.length, column = first[0].length;
        int[][] dev = new int[row][column];

        System.out.println("\nDevided of Matrices:\n");
        for (int r = 0; r < row; r++)
            for (int c = 0; c < column; c++)
                dev[r][c] = first[r][c] / second[r][c];

        Print2dArray.print2dArray(dev);
        return dev;
    }
}
