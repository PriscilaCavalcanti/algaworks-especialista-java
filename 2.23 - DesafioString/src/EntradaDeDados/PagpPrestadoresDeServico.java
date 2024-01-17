/*
 * 
 * 
 * A empresa que voc� trabalha descobriu que voc� est� indo muito bem neste curso de Java e pediu para que voc� desenvolvesse um 
 * programa que calcula os pagamentos para os prestadores de servi�os da empresa.

Este programa deve receber as seguintes entradas de dados do usu�rio:

Nome (texto)
Valor por hora (decimal)
Horas trabalhadas (inteiro)
Valor dos descontos (decimal)
A sa�da do programa deve ser um resumo da folha de pagamento, mostrando os c�lculos e os resultados finais, como no exemplo abaixo:

Folha de pagamento: Thiago Faria
172 horas x R$150.20 = R$25834.40
Descontos: R$482.88
Total devido: R$25351.52

Use a formata��o de sa�da com printf para imprimir na sa�da e o tipo Scanner
 para receber a entrada de dados do usu�rio.

Use a formata��o de sa�da com printf para imprimir na sa�da e o tipo Scanner para receber a entrada de dados do usu�rio.

 * 
 * 
 * */
package EntradaDeDados;
import java.util.Scanner;

public class PagpPrestadoresDeServico {

	  public static void main(String[] args) {
	    Scanner entrada = new Scanner(System.in);

	    System.out.print("Nome: ");
	    String nome = entrada.nextLine();

	    System.out.print("Valor por hora: ");
	    double valorHora = entrada.nextDouble();

	    System.out.print("Horas trabalhadas: ");
	    int horasTrabalhadas = entrada.nextInt();

	    System.out.print("Valor dos descontos: ");
	    double valorDescontos = entrada.nextDouble();

	    double valorTotalTrabalhado = valorHora * horasTrabalhadas;
	    double valorTotalDevido = valorTotalTrabalhado - valorDescontos;

	    System.out.printf("%nFolha de pagamento: %s%n", nome);
	    System.out.printf("%d horas x R$%.2f = R$%.2f%n", 
	        horasTrabalhadas, valorHora, valorTotalTrabalhado);
	    System.out.printf("Descontos: R$%.2f%n", valorDescontos);
	    System.out.printf("Total devido: R$%.2f%n", valorTotalDevido);
	  }

	}

