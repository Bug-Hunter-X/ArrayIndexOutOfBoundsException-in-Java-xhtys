public class MyClass {
    public static void main(String[] args) {
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 2;
        }
        //To avoid exception, print only valid indices, example index 0 to 4
        System.out.println(arr[0]);
    }
}