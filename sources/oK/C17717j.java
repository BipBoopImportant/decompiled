package oK;

import c2.p;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0016\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0017"}, d2 = {"LoK/j;", "", "LoK/l;", "sampleSize", "Lc2/p;", "bounds", "<init>", "(ILc2/p;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Lc2/p;", "()Lc2/p;", "sub-sampling-image_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: oK.j  reason: case insensitive filesystem */
public final class C17717j {

    /* renamed from: a  reason: collision with root package name */
    private final int f145382a;

    /* renamed from: b  reason: collision with root package name */
    private final p f145383b;

    public /* synthetic */ C17717j(int i10, p pVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, pVar);
    }

    public final p a() {
        return this.f145383b;
    }

    public final int b() {
        return this.f145382a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17717j)) {
            return false;
        }
        C17717j jVar = (C17717j) obj;
        return C17719l.e(this.f145382a, jVar.f145382a) && C17542s.e(this.f145383b, jVar.f145383b);
    }

    public int hashCode() {
        return (C17719l.f(this.f145382a) * 31) + this.f145383b.hashCode();
    }

    public String toString() {
        String g10 = C17719l.g(this.f145382a);
        p pVar = this.f145383b;
        return "ImageRegionTile(sampleSize=" + g10 + ", bounds=" + pVar + ")";
    }

    private C17717j(int i10, p pVar) {
        C17542s.j(pVar, "bounds");
        this.f145382a = i10;
        this.f145383b = pVar;
    }
}
