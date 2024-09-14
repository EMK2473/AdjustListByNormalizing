package AdjustListByNormalizing;

import java.util.Scanner; 

public class AdjustListByNormalizing {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int NUM_ELEMENTS = scnr.nextInt();

      double[] inputValues = new double[NUM_ELEMENTS];

      for(int i = 0; i < NUM_ELEMENTS; ++i){
        inputValues[i] = scnr.nextDouble();
      }
      
      double highestValue = inputValues[0];

      for(int i = 0; i < inputValues.length; ++i) {
        if(inputValues[i] > highestValue) {
            highestValue = inputValues[i];
        }
      }

      for(int i = 0; i < inputValues.length; ++i){
        inputValues[i] = inputValues[i] / highestValue;
        System.out.printf("%.2f", inputValues[i]);
        System.out.print(" ");
      }

      System.out.println();
      scnr.close();
   }
}
