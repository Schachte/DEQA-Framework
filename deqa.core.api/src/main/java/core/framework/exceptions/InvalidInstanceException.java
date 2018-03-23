package core.framework.exceptions;

public class InvalidInstanceException extends Exception {

    // Constructor that accepts a message
    public InvalidInstanceException(String error)
    {
        super(error);
    }

//    private String constructorError(Object ... args) {
//        return new StringBuilder()
//                .append("Error: ")
//                .append("expected( ")
//                .append(args[0].getClass().getName())
//                .append(") but received ")
//                .append(args[1].getClass().getName())
//                .toString();
//    }
}
