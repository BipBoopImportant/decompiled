package X5;

import T5.n;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000e"}, d2 = {"LX5/g;", "", "LT5/n;", "image", "", "isSampled", "<init>", "(LT5/n;Z)V", "a", "LT5/n;", "()LT5/n;", "b", "Z", "()Z", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: X5.g  reason: case insensitive filesystem */
public final class C6722g {

    /* renamed from: a  reason: collision with root package name */
    private final n f40671a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f40672b;

    public C6722g(n nVar, boolean z10) {
        this.f40671a = nVar;
        this.f40672b = z10;
    }

    public final n a() {
        return this.f40671a;
    }

    public final boolean b() {
        return this.f40672b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6722g)) {
            return false;
        }
        C6722g gVar = (C6722g) obj;
        return C17542s.e(this.f40671a, gVar.f40671a) && this.f40672b == gVar.f40672b;
    }

    public int hashCode() {
        return (this.f40671a.hashCode() * 31) + Boolean.hashCode(this.f40672b);
    }

    public String toString() {
        return "DecodeResult(image=" + this.f40671a + ", isSampled=" + this.f40672b + ')';
    }
}
