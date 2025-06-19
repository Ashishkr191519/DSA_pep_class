package collections;

import java.util.HashMap;
import java.util.Scanner;

public class Maps {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the number of element you want in hasmap");
        // int n = sc.nextInt();
        // int key = sc.nextInt();
        // String name = sc.nextLine();
        HashMap<Integer,String> m1 = new HashMap<>();
        // for(int i = 0 ; i < m1.size() ; i++){
        //     System.out.println("Enter the " + i + "name");
        //     m1.put(key, name);
        // }
        // System.out.println(m1);

        m1.put(01, "ashish");
        m1.put(02, "chetan rana");
        m1.put(03,"shivam");

        for(int i = 1 ; i <= m1.size() ; i++){
            System.out.println(m1.get(i));
        }

    }
}
