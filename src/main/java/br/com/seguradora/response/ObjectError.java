package br.com.seguradora.response;

public class ObjectError {

	private final String message;
    private final String field;
    private final Object parameter;

	/**
	 * @param message
	 * @param field
	 * @param parameter
	 */
	public ObjectError(String message, String field, Object parameter) {
		super();
		this.message = message;
		this.field = field;
		this.parameter = parameter;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @return the field
	 */
	public String getField() {
		return field;
	}

	/**
	 * @return the parameter
	 */
	public Object getParameter() {
		return parameter;
	}
}
