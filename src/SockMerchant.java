import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class SockMerchant {

  public static int solveSockMerchant(BufferedReader reader, BufferedWriter writer) throws IOException {
    writer.write("\nPlease Enter the size of array: ");
    int arraySize = Integer.parseInt(reader.readLine().trim());
    writer.write("\n Please enter the array separated by space: ");
    String inputString = reader.readLine().trim();
    List<Integer> array = Stream.of(inputString.replaceAll("/s+$", "").split(" "))
                            .map(Integer::parseInt)
                            .collect(toList());
    return SockMerchant.solveUsingSet(arraySize, array);
  }

  public static int solve(int n, List<Integer> arr) {
    int count = 0;
    int[] intArray = new int[n];
    for (Integer integer : arr) {
      for (int num : intArray) {
        num = integer;
      }
    }
    for (int index = 0; index < intArray.length; index++) {
      if (index < intArray.length) {
        if (intArray[index] == intArray[index++]) {
          count++;
          index++;
        }
      }
    }
    return count;
  }
  
  public static int solveUsingSet(int size, List<Integer> arr) {
    int count = 0;
    Set<Integer> unmatched = new HashSet<>();
    // for (int index = 0; index < size; index++) {
    for (Integer sock : arr) {
      if (unmatched.contains(sock)) {
        unmatched.remove(sock);
        ++count;
      } else
        unmatched.add(sock);
    }
    //}
    System.out.println(unmatched);
    return count;
  }
}
