public class run_length_decoding {
    public static void main(String[] args){
        String s="aaabbccdfaa";
        int n=s.length();
        String res="";
        for(int i=0;i<n;i++){

            int count=1;
            while(i < n-1 && s.charAt(i)==s.charAt(i+1)){
                count++;
                i++;
            }
            res+=count+""+s.charAt(i);
        }
        System.out.println(res);
    }
}
