import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    int c=1;
    do{
    try{
        System.out.println("Podaj 1 numer");
        int a=in.nextInt();
        System.out.println("Podaj 2 numer");
        int b=in.nextInt();
        int suma=a/b;
      c=2;
        System.out.println(suma);}
    catch(ArithmeticException e){
        System.out.println("Podales złą liczbę");
    }}while(c==1);
        System.out.println("essasiso");
    }
}
