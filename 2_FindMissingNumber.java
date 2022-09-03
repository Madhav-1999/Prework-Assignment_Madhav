import java.util.Scanner;
class MissingNumberFinder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in .nextInt();
        int[] arr = new int[size-1];
        for(int i=0;i<size-1;i++){
            arr[i] = in.nextInt();
        }
        System.out.println(missingNumberFinder(arr, size));
 }
    static int missingNumberFinder(int array[], int n) {
        int [] newarr = new int[size];
        
        for(int i=0;i<size-1;i++){
            
            newarr[i] = arr[i];
        }
        for(int i=0;i<size;i++){
            if(newarr[i] != i+1){
                System.out.println(i+1);
                break;
            }
        }
        
 // write your code here
 }
}