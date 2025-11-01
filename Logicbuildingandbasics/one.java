//Problem Statement: Given an array, we have to find the smallest element in the array.
public class one {
    //Problem Statement: Given an array, we have to find the smallest element in the array.
    public static void main(String[] args) {
        int[] arr = {1,6,-9,2,5};
        int min = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println(min);
    }

    
}