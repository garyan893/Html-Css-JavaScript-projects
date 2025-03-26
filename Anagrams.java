
import java.util.Scanner;

public class Anagrams {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first string");
        String str=sc.nextLine();
        System.out.println("Enter second string");
        String str1=sc.nextLine();

        boolean result=checkAnagram(str,str1);
        System.out.println("Anagram Strings : "+str+" and "+str1+ " : "+result);
    }


    public static boolean checkAnagram(String s,String s1) {
        String str=s.toLowerCase();
        String str1=s1.toLowerCase();

        if (str.length() != str1.length()) {
            System.out.println("Not a anagram Strings");
        }
        int[] charCount = new int[26];

        for (char c : str.toCharArray()) {
            charCount[c - 'a']++;
        }

        for (char c : str1.toCharArray()) {
            if (--charCount[c - 'a'] < 0) {
                return false;
            }
        }
return true;
    }
}
