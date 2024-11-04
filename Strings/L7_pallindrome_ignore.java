package Strings;

public class L7_pallindrome_ignore {
    public static void main(String[] args) {
        String str="AmMA";
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }if(str.equalsIgnoreCase(rev)){
            System.out.println("it is a pallindrome");
        }else{
            System.out.println("it is not a pallindrome");
        }
    }
}
