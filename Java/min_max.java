import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
  
public class min_max {
  
    // function to find minimum value in an unsorted
    // list in Java using Collection
    public static Integer findMin(List<Integer> list)
    {
  
        // check list is empty or not
        if (list == null || list.size() == 0) {
            return Integer.MAX_VALUE;
        }
  
        // return minimum value of the ArrayList
        return Collections.min(list);
    }
  
    // function return maximum value in an unsorted
    //  list in Java using Collection
    public static Integer findMax(List<Integer> list)
    {
  
        // check list is empty or not
        if (list == null || list.size() == 0) {
            return Integer.MIN_VALUE;
        }
  
        // return maximum value of the ArrayList
        return Collections.max(list);
    }
  
    public static void main(String[] args)
    {
  
        // create an ArrayList Object list
        List<Integer> list = new ArrayList<>();
  
        Scanner input = new Scanner(System.in);
        System.out.println("Kaç sayı giriniz ?");
        int num1 = input.nextInt();
        for (int i = 1; num1 >= i; i++){
            System.out.println(i + ". sayıyı giriniz:");
            list.add(input.nextInt());
        }
  
        // print min amd max value of ArrayList
        System.out.println("Min: " + findMin(list));
        System.out.println("Max: " + findMax(list));
    }
}