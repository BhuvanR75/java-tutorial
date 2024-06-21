import java.util.Scanner;

public class patrens {
    public static void main(String[] args) {
        int num[][]=new int[3][];
        num[0]=new int[2];
        num[1]=new int[4];
        num[2]=new int[5];
       // System.out.println(num.length);
        String c="bhuv";
        String r ="bhuvan";
        //System.out.println(r.charAt(3));

        for (int i=1;i<=6;i++)
        {
            for(int j=1;j<=6;j++)
            {
                if(i==1||j==1||i==6||j==6)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();
        }

       /* for(int i =0;i<num.length;i++)
        {
            for (int j =0;j<num[i].length;j++)
            {
                num[i][j]= (int)(Math.random()*10);
            }

        }
        
    
        for (int a[] :num)
        {
            for(int m:a)
            {
               System.out.print(m +" ");
            } 
              System.out.println();
        }*/
        
    }
    
}
