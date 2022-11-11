package Array.Rotation_Array;

// Array to rotate an array using three array 
// eg 1 :
// Input: {1,2,3,4,5}
// Shift: 2
// Output: {3,4,5,1,2}
// Logic :
// Array a contains numbers
// Array c contains number from d to last
// Array b contains number from 0 to d 

import java.io.IOException;
import java.util.*;
public class rotationarraytemp  
{
 public static void main(String args[]) throws IOException {
    try (Scanner sc = new Scanner(System.in)) {
        int d=sc.nextInt(); 
        int shift=sc.nextInt();
        int[] a = new int[d]; 
        int[] b=new int[d]; 
        int[] c=new int[shift];
        int j=0;
        for(int i=0;i<d;i++){
            a[i]=sc.nextInt();
        } 
        for(int m=0;m<shift;m++) {
            c[m]=a[m];
        }
        for(j=0;j<d-shift;j++){
            b[j]=a[j+shift];
        }
        for(int k=0;k<shift;k++){
            b[j]=c[k];
            j+=1;
        } 
        for(int fin=0;fin<j;fin++){
            System.out.println(b[fin]);
        }
    }
 }
}
