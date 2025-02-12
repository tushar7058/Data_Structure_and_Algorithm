package DSA.StackQueue;

import java.util.HashMap;
import java.util.Map;

class ImplementLRUCache {
    Node head  = new Node(0,0);
    Node tail = new Node (0,0);

    @SuppressWarnings({ "unchecked", "rawtypes" })
    Map < Integer, Node > map = new HashMap();

    int capacity;

    public void LRUCache(int _capacity){
        capacity = _capacity;
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key){
        if(map.containsKey(key)){
            Node node = map.get(key);
            remove(node);
            insert(node);

            return node.val;
        }
        else{
            return -1;
        }
    }

    public void put(int key, int value){
        if(map.containsKey(key)){
            remove(map.get(key));
        }
        if(map.size()==capacity){
            remove(tail.prev);
        }
        insert(new Node(key , value));
    }

    private void remove(Node node) {
        map.remove(node.key);
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }
    private void insert(Node node) {
        map.put(node.key, node);
        node.next = head.next;
        node.next.prev = node;
        head.next = node;
        node.prev = head;
    }


class Node {
    Node prev;
    Node next;
    int key ,val;

    Node(int _key , int _value){
        key = _key;
        val = _value;
    }
}
}