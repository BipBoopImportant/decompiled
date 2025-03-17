package g1;

import XH.C16807N;
import kotlin.Metadata;
import nI.C17642l;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0001¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u000b\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lg1/d;", "Lg1/c;", "", "id", "Lg1/n;", "invalid", "Lkotlin/Function1;", "", "LXH/N;", "readObserver", "writeObserver", "parent", "<init>", "(ILg1/n;LnI/l;LnI/l;Lg1/c;)V", "T", "()V", "d", "Lg1/l;", "C", "()Lg1/l;", "s", "Lg1/c;", "getParent", "()Lg1/c;", "", "t", "Z", "deactivated", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: g1.d  reason: case insensitive filesystem */
public final class C5335d extends C5334c {

    /* renamed from: s  reason: collision with root package name */
    private final C5334c f23386s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f23387t;

    public C5335d(int i10, C5345n nVar, C17642l<Object, C16807N> lVar, C17642l<Object, C16807N> lVar2, C5334c cVar) {
        super(i10, nVar, lVar, lVar2);
        this.f23386s = cVar;
        cVar.m(this);
    }

    private final void T() {
        if (!this.f23387t) {
            this.f23387t = true;
            this.f23386s.n(this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0076 A[Catch:{ all -> 0x0060 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public g1.C5343l C() {
        /*
            r7 = this;
            g1.c r0 = r7.f23386s
            boolean r0 = r0.D()
            if (r0 != 0) goto L_0x00bf
            g1.c r0 = r7.f23386s
            boolean r0 = r0.e()
            if (r0 == 0) goto L_0x0012
            goto L_0x00bf
        L_0x0012:
            j0.O r0 = r7.E()
            int r1 = r7.f()
            r2 = 0
            if (r0 == 0) goto L_0x0028
            g1.c r3 = r7.f23386s
            g1.n r4 = r3.g()
            java.util.Map r3 = g1.C5347p.R(r3, r7, r4)
            goto L_0x0029
        L_0x0028:
            r3 = r2
        L_0x0029:
            java.lang.Object r4 = g1.C5347p.I()
            monitor-enter(r4)
            g1.C5347p.g0(r7)     // Catch:{ all -> 0x0060 }
            if (r0 == 0) goto L_0x006b
            int r5 = r0.c()     // Catch:{ all -> 0x0060 }
            if (r5 != 0) goto L_0x003a
            goto L_0x006b
        L_0x003a:
            g1.c r5 = r7.f23386s     // Catch:{ all -> 0x0060 }
            int r5 = r5.f()     // Catch:{ all -> 0x0060 }
            g1.c r6 = r7.f23386s     // Catch:{ all -> 0x0060 }
            g1.n r6 = r6.g()     // Catch:{ all -> 0x0060 }
            g1.l r3 = r7.I(r5, r3, r6)     // Catch:{ all -> 0x0060 }
            g1.l$b r5 = g1.C5343l.b.f23402a     // Catch:{ all -> 0x0060 }
            boolean r5 = kotlin.jvm.internal.C17542s.e(r3, r5)     // Catch:{ all -> 0x0060 }
            if (r5 != 0) goto L_0x0054
            monitor-exit(r4)
            return r3
        L_0x0054:
            g1.c r3 = r7.f23386s     // Catch:{ all -> 0x0060 }
            j0.O r3 = r3.E()     // Catch:{ all -> 0x0060 }
            if (r3 == 0) goto L_0x0062
            r3.i(r0)     // Catch:{ all -> 0x0060 }
            goto L_0x006e
        L_0x0060:
            r0 = move-exception
            goto L_0x00bd
        L_0x0062:
            g1.c r3 = r7.f23386s     // Catch:{ all -> 0x0060 }
            r3.P(r0)     // Catch:{ all -> 0x0060 }
            r7.P(r2)     // Catch:{ all -> 0x0060 }
            goto L_0x006e
        L_0x006b:
            r7.b()     // Catch:{ all -> 0x0060 }
        L_0x006e:
            g1.c r0 = r7.f23386s     // Catch:{ all -> 0x0060 }
            int r0 = r0.f()     // Catch:{ all -> 0x0060 }
            if (r0 >= r1) goto L_0x007b
            g1.c r0 = r7.f23386s     // Catch:{ all -> 0x0060 }
            r0.B()     // Catch:{ all -> 0x0060 }
        L_0x007b:
            g1.c r0 = r7.f23386s     // Catch:{ all -> 0x0060 }
            g1.n r2 = r0.g()     // Catch:{ all -> 0x0060 }
            g1.n r2 = r2.s(r1)     // Catch:{ all -> 0x0060 }
            g1.n r3 = r7.F()     // Catch:{ all -> 0x0060 }
            g1.n r2 = r2.q(r3)     // Catch:{ all -> 0x0060 }
            r0.v(r2)     // Catch:{ all -> 0x0060 }
            g1.c r0 = r7.f23386s     // Catch:{ all -> 0x0060 }
            r0.J(r1)     // Catch:{ all -> 0x0060 }
            g1.c r0 = r7.f23386s     // Catch:{ all -> 0x0060 }
            int r1 = r7.y()     // Catch:{ all -> 0x0060 }
            r0.L(r1)     // Catch:{ all -> 0x0060 }
            g1.c r0 = r7.f23386s     // Catch:{ all -> 0x0060 }
            g1.n r1 = r7.F()     // Catch:{ all -> 0x0060 }
            r0.K(r1)     // Catch:{ all -> 0x0060 }
            g1.c r0 = r7.f23386s     // Catch:{ all -> 0x0060 }
            int[] r1 = r7.G()     // Catch:{ all -> 0x0060 }
            r0.M(r1)     // Catch:{ all -> 0x0060 }
            XH.N r0 = XH.C16807N.f139792a     // Catch:{ all -> 0x0060 }
            monitor-exit(r4)
            r0 = 1
            r7.O(r0)
            r7.T()
            g1.l$b r0 = g1.C5343l.b.f23402a
            return r0
        L_0x00bd:
            monitor-exit(r4)
            throw r0
        L_0x00bf:
            g1.l$a r0 = new g1.l$a
            r0.<init>(r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g1.C5335d.C():g1.l");
    }

    public void d() {
        if (!e()) {
            super.d();
            T();
        }
    }
}
