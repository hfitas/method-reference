import java.util.function.Supplier;

public class Utils {

    private Utils(){}

    public static <T, R> R getNullOrValue(T evaluateNull, Supplier<R> supplier) {
        return evaluateNull == null ?
                null :
                supplier.get();
    }

}
