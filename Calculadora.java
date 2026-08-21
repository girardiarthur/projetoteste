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

                            int opcao1 = 0;// variavel opção 1 sem valor

                            opcao1 = entrada.nextInt(); //le o numero inteiro digitado pelo usuario
                                if (opcao1 == 1){ // se a opcao 1 é igual a 1
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




            
        }


        
    }
    