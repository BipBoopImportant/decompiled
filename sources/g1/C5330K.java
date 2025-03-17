package g1;

import XH.C16807N;
import XH.C16820k;
import j0.O;
import kotlin.Metadata;
import nI.C17642l;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0001\n\u0002\b\u0012\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0012H\u0010¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0018\u001a\u00020\u00172\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J;\u0010\u001b\u001a\u00020\u00012\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00032\u0014\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0005H\u0010¢\u0006\u0004\b\u001d\u0010\u000eJ\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u0017H\u0010¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u0017H\u0010¢\u0006\u0004\b\"\u0010!R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b'\u0010&RF\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00032\u0014\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0010@VX\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.RF\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00032\u0014\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0010@VX\u000e¢\u0006\u0012\n\u0004\b/\u0010*\u001a\u0004\b0\u0010,\"\u0004\b1\u0010.R\u001a\u00106\u001a\u0002028\u0000X\u0004¢\u0006\f\n\u0004\b\u0018\u00103\u001a\u0004\b4\u00105R\u0014\u00109\u001a\u00020\u00018BX\u0004¢\u0006\u0006\u001a\u0004\b7\u00108R$\u0010?\u001a\u00020:2\u0006\u0010;\u001a\u00020:8V@PX\u000e¢\u0006\f\u001a\u0004\b<\u0010=\"\u0004\b'\u0010>R$\u0010D\u001a\u00020@2\u0006\u0010;\u001a\u00020@8P@PX\u000e¢\u0006\f\u001a\u0004\bA\u0010B\"\u0004\b)\u0010CR4\u0010J\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010E2\u000e\u0010;\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010E8P@VX\u000e¢\u0006\f\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR$\u0010L\u001a\u00020:2\u0006\u0010;\u001a\u00020:8P@PX\u000e¢\u0006\f\u001a\u0004\bK\u0010=\"\u0004\b/\u0010>R\u0014\u0010O\u001a\u00020\b8VX\u0004¢\u0006\u0006\u001a\u0004\bM\u0010N¨\u0006P"}, d2 = {"Lg1/K;", "Lg1/c;", "parentSnapshot", "Lkotlin/Function1;", "", "LXH/N;", "specifiedReadObserver", "specifiedWriteObserver", "", "mergeParentObservers", "ownsParentSnapshot", "<init>", "(Lg1/c;LnI/l;LnI/l;ZZ)V", "d", "()V", "Lg1/l;", "C", "()Lg1/l;", "Lg1/G;", "state", "p", "(Lg1/G;)V", "readObserver", "Lg1/k;", "x", "(LnI/l;)Lg1/k;", "writeObserver", "Q", "(LnI/l;LnI/l;)Lg1/c;", "o", "snapshot", "", "V", "(Lg1/k;)Ljava/lang/Void;", "W", "s", "Lg1/c;", "t", "Z", "u", "<set-?>", "v", "LnI/l;", "H", "()LnI/l;", "X", "(LnI/l;)V", "w", "k", "Y", "", "J", "U", "()J", "threadId", "T", "()Lg1/c;", "currentSnapshot", "", "value", "f", "()I", "(I)V", "id", "Lg1/n;", "g", "()Lg1/n;", "(Lg1/n;)V", "invalid", "Lj0/O;", "E", "()Lj0/O;", "P", "(Lj0/O;)V", "modified", "j", "writeCount", "i", "()Z", "readOnly", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: g1.K  reason: case insensitive filesystem */
public final class C5330K extends C5334c {

    /* renamed from: s  reason: collision with root package name */
    private final C5334c f23357s;

    /* renamed from: t  reason: collision with root package name */
    private final boolean f23358t;

    /* renamed from: u  reason: collision with root package name */
    private final boolean f23359u;

    /* renamed from: v  reason: collision with root package name */
    private C17642l<Object, C16807N> f23360v;

    /* renamed from: w  reason: collision with root package name */
    private C17642l<Object, C16807N> f23361w;

    /* renamed from: x  reason: collision with root package name */
    private final long f23362x;

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r1 = r3.h();
     */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C5330K(g1.C5334c r3, nI.C17642l<java.lang.Object, XH.C16807N> r4, nI.C17642l<java.lang.Object, XH.C16807N> r5, boolean r6, boolean r7) {
        /*
            r2 = this;
            g1.n$a r0 = g1.C5345n.f23408e
            g1.n r0 = r0.a()
            if (r3 == 0) goto L_0x000e
            nI.l r1 = r3.h()
            if (r1 != 0) goto L_0x001c
        L_0x000e:
            java.util.concurrent.atomic.AtomicReference r1 = g1.C5347p.f23429j
            java.lang.Object r1 = r1.get()
            g1.a r1 = (g1.C5332a) r1
            nI.l r1 = r1.h()
        L_0x001c:
            nI.l r4 = g1.C5347p.K(r4, r1, r6)
            if (r3 == 0) goto L_0x0028
            nI.l r1 = r3.k()
            if (r1 != 0) goto L_0x0036
        L_0x0028:
            java.util.concurrent.atomic.AtomicReference r1 = g1.C5347p.f23429j
            java.lang.Object r1 = r1.get()
            g1.a r1 = (g1.C5332a) r1
            nI.l r1 = r1.k()
        L_0x0036:
            nI.l r5 = g1.C5347p.M(r5, r1)
            r1 = 0
            r2.<init>(r1, r0, r4, r5)
            r2.f23357s = r3
            r2.f23358t = r6
            r2.f23359u = r7
            nI.l r3 = super.h()
            r2.f23360v = r3
            nI.l r3 = super.k()
            r2.f23361w = r3
            long r3 = U0.C4863c.a()
            r2.f23362x = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g1.C5330K.<init>(g1.c, nI.l, nI.l, boolean, boolean):void");
    }

    private final C5334c T() {
        C5334c cVar = this.f23357s;
        return cVar == null ? (C5334c) C5347p.f23429j.get() : cVar;
    }

    public C5343l C() {
        return T().C();
    }

    public O<C5326G> E() {
        return T().E();
    }

    /* renamed from: H */
    public C17642l<Object, C16807N> h() {
        return this.f23360v;
    }

    public void P(O<C5326G> o10) {
        C5356y.b();
        throw new C16820k();
    }

    public C5334c Q(C17642l<Object, C16807N> lVar, C17642l<Object, C16807N> lVar2) {
        C17642l L10 = C5347p.L(lVar, h(), false, 4, (Object) null);
        C17642l m10 = C5347p.M(lVar2, k());
        return !this.f23358t ? new C5330K(T().Q((C17642l<Object, C16807N>) null, m10), L10, m10, false, true) : T().Q(L10, m10);
    }

    public final long U() {
        return this.f23362x;
    }

    /* renamed from: V */
    public Void m(C5342k kVar) {
        C5356y.b();
        throw new C16820k();
    }

    /* renamed from: W */
    public Void n(C5342k kVar) {
        C5356y.b();
        throw new C16820k();
    }

    public void X(C17642l<Object, C16807N> lVar) {
        this.f23360v = lVar;
    }

    public void Y(C17642l<Object, C16807N> lVar) {
        this.f23361w = lVar;
    }

    public void d() {
        C5334c cVar;
        t(true);
        if (this.f23359u && (cVar = this.f23357s) != null) {
            cVar.d();
        }
    }

    public int f() {
        return T().f();
    }

    public C5345n g() {
        return T().g();
    }

    public boolean i() {
        return T().i();
    }

    public int j() {
        return T().j();
    }

    public C17642l<Object, C16807N> k() {
        return this.f23361w;
    }

    public void o() {
        T().o();
    }

    public void p(C5326G g10) {
        T().p(g10);
    }

    public void u(int i10) {
        C5356y.b();
        throw new C16820k();
    }

    public void v(C5345n nVar) {
        C5356y.b();
        throw new C16820k();
    }

    public void w(int i10) {
        T().w(i10);
    }

    public C5342k x(C17642l<Object, C16807N> lVar) {
        C17642l L10 = C5347p.L(lVar, h(), false, 4, (Object) null);
        return !this.f23358t ? C5347p.D(T().x((C17642l<Object, C16807N>) null), L10, true) : T().x(L10);
    }
}
