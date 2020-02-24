package anz.techprogramming.RestAPI.exception;

import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;
 
@XmlRootElement(name = "error")
public class ErrorResponse 
{
    public ErrorResponse(String message, List<String> details) {
        super();
        this.message = message;
        this.details = details;
    }
 
    //General error message about nature of error
    private String message;
 
    //Specific errors in API request processing
    private List<String> details;

	/**
	 * @return the message
	 */
	private String getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	private void setMessage(String message) {
		this.message = message;
	}

	/**
	 * @return the details
	 */
	private List<String> getDetails() {
		return details;
	}

	/**
	 * @param details the details to set
	 */
	private void setDetails(List<String> details) {
		this.details = details;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ErrorResponse [message=" + message + ", details=" + details + "]";
	}
}
