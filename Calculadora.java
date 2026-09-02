import java.util.Scanner; // import do scanner
    public class Calculadora{ // criamos a classe
        public static void main(String[] args) { // método main

                    Scanner entrada = new Scanner(System.in); // objeto scanner que é como o leia em portugol

                        System.out.println("---CALCULADORA--DE-CONVERSÃO---"); //texto titulo
                        System.out.println("\n ESCOLHA UMA DAS OPÇÕES ABAIXO: "); // texto apresentacao
                        System.out.println("1 - Decimal -> Binário"); // texto opcao1
                        System.out.println("2 - Decimal-> Hexadecimal");// texto opcao2
                        System.out.println("3 - Binário -> Decimal");// texto opcao3
                        System.out.println("4 - Hexadecimal -> Decimal");// texto opcao3

                            int opcao = 0;// variavel opção 1 sem valor
                            
                            opcao = entrada.nextInt(); //le o numero inteiro digitado pelo usuario
                                if (opcao == 1){ // se a opcao 1 é igual a 1
                                    System.out.println("Digite o número decimal para ser convertido");// texto pedido
                                    int numeroDecimal = entrada.nextInt(); // cria uma variavel de numero decimal e ele vai ser igual ao inteiro digitado
                                    String resultadoBinario = ""; // cria uma variavel de resultado tipo string sem valor ainda
                                        while (numeroDecimal > 0) {//enquanto o numero decimal n chegar a zero ele vai rodar o codigo
                                            int resto;// variavel inteiro de resto
                                            resto = numeroDecimal % 2; // aqui ele vai extrair o resto da divisçao do numero decimal digitado por 2
                                            resultadoBinario = resto + resultadoBinario; // aquio ele vai adicionar ao resultado o resto mais o ultimo resto 
                                            numeroDecimal = numeroDecimal / 2;// aqui o numero decimal vai ser dividido por dois para continuar a divisao até o fim

                                            
                                        }
                        System.out.println("seu numero decimal convertido em binário é igual: " + resultadoBinario);// aqui va1i exibir o resultado para o usuario


                                    
                                }




                                if(opcao == 2){ // se o usuario escolher a opcao 2
                                    System.out.println("Digite o número decimal para ser convertido"); // pede para ele digitar o valor a ser convertido
                                    int numeroDecimal = entrada.nextInt(); // a variavel do numero decimal escolhido vai ser igual ao proximo numero inteiro digitado
                                    String resultadoHexa = ""; // resultado sem valor
                                        while (numeroDecimal > 0) { // enquanto o numero decimal for maior q zero
                                            int resto; // variavel resto
                                            String simbolo = "";// simbolo é para adicionar os valores 10,11,12...15 que sao A B C D E F
                                            resto = numeroDecimal % 16;// resto vai ser o resto da divisao por 16
                                              if (resto == 10){ // se o resto for igual a 10 ele vai assumir o simbolo a
                                                    simbolo = "A";
                                              }
                                                else if (resto == 11){ // se for igual a 11 o B
                                                    simbolo = "B";
                                                }
                                                 else if (resto == 12){// 12 igual a C
                                                    simbolo = "C";
                                                }
                                                 else if (resto == 13){//13 igual a D
                                                    simbolo = "D";
                                                }
                                                 else if (resto == 14){// 14 igual a E
                                                    simbolo = "E";
                                                }
                                                 else if (resto == 15){ // 15 igual a F
                                                    simbolo = "F";
                                                }
                                                else{ // se ele nao for igual a esses numeros acima ele vai sair o numero mesmo só que transformado em string
                                                    simbolo = ""+ resto;
                                                }
                                            resultadoHexa = simbolo + resultadoHexa; // resultado vai ser o simbolo hexa q é o resto + o proprio resultado adicionando valores caso precise
                                            numeroDecimal = numeroDecimal / 16; // vai continuar dividindo por 16 para continuar até o fim da divisao
                                                                    
                                        }
                                        System.out.println("seu numero decimal convertido em hexacimal é igual: " + resultadoHexa ); // vai printar o resultado
                                }
    

                                if(opcao == 3){ // se o usuário escolher a opcao 3
                                    System.out.println("Digite o valor binário a ser convertido: ");
                                    String numeroBinario = entrada.next();
                                    int posicao = 0;
                                    int resultadoDecimal = 0;
                                    while(posicao < numeroBinario.length()){
                                        char digito = numeroBinario.charAt(posicao);
                                        int expoente = numeroBinario.length() - 1 - posicao;
                                        int potencia = (int) Math.pow(2, expoente);

                                            if(digito == '1'){
                                                resultadoDecimal = resultadoDecimal + potencia;

                                            }
                                            
                                           posicao ++;
                                    
                                }
                                System.out.println("Seu número binário convertido em Decimal é igual: " + resultadoDecimal);
    }
}
}