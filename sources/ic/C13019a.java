package IC;

import Oo.b;
import fI.C17221b;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"LIC/a;", "", "LIC/e;", "text", "<init>", "(Ljava/lang/String;ILIC/e;)V", "LIC/e;", "b", "()LIC/e;", "NotAvailable", "Morning", "Afternoon", "Evening", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: IC.a  reason: case insensitive filesystem */
public enum C13019a {
    NotAvailable(C13026h.c("")),
    Morning(C13026h.a(b.f84401I3)),
    Afternoon(C13026h.a(b.f84381G3)),
    Evening(C13026h.a(b.f84391H3));
    
    private final C13023e text;

    static {
        C13019a[] a10;
        $ENTRIES = C17221b.a(a10);
    }

    private C13019a(C13023e eVar) {
        this.text = eVar;
    }

    public final C13023e b() {
        return this.text;
    }
}
