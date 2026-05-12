import java.util.ArrayList;

public class leaders_in_a_array {
    public static void main (String[] args){
        int[] arr={10,4,2,4,1};
        int n=5;
        for(int i=0;i<n;i++){
            boolean found=true;
            for(int j=i+1;j<n;j++){
                if(arr[i]<arr[j]){
                    found=false;
                }
            }
            if(found){
                System.out.print(arr[i]+" ");
            }
        }
//        ArrayList<Integer> res=new ArrayList<>();
//        int last=arr[n-1];
//        res.add(last);
//        for(int i=n-2;i>=0;i--){
//            if(arr[i]>=last){
//                last=arr[i];
//                res.add(last);
//            }
//        }
//        System.out.println(res.reversed());
    }
}
