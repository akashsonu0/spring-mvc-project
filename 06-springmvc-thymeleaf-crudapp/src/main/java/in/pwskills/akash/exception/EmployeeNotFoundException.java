package in.pwskills.akash.exception;

public class EmployeeNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public EmployeeNotFoundException() {
		
	}
	
	public EmployeeNotFoundException(String msg) {
		super(msg);
	}

}
