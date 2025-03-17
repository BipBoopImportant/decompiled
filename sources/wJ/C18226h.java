package wJ;

import fI.C17221b;

/* renamed from: wJ.h  reason: case insensitive filesystem */
public enum C18226h {
    CAPTURED_TYPE_SCOPE("No member resolution should be done on captured type, it used only during constraint system resolution"),
    INTEGER_LITERAL_TYPE_SCOPE("Scope for integer literal type (%s)"),
    ERASED_RECEIVER_TYPE_SCOPE("Error scope for erased receiver type"),
    SCOPE_FOR_ABBREVIATION_TYPE("Scope for abbreviation %s"),
    STUB_TYPE_SCOPE("Scope for stub type %s"),
    NON_CLASSIFIER_SUPER_TYPE_SCOPE("A scope for common supertype which is not a normal classifier"),
    ERROR_TYPE_SCOPE("Scope for error type %s"),
    UNSUPPORTED_TYPE_SCOPE("Scope for unsupported type %s"),
    SCOPE_FOR_ERROR_CLASS("Error scope for class %s with arguments: %s"),
    SCOPE_FOR_ERROR_RESOLUTION_CANDIDATE("Error resolution candidate for call %s");
    
    private final String debugMessage;

    static {
        C18226h[] a10;
        $ENTRIES = C17221b.a(a10);
    }

    private C18226h(String str) {
        this.debugMessage = str;
    }

    public final String b() {
        return this.debugMessage;
    }
}
