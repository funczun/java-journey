package enumeration.test.http;

public enum HttpStatus {
    OK(200, "OK"),
    BAD_REQUEST(400, "Bad Request"),
    NOT_FOUND(404, "Not Found"),
    INTERNAL_SERVER_ERROR(500, "Internal Server Error");

    private int code;
    private String message;

    HttpStatus(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public static HttpStatus findByCode(int input) {
        HttpStatus[] values = HttpStatus.values();
        for (HttpStatus value : values) {
            if (value.code == input) {
                return value;
            }
        }
        return null;
    }

    public boolean isOK() {
        return this.code >= 200 && this.code <= 299;
    }
}
