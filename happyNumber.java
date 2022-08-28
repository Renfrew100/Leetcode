int number;
int[] array;
int[] array2;

class Heap {
    void heapify(ArrayList<Integer> hT, int i){
        int size = hT.size();
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if (l < size && hT.get(l) > hT.get(largest)){
            largest = l;
        }
        if (r < size && hT.get(r) > hT.get(largest)){
            largest = r;
        }
    }
}