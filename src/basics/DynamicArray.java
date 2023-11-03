package basics;

class DynamicArray {
    private int[] dynamicArray;
    private int capacity;
    private int length;

    public DynamicArray(int capacity) {
        dynamicArray = new int[capacity];
        this.capacity = capacity;
        this.length = 0;
    }

    public int get(int i) {
        if (capacity >= i) {
            return dynamicArray[i];
        } else {
            return -1;
        }
    }

    public void set(int i, int n) {
        dynamicArray[i] = n;
        if (i + 1 > length)
            length = i + 1;
    }

    public void pushback(int n) {
        if (length == capacity) {
            resize();
        }
        dynamicArray[length++] = n;
    }

    public int popback() {
        length--;
        return dynamicArray[length];
    }

    private void resize() {
        capacity *= 2;
        var newArray = new int[capacity];
        System.arraycopy(dynamicArray, 0, newArray, 0, dynamicArray.length);
        dynamicArray = newArray;
    }

    public int getSize() {
        return this.length;
    }

    public int getCapacity() {
        return this.capacity;
    }
}

