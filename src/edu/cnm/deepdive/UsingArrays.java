package edu.cnm.deepdive;

import java.util.Arrays;

public class UsingArrays {

  public static void main(String[] args) {
    String[] pets = {"parrot", "cat", "dog"};
    System.out.println(pets[0]);
    System.out.println(pets[1]);
    System.out.println(pets[2] + "\n");
    //System.out.println(pets[3]);// throws ArrayIndexOutOfBoundsException because there is no index 3.

    pets[0] = "bird";

    for (int i = 0; i < pets.length ; i++) {
      System.out.println(pets[i]);
    }
      System.out.println("\n" + pets);//prints [Ljava.lang.String;@d93b30
    System.out.println(Arrays.toString(pets));//prints [bird, cat, dog]

    int[] numbers = new int[5];
    System.out.println(Arrays.toString(numbers));//will print all zeros because we did not initialize
    //the array.

    String[] newPets = new String[5];
    System.out.println(Arrays.toString(newPets) + "\n");//will print all nulls because Strings are objects.

    for (int i = 0; i < numbers.length; i++) {
      //first iteration i = 0
      //numbers[0] = 0 + 10 -> 10
      //2nd iteration i = 1
      //numbers[1] = 1 + 10 -> 11
      numbers[i] = i + 10;
    }
    for (int i = 0; i < numbers.length ; i++) {
      System.out.println("numbers [" + i + "] = " + numbers[i]);

      Integer[] nums = new Integer[4];//will print 4 nulls because this is a wrapper class, hence
      //contains objects.
    }


  }
}
