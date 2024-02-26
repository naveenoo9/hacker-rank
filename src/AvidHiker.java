import static java.util.stream.Collectors.counting;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Scanner;

public class AvidHiker {

  public static int solve(Scanner reader) throws IOException {
    int valleys = 0, level = 0;
    //writer.write("Enter the Number of Steps: ");
    System.out.println("Enter the Number of Steps: ");
    int steps = reader.nextInt();
    // int steps = Integer.parseInt(reader.readLine());
    // writer.write("\nEnter a String descibing the hikers path:");
    System.out.println("Enter a String descibing the hikers path:");
    String path = reader.next();
    // String path = reader.readLine().trim();
    //writer.write("Given, \n\t Steps:\t" + steps + ";\n\t Path:\t" + path);
    System.out.println("\nGiven, \n\t Steps:\t" + steps + ";\n\t Path:\t" + path + ";");
    for (int index = 0; index < path.length(); index++) {
      
        System.out.println(level+ " : " + valleys +" : " + path.charAt(index));
      if (path.charAt(index) == 'U') {
        level++;
        // System.out.print(level+ " for " + path.charAt(index));
      } else if (path.charAt(index) == 'D') {
        if (level == 0) {
          valleys++;
          // System.out.print(valleys+ " ");
        }
        level--;
      }
    }
    return valleys;
  }
}
