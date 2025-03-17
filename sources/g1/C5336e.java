package g1;

import XH.C16807N;
import XH.C16820k;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\u0001¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\r\u001a\u00020\u00002\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0010¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0010¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\u001a\u0010\u0019R(\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00068\u0010X\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\n\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0014\u0010&\u001a\u00020#8VX\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\"\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00068PX\u0004¢\u0006\u0006\u001a\u0004\b'\u0010\u001e¨\u0006)"}, d2 = {"Lg1/e;", "Lg1/k;", "", "id", "Lg1/n;", "invalid", "Lkotlin/Function1;", "", "LXH/N;", "readObserver", "parent", "<init>", "(ILg1/n;LnI/l;Lg1/k;)V", "E", "(LnI/l;)Lg1/e;", "o", "()V", "d", "Lg1/G;", "state", "", "D", "(Lg1/G;)Ljava/lang/Void;", "snapshot", "C", "(Lg1/k;)Ljava/lang/Void;", "B", "g", "LnI/l;", "A", "()LnI/l;", "h", "Lg1/k;", "getParent", "()Lg1/k;", "", "i", "()Z", "readOnly", "k", "writeObserver", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: g1.e  reason: case insensitive filesystem */
public final class C5336e extends C5342k {

    /* renamed from: g  reason: collision with root package name */
    private final C17642l<Object, C16807N> f23388g;

    /* renamed from: h  reason: collision with root package name */
    private final C5342k f23389h;

    public C5336e(int i10, C5345n nVar, C17642l<Object, C16807N> lVar, C5342k kVar) {
        super(i10, nVar, (DefaultConstructorMarker) null);
        this.f23388g = lVar;
        this.f23389h = kVar;
        kVar.m(this);
    }

    /* renamed from: A */
    public C17642l<Object, C16807N> h() {
        return this.f23388g;
    }

    /* renamed from: B */
    public Void m(C5342k kVar) {
        C5356y.b();
        throw new C16820k();
    }

    /* renamed from: C */
    public Void n(C5342k kVar) {
        C5356y.b();
        throw new C16820k();
    }

    /* renamed from: D */
    public Void p(C5326G g10) {
        Void unused = C5347p.Z();
        throw new C16820k();
    }

    /* renamed from: E */
    public C5336e x(C17642l<Object, C16807N> lVar) {
        return new C5336e(f(), g(), C5347p.L(lVar, h(), false, 4, (Object) null), this.f23389h);
    }

    public void d() {
        if (!e()) {
            if (f() != this.f23389h.f()) {
                b();
            }
            this.f23389h.n(this);
            super.d();
        }
    }

    public boolean i() {
        return true;
    }

    public C17642l<Object, C16807N> k() {
        return null;
    }

    public void o() {
    }
}
