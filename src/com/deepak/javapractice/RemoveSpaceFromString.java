package com.deepak.javapractice;

class RemoveSpaceFromString {

  public static void main(String[] args) {
    String input = " I am having a good day !!!";
    String result = removeSpaces(input);
    System.out.println("Result after removing spaces:"+result);
  }

  private static String removeSpaces(String input) {
    return input.replaceAll("\\s", "");
  }

}