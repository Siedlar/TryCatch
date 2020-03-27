import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    Scanner in;
    int c=1;
    do{
    try{
        in=new Scanner(System.in);
        System.out.println("Podaj 1 numer");
        int a=in.nextInt();
        System.out.println("Podaj 2 numer");
        int b=in.nextInt();
        int suma=a/b;
      c=2;
        System.out.println(suma);}
    catch(ArithmeticException e){

    }
    catch (InputMismatchException e){
        System.out.println("Wprowadz cyfre gościu");
    }}while(c==1);
        System.out.println("essasiso");

try{tablica();}catch (ArrayIndexOutOfBoundsException e){
    System.out.println("Wolny kurdystan");
}
        try {
            BufferedReader bufer=new BufferedReader(new FileReader("nazwa"));
        } catch (IOException e) {
            System.out.println("NIE MA PLIKU BYKU");
        }
        System.out.println("s");}

    public static  void tablica() {
        String[] pets={"dog","cat","bird"};
        int b=3;
        if(b==3){
        throw new ArrayIndexOutOfBoundsException();
        }
    }
}
