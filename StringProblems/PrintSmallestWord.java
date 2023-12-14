// package StringProblems;

import java.util.Scanner;

public class PrintSmallestWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] res = str.split(" ");
        int size = Integer.MAX_VALUE;
        for(int i = 0; i < res.length;i++){
            if(res[i].length() < size){
                size = res[i].length();
            }
        }
        System.out.println("Shortest word : "+res[size]);
    }
}
