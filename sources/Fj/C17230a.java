package fJ;

import fI.C17221b;

/* renamed from: fJ.a  reason: case insensitive filesystem */
public enum C17230a {
    NO_ARGUMENTS(false, false, 3, (boolean) null),
    UNLESS_EMPTY(true, false, 2, (boolean) null),
    ALWAYS_PARENTHESIZED(true, true);
    
    private final boolean includeAnnotationArguments;
    private final boolean includeEmptyAnnotationArguments;

    static {
        C17230a[] a10;
        $ENTRIES = C17221b.a(a10);
    }

    private C17230a(boolean z10, boolean z11) {
        this.includeAnnotationArguments = z10;
        this.includeEmptyAnnotationArguments = z11;
    }

    public final boolean b() {
        return this.includeAnnotationArguments;
    }

    public final boolean j() {
        return this.includeEmptyAnnotationArguments;
    }
}
