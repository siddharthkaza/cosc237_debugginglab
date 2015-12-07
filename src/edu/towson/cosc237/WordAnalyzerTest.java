/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.towson.cosc237;

/**
 *
 * @author skaza
 */
public class WordAnalyzerTest
{
   public static void main(String[] args)
   {
      testFirstRepeatedCharacter("aardvark"); // expect: a
      testFirstRepeatedCharacter("roommate"); // expect: o (not m)
      testFirstRepeatedCharacter("mate"); // expect: 0 (no duplicate letters)
      testFirstRepeatedCharacter("test"); // expect: 0 (the t isn't repeating)
      
      /* Uncomment the following lines when prompted in lab. */
      //testCountRepeatedCharacters("mississippiii"); // expect: 4 (ss, ss, pp, iii)
      //testCountRepeatedCharacters("test"); // expect: 0 (no repeated letters)
      //testCountRepeatedCharacters("aabbcdaaaabb"); // expect: 4 (aa, bb, aaaa, bb)
   }

   public static void testFirstRepeatedCharacter(String s)
   {
      WordAnalyzer wa = new WordAnalyzer(s);
      char result = wa.firstRepeatedCharacter();
      if (result == 0)
         System.out.println("No repeated character.");
      else
         System.out.println("First repeated character = " + result);
   }


   public static void testCountRepeatedCharacters(String s)
   {
      WordAnalyzer wa = new WordAnalyzer(s);
      int result = wa.countRepeatedCharacters();
      System.out.println(result + " repeated characters.");
   }

}
