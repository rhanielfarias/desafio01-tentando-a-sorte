import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.List;

    public class DesafioSorte {
    public static void main(String[] args) {
int soma = 0;
int rangeMinimo = 1;
int rangeMaximo = 0;
//Declarando variáveis globais

    List <Integer> errou = new ArrayList();
    List <Integer> acertou = new ArrayList();
    Scanner input = new Scanner(System.in);
    Random random = new Random();
//Criando objetos que o jogo vai utilizar

    for (;;) {
//Laço para rodar o nível de dificuldade

System.out.println("*** Bem-vindo ao jogo da sorte. ***");
System.out.println("Qual nível de dificuldade deseja jogar");
System.out.println("1 - Fácil - entre 1 a 30");
System.out.println("2 - Intermediï¿½rio - entre 1 a 60");
System.out.println("3 - Difï¿½cil - entre 1 a 100");

int opcao = input.nextInt();
//Variável para manipular o switch

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
                System.out.println("Opção inválida");
        }
//Switch com a manipulação das variáveis para os níveis de dificuldade

int numeroAleatorio =  random.nextInt(rangeMaximo-rangeMinimo)+1 ;
/*Capturando na variável numeroAleatorio o nível de dificuldade para por
no random */

    for(;;) {
//Laço interno para o usuário jogar

System.out.println("Digite um número para testar sua sorte");
int uValor = input.nextInt();
//Variável de entrada do usuário
System.out.println(" Você digitou o valor: " + uValor);

    if(uValor == numeroAleatorio) {
soma = soma+10;
System.out.println("Parabéns, você acertou. O número correto era: " + numeroAleatorio);
acertou.add(uValor);
System.out.println("*** Os números que você acertou foram: " + acertou);
System.out.println("*** Os números que você errou foi: " + errou);
    break;
}
    if(uValor == numeroAleatorio-1 || uValor == numeroAleatorio+1) {
System.out.println("Você está próximo do número");
soma = 5;
errou.add(uValor);
}
    else {
System.out.println("Infelizmente você digitou um número muito longe");
    break;
}
//Condicionais para validar as comparações
}
System.out.println("Você quer jogar de novo?");
input.nextLine();
String quer = input.nextLine();
if (quer.equals("n") || quer.equals("não"))
    break;
//Função para terminar com o laço infinito
}
}
}
