package OOPs.ArgumentPassing;

import java.util.ArrayList;

public class PassByValueObjectRefernce {
    static void main() {
        ArrayList<Integer> mylist=new ArrayList<>();
        mylist.add(2);
        mylist.add(4);
        System.out.println("Before Changing  MyList:"+mylist);
        change(mylist);
        System.out.println("After Changing  MyList:"+mylist);
    }
    public static void change(ArrayList<Integer> list){
         list.add(3);
         list.add(5);
    }
}
