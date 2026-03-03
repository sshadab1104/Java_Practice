package Mar_2026.Mar_03_String;

public class P002_Palindrome {
    public static void main(String[] args) {
        String s = "madam";
        String rev = "";
        boolean palindrome = false;
        for (int i=s.length()-1; i>=0; i--){
            rev =  rev + s.charAt(i);
        }
        if (rev.equals(s)){
            palindrome =true;
        }
        System.out.println(palindrome);

    }
}
