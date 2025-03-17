package x0;

import kotlin.Metadata;
import tI.C17978n;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J7\u0010\f\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lx0/B;", "Lx0/A;", "", "pagesLimit", "<init>", "(I)V", "startPage", "suggestedTargetPage", "", "velocity", "pageSize", "pageSpacing", "a", "(IIFII)I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "b", "I", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: x0.B  reason: case insensitive filesystem */
public final class C6229B implements C6228A {

    /* renamed from: b  reason: collision with root package name */
    private final int f31555b;

    public C6229B(int i10) {
        this.f31555b = i10;
    }

    public int a(int i10, int i11, float f10, int i12, int i13) {
        long j10 = (long) i10;
        return C17978n.m(i11, (int) C17978n.f(j10 - ((long) this.f31555b), 0), (int) C17978n.j(j10 + ((long) this.f31555b), 2147483647L));
    }

    public boolean equals(Object obj) {
        return (obj instanceof C6229B) && this.f31555b == ((C6229B) obj).f31555b;
    }

    public int hashCode() {
        return Integer.hashCode(this.f31555b);
    }
}
