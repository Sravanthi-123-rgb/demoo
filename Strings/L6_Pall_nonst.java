//WAP TO FIND A GIVEN STRING IS A PALLINDROME OR NOT BY USING NON-STATIC
package Strings;

public class L6_Pall_nonst {
    /*void pallindrome(){
        String st="AMmA";
        String rev="";
        for(int i=st.length()-1;i>=0;i--){
            rev=rev+st.charAt(i);
        }if(st.equalsIgnoreCase(st)){
            System.out.println("it is a pallindrome");
        }else{
            System.out.println("it is not a pallindrome");
        }
    }
    public static void main(String[] args) {
        L6_Pall_nonst p1=new L6_Pall_nonst();
        p1.pallindrome();
    }*/

    //static
    static void pallindrome(){
        String st="AMmA";
        String rev="";
        for(int i=st.length()-1;i>=0;i--){
            rev=rev+st.charAt(i);
        }if(st.equalsIgnoreCase(st)){
            System.out.println("it is a pallindrome");
        }else{
            System.out.println("it is not a pallindrome");
        }
    }
    public static void main(String[] args) {
        pallindrome();
    }
}
