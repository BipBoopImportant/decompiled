package A1;

import E1.C4488v;
import W0.b;
import j0.C5468y;
import j0.L;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0010\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\r\u001a\u00020\u000b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ5\u0010\u000f\u001a\u00020\u000b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0003J\r\u0010\u0014\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0003J%\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00152\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0012¢\u0006\u0004\b\u001c\u0010\u0003J\u0017\u0010\u001d\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00180\u001f8\u0006¢\u0006\f\n\u0004\b\r\u0010 \u001a\u0004\b!\u0010\"¨\u0006$"}, d2 = {"LA1/n;", "", "<init>", "()V", "Lj0/y;", "LA1/B;", "changes", "LE1/v;", "parentCoordinates", "LA1/h;", "internalPointerEvent", "", "isInBounds", "a", "(Lj0/y;LE1/v;LA1/h;Z)Z", "f", "e", "(LA1/h;)Z", "LXH/N;", "d", "c", "", "pointerIdValue", "Lj0/L;", "LA1/m;", "hitNodes", "i", "(JLj0/L;)V", "h", "b", "(LA1/h;)V", "LW0/b;", "LW0/b;", "g", "()LW0/b;", "children", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: A1.n  reason: case insensitive filesystem */
public class C4347n {

    /* renamed from: b  reason: collision with root package name */
    public static final int f4424b = b.f14622d;

    /* renamed from: a  reason: collision with root package name */
    private final b<C4346m> f4425a = new b<>(new C4346m[16], 0);

    public boolean a(C5468y<B> yVar, C4488v vVar, C4341h hVar, boolean z10) {
        b<C4346m> bVar = this.f4425a;
        int r10 = bVar.r();
        if (r10 <= 0) {
            return false;
        }
        Object[] q10 = bVar.q();
        int i10 = 0;
        boolean z11 = false;
        do {
            z11 = ((C4346m) q10[i10]).a(yVar, vVar, hVar, z10) || z11;
            i10++;
        } while (i10 < r10);
        return z11;
    }

    public void b(C4341h hVar) {
        int r10 = this.f4425a.r();
        while (true) {
            r10--;
            if (-1 >= r10) {
                return;
            }
            if (((C4346m) this.f4425a.q()[r10]).l().g()) {
                this.f4425a.B(r10);
            }
        }
    }

    public final void c() {
        this.f4425a.k();
    }

    public void d() {
        b<C4346m> bVar = this.f4425a;
        int r10 = bVar.r();
        if (r10 > 0) {
            Object[] q10 = bVar.q();
            int i10 = 0;
            do {
                ((C4346m) q10[i10]).d();
                i10++;
            } while (i10 < r10);
        }
    }

    public boolean e(C4341h hVar) {
        b<C4346m> bVar = this.f4425a;
        int r10 = bVar.r();
        boolean z10 = false;
        if (r10 > 0) {
            Object[] q10 = bVar.q();
            int i10 = 0;
            boolean z11 = false;
            do {
                z11 = ((C4346m) q10[i10]).e(hVar) || z11;
                i10++;
            } while (i10 < r10);
            z10 = z11;
        }
        b(hVar);
        return z10;
    }

    public boolean f(C5468y<B> yVar, C4488v vVar, C4341h hVar, boolean z10) {
        b<C4346m> bVar = this.f4425a;
        int r10 = bVar.r();
        if (r10 <= 0) {
            return false;
        }
        Object[] q10 = bVar.q();
        int i10 = 0;
        boolean z11 = false;
        do {
            z11 = ((C4346m) q10[i10]).f(yVar, vVar, hVar, z10) || z11;
            i10++;
        } while (i10 < r10);
        return z11;
    }

    public final b<C4346m> g() {
        return this.f4425a;
    }

    public final void h() {
        int i10 = 0;
        while (i10 < this.f4425a.r()) {
            C4346m mVar = (C4346m) this.f4425a.q()[i10];
            if (!mVar.k().j2()) {
                mVar.d();
                this.f4425a.B(i10);
            } else {
                i10++;
                mVar.h();
            }
        }
    }

    public void i(long j10, L<C4346m> l10) {
        b<C4346m> bVar = this.f4425a;
        int r10 = bVar.r();
        if (r10 > 0) {
            Object[] q10 = bVar.q();
            int i10 = 0;
            do {
                ((C4346m) q10[i10]).i(j10, l10);
                i10++;
            } while (i10 < r10);
        }
    }
}
