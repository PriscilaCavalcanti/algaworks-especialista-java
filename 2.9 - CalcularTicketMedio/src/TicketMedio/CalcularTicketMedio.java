/*
 * Um comerciante est� curioso para saber o ticket m�dio das �ltimas 3 vendas que fez em sua loja e contratou voc� para desenvolver um programa que resolva isso.

Como voc� ainda n�o aprendeu a receber entrada de dados pelo usu�rio, voc� pediu ao comerciante os valores das 3 �ltimas vendas para
 incluir dentro do c�digo-fonte do programa (mas prometeu arrumar isso assim que aprendesse).

O comerciante te passou os seguintes valores: 20, 30 e 100.

Desenvolva um programa que calcula a m�dia desses n�meros e exibe na sa�da.
*/


package TicketMedio;

public class CalcularTicketMedio {

	public static void main(String[] args) {
		
		 int venda1 = 20; 
		 int venda2 = 30;
		 int venda3 = 100;
		 int media = (venda1 + venda2 + venda3) /3; 
		 
		 System.out.println("P Ticket mediow de venda �: " + media);
	}

}
