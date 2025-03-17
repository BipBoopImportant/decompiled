package p7;

import a7.h;
import j7.C8409c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0016X\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, d2 = {"Lp7/b;", "La7/h;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "<init>", "(Ljava/lang/Exception;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Exception;", "()Ljava/lang/Exception;", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: p7.b  reason: case insensitive filesystem */
public final class C8629b extends h {

    /* renamed from: a  reason: collision with root package name */
    private final Exception f55414a;

    public C8629b(Exception exc) {
        C17542s.j(exc, "exception");
        this.f55414a = exc;
    }

    public Exception a() {
        return this.f55414a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C8629b) && C17542s.e(this.f55414a, ((C8629b) obj).f55414a);
    }

    public int hashCode() {
        return this.f55414a.hashCode();
    }

    public String toString() {
        return "Certificate could not be encoded with: " + C8409c.a(a());
    }
}
