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
      test("aardvark"); // expect: a
      test("roommate"); // expect: o (not m)
      test("mate"); // expect: 0 (no duplicate letters)
      test("test"); // expect: 0 (the t isn't repeating)
   }

   public static void test(String s)
   {
      WordAnalyzer wa = new WordAnalyzer(s);
      char result = wa.firstRepeatedCharacter();
      if (result == 0)
         System.out.println("No repeated character.");
      else
         System.out.println("First repeated character = " + result);
   }
}
