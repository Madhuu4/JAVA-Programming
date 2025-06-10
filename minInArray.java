// JAVA code to print the minimum element in an Array

public class minInArray {
    public static void main(String[] args){
        int[] arr = {10,20,30,40,50};
        int min = arr[0];

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] < min)
            {
                min = arr[i];
            }
        }
        System.out.println("The minimum element in an Array is " + min);
    }  
}
