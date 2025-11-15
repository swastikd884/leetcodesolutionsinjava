//convert arr to arrlist
import java.util.*;
public class six {
    public static void main(String[] args){
        List<Integer> arrlist = new ArrayList<>();
        //arrlist.add(1);
        //arrlist.add(7);
        //arrlist.add(3);
        Integer[] arr = {1,2,5,3};
         arrlist = Arrays.asList(arr);
         //arrlist.add(1); 
        System.out.println(arrlist);


    }

    
}