package s0;

import c2.d;
import c2.h;
import c2.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\fJ\u0017\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u000eJ\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001b¨\u0006\u001c"}, d2 = {"Ls0/H;", "Ls0/T;", "Ls0/E;", "paddingValues", "<init>", "(Ls0/E;)V", "Lc2/d;", "density", "Lc2/t;", "layoutDirection", "", "c", "(Lc2/d;Lc2/t;)I", "a", "(Lc2/d;)I", "d", "b", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Ls0/E;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: s0.H  reason: case insensitive filesystem */
final class C5837H implements C5848T {

    /* renamed from: b  reason: collision with root package name */
    private final C5834E f28722b;

    public C5837H(C5834E e10) {
        this.f28722b = e10;
    }

    public int a(d dVar) {
        return dVar.K0(this.f28722b.d());
    }

    public int b(d dVar) {
        return dVar.K0(this.f28722b.a());
    }

    public int c(d dVar, t tVar) {
        return dVar.K0(this.f28722b.c(tVar));
    }

    public int d(d dVar, t tVar) {
        return dVar.K0(this.f28722b.b(tVar));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5837H)) {
            return false;
        }
        return C17542s.e(((C5837H) obj).f28722b, this.f28722b);
    }

    public int hashCode() {
        return this.f28722b.hashCode();
    }

    public String toString() {
        t tVar = t.Ltr;
        float c10 = this.f28722b.c(tVar);
        float d10 = this.f28722b.d();
        float b10 = this.f28722b.b(tVar);
        float a10 = this.f28722b.a();
        return "PaddingValues(" + h.F(c10) + ", " + h.F(d10) + ", " + h.F(b10) + ", " + h.F(a10) + ')';
    }
}
