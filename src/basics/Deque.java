package basics;

class DequeNode {
    int val;
    DequeNode prev, next;

    DequeNode(int val, DequeNode prev, DequeNode next) {
        this.val = val;
        this.prev = prev;
        this.next = next;
    }

    DequeNode(int val) {
        this(val, null, null);
    }
}

class Deque {
    DequeNode head;
    DequeNode tail;
    int size;
    int capacity;

    public Deque(int capacity) {
        this.capacity = capacity;
        size = 0;
        head = new DequeNode(-1);
        tail = new DequeNode(-1);
        head.next = head.prev = tail;
        tail.next = tail.prev = head;
    }

    public boolean enQueue(int value) {
        if (size < capacity) {
            var newNode = new DequeNode(value);
            var prev = tail.prev;
            var next = tail;
            newNode.prev = prev;
            newNode.next = next;
            prev.next = next.prev = newNode;
            size++;
            return true;
        }
        return false;
    }

    public boolean deQueue() {
        if (size > 0) {
            var prev = head;
            var next = head.next.next;
            prev.next = next;
            next.prev = prev;
            size--;
            return true;
        }
        return false;
    }

    public int Front() {
        if (size > 0) {
            return head.next.val;
        }
        return -1;
    }

    public int Rear() {
        if (size > 0) {
            return tail.prev.val;
        }
        return -1;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public void print() {
        var cur = head.next;
        while (cur != tail) {
            System.out.println("Print:"+cur.val);
            cur = cur.next;
        }
    }
}
