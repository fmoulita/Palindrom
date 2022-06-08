package com.solution;

import java.util.Scanner;

class Solution {
    public static boolean isPalindrome(String str){
        String b="";
        int n = str.length();
        for(int i = n -1; i>=0; i--){
            b=b+str.charAt(i);
        }
        boolean result;
        if(str.equalsIgnoreCase(b)){
            result = true;
        }else{
            result = false;
        }
        return result;
    }
    public static void main(String[] args){
        Solution solution = new Solution();
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your string:");
        String word = sc.nextLine();
        boolean result = solution.isPalindrome(word);
        if(result){
            System.out.println("The String is Palindrome");
        } else{
            System.out.println("The String is not Palindrome");
        }
    }

}

