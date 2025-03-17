package tE;

/* renamed from: tE.d  reason: case insensitive filesystem */
public class C15075d extends RuntimeException {
    public C15075d(String str) {
        super(str);
    }

    public C15075d(RuntimeException runtimeException) {
        super(runtimeException.getMessage(), runtimeException.getCause());
    }
}
