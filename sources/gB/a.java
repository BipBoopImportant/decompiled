package Gb;

public class a extends Exception {
    public a(String str) {
        super(str);
    }

    public a(String str, Exception exc) {
        super(str, exc);
    }
}
