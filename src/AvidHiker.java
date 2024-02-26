import java.io.IOException;
import java.util.Scanner;

public class AvidHiker {

  public static int solve(Scanner reader) throws IOException {
    int valleys = 0, level = 0;
    System.out.println("Please Enter the number of Steps: ");
    int steps = reader.nextInt();
    System.out.println("Enter the Path of Hiker: ");
    String path = reader.next();
    System.out.println("Entered Path: ");

    for (int i = 0; i < path.length(); i++) {
      if (path.charAt(i) == 'U')
        level++;
      else if (path.charAt(i) == 'D') {
        if (level == 0)
          valleys++;
        level--;
      }
    }
    System.out.println("Level: " + level + ", Valleys: " + valleys);
    return valleys;
  }
}
