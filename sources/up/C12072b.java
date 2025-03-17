package up;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0015\u001a\u0004\b\u0011\u0010\u0016¨\u0006\u0017"}, d2 = {"Lup/b;", "", "Lup/a;", "key", "", "currentValue", "<init>", "(Lup/a;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lup/a;", "b", "()Lup/a;", "Z", "()Z", "dataconsent_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: up.b  reason: case insensitive filesystem */
public final class C12072b {

    /* renamed from: a  reason: collision with root package name */
    private final C12071a f103984a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f103985b;

    public C12072b(C12071a aVar, boolean z10) {
        C17542s.j(aVar, "key");
        this.f103984a = aVar;
        this.f103985b = z10;
    }

    public final boolean a() {
        return this.f103985b;
    }

    public final C12071a b() {
        return this.f103984a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12072b)) {
            return false;
        }
        C12072b bVar = (C12072b) obj;
        return C17542s.e(this.f103984a, bVar.f103984a) && this.f103985b == bVar.f103985b;
    }

    public int hashCode() {
        return (this.f103984a.hashCode() * 31) + Boolean.hashCode(this.f103985b);
    }

    public String toString() {
        C12071a aVar = this.f103984a;
        boolean z10 = this.f103985b;
        return "UserConsent(key=" + aVar + ", currentValue=" + z10 + ")";
    }
}
