package Fu;

import Du.a;
import Du.d;
import E1.I;
import G1.C4504g;
import IC.C13023e;
import O0.e1;
import O0.g1;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.C4912y;
import U0.F1;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import XH.t;
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.foundation.layout.C5080k;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.c;
import com.ikea.kompassmap.model.store.map.ExposedFloor;
import i1.C5437c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.C17642l;
import nI.q;
import ol.u;
import ol.v;
import s0.C5842M;
import s0.C5848T;
import s0.C5862h;
import yd.C10461o;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a9\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H\u0001¢\u0006\u0004\b\b\u0010\t\u001a+\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LDu/d$a;", "state", "Lkotlin/Function1;", "LDu/a;", "LXH/N;", "onAction", "Lkotlin/Function0;", "onCloseWayfinding", "f", "(LDu/d$a;LnI/l;LnI/a;LU0/m;I)V", "LDu/c;", "content", "i", "(LDu/c;LnI/l;LU0/m;I)V", "wayfinding-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class p {
    public static final void f(d.a aVar, C17642l<? super a, C16807N> lVar, C17631a<C16807N> aVar2, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        d.a aVar3 = aVar;
        C17642l<? super a, C16807N> lVar2 = lVar;
        C17631a<C16807N> aVar4 = aVar2;
        int i12 = i10;
        C17542s.j(aVar3, "state");
        C17542s.j(lVar2, "onAction");
        C17542s.j(aVar4, "onCloseWayfinding");
        C4889m k10 = mVar.k(949566209);
        if ((i12 & 6) == 0) {
            i11 = ((i12 & 8) == 0 ? k10.V(aVar3) : k10.F(aVar3) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i12 & 48) == 0) {
            i11 |= k10.F(lVar2) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i11 |= k10.F(aVar4) ? 256 : 128;
        }
        int i13 = i11;
        if ((i13 & 147) != 146 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(949566209, i13, -1, "com.ingka.ikea.instore.wayfinding.impl.map.ui.KompassMapScreen (WayfindingMapScreen.kt:30)");
            }
            Eu.a d10 = aVar.d();
            if (d10 == null) {
                if (C4895p.J()) {
                    C4895p.R();
                }
                Y0 n10 = k10.n();
                if (n10 != null) {
                    n10.a(new k(aVar3, lVar2, aVar4, i12));
                    return;
                }
                return;
            }
            androidx.compose.ui.d f10 = J.f(androidx.compose.ui.d.f18749a, 0.0f, 1, (Object) null);
            I a10 = C5080k.a(C5073d.f18068a.g(), C5437c.f24302a.k(), k10, 0);
            int a11 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            androidx.compose.ui.d e10 = c.e(k10, f10);
            C4504g.a aVar5 = C4504g.f6515W;
            C17631a<C4504g> a12 = aVar5.a();
            if (k10.m() == null) {
                C4883j.c();
            }
            k10.I();
            if (k10.i()) {
                k10.p(a12);
            } else {
                k10.t();
            }
            C4889m a13 = F1.a(k10);
            F1.c(a13, a10, aVar5.c());
            F1.c(a13, s10, aVar5.e());
            nI.p<C4504g, Integer, C16807N> b10 = aVar5.b();
            if (a13.i() || !C17542s.e(a13.D(), Integer.valueOf(a11))) {
                a13.u(Integer.valueOf(a11));
                a13.w(Integer.valueOf(a11), b10);
            }
            F1.c(a13, e10, aVar5.d());
            C5862h hVar = C5862h.f28810a;
            mVar2 = k10;
            ol.p.c(v.BACK, aVar2, (androidx.compose.ui.d) null, d10.a().a(k10, C13023e.f110931a), (u) null, (q<? super C5842M, ? super C4889m, ? super Integer, C16807N>) null, (C5848T) null, (e1) null, (g1) null, k10, ((i13 >> 3) & 112) | 6, 500);
            i(aVar.c(), lVar2, mVar2, i13 & 112);
            mVar2.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            mVar2 = k10;
        }
        Y0 n11 = mVar2.n();
        if (n11 != null) {
            n11.a(new l(aVar, lVar2, aVar4, i12));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N g(d.a aVar, C17642l lVar, C17631a aVar2, int i10, C4889m mVar, int i11) {
        f(aVar, lVar, aVar2, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N h(d.a aVar, C17642l lVar, C17631a aVar2, int i10, C4889m mVar, int i11) {
        f(aVar, lVar, aVar2, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: nI.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: nI.l} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void i(Du.c r9, nI.C17642l<? super Du.a, XH.C16807N> r10, U0.C4889m r11, int r12) {
        /*
            r0 = -1977691257(0xffffffff8a1ed387, float:-7.647207E-33)
            U0.m r11 = r11.k(r0)
            r1 = r12 & 6
            if (r1 != 0) goto L_0x0016
            boolean r1 = r11.V(r9)
            if (r1 == 0) goto L_0x0013
            r1 = 4
            goto L_0x0014
        L_0x0013:
            r1 = 2
        L_0x0014:
            r1 = r1 | r12
            goto L_0x0017
        L_0x0016:
            r1 = r12
        L_0x0017:
            r2 = r12 & 48
            r3 = 32
            if (r2 != 0) goto L_0x0028
            boolean r2 = r11.F(r10)
            if (r2 == 0) goto L_0x0025
            r2 = r3
            goto L_0x0027
        L_0x0025:
            r2 = 16
        L_0x0027:
            r1 = r1 | r2
        L_0x0028:
            r2 = r1 & 19
            r4 = 18
            if (r2 != r4) goto L_0x003a
            boolean r2 = r11.l()
            if (r2 != 0) goto L_0x0035
            goto L_0x003a
        L_0x0035:
            r11.L()
            goto L_0x00be
        L_0x003a:
            boolean r2 = U0.C4895p.J()
            if (r2 == 0) goto L_0x0046
            r2 = -1
            java.lang.String r4 = "com.ingka.ikea.instore.wayfinding.impl.map.ui.KompassMapUI (WayfindingMapScreen.kt:47)"
            U0.C4895p.S(r0, r1, r2, r4)
        L_0x0046:
            com.ikea.kompassmap.model.store.map.KompassMapOptions r0 = new com.ikea.kompassmap.model.store.map.KompassMapOptions
            java.lang.String r2 = r9.d()
            java.lang.String r4 = r9.a()
            java.lang.String r5 = r9.b()
            r0.<init>(r2, r4, r5)
            java.lang.String r2 = r9.c()
            r4 = 341942984(0x1461a2c8, float:1.13917E-26)
            r11.W(r4)
            r1 = r1 & 112(0x70, float:1.57E-43)
            r4 = 0
            r5 = 1
            if (r1 != r3) goto L_0x0069
            r6 = r5
            goto L_0x006a
        L_0x0069:
            r6 = r4
        L_0x006a:
            java.lang.Object r7 = r11.D()
            if (r6 != 0) goto L_0x0078
            U0.m$a r6 = U0.C4889m.f14007a
            java.lang.Object r6 = r6.a()
            if (r7 != r6) goto L_0x0080
        L_0x0078:
            Fu.m r7 = new Fu.m
            r7.<init>(r10)
            r11.u(r7)
        L_0x0080:
            r6 = r7
            nI.l r6 = (nI.C17642l) r6
            r11.P()
            r7 = 341946098(0x1461aef2, float:1.1394099E-26)
            r11.W(r7)
            if (r1 != r3) goto L_0x008f
            r4 = r5
        L_0x008f:
            java.lang.Object r1 = r11.D()
            if (r4 != 0) goto L_0x009d
            U0.m$a r3 = U0.C4889m.f14007a
            java.lang.Object r3 = r3.a()
            if (r1 != r3) goto L_0x00a5
        L_0x009d:
            Fu.n r1 = new Fu.n
            r1.<init>(r10)
            r11.u(r1)
        L_0x00a5:
            r5 = r1
            nI.l r5 = (nI.C17642l) r5
            r11.P()
            int r7 = com.ikea.kompassmap.model.store.map.KompassMapOptions.$stable
            r8 = 4
            r3 = 0
            r1 = r0
            r4 = r6
            r6 = r11
            yd.C10472z.e(r1, r2, r3, r4, r5, r6, r7, r8)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x00be
            U0.C4895p.R()
        L_0x00be:
            U0.Y0 r11 = r11.n()
            if (r11 == 0) goto L_0x00cc
            Fu.o r0 = new Fu.o
            r0.<init>(r9, r10, r12)
            r11.a(r0)
        L_0x00cc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Fu.p.i(Du.c, nI.l, U0.m, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N j(C17642l lVar, ExposedFloor exposedFloor) {
        C17542s.j(exposedFloor, "it");
        lVar.invoke(new a.C1516a(exposedFloor.getOrdinal()));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N k(C17642l lVar, C10461o oVar) {
        C17542s.j(oVar, "it");
        if (oVar instanceof C10461o.a) {
            lVar.invoke(a.d.f80324a);
        } else if (oVar instanceof C10461o.c) {
            lVar.invoke(new a.c((C10461o.c) oVar));
        } else {
            throw new t();
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N l(Du.c cVar, C17642l lVar, int i10, C4889m mVar, int i11) {
        i(cVar, lVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }
}
