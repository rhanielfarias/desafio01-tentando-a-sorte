import java.util.Scanner;
import java.util.Random;
    public class Desafio {
    public static void main(String[] args) {
int soma = 0;
    Scanner input = new Scanner(System.in);
    Random random = new Random();

System.out.println("*** Bem-vindo ao jogo da sorte. ***");
System.out.println("Qual nível de dificuldade deseja jogar");
System.out.println("1 - Fácil - entre 1 a 30");
System.out.println("2 - Intermediário - entre 1 a 60");
System.out.println("3 - Difícil - entre 1 a 100");
int opcao = input.nextInt();

int numeroAleatorio = 1 + random.nextInt(opcao);
boolean jogoAtivo= true;

while(jogoAtivo) {
System.out.println("Digite um número para testar sua sorte");
int uValor = input.nextInt();
//Variável de entrada do usuário
System.out.println(" Você digitou o valor: " + uValor);
System.out.println("O número era: " + numeroAleatorio);
    if(uValor == numeroAleatorio) {
soma = soma+soma+10;

System.out.println("Parabéns, você acertou. Sua pontuação final é de: " + soma);
jogoAtivo= false;
    break;
}
    if(uValor == numeroAleatorio-1) {
System.out.println("Você está próximo do número");
soma = 5;
}
    if(uValor == numeroAleatorio+1) {
System.out.println("Você está próximo do número");
soma = 5;

}
    else {
System.out.println("Infelizmente você não acertou. Tente outra vez");
    break;
}
    switch(opcao) {
    case 1:
opcao= 29;
    case 2:
opcao= 59;
    case 3:
opcao = 99;
    default:
System.out.println("Opção inválida.");
}

}

}
}
