import java.util.Arrays;

public class rat_food {
    public static int food_consumes(int[] arr,int rat,int consume){
        int total=consume*rat;
        int count=0;
        Arrays.sort(arr);
        int minlen=Integer.MAX_VALUE;
        for(int i=arr.length-1;i>=0;i--){
            if(total-arr[i]>=0){
                count++;
                total-=arr[i];
            }
            if(total==0){
                minlen=Math.min(minlen,count);
            }
        }
        if(minlen==Integer.MAX_VALUE){
            return 0;
        }
        return minlen;
    }
    public static void main(String[] args){
        int count=0;
        int[] arr={1,2,3,4,5};
        int rat=10;
        int consume=3;
        System.out.println(food_consumes(arr,rat,consume));
    }
}
