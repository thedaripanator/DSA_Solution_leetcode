package Arrays.SlidingWindow.Fixed;

import java.util.Scanner;

public class Maximum_Repeating_substring {
    static void main() {
        Scanner sc=new Scanner(System.in);
        String sequence=sc.next();
        String word=sc.next();
        System.out.println(maxRepeating(sequence,word));
    }
    public static int maxRepeating(String sequence, String word) {
        int count = 0;
        int max=0;
        int j=word.length();
        int i=0;
        int start=0;
       while(i<sequence.length()){
             if(j>sequence.length()){
                 break;
             }
             if(sequence.substring(i,j).equals(word)){
                 count+=j-i;
                 max=Math.max(max,count);
                 i=i+word.length();
                 j+=word.length();
             }
             else{
                 count=0;
                 start++;
                 i=start;
                 j=i+word.length();
             }

        }
        return max/word.length();
    }
}
