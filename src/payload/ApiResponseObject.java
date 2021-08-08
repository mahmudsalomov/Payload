package payload;


public class ApiResponseObject extends ApiResponse {
    private Object object;

    public ApiResponseObject(String message, boolean success, Object object) {
        super(message, success);
        this.object = object;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }
}
