package ei;

import IC.C13023e;
import Lu.i;
import U0.C4889m;
import U0.C4895p;
import XH.C16807N;
import XH.t;
import di.l;
import di.q;
import ei.C9664e;
import gi.C9749d;
import kotlin.Metadata;
import nI.p;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a#\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0005\u0010\u0006\u001a#\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lgi/d;", "Lei/e$a;", "actions", "Lkotlin/Function0;", "LXH/N;", "g", "(Lgi/d;Lei/e$a;LU0/m;I)LnI/a;", "f", "(Lgi/d;Lei/e$a;LU0/m;I)LnI/p;", "productinformationpage-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: ei.j  reason: case insensitive filesystem */
public final class C9669j {
    /* access modifiers changed from: private */
    public static final p<C4889m, Integer, C16807N> f(C9749d dVar, C9664e.a aVar, C4889m mVar, int i10) {
        p<C4889m, Integer, C16807N> pVar;
        mVar.W(1520026567);
        if (C4895p.J()) {
            C4895p.S(1520026567, i10, -1, "com.ingka.ikea.app.productinformationpage.v2.delegates.expandViewOrNull (AvailabilityDelegate.kt:116)");
        }
        if (dVar instanceof C9749d.b) {
            mVar.W(-401421034);
            pVar = l.f((C9749d.b) dVar, aVar, mVar, (i10 & 112) | C13023e.f110931a);
            mVar.P();
        } else if (dVar instanceof C9749d.c) {
            mVar.W(-401307915);
            C9749d.c cVar = (C9749d.c) dVar;
            pVar = q.m(cVar, cVar.o(), aVar, mVar, ((i10 << 3) & 896) | ((C13023e.f110931a | i.a.f83372a) << 3));
            mVar.P();
        } else if (dVar instanceof C9749d.a) {
            mVar.W(-401123094);
            mVar.P();
            pVar = null;
        } else {
            mVar.W(1788165205);
            mVar.P();
            throw new t();
        }
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
        return pVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: nI.a<XH.N>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: nI.a<XH.N>} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final nI.C17631a<XH.C16807N> g(gi.C9749d r5, ei.C9664e.a r6, U0.C4889m r7, int r8) {
        /*
            r0 = 1911371642(0x71ed377a, float:2.3492805E30)
            r7.W(r0)
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x0012
            r1 = -1
            java.lang.String r2 = "com.ingka.ikea.app.productinformationpage.v2.delegates.onHeaderClickedAction (AvailabilityDelegate.kt:86)"
            U0.C4895p.S(r0, r8, r1, r2)
        L_0x0012:
            di.i r0 = r5.k()
            boolean r0 = r0.c()
            if (r0 != 0) goto L_0x002a
            boolean r5 = U0.C4895p.J()
            if (r5 == 0) goto L_0x0025
            U0.C4895p.R()
        L_0x0025:
            r7.P()
            r5 = 0
            return r5
        L_0x002a:
            boolean r0 = r5 instanceof gi.C9749d.b
            r1 = 0
            r2 = 1
            r3 = 32
            if (r0 == 0) goto L_0x006f
            r5 = -1849458875(0xffffffff91c37f45, float:-3.0844011E-28)
            r7.W(r5)
            r5 = 771624453(0x2dfe0e05, float:2.8882683E-11)
            r7.W(r5)
            r5 = r8 & 112(0x70, float:1.57E-43)
            r5 = r5 ^ 48
            if (r5 <= r3) goto L_0x004a
            boolean r5 = r7.F(r6)
            if (r5 != 0) goto L_0x004e
        L_0x004a:
            r5 = r8 & 48
            if (r5 != r3) goto L_0x004f
        L_0x004e:
            r1 = r2
        L_0x004f:
            java.lang.Object r5 = r7.D()
            if (r1 != 0) goto L_0x005d
            U0.m$a r8 = U0.C4889m.f14007a
            java.lang.Object r8 = r8.a()
            if (r5 != r8) goto L_0x0065
        L_0x005d:
            ei.g r5 = new ei.g
            r5.<init>(r6)
            r7.u(r5)
        L_0x0065:
            nI.a r5 = (nI.C17631a) r5
            r7.P()
            r7.P()
            goto L_0x011b
        L_0x006f:
            boolean r0 = r5 instanceof gi.C9749d.a
            r4 = 4
            if (r0 == 0) goto L_0x00c6
            r0 = -1849344671(0xffffffff91c53d61, float:-3.1118947E-28)
            r7.W(r0)
            r0 = 771628137(0x2dfe1c69, float:2.8889073E-11)
            r7.W(r0)
            r0 = r8 & 112(0x70, float:1.57E-43)
            r0 = r0 ^ 48
            if (r0 <= r3) goto L_0x008c
            boolean r0 = r7.F(r6)
            if (r0 != 0) goto L_0x0090
        L_0x008c:
            r0 = r8 & 48
            if (r0 != r3) goto L_0x0092
        L_0x0090:
            r0 = r2
            goto L_0x0093
        L_0x0092:
            r0 = r1
        L_0x0093:
            r3 = r8 & 14
            r3 = r3 ^ 6
            if (r3 <= r4) goto L_0x009f
            boolean r3 = r7.V(r5)
            if (r3 != 0) goto L_0x00a3
        L_0x009f:
            r8 = r8 & 6
            if (r8 != r4) goto L_0x00a4
        L_0x00a3:
            r1 = r2
        L_0x00a4:
            r8 = r0 | r1
            java.lang.Object r0 = r7.D()
            if (r8 != 0) goto L_0x00b4
            U0.m$a r8 = U0.C4889m.f14007a
            java.lang.Object r8 = r8.a()
            if (r0 != r8) goto L_0x00bc
        L_0x00b4:
            ei.h r0 = new ei.h
            r0.<init>(r6, r5)
            r7.u(r0)
        L_0x00bc:
            r5 = r0
            nI.a r5 = (nI.C17631a) r5
            r7.P()
            r7.P()
            goto L_0x011b
        L_0x00c6:
            boolean r0 = r5 instanceof gi.C9749d.c
            if (r0 == 0) goto L_0x0128
            r0 = -1849231583(0xffffffff91c6f721, float:-3.1391197E-28)
            r7.W(r0)
            r0 = 771631785(0x2dfe2aa9, float:2.8895402E-11)
            r7.W(r0)
            r0 = r8 & 112(0x70, float:1.57E-43)
            r0 = r0 ^ 48
            if (r0 <= r3) goto L_0x00e2
            boolean r0 = r7.F(r6)
            if (r0 != 0) goto L_0x00e6
        L_0x00e2:
            r0 = r8 & 48
            if (r0 != r3) goto L_0x00e8
        L_0x00e6:
            r0 = r2
            goto L_0x00e9
        L_0x00e8:
            r0 = r1
        L_0x00e9:
            r3 = r8 & 14
            r3 = r3 ^ 6
            if (r3 <= r4) goto L_0x00f5
            boolean r3 = r7.V(r5)
            if (r3 != 0) goto L_0x00f9
        L_0x00f5:
            r8 = r8 & 6
            if (r8 != r4) goto L_0x00fa
        L_0x00f9:
            r1 = r2
        L_0x00fa:
            r8 = r0 | r1
            java.lang.Object r0 = r7.D()
            if (r8 != 0) goto L_0x010a
            U0.m$a r8 = U0.C4889m.f14007a
            java.lang.Object r8 = r8.a()
            if (r0 != r8) goto L_0x0112
        L_0x010a:
            ei.i r0 = new ei.i
            r0.<init>(r6, r5)
            r7.u(r0)
        L_0x0112:
            r5 = r0
            nI.a r5 = (nI.C17631a) r5
            r7.P()
            r7.P()
        L_0x011b:
            boolean r6 = U0.C4895p.J()
            if (r6 == 0) goto L_0x0124
            U0.C4895p.R()
        L_0x0124:
            r7.P()
            return r5
        L_0x0128:
            r5 = 771622997(0x2dfe0855, float:2.8880157E-11)
            r7.W(r5)
            r7.P()
            XH.t r5 = new XH.t
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ei.C9669j.g(gi.d, ei.e$a, U0.m, int):nI.a");
    }

    /* access modifiers changed from: private */
    public static final C16807N h(C9664e.a aVar) {
        aVar.b().invoke();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N i(C9664e.a aVar, C9749d dVar) {
        aVar.c().invoke(((C9749d.a) dVar).b());
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N j(C9664e.a aVar, C9749d dVar) {
        aVar.c().invoke(((C9749d.c) dVar).b());
        return C16807N.f139792a;
    }
}
