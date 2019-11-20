package helloworld.helloworld;

public class HelloModel {
    String message;

    public HelloModel(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "HelloModel{" +
                "message='" + message + '\'' +
                '}';
    }
}
