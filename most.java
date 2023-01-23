import java.util.*;
public class most {
    public static int mostContainer(int height[]){
        int max=0;
        int lp=0;
        int rp=height.length-1;
        while(lp<rp){
            int ht=Math.min(height[lp],height[rp]);
            int width=rp-lp;
            int curr=ht*width;
            max=Math.max(max,curr);
            if(height[lp]<height[rp]){
                lp++;
            }
            else{
                rp--;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the element");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int water=mostContainer(arr);
        System.out.println("ans is "+water);
    }
}
