package arr;

public class demo1 {
    public static void main(String[] args) {
        int[] arr={1,2,46,8,5};
//        找最大值
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("max = " + max);
        //        找最大值
        int min=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("min = " + min);
    }
}
