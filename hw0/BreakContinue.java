public class BreakContinue {
  public static void windowPosSum(int[] a, int n) {
    /** your code here */ 
     for(int i = 0; i < a.length; i++){
        int sum = 0;
        if(a[i] > 0){
           for(int j = 0; j <= n; j++){
              if(i+j < a.length){
                 sum = sum + a[i+j];
              }else{
                 break;
              }
              a[i] = sum;
           }
        }else{
           continue;
        }
     
     }
  }

  public static void main(String[] args) {
    int[] a = {1, -1, -1, 10, 5, -1};
    int n = 2;
    windowPosSum(a, n);

    // Should print {-1, -1, -1, 14, 4, -1}
    System.out.println(java.util.Arrays.toString(a));
  }
}
