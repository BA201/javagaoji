package service;

public class TheamException extends RuntimeException {

    static final long serialVersionUID = -7034897190745766939L;

    public TheamException(String Messages) {
        super(Messages);
    }

    public TheamException() {
    }
}
