import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);


        System.out.print("Fibonacci Dizisini Görmek İstediğiniz Sayıyı Girin :");
        int n= input.nextInt();
        for (int i=0; i<n; i++) {
            System.out.println(i+ " ");
        }
    }

    int fibonacci(int n ){
        if (n<=1){
            return n;
        }else {
            return fibonacci(n -1)+fibonacci(n-2);
        }
    }

}