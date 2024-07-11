package transpose;

public class Transpose {
    public static int[][] transpose(int[][] data) {
        int row = data.length;
        int column = data[0].length;
        int[][] transpose = new int[column][row];

        System.out.println("Elements of transpose matrix T are: ");
        for (int r = 0; r < row; r++) {
            for (int c = 0; c < column; c++) {
                transpose[c][r] = data[r][c];
                System.out.print(data[c][r] + "\t");

            }
            System.out.println();
        }
        return data;
    }

    public static void normalize(int[][] untranspose) {
        int row = untranspose.length;
        int column = untranspose[0].length;
        int[][] transpose = new int[column][row];

        for (int a = 0; a < row; a++) {
            for (int b = 0; b < column; b++) {
                int temp = untranspose[a][b];
                untranspose[a][b] = untranspose[b][a];
                untranspose[b][a] = temp;
            }
        }
    }
}