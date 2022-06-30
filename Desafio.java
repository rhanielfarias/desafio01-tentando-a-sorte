import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.List;

public class Desafio {
    public static void main(String[] args) {
        int soma = 0;
        int rangeMinimo = 1;
        int rangeMaximo = 0;
//Declarando vari�veis globais

        List <Integer> errou = new ArrayList();
        List <Integer> acertou = new ArrayList();
        Scanner input = new Scanner(System.in);
        Random random = new Random();
//Criando objetos que o jogo vai utilizar

        for (;;) {
//La�o para rodar o n�vel de dificuldade

            System.out.println("*** Bem-vindo ao jogo da sorte. ***");
            System.out.println("Qual n�vel de dificuldade deseja jogar");
            System.out.println("1 - F�cil - entre 1 a 30");
            System.out.println("2 - Intermedi�rio - entre 1 a 60");
            System.out.println("3 - Dif�cil - entre 1 a 100");

            int opcao = input.nextInt();
//Vari�vel para manipular o switch

            switch(opcao) {
                case 1:
                    rangeMaximo= 30;
                    break;
                case 2:
                    rangeMaximo= 60;
                    break;
                case 3:
                    rangeMaximo = 100;
                    break;
                default:
                    System.out.println("Op��o inv�lida");
            }
//Switch com a manipula��o das vari�veis para os n�veis de dificuldade

            int numeroAleatorio =  random.nextInt(rangeMaximo-rangeMinimo)+1 ;
            /*Capturando na vari�vel numeroAleatorio o n�vel de dificuldade para por
no random */

            for(;;) {
//La�o interno para o usu�rio jogar

                System.out.println("Digite um n�mero para testar sua sorte");
                int uValor = input.nextInt();
//Vari�vel de entrada do usu�rio
                System.out.println(" Voc� digitou o valor: " + uValor);

                if(uValor == numeroAleatorio) {
                    soma = soma+10;
                    System.out.println("Parab�ns, voc� acertou. O n�mero correto era: " + numeroAleatorio);
                    acertou.add(uValor);
                    System.out.println("*** Os n�meros que voc� acertou foram: " + acertou);
                    System.out.println("*** Os n�meros que voc� errou foi: " + errou);
System.out.println("Você fez de pontos: " + soma);
                    break;
                }
                if(uValor == numeroAleatorio-1 || uValor == numeroAleatorio+1) {
                    System.out.println("Voc� est� pr�ximo do n�mero");
                    soma = 5;
                    errou.add(uValor);
                }
                else {
                    System.out.println("Infelizmente voc� digitou um n�mero muito longe");
                    break;
                }
//Condicionais para validar as compara��es
            }
            System.out.println("Voc� quer jogar de novo?");
            input.nextLine();
            String quer = input.nextLine();
            if (quer.equals("n") || quer.equals("n�o"))
                break;
//Fun��o para terminar com o la�o infinito
        }
    }
}
