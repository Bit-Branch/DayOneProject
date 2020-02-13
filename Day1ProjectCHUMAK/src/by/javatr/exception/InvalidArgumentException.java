package by.javatr.exception;

public class InvalidArgumentException extends Exception{
    private String msg;

    public InvalidArgumentException(String msg){
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "Invalid Argument: " + msg;
    }
}
