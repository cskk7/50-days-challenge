package Exceptions;

public class ExceptionHandling2 {
    public static void main(String[] args) {
        try{
            try{
                int num = Integer.parseInt("MT15");
                System.out.println(num);
            }catch (NumberFormatException e){
                System.out.println("Number Format is invalid.");
            }
            try{
                int[] arr = {5,4,3,2,1};
                System.out.println(arr[5]);

            }catch(ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid array size");
            }try{
                String str = null;
                System.out.println(str.length());
            }catch(NullPointerException e){
                System.out.println("String value is null");
            }try{
                String str = "T56";
                System.out.println(str.charAt(3));

            }catch (StringIndexOutOfBoundsException e){
                System.out.println("Invalid length of String");
            }
        }catch(Exception e){
            System.out.println("Handled remaining exceptions");
        }finally{
            System.out.println("Completed handling exceptions");
        }
    }
}
