import static java.util.stream.Collectors.toList;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class JumpingClouds {

    public static void solve(Scanner reader) {
        System.out.println("Please enter the Clouds:");
        String cloud = reader.next();
        List<Integer> list = Stream.of(cloud.replaceAll("/s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());
        int jumps = 0;
        int[] arr = new int[list.size()];
        for (int i = 0; i < arr.length - 1; i++) {
            if (i + 2 < arr.length - 1 && arr[i + 2] == 0)
                i = i + 2;
            else if (arr[i + 1] == 0)
                i++;
            jumps++;
        }
        System.out.println(jumps);
    }

}
