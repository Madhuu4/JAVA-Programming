public class bubbleSort {    
    public static void main(String[] args) {
        int[] arr = {30,40,10,5,15};

        for(int i = 0; i <= arr.length - 1 ; i++){
            for(int j = 0; j < arr.length - 1 - i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }    
        }
        for (int num:arr){
                System.out.println(num + " ");
        }
    }
}