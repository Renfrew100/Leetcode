class LRUCache {

    public LRUCache(int capacity) {
        int cap = capacity;
    }

    class Node {
        int key;
        int value;
        Node pre;
        Node post;
    }
    
    private void addNode(Node node){
        node.pre = head;
        node.post = head.post;

        head.post.pre = node;
        head.post = node;
    }

    private void removeNode(Node node){
        Node pre = node.pre;
        Node post = node.post;
        
        pre.post = post;
        post.pre = pre;
    }

    private void moveToHead(Node node){
        removeNode(node);
        addNode(node);
    }

    private Node popTail(){
        Node res = tail.pre;
        removeNode(res);
        return res;
    }

/*     public LRUCache(int capacity){
        this.count = 0;
        this.capacity = capacity; 
        
        this.head = new Node();
        head.pre=null;

        tail = new Node();
        tail.post = null;

        head.post = tail;
        tail.pre = head;
    }
 */
    public int get(int key) {
        Node node = cache.get(key);
        if(node == null){
            return -1;
        }

        this.moveToHead(node);
        return node.value;
    }
    
    public void put(int key, int value) {
        if(get(key) == true){
            linkedMap.put(key, value);
            return v == null ? - 1 : v;
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */