import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       
        for(int i=1;i<=50;i++){
            // verifica se o valor atual de i é divisível por 3 e por 5
            if(i%3==0 && i%5==0){
                System.out.println("FizzBuzz");
            //verifica se o valor atual de i é divisível por 3 
            }else if (i%3==0){
                System.out.println("Fizz");
            //verifica se o valor atual de i é divisível por 5     
            }else if (i%5==0){
                System.out.println("Buzz");
            }
            else{
                System.out.println(i);
            }
        }


    }
}
