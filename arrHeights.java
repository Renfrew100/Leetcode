import java.util.Scanner;
import java.util.stream.Stream;

import java.util.Arrays;

class arrHeights {

  static int solution(Integer[] A) {
    // Your solution goes here.
    int i = 0;
    int rows = 0;
    int[] anArray;
    int[] anArray2;
    
    while(A != null){
      if(A[i + 1] < A[i]){
        anArray.append(i);
        return rows = 1;
      }
      else{
        anArray2.append(i);
        return rows = 2;
      }
    }
  }
  public static void main(String[] args) {
    // Read from stdin, solve the problem, write answer to stdout.
    Scanner in = new Scanner(System.in);
    Integer[] A = getIntegerArray(in.next());

    System.out.print(solution(A));
  }

  private static Integer[] getIntegerArray(String str) {
    return Stream.of(str.split("\\,"))
          .map(Integer::valueOf)
          .toArray(Integer[]::new);
  }
}