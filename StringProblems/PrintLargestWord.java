// package StringProblems;

import java.util.Scanner;

public class PrintLargestWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] res = str.split(" ");
        int size = Integer.MIN_VALUE;
        for(int i = 0 ; i < res.length; i++){
            if(res[i].length() > size){
                size = i;
            }
        }
        System.out.println("Longest word : "+res[size]);
    }
}
