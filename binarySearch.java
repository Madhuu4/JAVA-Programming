import java.util.*;
public class binarySearch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] a= {10,20,30,40,50};
        System.out.println("Enter your key: ");
        int key = sc.nextInt();

        int left = 0;
        int right = a.length-1;
        boolean found = false;

        while(left<=right)
        {
            int mid = left+(right-left)/2;
            if(a[mid] == key)
            {
                System.out.println("Found at index: "+mid);
                found = true;
                break;
            }
            else if(a[mid]<key)
            {
                left = mid + 1;
            }
            else
            {
                right = mid - 1;
            }
        }
        if(!found)
        {
            System.out.println("Element not found: ");
        }
            sc.close(); 
    }
}
    
