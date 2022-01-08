import java.util.Scanner;
import java.util.stream.Stream;
 
class processes {
 
  static int solution(Integer[] loads) {
    // put your solution here
    int i = 0;
    int sum1 = 0;
    int sum2 = 0;
    
    while(loads != null){
      sum1 = loads[i] + loads[i+1] + loads[i+3];
      sum2 = loads[i+2] + loads[i+4];
    }
    return sum2 - sum1; 
  }
 
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    Integer[] loads = getIntegerArray(in.next());
 
    System.out.print(solution(loads));
  }
 
  private static Integer[] getIntegerArray(String str) {
    return Stream.of(str.split("\\,"))
          .map(Integer::valueOf)
          .toArray(Integer[]::new);
  }
}