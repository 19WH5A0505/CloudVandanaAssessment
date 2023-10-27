import java.util.*;

public class RomanNumber
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Roman Number:");
        String str=sc.nextLine().toUpperCase(); 
        int res=0;

        for (int i=0;i<str.length();i++) 
        {
            char presentValue=str.charAt(i);
            if(i<str.length()-1) 
            {
                char nextValue=str.charAt(i+1);

                if (romanNumber(presentValue) < romanNumber(nextValue))
                    res=res-romanNumber(presentValue);
                else 
                    res=res+romanNumber(presentValue);
            } 
            else 
                res=res+romanNumber(presentValue);
        }
        System.out.println("Integer of "+str+" is: "+res);
    }


    public static int romanNumber(char ch) 
    {
        switch(ch)
        {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
}
