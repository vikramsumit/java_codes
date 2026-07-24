import java.util.ArrayList;
import java.util.LinkedList;

public class hashmap1 {

    static class HashMap<K, V> {

        private class Node {
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int size; // n = number of nodes
        private LinkedList<Node>[] buckets; // N = number of buckets

        @SuppressWarnings("unchecked")
        public HashMap() {
            this.size = 0;
            this.buckets = new LinkedList[4];

            for (int i = 0; i < 4; i++) {
                buckets[i] = new LinkedList<>();
            }
        }

        // Hash Function
        private int hashFunction(K key) {
            int hc = key.hashCode();
            return Math.abs(hc) % buckets.length;
        }

        // Search in LinkedList
        private int searchInLL(K key, int bi) {
            LinkedList<Node> ll = buckets[bi];

            for (int i = 0; i < ll.size(); i++) {
                if (ll.get(i).key.equals(key)) {
                    return i;
                }
            }

            return -1;
        }

        @SuppressWarnings("unchecked")
        private void rehash() {

            LinkedList<Node>[] oldBuckets = buckets;

            buckets = new LinkedList[oldBuckets.length * 2];

            for (int i = 0; i < buckets.length; i++) {
                buckets[i] = new LinkedList<>();
            }

            size = 0;

            for (int i = 0; i < oldBuckets.length; i++) {
                LinkedList<Node> ll = oldBuckets[i];

                for (int j = 0; j < ll.size(); j++) {
                    Node node = ll.get(j);
                    put(node.key, node.value);
                }
            }
        }

        // Put
        public void put(K key, V value) {

            int bi = hashFunction(key);
            int di = searchInLL(key, bi);

            if (di != -1) {
                Node node = buckets[bi].get(di);
                node.value = value;
            } else {
                buckets[bi].add(new Node(key, value));
                size++;
            }

            double lambda = (double) size / buckets.length;

            if (lambda > 2.0) {
                rehash();
            }
        }

        // Contains Key
        public boolean containsKey(K key) {

            int bi = hashFunction(key);
            int di = searchInLL(key, bi);

            return di != -1;
        }

        // Get
        public V get(K key) {

            int bi = hashFunction(key);
            int di = searchInLL(key, bi);

            if (di != -1) {
                return buckets[bi].get(di).value;
            }

            return null;
        }

        // Remove
        public V remove(K key) {

            int bi = hashFunction(key);
            int di = searchInLL(key, bi);

            if (di != -1) {
                Node node = buckets[bi].remove(di);
                size--;
                return node.value;
            }

            return null;
        }

        // Key Set
        public ArrayList<K> keySet() {

            ArrayList<K> keys = new ArrayList<>();

            for (int i = 0; i < buckets.length; i++) {

                LinkedList<Node> ll = buckets[i];

                for (int j = 0; j < ll.size(); j++) {
                    keys.add(ll.get(j).key);
                }
            }

            return keys;
        }

        // Size
        public int size() {
            return size;
        }

        // Is Empty
        public boolean isEmpty() {
            return size == 0;
        }
    }

    public static void main(String[] args) {

        HashMap<String, Integer> hm = new HashMap<>();

        hm.put("India", 100);
        hm.put("USA", 50);
        hm.put("China", 150);

        System.out.println(hm.get("India"));
        System.out.println(hm.containsKey("USA"));

        System.out.println(hm.remove("USA"));

        System.out.println(hm.keySet());

        System.out.println(hm.size());

        System.out.println(hm.isEmpty());
    }
}