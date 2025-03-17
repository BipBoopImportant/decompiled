package y3;

public class e extends Exception {
    public e(String str) {
        super(str);
    }

    public e(Throwable th2) {
        super(th2);
    }

    public e(String str, Throwable th2) {
        super(str, th2);
    }
}
