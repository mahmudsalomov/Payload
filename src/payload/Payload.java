package payload;


//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;


public class Payload {



    /**
     * For responses
     **/
    public ApiResponse api(String message, boolean success) {
        return new ApiResponse(message, success);
    }

    public ApiResponse api(String message, boolean success, Object object) {
        return new ApiResponseObject(message, success, object);
    }

    public ApiResponse apiError() {
        return api("Error", false);
    }

    public ApiResponse apiError(String message) {
        return api(message, false);
    }

    public ApiResponse apiError(Object object) {
        return api("Error", false, object);
    }

    public ApiResponse apiError(String message, Object object) {
        return api(message, false, object);
    }

    public ApiResponse apiSuccess() {
        return api("Success", true);
    }

    public ApiResponse apiSuccess(String message) {
        return api(message, true);
    }

    public ApiResponse apiSuccess(Object object) {
        return api("Success", true, object);
    }

    public ApiResponse apiSuccess(String message, Object object) {
        return api(message, true, object);
    }





}

