import java.util.*;

public class ArraySuffling 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in); 
        Random r=new Random();
        System.out.println("Enter array size:");
        int n=sc.nextInt();
        System.out.println("Enter array elements:");
        int arr[]=new int[n];
        
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for (int i=n-1;i>0;i--) 
        {
            int j=r.nextInt(i + 1);
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        for (int i=0;i<n;i++) 
        {
            System.out.print(arr[i] + " ");
        }
    }

}