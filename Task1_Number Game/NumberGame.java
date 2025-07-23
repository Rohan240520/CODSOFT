// Source code is decompiled from a .class file using FernFlower decompiler.
import java.util.Scanner;

public class NumberGame {
   public NumberGame() {
   }

   public static void guessingNumberGame() {
      Scanner var0 = new Scanner(System.in);
      int var1 = 1 + (int)(100.0 * Math.random());
      int var2 = 0;
      byte var3 = 5;
      boolean var4 = false;
      System.out.println("A number is chosen between 1 and 100.");
      System.out.println("You have " + var3 + " attempts per round to guess the correct number.");

      while(!var4) {
         for(int var5 = 0; var5 < var3; ++var5) {
            System.out.print("Enter your guess: ");
            int var6 = var0.nextInt();
            ++var2;
            if (var6 == var1) {
               System.out.println("Congratulations! You guessed the correct number in " + var2 + " attempts.");
               var4 = true;
               break;
            }

            if (var6 < var1) {
               System.out.println("The number is greater than " + var6);
            } else {
               System.out.println("The number is less than " + var6);
            }
         }

         if (!var4) {
            System.out.println("You have used all " + var3 + " attempts.");
            System.out.print("Do you want to continue guessing? (yes/no): ");
            String var7 = var0.next();
            if (!var7.equalsIgnoreCase("yes")) {
               System.out.println("Game Over! The correct number was: " + var1);
               break;
            }
         }
      }

      var0.close();
   }

   public static void main(String[] var0) {
      guessingNumberGame();
   }
}
