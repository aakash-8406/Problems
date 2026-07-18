public class two_String_Subsequence {
    public static void main(String[] args){
        String s="abc";
        String st="ahbgdc";
        int i=0,j=0;

        while (i < s.length() && j < st.length()){

            if(s.charAt(i) == st.charAt(j)){
                i++;
            }
            j++;
        }
        System.out.println(i == s.length());
    }
}
