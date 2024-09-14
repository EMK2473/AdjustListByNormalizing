package AdjustListByNormalizing;

import java.util.Scanner; 

public class AdjustListByNormalizing {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int NUM_ELEMENTS = scnr.nextInt();
      System.out.println(NUM_ELEMENTS);

      double[] inputValues = new double[NUM_ELEMENTS];

      for(int i = 0; i < NUM_ELEMENTS; ++i){
        inputValues[i] = scnr.nextDouble();
        System.out.println(inputValues[i]);

      }
      scnr.close();
   }
}
