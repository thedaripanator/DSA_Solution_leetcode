package String;

import java.util.*;

public class Minimum_Number_of_Pushes_to_Type_Word_II {
    static void main() {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println(minimumPushes(str));
    }
    public static int minimumPushes(String word) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        if(map.size()<=8){
            return word.length();
        }

        List<Integer>  result=new ArrayList<>();
        for(Map.Entry<Character,Integer> c:map.entrySet()){
            result.add(c.getValue());
        }
        Collections.sort(result,Collections.reverseOrder());
//        System.out.println(result);
        int total=0;
        for(int i=0;i<8;i++){
            total+=result.get(i);
        }
        if(result.size()>8 && result.size()<16){
            for(int i=8;i<result.size();i++){
                total+=2*result.get(i);
            }
        }
        else{
            for(int i=8;i<16;i++){
                total+=2*result.get(i);
            }
            for(int i=16;i<result.size();i++){
                total+=3*result.get(i);
            }
        }



        return total;
    }
}
