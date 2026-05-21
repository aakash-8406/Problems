import java.util.*;

public class balloonColor {
    public static void main (String[] args){
        HashMap<Character,Integer> map=new HashMap<>();

        char[] ch={'A','B','B','C','C','A'};
//        char res="";
        for(int i=0;i<ch.length;i++){
            map.put(ch[i],map.getOrDefault(ch[i],0)+1);
        }
        for(int i=0;i<map.size();i++){
            if(map.get(ch[i]) == 1 || map.get(ch[i]) % 3 ==0){
                System.out.print(ch[i]);
                return;
            }
        }
        System.out.println("All are Even");
    }
}
