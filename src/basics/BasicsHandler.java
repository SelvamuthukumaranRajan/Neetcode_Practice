package basics;

import java.util.Arrays;

public class BasicsHandler {
    public void runInsertionSort(int[] arr) {
        System.out.print(Arrays.toString(arr) + " -> ");
        new InsertionSort().insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public void runMergeSort(int[] arr) {
        System.out.print(Arrays.toString(arr) + " -> ");
        new MergeSort().mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public void runDeque1() {
        var deque = new Deque(3);

        var out = deque.enQueue(1);
        System.out.print(out);

        out = deque.enQueue(2);
        System.out.print("\t" + out);

        out = deque.enQueue(3);
        System.out.print("\t" + out);

        out = deque.enQueue(4);
        System.out.print("\t" + out);

        var val = deque.Rear();
        System.out.print("\t" + val);

        out = deque.isFull();
        System.out.print("\t" + out);

        out = deque.deQueue();
        System.out.print("\t" + out);

        out = deque.enQueue(4);
        System.out.print("\t" + out);

        val = deque.Rear();
        System.out.println("\t" + val);

        deque.print();
    }

    public void runDeque2() {
        var deque = new Deque(2);

        var out = deque.enQueue(1);
        System.out.print(out);

        out = deque.enQueue(2);
        System.out.print("\t" + out);

        out = deque.enQueue(3);
        System.out.print("\t" + out);

        var val = deque.Front();
        System.out.print("\t" + val);

        val = deque.Rear();
        System.out.print("\t" + val);

        out = deque.isEmpty();
        System.out.print("\t" + out);

        out = deque.deQueue();
        System.out.print("\t" + out);

        out = deque.enQueue(4);
        System.out.println("\t" + out);

        deque.print();
    }
}
