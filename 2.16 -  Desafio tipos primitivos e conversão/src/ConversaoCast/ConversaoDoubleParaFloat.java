package ConversaoCast;

public class ConversaoDoubleParaFloat {

	public static void main (String [] args) {
		double peso1 = 30.5;
		
		float peso2 = (float) peso1;
		
		System.out.println("Exemplo peso\n");
		System.out.println(peso1);
		System.out.println(peso2+"\n");
		
		float taxa1 = 930.5f;
		//double taxa2 = taxa1;
		double taxa2 = (double) taxa1; // Instrução de cast é opcional. 
		
		System.out.println("Exemplo taxa");
		
		System.out.println(taxa1);
		System.out.println(taxa2);
	}
}
