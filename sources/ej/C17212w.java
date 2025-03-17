package eJ;

import java.util.List;

/* renamed from: eJ.w  reason: case insensitive filesystem */
public class C17212w extends RuntimeException {

    /* renamed from: a  reason: collision with root package name */
    private final List<String> f143122a = null;

    public C17212w(C17206q qVar) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public C17200k a() {
        return new C17200k(getMessage());
    }
}
