import java.util.logging.*;
  
public class tablas_multi { 
    
  public static void main(String[] args) {
    int[] h = {1, 2, 3, 4, 5,6,7,8,9,10};
    int[] v = {1, 2, 3, 4, 5,6,7,8,9,10};
    for (int i = 0; i < h.length; i++) {
        for (int j = 0; j < v.length; j++) {
            System.out.printf("%5d", h[i] * v[j]);
        }
        System.out.println();
    }
}
}
