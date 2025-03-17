package s0;

import c2.d;
import c2.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\nH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u000f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\fJ\u0015\u0010\u0010\u001a\u00020\nH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u000eJ\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001f\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006 "}, d2 = {"Ls0/w;", "Ls0/E;", "Ls0/T;", "insets", "Lc2/d;", "density", "<init>", "(Ls0/T;Lc2/d;)V", "Lc2/t;", "layoutDirection", "Lc2/h;", "c", "(Lc2/t;)F", "d", "()F", "b", "a", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Ls0/T;", "getInsets", "()Ls0/T;", "Lc2/d;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: s0.w  reason: case insensitive filesystem */
final class C5877w implements C5834E {

    /* renamed from: a  reason: collision with root package name */
    private final C5848T f28850a;

    /* renamed from: b  reason: collision with root package name */
    private final d f28851b;

    public C5877w(C5848T t10, d dVar) {
        this.f28850a = t10;
        this.f28851b = dVar;
    }

    public float a() {
        d dVar = this.f28851b;
        return dVar.H(this.f28850a.b(dVar));
    }

    public float b(t tVar) {
        d dVar = this.f28851b;
        return dVar.H(this.f28850a.d(dVar, tVar));
    }

    public float c(t tVar) {
        d dVar = this.f28851b;
        return dVar.H(this.f28850a.c(dVar, tVar));
    }

    public float d() {
        d dVar = this.f28851b;
        return dVar.H(this.f28850a.a(dVar));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5877w)) {
            return false;
        }
        C5877w wVar = (C5877w) obj;
        return C17542s.e(this.f28850a, wVar.f28850a) && C17542s.e(this.f28851b, wVar.f28851b);
    }

    public int hashCode() {
        return (this.f28850a.hashCode() * 31) + this.f28851b.hashCode();
    }

    public String toString() {
        return "InsetsPaddingValues(insets=" + this.f28850a + ", density=" + this.f28851b + ')';
    }
}
