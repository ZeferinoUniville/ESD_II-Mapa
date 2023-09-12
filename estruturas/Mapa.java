public class Mapa<K, V> {
    private Nodo<K, V> first;

    public void put(K key, V value) {
        if (first == null) {
            first = new Nodo<>(key, value);
        } else {
            Nodo<K, V> node = first;
            while (node.getNext() != null) {
                node = node.getNext();
            }
            node.setNext(new Nodo<>(key, value));
            node.getNext().setPrevious(node);
        }
    }

    public V get(K key) {
        Nodo<K, V> node = first;
        while (node != null) {
            if (node.getKey().equals(key)) {
                return node.getValue();
            }
            node = node.getNext();
        }
        return null;
    }

    public void remove(K key) {
        Nodo<K, V> node = first;
        while (node != null) {
            if (node.getKey().equals(key)) {
                if (node.getPrevious() != null) {
                    node.getPrevious().setNext(node.getNext());
                } else {
                    first = node.getNext();
                }
                if (node.getNext() != null) {
                    node.getNext().setPrevious(node.getPrevious());
                }
                return;
            }
            node = node.getNext();
        }
    }

    public boolean containsKey(K key) {
        Nodo<K, V> node = first;
        while (node != null) {
            if (node.getKey().equals(key)) {
                return true;
            }
            node = node.getNext();
        }
        return false;
    }

    public int size() {
        int count = 0;
        Nodo<K, V> node = first;
        while (node != null) {
            count++;
            node = node.getNext();
        }
        return count;
    }

    private static class Nodo<K, V> {
        private K key;
        private V value;
        private Nodo<K, V> previous;
        private Nodo<K, V> next;

        public Nodo(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }

        public Nodo<K, V> getPrevious() {
            return previous;
        }

        public void setPrevious(Nodo<K, V> previous) {
            this.previous = previous;
        }

        public Nodo<K, V> getNext() {
            return next;
        }

        public void setNext(Nodo<K, V> next) {
            this.next = next;
        }
    }
}
