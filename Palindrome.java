package string;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            System.out.print("enter a string:-");
            String str = input.nextLine();
            if(IsPalindrome(str)==true){
                System.out.println("yes, it's a palindrome");
            }
            else{
                System.out.println("not a palindrome");
            }
        } 
        
    }

    static boolean IsPalindrome(String str){

        if(str == null || str == ""){
            return true;
        }

        for (int i = 0; i < str.length()/2 ; i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length()-1-i );

            if(start != end){
                return false;
            }
        }
        return true;
    }
}
