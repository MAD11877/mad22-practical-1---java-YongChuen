import java.util.Scanner;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
    System.out.print("number of numbers: ");
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int num = 0;
    for (int i=n;
        i > 0;
        i--) {
      System.out.print("number pls: ");
      Scanner input = new Scanner(System.in);
      int eachnum = input.nextInt();
      if (eachnum > num) {
        num = eachnum;
      }
    }
    System.out.print(num);
    
  }
}
