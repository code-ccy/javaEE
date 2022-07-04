package arr;

public class arrPrint {
    public static void main(String[] args) {
        int[] arr={12,412,4,521,5,24,2};
        System.out.print("[");
        printArr(arr);
    }

    private static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i== arr.length-1){
                System.out.println(arr[i]+"]");
            }else {
                System.out.print(arr[i]+",");
            }
        }
    }
}
