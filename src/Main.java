import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    try{
        System.out.println("Podaj 1 numer");
        int a=in.nextInt();
        System.out.println("Podaj 1 numer");
        int b=in.nextInt();
        int suma=a/b;
        System.out.println(suma);}
    catch(ArithmeticException e){

    }
        System.out.println("essasiso");
    }
}
