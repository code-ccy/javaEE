package methond;

public class demo1 {
    public static void main(String[] args) {
        int[] arr={23,52,3,52,2352,242};
        System.out.println(" maxValue(arr) = " +  maxValue(arr));
    }
    public static int maxValue(int[] arr){
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}
