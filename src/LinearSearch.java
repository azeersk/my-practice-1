/*Given an array A of N integers and an integer K, A is sorted in increasing order,
 write a program to return the index of element K in A.
 Return -1 if K is not present in A.*/
/*input : 4
*         4,8,9,10
*         9*/


import java.util.Scanner;
public class LinearSearch{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int array[] =new int[number];
        for(int i = 0; i<array.length;i++){
            int a = input.nextInt();
            array[i]= a;
        }
        int linear = input.nextInt();
        for(int i=0; i<array.length;i++){
            if (linear==array[i]){
                System.out.println(i);
            }
        }
    }
}
