package fx;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, d2 = {"Lfx/B;", "", "", "label", "", "isLast", "<init>", "(Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Z", "()Z", "populartimes-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: fx.B  reason: case insensitive filesystem */
final class C14455B {

    /* renamed from: a  reason: collision with root package name */
    private final String f126931a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f126932b;

    public C14455B(String str, boolean z10) {
        C17542s.j(str, "label");
        this.f126931a = str;
        this.f126932b = z10;
    }

    public final String a() {
        return this.f126931a;
    }

    public final boolean b() {
        return this.f126932b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14455B)) {
            return false;
        }
        C14455B b10 = (C14455B) obj;
        return C17542s.e(this.f126931a, b10.f126931a) && this.f126932b == b10.f126932b;
    }

    public int hashCode() {
        return (this.f126931a.hashCode() * 31) + Boolean.hashCode(this.f126932b);
    }

    public String toString() {
        String str = this.f126931a;
        boolean z10 = this.f126932b;
        return "Label(label=" + str + ", isLast=" + z10 + ")";
    }
}
