package RotateArray;
import java.util.*;
import java.io.*;
public class MinimumelementArray {
    public static void main(String[] args)throws IOException {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of the array");
        int size=sc.nextInt();
        int[] a=new int[size];
        for(int i=0;i<size;i++) {
            a[i]=sc.nextInt();
        } 
        Arrays.sort(a);
        System.out.println(a[0]);
    }
}
