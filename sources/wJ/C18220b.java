package wJ;

import fI.C17221b;

/* renamed from: wJ.b  reason: case insensitive filesystem */
public enum C18220b {
    ERROR_CLASS("<Error class: %s>"),
    ERROR_FUNCTION("<Error function>"),
    ERROR_SCOPE("<Error scope>"),
    ERROR_MODULE("<Error module>"),
    ERROR_PROPERTY("<Error property>"),
    ERROR_TYPE("[Error type: %s]"),
    PARENT_OF_ERROR_SCOPE("<Fake parent for error lexical scope>");
    
    private final String debugText;

    static {
        C18220b[] a10;
        $ENTRIES = C17221b.a(a10);
    }

    private C18220b(String str) {
        this.debugText = str;
    }

    public final String b() {
        return this.debugText;
    }
}
