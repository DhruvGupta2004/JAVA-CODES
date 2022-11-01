import java.util.*;

public class RecursionAll4{

    public static void PrintNum(int n) {
        if(n==0){
            return;
        }
        
        System.out.println("you're no. are");
        System.out.println(n);
        PrintNum(n-1);
    }

    public static int factorial(int n) {
        if(n==1){
            return 1;
        } 
        int s = n * factorial(n-1);
        return s;
    }

    public static void fabonacci(int a, int b , int n) {
        if(n==0){
            return;
        }
        int c = a+b;
        System.out.println(c);
        fabonacci(b,c,n-1);
        
    }

    public static int Calculate_Power(int x, int p) {

        if(x==0){
            return 0;
        }
        if(p==0){
            return 1;
        }
        if(p%2==0){
            return Calculate_Power(x, p/2) * Calculate_Power(x, p/2);
        }

        else{
            return Calculate_Power(x, p/2) * Calculate_Power(x, p/2) * x;
        }
    }
    

    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            
            System.out.println("what you want to do");
            
            System.out.println("number in ascending order [PRESS 1]");
            System.out.println("factorial [PRESS 2]");
            System.out.println("fabonacci series [PRESS 3]");
            System.out.println("POWER OF A NO. [PRESS 4]");

            int q = sc.nextInt();
            
            if(q==1){
                System.out.println("enter a no.");
                int n = sc.nextInt();
                PrintNum(n);
            }

            if(q==2){
                System.out.println("enter a no.");
                int n = sc.nextInt();
                factorial(n);
                int z = factorial(n);
                System.out.println(z);
            }

            if(q==3){
                System.out.println("at what term do you want series");
                int n =sc.nextInt();
                int a=0 , b=1;
    
                System.out.println(a);
                System.out.println(b);
                
                fabonacci(a,b,n-2); //n-2 becaude two terms 0,1 are already pass
            }
            
            if(q==4){
                System.out.println("enter no.");
                int x = sc.nextInt();
                System.out.println("enter power");
                int p = sc.nextInt();
                int z = Calculate_Power(x , p);
                System.out.print("ans is =");
                System.out.println(z); 
            }
            
        }
    }
}
