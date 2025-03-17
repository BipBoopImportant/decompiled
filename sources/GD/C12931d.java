package GD;

import IC.C13023e;
import IC.C13026h;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\bJ\u0010\u0010\t\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0012\u0010\u0015¨\u0006\u0016"}, d2 = {"LGD/d;", "", "LIC/e;", "title", "body", "<init>", "(LIC/e;LIC/e;)V", "", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LIC/e;", "b", "()LIC/e;", "wallet-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: GD.d  reason: case insensitive filesystem */
public final class C12931d {

    /* renamed from: a  reason: collision with root package name */
    private final C13023e f110340a;

    /* renamed from: b  reason: collision with root package name */
    private final C13023e f110341b;

    public C12931d(C13023e eVar, C13023e eVar2) {
        C17542s.j(eVar, "title");
        C17542s.j(eVar2, "body");
        this.f110340a = eVar;
        this.f110341b = eVar2;
    }

    public final C13023e a() {
        return this.f110341b;
    }

    public final C13023e b() {
        return this.f110340a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12931d)) {
            return false;
        }
        C12931d dVar = (C12931d) obj;
        return C17542s.e(this.f110340a, dVar.f110340a) && C17542s.e(this.f110341b, dVar.f110341b);
    }

    public int hashCode() {
        return (this.f110340a.hashCode() * 31) + this.f110341b.hashCode();
    }

    public String toString() {
        C13023e eVar = this.f110340a;
        C13023e eVar2 = this.f110341b;
        return "Hint(title=" + eVar + ", body=" + eVar2 + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C12931d(String str, String str2) {
        this(C13026h.c(str), C13026h.c(str2));
        C17542s.j(str, "title");
        C17542s.j(str2, "body");
    }
}
