// Creative Exercise 1b

public class DrawTriangle {
   public static void drawTriangle(int N){
      int col = 0;
      int row = 0;
      while (row < N) {
          row = row + 1;
          col = 0;
          while (col < row) {
              col = col + 1;
              System.out.print('*');
          }
          System.out.println();
      }
   }
   
   public static void main(String[] args) {
      drawTriangle(10);
      
   }
}
