//WAP TO FIND THE PALLINDROME OR NOT BY USING PARAMETER,RETURN TYRPE & ARGUMNETS...
package Strings;

public class L8_pal_repla {
    static String reverseString(String str){
        str= str.replaceAll("[0-9]","");
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }
        if(str.equalsIgnoreCase(rev)){
            System.out.println("it is a pallindrome");
        }else{
            System.out.println("it is not a pallindrome");
        }return str;
    }
    public static void main(String[] args) {
        reverseString("L12ev35E192l");
    }
}
