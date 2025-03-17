package MI;

import fI.C17221b;

/* renamed from: MI.c  reason: case insensitive filesystem */
public enum C16059c {
    METHOD_RETURN_TYPE("METHOD"),
    VALUE_PARAMETER("PARAMETER"),
    FIELD("FIELD"),
    TYPE_USE("TYPE_USE"),
    TYPE_PARAMETER_BOUNDS("TYPE_USE"),
    TYPE_PARAMETER("TYPE_PARAMETER");
    
    private final String javaTarget;

    static {
        C16059c[] a10;
        $ENTRIES = C17221b.a(a10);
    }

    private C16059c(String str) {
        this.javaTarget = str;
    }

    public final String b() {
        return this.javaTarget;
    }
}
