//Import Scanner for input
import java.util.Scanner;

class HelloWorld {
  public static void main(String[] args) {
    // set variable for scanner
    Scanner age = new Scanner(System.in);
    System.out.println("What is your age? ");
    int userAge = age.nextInt();

    // inequality
    if (userAge >= 18) {
      System.out.println("You may vote.");
    } else {
      System.out.println("You cannot vote.");
    }
  }
}