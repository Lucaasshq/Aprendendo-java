package parametroInvalidoException;

@SuppressWarnings("serial")
public class ParametroInvalidoException extends Exception  {
	
	public ParametroInvalidoException() {
		super("O segundo parâmetro deve ser maior que o primeiro");	
		
		
	}
}
