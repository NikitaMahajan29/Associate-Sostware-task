import java.util.Arrays;
import java.util.Random;
public class ShuffleArray {
   public static void main(String[] args) {
      int[] arr = { 1,2,3,4,5,6,7};
      System.out.println("Non Shuffled Array = "+Arrays.toString(arr));
      Random rnd = new Random();
      for(int i = 0; i < arr.length; ++i) {
         int index = rnd.nextInt(arr.length - i);
         int tmp = arr[arr.length - 1 - i];
         arr[arr.length - 1 - i] = arr[index];
         arr[index] = tmp;
      }
      System.out.println("Shuffled Array = "+Arrays.toString(arr));
   }
}
