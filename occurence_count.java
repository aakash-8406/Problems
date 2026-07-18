public class occurence_count {
    public static void main(String[] args){
        int[] arr={1,1,2,3,4};
        int n=arr.length;
        int max=0;
        for(int i=0;i<n;i++){
            max=Math.max(arr[i],max);
        }

        int[] freq=new int[max+1];
        for(int i=0;i<n;i++) {
            freq[arr[i]]++;
        }
        int[] ans = new int[arr.length + 1];
        for (int num = 1; num <= max; num++) {
            if (freq[num] > 0) {
                ans[freq[num]] += num * freq[num];
            }
        }
        for(int i=1;i<=n;i++){
            if(ans[i] != 0) {
                System.out.println(i + "->" +ans[i]);
            }
        }
    }
}
