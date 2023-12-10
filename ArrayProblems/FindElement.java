import java.util.Scanner;

public class FindElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array: ");
        int n = sc.nextInt();
        System.out.println("Enter elements in array");
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Check element in Array: ");
        int ele = sc.nextInt();
        String result = "Element Not Present";
        for(int i = 0; i < n; i++){
            if(arr[i] == ele){
                result = "Element is present";
                break;
            }
        }
         System.out.println(result);       
    }
}
