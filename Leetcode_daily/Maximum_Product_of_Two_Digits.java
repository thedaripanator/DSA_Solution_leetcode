package Leetcode_daily;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Maximum_Product_of_Two_Digits {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(maximumProduct(n));
    }
    public static int maximumProduct (int x){
        List<Integer> list=new ArrayList<>();
        while(x!=0){
            list.add(x%10);
            x/=10;
        }
        Collections.sort(list);
        return list.getLast()*(list.get(list.size()-2));
    }
}
