import java.util.Scanner;

public class FakeNatty {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        while (true) {
            var G = teclado.nextInt(); 
            var P = teclado.nextInt(); 

            if (G == 0 && P == 0) {
                break; // fim da entrada
            }
            // armazena os resultados, assim colocamos a numeração do piloto
            //obs podia ser uma lista
            int[][] resultados = new int[G][P]; 

           
            for (int i = 0; i < G; i++) {
                for (int j = 0; j < P; j++) {
                    //System.out.print("Digite a numeracao dos pilotos " + (j + 1) + ": ");
                    resultados[i][j] = teclado.nextInt();
                    //colocando os numeros na matrizes
                }
            }
            
            //System.out.println("Sistemas de pontuação diferentes serão testados");
            var S = teclado.nextInt();
            //quantas vezes o tipo pontuação diferentes serão testados
            for(int i = 0; i< S; i++ ){
                //System.out.println("Ordem dos pontos:");
                var K = teclado.nextInt();
                //a quantidade de pontos tem q ter o tamanho de P
                int[] pontos = new int[P];
                for (int k = 0; k < P; k++) {
                    //setamos todos os pontos em 0, pois pode  K (1 ≤ K ≤ P ) ou seja pode ser menor que P
                    pontos[k] = 0;
                }

                for (int k = 0; k < K; k++) {
                    //System.out.println("Pontuação dos pilotos");
                    pontos[k] = teclado.nextInt();
                }
                
                int[] totalPontos = new int[P];
               
                for (int w = 0; w < G; w++) {
                    for (int z = 0; z < P; z++) {
                        // Subtraímos o -1 para garantir que estamos acessando a array de maneira correta
                        // Pontos vai de k-1
                        totalPontos[z]  += pontos[resultados[w][z]-1];
                    }
                }
                var maximoDePontos = 0 ;
                // encontrar o máximo de pontos entre os valores do array totalPontos
                for(int m = 0; m < P ; m++){
                    maximoDePontos = Math.max(maximoDePontos,totalPontos[m]);
                }

                var flag = false;
                //verificar quais participantes têm o máximo de pontos 
                for(int c = 0 ; c < P; c++){
                    if(maximoDePontos == totalPontos[c]){
                        if(flag){
                            System.out.println(" ");
                        }
                        //System.out.print("campeao:");
                        //índice do participante,adiciona 1 para exibir o índice baseado em 1
                        System.out.println(c + 1);
                        flag = true;
                    }
                }
                System.out.println(); 
            }
        }    
        teclado.close();
    }
}