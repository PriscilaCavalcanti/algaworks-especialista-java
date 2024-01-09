package ConversaoCast;

public class ConversaoIntParaLong {

	public static void main(String[] args) {
		int y = 102344;

		// long x = y;

		long x = (long) y; // A instrução de casting é opcional

		System.out.println(y);
		System.out.println(x);
	}

}
