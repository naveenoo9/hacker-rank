
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Solution {

  // @SuppressWarnings("unused")
  // private static BufferedReader reader = new BufferedReader(new
  // InputStreamReader(System.in));
  // @SuppressWarnings("unused")
  // private static BufferedWriter writer = new BufferedWriter(new
  // OutputStreamWriter(System.out));
  private static Scanner reader = new Scanner(System.in);

  public static void main(String[] args) throws IOException {

    // SockMerchant.solveSockMerchant(reader, writer);
    // System.out.println(AvidHiker.solve(reader));;

    boolean exit = false;
    int option = 0;
    while (!exit) {
      System.out.println(
          "\nPlease Select the problem Number you wish to solve from below:\n\t1.  Sock Merchant\n\t2.  Avid Hiker\n\t3.  Exit");
      option = reader.nextInt();
      switch (option) {
        case 1:
          SockMerchant.solveSockMerchant(null, null);
          break;
        case 2:
          AvidHiker.solve(reader);
          break;
        case 3:
          JumpingClouds.solve(reader);
          break;
        case 4:
          exit = !exit;
        default:
          System.out.println("\tXXX\tH A P P Y\tS O L V I N G \tXXX");
          break;
      }
    }
  }
}
