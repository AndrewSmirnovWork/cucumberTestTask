
package cucumberTestTask.message;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ApiErrorsAndMessages {

    public Boolean success;
    public ErrorMessages error;

    public ApiErrorsAndMessages() {
    }

    public ApiErrorsAndMessages(Boolean success, ErrorMessages error) {
        super();
        this.success = success;
        this.error = error;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public ErrorMessages getError() {
        return error;
    }

    public void setError(ErrorMessages error) {
        this.error = error;
    }
}
