public class version_comparision {
    public static void main(String[] args){
        String v1="4.0.0";

        String v2="4.0.1";


        String[] V1=v1.split("\\.");
        String[] V2=v2.split("\\.");

        int n=Math.max(V1.length,V2.length);

        int num1=0,num2=0;
        for(int i=0;i<n;i++){
            if(i < v1.length()){
                num1=Integer.parseInt(V1[i]);
            }
            if(i < v2.length()){
                num2=Integer.parseInt(V2[i]);
            }

            if(num1 < num2){
                System.out.println("Upgraded");
                return;
            }
            if(num1 > num2){
                System.out.println("Downgraded");
                return;
            }
        }
        System.out.println("Same Version");

    }
}
