public class Solution {
    
    static class Node {
        int key;
        int value;
        Node next;
        Node prev;
        public Node(int key, int value) {
            this.key = key;
            this.value = value;
            
        }
    }
    
    Node head;
    Node tail;
    HashMap<Integer, Node> map;
    int cap;
    
    public Solution(int capacity) {
        head = new Node(-1, -1);
        tail = new Node(-1, -1);
        // connect head and tail
        head.next = tail;
        tail.prev = head;
        
        map = new HashMap<>();
        cap = capacity;
    }
    
    public void removeNode(Node n) {
        Node nm1 = n.prev;
        Node np1 = n.next;
        
        nm1.next = np1;
        np1.prev = nm1;
    }
    
    public void addBeforeTail(Node n) {
        Node tm1 = tail.prev;
        // connect tm1 with n
        tm1.next = n;
        n.prev = tm1;
        // connect tail with n
        n.next = tail;
        tail.prev = n;
    }
    
    public int get(int key) {
        if(map.containsKey(key)) {
            // 1. get the Node
            Node n = map.get(key);
            // 2. Make that node as most recent used
            removeNode(n);
            addBeforeTail(n);
            // 3. return the value for that node
            return n.value;
        } 
        else {
            return -1;
        }
    }
    
    public void set(int key, int value) {
        if(map.containsKey(key)) {
            // 1. get the node
            Node n = map.get(key);
            // 2. update the value
            n.value = value;
            // 3. Make it as most recent Node
            removeNode(n);
            addBeforeTail(n);
        }
        else {
            // 1. create a new Node
            Node nn = new Node(key, value);
            // 2. add it before tail
            addBeforeTail(nn);
            // 3. add it in the map
            map.put(key, nn);
            // 4. capacity Check
            if(map.size() > cap) {
                // remove least recent used
                Node n = head.next;
                removeNode(n);
                map.remove(n.key);
            }
        }
    }
}
