package Array.Rotation_Array;
import java.util.*;
import java.io.*;
public class Reversal_Algorithm {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter size of array");
       try (Scanner sc = new Scanner(System.in)) {
        int size = sc.nextInt();
        int[] a=new int[size];
        System.out.println("Enter elements of the array");
        for(int i=0;i<size;i++){
            a[i]=sc.nextInt();
        } 
        System.out.println("Enter number of shift");
        int shift=sc.nextInt();
        leftRotate(a,shift);
        printArray(a);
    }
    } 
    static void leftRotate(int[] a, int shift) {
        if(shift==0){
            return;
        } 
        int len=a.length;
        shift=shift%len;
        reversalArray(a,0,shift-1);
        reversalArray(a,shift,len-1);
        reversalArray(a,0,len-1);
    } 
    static void reversalArray(int[] a,int first, int last){
        int temp;
        while(first<last) {
            temp=a[first];
            a[first]=a[last];
            a[last]=temp;
            first++;
            last--;
        } 
    } 
    static void printArray(int[] a){ 
        System.out.println("Output");
        for(int i=0;i<a.length;i++){ 
            System.out.println(a[i]);
        }
    }
}