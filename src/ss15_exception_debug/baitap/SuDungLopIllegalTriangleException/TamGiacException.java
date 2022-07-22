package ss15_exception_debug.baitap.SuDungLopIllegalTriangleException;

public class TamGiacException extends Exception {
    public TamGiacException(String message){
        super(message);
    }
    public TamGiacException(){
        super("Invalid");
    }
}
