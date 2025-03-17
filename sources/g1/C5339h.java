package g1;

import XH.C16807N;
import XH.C16820k;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B/\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\f\u001a\u00020\u00012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\bH\u0010¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\u0014\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0010¢\u0006\u0004\b\u0017\u0010\u0018R(\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00068\u0010X\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001f\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8VX\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\"\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00068PX\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\u001c¨\u0006&"}, d2 = {"Lg1/h;", "Lg1/k;", "", "id", "Lg1/n;", "invalid", "Lkotlin/Function1;", "", "LXH/N;", "readObserver", "<init>", "(ILg1/n;LnI/l;)V", "x", "(LnI/l;)Lg1/k;", "o", "()V", "d", "snapshot", "m", "(Lg1/k;)V", "n", "Lg1/G;", "state", "p", "(Lg1/G;)V", "g", "LnI/l;", "A", "()LnI/l;", "h", "I", "snapshots", "", "i", "()Z", "readOnly", "k", "writeObserver", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: g1.h  reason: case insensitive filesystem */
public final class C5339h extends C5342k {

    /* renamed from: g  reason: collision with root package name */
    private final C17642l<Object, C16807N> f23391g;

    /* renamed from: h  reason: collision with root package name */
    private int f23392h = 1;

    public C5339h(int i10, C5345n nVar, C17642l<Object, C16807N> lVar) {
        super(i10, nVar, (DefaultConstructorMarker) null);
        this.f23391g = lVar;
    }

    /* renamed from: A */
    public C17642l<Object, C16807N> h() {
        return this.f23391g;
    }

    public void d() {
        if (!e()) {
            n(this);
            super.d();
        }
    }

    public boolean i() {
        return true;
    }

    public C17642l<Object, C16807N> k() {
        return null;
    }

    public void m(C5342k kVar) {
        this.f23392h++;
    }

    public void n(C5342k kVar) {
        int i10 = this.f23392h - 1;
        this.f23392h = i10;
        if (i10 == 0) {
            b();
        }
    }

    public void o() {
    }

    public void p(C5326G g10) {
        Void unused = C5347p.Z();
        throw new C16820k();
    }

    public C5342k x(C17642l<Object, C16807N> lVar) {
        C5347p.g0(this);
        return new C5336e(f(), g(), C5347p.L(lVar, h(), false, 4, (Object) null), this);
    }
}
