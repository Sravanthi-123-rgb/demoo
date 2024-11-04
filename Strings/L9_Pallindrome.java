package Strings;

public class L9_Pallindrome {
    public static void main(String[] args) {
        String str="APPA";
        char ch=str.toCharArray();

        for(int i=ch.length()-1;i>=0;i--){
            System.out.print(ch[i]);
        }
    }
}
