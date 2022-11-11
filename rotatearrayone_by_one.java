package Array.Rotation_Array;
import java.util.*;
import java.io.*;
public class rotatearrayone_by_one {
    public static void main(String[] args) { 
        try (Scanner sc = new Scanner(System.in)) {
            int[] a=new int[10];
            for(int i=0;i<10;i++) {
                a[i]=sc.nextInt();
            } 
            System.out.println("Enter shift");
            int shift = sc.nextInt();
            int p=1;
            int j;
            while(p<=shift){ 
                int k=a[0];
                for(j=0;j<9;j++){
                    a[j]=a[j+1];
                } 
                a[j-1]=k; 
                p+=1;
            } 
            for(int m=0;m<10;m++) {
                System.out.println(a[m]);
            }
        }
    }
}