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
      
      double highestValue = inputValues[0];

      for(int i = 0; i < inputValues.length; ++i) {
        if(inputValues[i] > highestValue) {
            highestValue = inputValues[i];
        }
      }
      System.out.println("Highest value: " + highestValue);

      for(int i = 0; i < inputValues.length; ++i){
        inputValues[i] = inputValues[i] / highestValue;
        System.out.println("Values divided by highest value: " + inputValues[i]);

      }


      scnr.close();
   }
}
