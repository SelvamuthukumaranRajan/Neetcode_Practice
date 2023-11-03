import basics.BasicsHandler;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        new BasicsHandler().runInsertionSort(new int[]{5,4,3,2,1});
        new BasicsHandler().runMergeSort(new int[]{5,7,3,8,1});
        new BasicsHandler().runDeque1();
        new BasicsHandler().runDeque2();
    }
}