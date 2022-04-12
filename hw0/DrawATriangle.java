public class DrawATriangle {
    public static void main(String[] args) {
        int col = 0;
        int row = 0;
        int SIZE = 5;
        while (row < SIZE) {
            row = row + 1;
            col = 0;
            while (col < row) {
                col = col + 1;
                System.out.print('*');
            }
            System.out.println();

        }

    }
}
