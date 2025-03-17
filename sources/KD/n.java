package kD;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0017"}, d2 = {"LkD/n;", "LkD/g;", "", "message", "", "throwable", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Ljava/lang/Throwable;", "()Ljava/lang/Throwable;", "useraccount_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class n extends g {

    /* renamed from: a  reason: collision with root package name */
    private final String f128648a;

    /* renamed from: b  reason: collision with root package name */
    private final Throwable f128649b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n(String str, Throwable th2) {
        super((DefaultConstructorMarker) null);
        C17542s.j(str, "message");
        this.f128648a = str;
        this.f128649b = th2;
    }

    public String a() {
        return this.f128648a;
    }

    public final Throwable b() {
        return this.f128649b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return C17542s.e(this.f128648a, nVar.f128648a) && C17542s.e(this.f128649b, nVar.f128649b);
    }

    public int hashCode() {
        int hashCode = this.f128648a.hashCode() * 31;
        Throwable th2 = this.f128649b;
        return hashCode + (th2 == null ? 0 : th2.hashCode());
    }

    public String toString() {
        String str = this.f128648a;
        Throwable th2 = this.f128649b;
        return "UnspecifiedFailure(message=" + str + ", throwable=" + th2 + ")";
    }
}
