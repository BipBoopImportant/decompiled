package DI;

import fI.C17221b;

/* renamed from: DI.f  reason: case insensitive filesystem */
public enum C15559f {
    CLASS("class"),
    INTERFACE("interface"),
    ENUM_CLASS("enum class"),
    ENUM_ENTRY((String) null),
    ANNOTATION_CLASS("annotation class"),
    OBJECT("object");
    
    private final String codeRepresentation;

    static {
        C15559f[] a10;
        $ENTRIES = C17221b.a(a10);
    }

    private C15559f(String str) {
        this.codeRepresentation = str;
    }

    public final boolean b() {
        return this == OBJECT || this == ENUM_ENTRY;
    }
}
