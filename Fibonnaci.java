
public class Fibonnaci{
    public static void main(String[] args){
    int x = 0;
    int y = 0;
    int temp = 0;
    int sum = 0;

    do{
        if(y % 2 == 0){
            sum += y; // checking if even value, then append to sum
        }
        temp = x + y;
        x = y;
        y = temp;
    } while (y < 4000000); //do not exceed 4 million
    System.out.println(sum);
    }
    }
 