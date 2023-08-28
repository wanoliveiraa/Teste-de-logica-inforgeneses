

public class Izi {
    public static void main(String[] args) throws Exception {
       
        for(int i=1;i<=50;i++){
            // verifica se o valor atual de i é divisível por 3 e por 5
            //importante começa com essa condição primeiro, garante que quando i for 15 (um múltiplo de 3 e 5) ser FizzBuzz invez de ser Fizz ou Buzz
           //usando % o resto sabendo que numero é divisível se for igual 0
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
