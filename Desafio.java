import java.util.Scanner;
import java.util.Random;
    public class Desafio {
    public static void main(String[] args) {
int soma = 0;
    Scanner input = new Scanner(System.in);
    Random random = new Random();

System.out.println("*** Bem-vindo ao jogo da sorte. ***");
System.out.println("Qual n�vel de dificuldade deseja jogar");
System.out.println("1 - F�cil - entre 1 a 30");
System.out.println("2 - Intermedi�rio - entre 1 a 60");
System.out.println("3 - Dif�cil - entre 1 a 100");
int opcao = input.nextInt();

int numeroAleatorio = 1 + random.nextInt(opcao);
boolean jogoAtivo= true;

while(jogoAtivo) {
System.out.println("Digite um n�mero para testar sua sorte");
int uValor = input.nextInt();
//Vari�vel de entrada do usu�rio
System.out.println(" Voc� digitou o valor: " + uValor);
System.out.println("O n�mero era: " + numeroAleatorio);
    if(uValor == numeroAleatorio) {
soma = soma+soma+10;

System.out.println("Parab�ns, voc� acertou. Sua pontua��o final � de: " + soma);
jogoAtivo= false;
    break;
}
    if(uValor == numeroAleatorio-1) {
System.out.println("Voc� est� pr�ximo do n�mero");
soma = 5;
}
    if(uValor == numeroAleatorio+1) {
System.out.println("Voc� est� pr�ximo do n�mero");
soma = 5;

}
    else {
System.out.println("Infelizmente voc� n�o acertou. Tente outra vez");
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
System.out.println("Op��o inv�lida.");
}

}

}
}
