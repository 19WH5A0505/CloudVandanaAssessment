import java.util.*;
public class IsPangram 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String str=sc.nextLine();
        
        if (Pangram(str)) 
            System.out.println("Pangram");
        else
            System.out.println("Not a Pangram");
    }
    
    public static boolean Pangram(String str) 
    {
        boolean[] arr=new boolean[26];
        int index;
    
        for(int i=0;i<str.length();i++) 
        {
            char ch=str.charAt(i);
            if(ch>='A' && ch<='Z') 
                index=ch-'A';
            else if (ch>='a' && ch<='z') 
                index=ch-'a';
            else 
                continue;
            arr[index]=true;
        }
    
        for (boolean i:arr)
        {
            if (!i) 
                return false;
        }
    
        return true;
    }
}