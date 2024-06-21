import java.util.Scanner;
class calculator{
  public void test()
  {
    Scanner sc= new Scanner(System.in);
    for(int i = 0; i<5;i++)
    {
      int n = sc.nextInt();
      //System.out.println(n);
    }
  }
  public double add(double n1,double n2)
  {
    double result=n1+n2;
    System.out.println(result);
    return result ;
  }
  public float sub(float n1,float n2)
  {
    float result=n1-n2;
    System.out.println(result);
    return result;
  }
  public float mult(float n1,float n2)
  {
    float result=n1*n2;
    System.out.println(result);
    return result;
  }
  public float div(float n1,float n2)
  {
    float result=n1/n2;
    System.out.println(result);
    return result;
  }
  public float mod(float n1,float n2)
  {
    float result=n1%n2;
    System.out.println(result);
    return result;
  }

}
public class App {
    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      int b = sc.nextInt();
        float num1=3;
       float num2=3;
       calculator cal=new calculator();
       cal.test();
       cal.add(num1,num2);
       System.out.println(b);
       cal.mult(num1, num2);

    }
}
