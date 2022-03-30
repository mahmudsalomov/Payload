package payload;

public interface Response<T> {
    boolean isSuccess();
    String getMessage();
}
