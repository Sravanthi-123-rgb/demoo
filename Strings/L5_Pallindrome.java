package Strings;

public class L5_Pallindrome {
    public static void main(String[] args) {
        String str="AMMA";
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }
        if(str.equals(rev)){
            System.out.println("it is a pallindrome");
        }else{
            System.out.println("it is not a pallindrome");
        }
    }
}
