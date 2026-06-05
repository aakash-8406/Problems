public class pascal_triangle {
    public static void main(String[] args){
        int n=4;
        for(int i=0;i<n;i++){

            int num=1;

            for(int l=0;l<n-i-1;l++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print(num+" ");
                num=num*(i-j)/(j+1);
            }
            System.out.println();
        }
    }
}
