package collections;
import java.util.*;

public class collection01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> ll = new ArrayList<>();
        ll.add(5);
        ll.add(50);
        ll.add(80);
        ll.add(22);
        ll.add(30);
        ll.add(3,99);

        System.out.println(ll);

        for(int i = ll.size()-1 ; i >= 0 ; i--){
            System.out.print(ll.get(i) + " ");
        }

        // for(int i = 0 ; i < ll.size() ;i++){
        //     System.out.print(ll.get(i) + " ");

        // }

        // for(int i : ll){
        //     System.out.println(i);
        // }
        // for(int i = 0 ; i < ll.size() ; i++){
        //     if(ll.get(i) == 80){
        //         ll.remove(2);
        //     }
        // }
        // System.out.println(ll);


    }
    
}
