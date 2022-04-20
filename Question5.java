import java.util.Scanner;
import java.util.ArrayList;


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
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int num = 0;
    ArrayList<Integer> data = new ArrayList<>();
    for (int i=n;
        i > 0;
        i--) {
      Scanner input = new Scanner(System.in);
      int eachnum = input.nextInt();
      data.add(eachnum);
    }

    int mode = data.get(0);
    int highest = 0;
    for (int i = 0; i < n; i++) {
        int value = data.get(i);
        int count = 1;
        for (int j = 0; j < n; j++) {
            if (data.get(j) == value)
                count++;
            if (count > highest) {
                mode = value;
                highest = count;
            }
        }
    }
    System.out.print(mode);
    
  }
}
