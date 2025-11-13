//Problem statement: Given an array, we have found the number of occurrences of each element in the array.
public class five{
    public static void count(int[] array,int num){
        int count = 0;
        for(int j = 0; j < array.length; j++){
            if(array[j] == num)
            {
                count++;
            }
        }
        System.out.printf("%d  %d/n",num,count);

    }
    public static void main(String[] args){
        int[] arr = {10,5,10,15,10,5};
        for(int i : arr){
            count(arr,i);
        }
    }

}
//to avoid repeatition use hashmaps or use a visited array with boolean values and update the visited array as true when you count the element at a particular index
//if visited[i] is false then only calculate the frequency for that element 