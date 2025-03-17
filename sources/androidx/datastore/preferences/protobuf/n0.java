package androidx.datastore.preferences.protobuf;

import java.util.List;

public class n0 extends RuntimeException {

    /* renamed from: a  reason: collision with root package name */
    private final List<String> f21398a = null;

    public n0(S s10) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public A a() {
        return new A(getMessage());
    }
}
