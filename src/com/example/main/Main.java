package com.example.main;

import java.util.Arrays;
import java.util.ArrayList;
import java.lang.String;

class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to our Java Unit 3 Closing CFU");

      /*
        Some activities for Array
      */

        //create an array (not an ArrayList) called favoriteColors that holds five strings with your favoriteColors and print the entire array to the screen.
        String[] favoriteColors = {"red", "blue", "green", "yellow", "orange"};

        //Change the third element of facoriteColors to a different color and print that element to the sceen
        favoriteColors[2] = "violet";
        System.out.println(Arrays.toString(favoriteColors));
        //Declare and initialize and array of type int called numbers to hold 1000 elements (this should be used later in the loop exercise)
        int[] numbers = new int[1000];
        //ArrayList
        //Declare and initialize an ArrayList so that it holds values of type <Double>.
        ArrayList<Double> myNumber = new ArrayList<>();
        //Using the .add() method, add 5 decimal values to the ArrayList and print it to the screen
        myNumber.add(4.6);
        myNumber.add(6.7);
        myNumber.add(9.8);
        myNumber.add(5.2);
        myNumber.add(2.4);
        System.out.println(myNumber);
        //Using the .remove() method, remove the 3rd value in the ArrayList.
        myNumber.remove(2);
        //Print ArrayList to the screen.
        System.out.println(myNumber);
        //Now change the last element in the ArrayList and print the new element to the screen
        myNumber.set(3, 1.2);
        System.out.println(myNumber);

    /*
      Some activities for Loops
    */
        // write a for loop that prints out numbers 1-1000 and saves these numbers to the empty array you created earlier
         for(int i = 0; i < numbers.length; i++){
              numbers[i] = i + 1;
              System.out.println("number on index" +  "["+i+"]" + " is : " +numbers[i]);
              }
        // write a while loop that prints the elements of the array you used in the previous exercise. Take care to avoid infinite looping!
        int x = 0;
        while(x < numbers.length) {
            numbers[x] = x + 1;
            System.out.println("Using while loop number on index" +  "["+x+"]" + " is : " + numbers[x]);
            x++;
        }
        //write a do-while loop that does the same.
        int y = 0;
        do {
            numbers[y] = y + 1;
            System.out.println("Using do-while loop number on index " +  "["+y+"]" + " is : " + numbers[y]);
            y++;
        }
        while(y < numbers.length);
        // write an enhanced for loop that iterates over this array and prints the result of that number modulus(%) 3
        for(int number : numbers) {
            System.out.println("for each loop  " + number % 3);
        }

    /*
      Some activities for String methods
    */
        // Create two String variables, one holding "Hello" and one holding "world"
        String myWord = "Hello";
        String newWord = " world";

        // using String methods, concatenate these strings together with a space between them so that it reads "Hello world" and save the resulting String to a new variable
        String wordTogether = myWord.concat(newWord);
        System.out.println(wordTogether);

        // then, create a for loop that iterates over your new String and prints each letter out using sout
        for(int i = 0; i < wordTogether.length(); i++) {
            System.out.println(wordTogether.charAt(i));
        }


    /*
      Combination Exercises
    */


        // Create a variable that stores a String with the value "Testing out String methods"
        String test = "Testing out String methods";

        // Use the String's .split() method with the input of '\s' save an array containing each word of your String variable
        String[] testSplit = test.split("\s");
        System.out.println(Arrays.toString(testSplit));

        // Using a loop of your choosing, loop through the array of strings and print each word to the screen in all caps, along with its length
        for(int i = 0; i < testSplit.length; i++) {
            System.out.println(testSplit[i].toUpperCase() + " " + testSplit[i].length());
        }

        // CHALLENGE: search the Oracle Documentation to find out how to sort an array, then print the sorted array to the string
        Arrays.sort(testSplit);
        System.out.println(Arrays.toString(testSplit));
    }
}