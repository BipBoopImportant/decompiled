package s0;

import U0.C4899r0;
import U0.o1;
import c2.d;
import c2.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0011\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\u0010J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001c\u001a\u0004\b\u001d\u0010\u001bR+\u0010$\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u00028@@@X\u0002¢\u0006\u0012\n\u0004\b\r\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Ls0/S;", "Ls0/T;", "Ls0/x;", "insets", "", "name", "<init>", "(Ls0/x;Ljava/lang/String;)V", "Lc2/d;", "density", "Lc2/t;", "layoutDirection", "", "c", "(Lc2/d;Lc2/t;)I", "a", "(Lc2/d;)I", "d", "b", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "getName", "<set-?>", "LU0/r0;", "e", "()Ls0/x;", "f", "(Ls0/x;)V", "value", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: s0.S  reason: case insensitive filesystem */
public final class C5847S implements C5848T {

    /* renamed from: b  reason: collision with root package name */
    private final String f28731b;

    /* renamed from: c  reason: collision with root package name */
    private final C4899r0 f28732c;

    public C5847S(C5878x xVar, String str) {
        this.f28731b = str;
        this.f28732c = u1.e(xVar, (o1) null, 2, (Object) null);
    }

    public int a(d dVar) {
        return e().d();
    }

    public int b(d dVar) {
        return e().a();
    }

    public int c(d dVar, t tVar) {
        return e().b();
    }

    public int d(d dVar, t tVar) {
        return e().c();
    }

    public final C5878x e() {
        return (C5878x) this.f28732c.getValue();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5847S)) {
            return false;
        }
        return C17542s.e(e(), ((C5847S) obj).e());
    }

    public final void f(C5878x xVar) {
        this.f28732c.setValue(xVar);
    }

    public int hashCode() {
        return this.f28731b.hashCode();
    }

    public String toString() {
        return this.f28731b + "(left=" + e().b() + ", top=" + e().d() + ", right=" + e().c() + ", bottom=" + e().a() + ')';
    }
}
