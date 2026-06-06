public class run_length_decoding {
    public static void main(String[] args){
        String s="aaabbccdfaa";
        int n=s.length();
        String res="";
        int count=1;
        for(int i=0;i<n;i++){
            if(i<n-1 && s.charAt(i)==s.charAt(i+1)) {
                count++;
            }else{
                res+=count+""+s.charAt(i-1);
                count=1;
            }
        }
        System.out.println(res);
    }
}
 