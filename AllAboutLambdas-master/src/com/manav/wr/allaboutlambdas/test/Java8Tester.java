package com.manav.wr.allaboutlambdas.test;

public class Java8Tester {

  public static void main(String str[]){

    Java8Tester tester = new Java8Tester();

    //with type declaration
    MathOperation addition = (int a, int b) -> a + b;
  }

  interface MathOperation {
    int operation(int a, int b);
 }

}
