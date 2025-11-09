//Problem Statement: You are given an array. The task is to reverse the array and print it. 
public class four {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int i = 0;
        int j = arr.length-1;
        int[] newarr = new int[j+1];


        while(j >= 0){
            newarr[i] = arr[j];
            i++;
            j--;
            

        }
        System.out.println("reversed array is :");
        for(int k = 0; k < arr.length;k++){
            System.out.println(newarr[k] + ",");
        }
    }
}
