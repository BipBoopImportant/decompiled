package s0;

import c2.d;
import c2.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\fJ\u0017\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001b¨\u0006\u001c"}, d2 = {"Ls0/a;", "Ls0/T;", "first", "second", "<init>", "(Ls0/T;Ls0/T;)V", "Lc2/d;", "density", "Lc2/t;", "layoutDirection", "", "c", "(Lc2/d;Lc2/t;)I", "a", "(Lc2/d;)I", "d", "b", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "toString", "()Ljava/lang/String;", "Ls0/T;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: s0.a  reason: case insensitive filesystem */
final class C5855a implements C5848T {

    /* renamed from: b  reason: collision with root package name */
    private final C5848T f28791b;

    /* renamed from: c  reason: collision with root package name */
    private final C5848T f28792c;

    public C5855a(C5848T t10, C5848T t11) {
        this.f28791b = t10;
        this.f28792c = t11;
    }

    public int a(d dVar) {
        return this.f28791b.a(dVar) + this.f28792c.a(dVar);
    }

    public int b(d dVar) {
        return this.f28791b.b(dVar) + this.f28792c.b(dVar);
    }

    public int c(d dVar, t tVar) {
        return this.f28791b.c(dVar, tVar) + this.f28792c.c(dVar, tVar);
    }

    public int d(d dVar, t tVar) {
        return this.f28791b.d(dVar, tVar) + this.f28792c.d(dVar, tVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5855a)) {
            return false;
        }
        C5855a aVar = (C5855a) obj;
        return C17542s.e(aVar.f28791b, this.f28791b) && C17542s.e(aVar.f28792c, this.f28792c);
    }

    public int hashCode() {
        return this.f28791b.hashCode() + (this.f28792c.hashCode() * 31);
    }

    public String toString() {
        return '(' + this.f28791b + " + " + this.f28792c + ')';
    }
}
