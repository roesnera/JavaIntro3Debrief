package com.example.main;

import java.util.ArrayList;
import java.util.Arrays;

class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to our Java Unit 3 Closing CFU");

      /*
        Some activities for Array
      */

        //create an array (not an ArrayList) called favoriteColors that holds five strings with your favoriteColors and print the entire array to the screen.
        String[] favoriteColors = {"Purple", "Black", "Crimson", "Cobalt", "Magenta"};
        System.out.println(Arrays.toString(favoriteColors));
        //Change the third element of favoriteColors to a different color and print that element to the sceen
        favoriteColors[2] = "Purple again";
        System.out.println(favoriteColors[2]);
        //Declare and initialize and array of type int called numbers to hold 1000 elements (this should be used later in the loop exercise)
        int[] numbers = new int[1000];
        //ArrayList
        //Declare and initialize an ArrayList so that it holds values of type <Double>.
        ArrayList<Double> doubles = new ArrayList<>();
        //Using the .add() method, add 5 decimal values to the ArrayList and print it to the screen
        doubles.add(3.14);
        doubles.add(2.89);
        doubles.add(4.5);
        doubles.add(6.67);
        doubles.add(1.337);
        System.out.println(doubles);
        //Using the .remove() method, remove the 3rd value in the ArrayList.
        doubles.remove(2);
        //Print ArrayList to the screen.
        System.out.println(doubles);
        //Now change the last element in the ArrayList and print the new element to the screen
        doubles.set(doubles.size()-1, 5.43);

    /*
      Some activities for Loops
    */
        // write a for loop that prints out numbers 1-1000 and saves these numbers to the empty array you created earlier
        for (int i = 0; i < 1000; i++) {
            System.out.println(i+1);
            numbers[i] = i+1;
        }
        // write a while loop that prints the elements of the array you used in the previous exercise. Take care to avoid infinite looping!
        int index = 0;
        while(index<numbers.length){
            System.out.println(numbers[index++]);
        }
        //write a do-while loop that does the same.
        do {
            System.out.println(numbers[--index]);
        } while (index>0);
        // write an enhanced for loop that iterates over this array and prints the result of that number modulus(%) 3
        for (int i :
                numbers) {
            System.out.println(i%3);
        }

    /*
      Some activities for String methods
    */
        // Create two String variables, one holding "Hello" and one holding "world"
        String hello = "Hello";
        String world = "world";

        // using String methods, concatenate these strings together with a space between them so that it reads "Hello world" and save the resulting String to a new variable
        String helloWorld = hello.concat(" ").concat(world);

        // then, create a for loop that iterates over your new String and prints each letter out using sout
        for (int i = 0; i<helloWorld.length(); i++){
            System.out.println(helloWorld.charAt(i));
        }


    /*
      Combination Exercises
    */


        // Create a variable that stores a String with the value "Testing out String methods"
        String methodsVar = "Testing out String methods";

        // Use the String's .split() method with the input of '\s' save an array containing each word of your String variable
        String[] splitString = methodsVar.split("\s");

        // Using a loop of your choosing, loop through the array of strings and print each word to the screen in all caps, along with its length
        for (String str :
                splitString) {
            System.out.println(str.toUpperCase()+", length: "+str.length());
        }

        // CHALLENGE: search the Oracle Documentation to find out how to sort an array, then print the sorted array to the string
        System.out.println(Arrays.toString(splitString));
        Arrays.sort(splitString);
        System.out.println(Arrays.toString(splitString));
    }
}