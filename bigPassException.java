
public class bigPassException extends Exception {

    public bigPassException(String desc) {
        super(desc);
        desc = "My own number exception";
    }
}
