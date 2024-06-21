import java.util.Scanner;

import javax.annotation.processing.SupportedOptions;
class library1{
    
    String books[]=new String[1000];
    public void addbook(int n)
    {   
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the names of books");
        for(int i =0;i<n;i++)
        {
            String m = sc.nextLine();
            books[i] = m;
        }
        System.out.println("the total books are");
        for(int i=0;i<n;i++)
        {
            System.out.println(books[i]);
        }
        
    }
    public void rem(int n)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("which book do u whant");
        int b = sc.nextInt();
        System.out.println("the remaing books are");
        for(int i=0;i<n+1;i++)
        {
           if(i==b-1)
           continue;
           System.out.println(books[i]);
        }
    }
}
public class library {
    public static void main(String[] args) {
         
        library1 lib =new library1();
        Scanner sc = new Scanner(System.in);
        System.out.println("the no of books:");
        int n = sc.nextInt();
        lib.addbook(n); 
        lib.rem(n);
        
    }
    
}
