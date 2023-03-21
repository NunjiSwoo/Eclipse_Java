package DioClasses;

public class Class1 {
	public static void main(String[] args) {
		String primeiroNome = "Renan";
		String segundoNome = "Henrique";
		
		int n1 = 4;
		int n2 = 2;
		
		String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
		System.out.println(nomeCompleto);
		int calcular = calcular (n1,n2);
		System.out.println(calcular);
	}
	public static String nomeCompleto (String primeiroNome, String segundoNome) {
		return primeiroNome.concat(" ").concat(segundoNome);
	}
	
	public static int calcular (int n1, int n2) {
		return n1 + n2;
	}
	
	
}
	