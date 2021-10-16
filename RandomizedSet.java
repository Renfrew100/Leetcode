/* class RandomizedSet {

    public RandomizedSet() {
        int[][] RandomizedSet = new int[8][8];;
    }
    
    public boolean insert(int val) {
        for(i = 0; i < RandomizedSet.length(); i++){
            for(j = 0; j < RandomizedSet.length(); j++){
                RandomizedSet[i][j] = val;
                i++;
                j++;
                return true;
            }
        }
        return false;
    }   
    
    public boolean remove(int val) {
        for(i = 0; i < RandomizedSet.length(); i++){
            for(j = 0; j < RandomizedSet.length(); j++){
                if(RandomizedSet[i][j] == val){
                    RandomizedSet[i][j] = "";
                        return true;
                }
            }
        }
        return false;
    }   
    
    public int getRandom() {
        int random = (int)(Math.random() * RandomizedSet.length());
        return random;
    }
}
 */

import java.util.*;

class RandomizedSet {
     ArrayList<Integer> arr;   // A resizable array
 
     // A hash where keys are array elements and values are
     // indexes in arr[]
    HashMap<Integer, Integer>  hash;
 

    public RandomizedSet() {
       arr = new ArrayList<Integer>();
       hash = new HashMap<Integer, Integer>();    
    }
    
    public boolean insert(int val) {
    // If element is already present, then nothing to do
      if (hash.get(val) != null)
          return false;
 
      // Else put element at the end of arr[]
      int length = arr.size();
      arr.add(val);
        
      // And put in hash also
      hash.put(val, length);    
      return true;

    }   
    
    public boolean remove(int val) {
       Integer index = hash.get(val);
       if (index == null){
          return false;
       }
        { // If present, then remove element from hash
       hash.remove(val);
 
       // Swap element with last element so that remove from
       // arr[] can be done in O(1) time
       int size = arr.size();
       Integer last = arr.get(size-1);
       Collections.swap(arr, index,  size-1);
 
       // Remove last element (This is O(1))
       arr.remove(size-1);
 
       // Update hash table for new index of last element
       hash.put(last, index);
        }
        return true;

    }   
    
    public int getRandom() {
        // Find a random index from 0 to size - 1
       Random rand = new Random();  // Choose a different seed
       int index = rand.nextInt(arr.size());
 
       // Return element at randomly picked index
       return arr.get(index);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */