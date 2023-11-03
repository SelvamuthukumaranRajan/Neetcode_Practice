package basics;

import java.util.ArrayList;

class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

class LinkedList {
    private final ListNode head;
    private ListNode tail;

    public LinkedList() {
        head = new ListNode(-1);
        tail = head;
    }

    public int get(int index) {
        var curr = head.next;
        int idx = 0;
        while (curr != null) {
            if (idx == index) {
                return curr.val;
            }
            curr = curr.next;
            idx++;
        }
        return -1;
    }

    public void insertHead(int val) {
        var newNode = new ListNode(val);
        newNode.next = head.next;
        head.next = newNode;
        if (head == tail)
            tail = newNode;
    }

    public void insertTail(int val) {
        var newNode = new ListNode(val);
        tail.next = newNode;
        tail = newNode;
    }

    public boolean remove(int index) {
        var prev = head;
        var curr = head.next;
        int idx = 0;
        while (curr != null) {
            if (idx == index) {
                if (curr == tail)
                    tail = prev;
                prev.next = curr.next;
                return true;
            }
            prev = curr;
            curr = curr.next;
            idx++;
        }
        return false;
    }

    public ArrayList<Integer> getValues() {
        var result = new ArrayList<Integer>();
        var curr = head.next;
        while (curr != null) {
            result.add(curr.val);
            curr = curr.next;
        }
        return result;
    }
}

