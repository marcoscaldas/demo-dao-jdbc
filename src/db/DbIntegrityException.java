package db;

public class DbIntegrityException extends RuntimeException{   // EXCECAO PERSONALIZADA DE INTEGRIDADE REFERENCIAL

	
	private static final long serialVersionUID = 1L;
	
	public DbIntegrityException(String msg) {
		super(msg);
	}

}
