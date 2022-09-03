import java.util.Scanner;
class FirstLetterPrinter {
public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in .nextLine();
        System.out.println(firstLetterPrinter(input));
     }
     static String firstLetterPrinter(String str) {
        String temp="";
        String []strArr = str.split(" ");
        for(String part: strArr){
            temp+=part.charAt(0);
        }
        return temp;
     } 
}