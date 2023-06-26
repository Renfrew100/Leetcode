class Solution {
    class Node{
        int end;
        int value;
        public Node(int end , int value){
            this.end = end;
            this.value = value;
        }
    }
    public List<List<Integer>> getSkyline(int[][] arr) {
        List<List<Integer>> ans = new ArrayList<>();
        TreeMap<Integer , ArrayList<Node>> map = new TreeMap<>();
        PriorityQueue<Node> pq = new PriorityQueue<>(new Comparator<Node>(){
            public int compare(Node node1 , Node node2){
                return node2.value - node1.value;
            }
        });
        for(int i = 0 ; i < arr.length ; i++){
            int start = arr[i][0];
            int end = arr[i][1];
            int value = arr[i][2];
            
            if(!map.containsKey(start)){
                map.put(start , new ArrayList<>());
            }
            map.get(start).add(new Node(end , value));
            if(!map.containsKey(end)){
                map.put(end , new ArrayList<>());
            }
            map.get(end).add(new Node(Integer.MIN_VALUE , value));
        }
        int prev = -1;
        for(Map.Entry<Integer , ArrayList<Node>> entry : map.entrySet()){
            int key = entry.getKey();
            ArrayList<Node> l = entry.getValue();
            Collections.sort(l , (k , m) -> k.end - m.end);
            for(Node node : l){
                if(node.end == Integer.MIN_VALUE){
                    int index = key;
                    while(!pq.isEmpty() && pq.peek().end <= index){
                        pq.poll();
                    }
                }else{
                    pq.add(new Node(node.end , node.value));
                }
            }
            if(pq.isEmpty()){
                add(ans , key  , 0);
            }else if(prev != pq.peek().value){
                add(ans , key ,pq.peek().value);
                prev = pq.peek().value;
            }
        }
        return ans;
        
    }
    private void add(List<List<Integer>> list , int i , int j){
        List<Integer> temp = new ArrayList<>();
        temp.add(i);
        temp.add(j);
        list.add(temp);
    }
}
