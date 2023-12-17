import java.util.Scanner;

public class ConvertFirstLetterToUpper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String arr[] = str.split(" ");
        String res = "";
        for(int i = 0 ; i < arr.length; i++){
            res += arr[i].substring(0,1).toUpperCase()+ arr[i].substring(1, arr[i].length()) +" ";
        }
        System.out.println(res);
}
}
