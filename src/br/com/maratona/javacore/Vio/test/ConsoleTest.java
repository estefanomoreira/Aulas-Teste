import java.io.Console;

public class ConsoleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Console c = System.console();
		char[] pw = c.readPassword("%s", "pw: ");
		for(char pass : pw) {
			c.format("%c", pass);
		}
		c.format("\n");
		String texto;
		while(true) {
			texto = c.readLine("%s", "\nDigite: ");
			c.format("esse texto %s foi digitado",retorno(texto));
		}
	}
	
	public static String retorno(String arg1) {
		return arg1;
		
	}
}

