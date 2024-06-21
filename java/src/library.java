import java.util.Scanner;
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
           {
            books[i]="no book";
            continue;
           }
           
           System.out.println(books[i]);
        }
    }
    public void add(int n)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("name of the book returned");
        String b = sc.nextLine();
        for(int i =0 ; i<n;i++)
        {
            if(books[i]=="null")
            {
                books[i]=b;
            }
            System.out.println(books[i]);

        }
        System.out.println("0 book");
        System.out.println(books[0]);
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
        lib.add(n);
        
    }
    
}
