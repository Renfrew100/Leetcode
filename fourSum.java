import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class fourSum{   
    public ArrayList<ArrayList<Integer>> fourSum(int[] num, int target){
        ArrayList<ArrayList<Integer>> aList = new ArrayList<ArrayList<Integer>>();
        int N = num.length;

        for(int i=0; i<N; i++){
            for(int j=i+1; j<N; j++){
                for(int k=j+1; k<N; k++){
                    for(int l=k+1; l<N; l++){
                        int sum = num[i] + num[j] + num[k] + num[l];                        
                            if(sum == target){
                                ArrayList<Integer> tempArray = new ArrayList<Integer>();
                                Collections.addAll(tempArray, num[i], num[j], num[k], num[l]);
                                aList.add(tempArray);
                            }
                }
            }
        }
    }
    return aList;   
    }
}
