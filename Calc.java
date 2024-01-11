import java.util.Scanner;
public class Calc {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("enter number : ");
        int a = sc.nextInt();
        System.out.println("enter number : ");
        int b = sc.nextInt();
        System.out.println("enter operation you want to perform (a,s,m,d)");
        char ch = sc.next().charAt(0);
        
        switch (ch) {
            case 'a':
                System.out.println("SUM : "+(a+b));
                break;
            case 's':
                System.out.println("DIFFERENCE : "+(a-b));
                break;
            case 'm':
                System.out.println("MULTIPLICATION : "+(a*b));
                break;
            case 'd':
                System.out.println("DIVISION : "+(a/(double)b));
                break;
            default:
                System.out.println("Invalid Operator");
                break;
        }      
    }
}
