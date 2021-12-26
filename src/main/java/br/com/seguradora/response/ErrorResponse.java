package br.com.seguradora.response;

import java.util.List;

public class ErrorResponse {

	private final String message;
    private final int code;
    private final String status;
    private final String objectName;
    private final List<ObjectError> errors;
    
	/**
	 * @param message
	 * @param code
	 * @param status
	 * @param objectName
	 * @param errors
	 */
	public ErrorResponse(String message, int code, String status, String objectName, List<ObjectError> errors) {
		super();
		this.message = message;
		this.code = code;
		this.status = status;
		this.objectName = objectName;
		this.errors = errors;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @return the code
	 */
	public int getCode() {
		return code;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @return the objectName
	 */
	public String getObjectName() {
		return objectName;
	}

	/**
	 * @return the objectName
	 */
	public List<ObjectError> getErros() {
		return errors;
	}
}
