package RotateArray;

import java.io.IOException;
import java.util.*;
public class CyclicRotate { 
    public static void main(String[] args)throws IOException {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of the array");
        int size=sc.nextInt();
        int[] a=new int[size];
        for(int i=0;i<size;i++) {
            a[i]=sc.nextInt();
        } 
       Rotate(a);
       Print(a);
    } 
    static void Rotate(int[] a){
        int len=a.length;
        int temp=a[len-1];
        for(int j=len-1;j>0;j--) {
            a[j]=a[j-1];
        } 
        a[0]=temp;
    }
    static void Print(int[] a){
        System.out.println("Output");
        for(int m=0;m< (a.length);m++) {
            System.out.println(a[m]);
        }
    }
}
