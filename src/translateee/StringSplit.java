/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package translateee;

public class StringSplit {
  public static void main(String args[]) {
    String testString = "Real How To";
    System.out.println
      (java.util.Arrays.toString(testString.split(" ")));
    // output : [Real, How, To]
  }
}