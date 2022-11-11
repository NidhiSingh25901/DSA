package RotateArray; 
import java.util.*;
import java.io.*;
public class MaxCyclicRotateArray {
    public static void main(String[] args)throws IOException {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of the array");
        int size=sc.nextInt();
        int[] a=new int[size];
        for(int i=0;i<size;i++){
            a[i]=sc.nextInt();
        } 
        System.out.println(maxSum(a,size)); 
    }
    public static int maxSum(int[] a,int size) {
        int res=Integer.MIN_VALUE;
        for(int i=0;i<size;i++) {
            int curr_sum=0;
            for(int j=0;j<size;j++) {
                int index = (i+j)%size;
                curr_sum+= (j*a[index]);
            } 
            res=Math.max(res,curr_sum);
        }
        return res;
        
    }
}
