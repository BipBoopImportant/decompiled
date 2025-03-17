package EI;

import CJ.C15519a;
import fI.C17221b;

/* renamed from: EI.e  reason: case insensitive filesystem */
public enum C15646e {
    FIELD((String) null, 1, (String) null),
    FILE((String) null, 1, (String) null),
    PROPERTY((String) null, 1, (String) null),
    PROPERTY_GETTER("get"),
    PROPERTY_SETTER("set"),
    RECEIVER((String) null, 1, (String) null),
    CONSTRUCTOR_PARAMETER("param"),
    SETTER_PARAMETER("setparam"),
    PROPERTY_DELEGATE_FIELD("delegate");
    
    private final String renderName;

    static {
        C15646e[] a10;
        $ENTRIES = C17221b.a(a10);
    }

    private C15646e(String str) {
        this.renderName = str == null ? C15519a.f(name()) : str;
    }

    public final String b() {
        return this.renderName;
    }
}
