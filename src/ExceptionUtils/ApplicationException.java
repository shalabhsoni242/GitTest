package ExceptionUtils;
// CLass to handle Exceptions....
@SuppressWarnings("serial")
public class ApplicationException extends Exception {
	public ApplicationException(String msg) {
		super(msg);
	}
}
