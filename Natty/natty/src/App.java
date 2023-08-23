public class App {
    public static void main(String[] args) throws Exception {
        fibonacci(20);
        //Coloquei dessa forma para sequencia nao ser infinita
    }



    public static void fibonacci(int n){
        var primeiroTermo = 0;
        var segundoTermo = 1;

        for(int i=1;i<=n;i++){
            System.out.println(primeiroTermo + " ");
            int proximo= primeiroTermo +  segundoTermo;
            // Faz a soma do próximo termo somando os valores dos termos anteriores
            primeiroTermo=segundoTermo;
            //atualiza o valor do primeiro termo para o valor atual do segundo termo.
            //o primeiro termo agora é o segundo termo
            segundoTermo=proximo;
            //atualiza o valor do segundo termo para o valor calculado do próximo termo( primeiroTermo +  segundoTermo).
        }
    }
}


