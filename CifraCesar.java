import java.util.Scanner; 
public class CifraCesar {
	static Scanner sIn = new Scanner(System.in);
	static String alfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	public static void main(String[] args) {
		
			System.out.println(encrypt("O RATO ROEU A ROUPA DO REI DE ROMA".toUpperCase(), 4));
			System.out.println(decrypt(encrypt("O RATO ROEU A ROUPA DO REI DE ROMA".toUpperCase(), 4), 4));

		}
	}
	
	public static String encrypt(String palavra, Integer step) {
		String textEncrypt = "";
		for(int i=0; i < palavra.length();  i++) {
			char letra = palavra.charAt(i);
			if (Character.isWhitespace(letra)) {
				textEncrypt += " ";
				continue;
			}
			int pos = alfabeto.indexOf(letra) + step;
			if (pos < 0) {
				pos += 26;
			} else if (pos > 25) {
				pos -= 26;
			}
			textEncrypt += alfabeto.charAt(pos);
		}
		return textEncrypt;

}
	public static String decrypt(String palavra, Integer step) {
		String textDecrypt = "";
		for(int i=0; i < palavra.length();  i++) {
			char letra = palavra.charAt(i);
			if (Character.isWhitespace(letra)) {
				textDecrypt += " ";
				continue;
			}
			int pos = alfabeto.indexOf(letra) - step;
			if (pos < 0) {
				pos += 26;
			} else if (pos > 25) {
				pos -= 26;
			}
			textDecrypt += alfabeto.charAt(pos);
		}
		return textDecrypt;
}
}
