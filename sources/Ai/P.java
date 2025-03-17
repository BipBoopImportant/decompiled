package Ai;

import E1.I;
import G1.C4504g;
import Hx.c;
import J1.j;
import KJ.C15987c;
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
import androidx.compose.ui.d;
import androidx.compose.ui.platform.C5116k1;
import i1.C5437c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import s0.C5862h;
import wi.C12272a;

@Metadata(d1 = {"\u0000:\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a9\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005H\u0001¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\u000b\u001a\u00020\n*\u00020\u0003H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001aK\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00002\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014H\u0003¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"", "isSplitOrder", "LKJ/c;", "LHx/c$d;", "actions", "Lkotlin/Function1;", "LXH/N;", "onActionClicked", "d", "(ZLKJ/c;LnI/l;LU0/m;I)V", "", "i", "(LHx/c$d;)Ljava/lang/String;", "", "titleRes", "subtitleRes", "icon", "enabled", "Lkotlin/Function0;", "onClick", "Landroidx/compose/ui/d;", "modifier", "g", "(ILjava/lang/Integer;IZLnI/a;Landroidx/compose/ui/d;LU0/m;II)V", "purchasehistory-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class P {
    public static final void d(boolean z10, C15987c<? extends c.d> cVar, C17642l<? super c.d, C16807N> lVar, C4889m mVar, int i10) {
        int i11;
        int i12;
        boolean z11;
        boolean z12 = z10;
        C15987c<? extends c.d> cVar2 = cVar;
        C17642l<? super c.d, C16807N> lVar2 = lVar;
        int i13 = i10;
        C17542s.j(cVar2, "actions");
        C17542s.j(lVar2, "onActionClicked");
        C4889m k10 = mVar.k(1608196940);
        if ((i13 & 6) == 0) {
            i11 = (k10.b(z12) ? 4 : 2) | i13;
        } else {
            i11 = i13;
        }
        if ((i13 & 48) == 0) {
            i11 |= k10.F(cVar2) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i11 |= k10.F(lVar2) ? 256 : 128;
        }
        int i14 = i11;
        if ((i14 & 147) != 146 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(1608196940, i14, -1, "com.ingka.ikea.app.purchasehistory.impl.presentation.compose.ManageOrderContent (ManageOrderContent.kt:36)");
            }
            d a10 = C5116k1.a(d.f18749a, "MANAGE_ORDER_CONTAINER_TEST_TAG");
            boolean z13 = false;
            I a11 = C5080k.a(C5073d.f18068a.g(), C5437c.f24302a.k(), k10, 0);
            int a12 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            d e10 = androidx.compose.ui.c.e(k10, a10);
            C4504g.a aVar = C4504g.f6515W;
            C17631a<C4504g> a13 = aVar.a();
            if (k10.m() == null) {
                C4883j.c();
            }
            k10.I();
            if (k10.i()) {
                k10.p(a13);
            } else {
                k10.t();
            }
            C4889m a14 = F1.a(k10);
            F1.c(a14, a11, aVar.c());
            F1.c(a14, s10, aVar.e());
            p<C4504g, Integer, C16807N> b10 = aVar.b();
            if (a14.i() || !C17542s.e(a14.D(), Integer.valueOf(a12))) {
                a14.u(Integer.valueOf(a12));
                a14.w(Integer.valueOf(a12), b10);
            }
            F1.c(a14, e10, aVar.d());
            C5862h hVar = C5862h.f28810a;
            C10573g1.P(j.b(C12272a.f105800a1, k10, 0), k10, 0);
            k10.W(-539802572);
            for (c.d dVar : cVar) {
                boolean z14 = true;
                boolean z15 = (!z12 || !(dVar instanceof c.d.e)) ? z13 : true;
                k10.W(-539798676);
                if (!z15) {
                    int d10 = Q.d(dVar);
                    Integer c10 = Q.c(dVar);
                    int b11 = Q.b(dVar);
                    boolean a15 = dVar.a();
                    k10.W(2126515692);
                    if ((i14 & 896) != 256) {
                        z14 = z13;
                    }
                    boolean F10 = z14 | k10.F(dVar);
                    Object D10 = k10.D();
                    if (F10 || D10 == C4889m.f14007a.a()) {
                        D10 = new M(lVar2, dVar);
                        k10.u(D10);
                    }
                    k10.P();
                    z11 = z13;
                    i12 = i14;
                    g(d10, c10, b11, a15, (C17631a) D10, C5116k1.a(d.f18749a, i(dVar)), k10, 0, 0);
                } else {
                    z11 = z13;
                    i12 = i14;
                }
                k10.P();
                z13 = z11;
                i14 = i12;
            }
            k10.P();
            k10.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new N(z12, cVar2, lVar2, i13));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N e(C17642l lVar, c.d dVar) {
        lVar.invoke(dVar);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N f(boolean z10, C15987c cVar, C17642l lVar, int i10, C4889m mVar, int i11) {
        d(z10, cVar, lVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:54:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0165  */
    /* JADX WARNING: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void g(int r25, java.lang.Integer r26, int r27, boolean r28, nI.C17631a<XH.C16807N> r29, androidx.compose.ui.d r30, U0.C4889m r31, int r32, int r33) {
        /*
            r1 = r25
            r2 = r26
            r0 = r28
            r14 = r32
            r3 = 520584182(0x1f077bf6, float:2.86899E-20)
            r4 = r31
            U0.m r7 = r4.k(r3)
            r4 = r33 & 1
            if (r4 == 0) goto L_0x0018
            r4 = r14 | 6
            goto L_0x0028
        L_0x0018:
            r4 = r14 & 6
            if (r4 != 0) goto L_0x0027
            boolean r4 = r7.d(r1)
            if (r4 == 0) goto L_0x0024
            r4 = 4
            goto L_0x0025
        L_0x0024:
            r4 = 2
        L_0x0025:
            r4 = r4 | r14
            goto L_0x0028
        L_0x0027:
            r4 = r14
        L_0x0028:
            r5 = r33 & 2
            if (r5 == 0) goto L_0x002f
            r4 = r4 | 48
            goto L_0x003f
        L_0x002f:
            r5 = r14 & 48
            if (r5 != 0) goto L_0x003f
            boolean r5 = r7.V(r2)
            if (r5 == 0) goto L_0x003c
            r5 = 32
            goto L_0x003e
        L_0x003c:
            r5 = 16
        L_0x003e:
            r4 = r4 | r5
        L_0x003f:
            r5 = r33 & 4
            if (r5 == 0) goto L_0x0048
            r4 = r4 | 384(0x180, float:5.38E-43)
            r6 = r27
            goto L_0x005a
        L_0x0048:
            r5 = r14 & 384(0x180, float:5.38E-43)
            r6 = r27
            if (r5 != 0) goto L_0x005a
            boolean r5 = r7.d(r6)
            if (r5 == 0) goto L_0x0057
            r5 = 256(0x100, float:3.59E-43)
            goto L_0x0059
        L_0x0057:
            r5 = 128(0x80, float:1.794E-43)
        L_0x0059:
            r4 = r4 | r5
        L_0x005a:
            r5 = r33 & 8
            if (r5 == 0) goto L_0x0061
            r4 = r4 | 3072(0xc00, float:4.305E-42)
            goto L_0x0071
        L_0x0061:
            r5 = r14 & 3072(0xc00, float:4.305E-42)
            if (r5 != 0) goto L_0x0071
            boolean r5 = r7.b(r0)
            if (r5 == 0) goto L_0x006e
            r5 = 2048(0x800, float:2.87E-42)
            goto L_0x0070
        L_0x006e:
            r5 = 1024(0x400, float:1.435E-42)
        L_0x0070:
            r4 = r4 | r5
        L_0x0071:
            r5 = r33 & 16
            if (r5 == 0) goto L_0x007a
            r4 = r4 | 24576(0x6000, float:3.4438E-41)
        L_0x0077:
            r5 = r29
            goto L_0x008c
        L_0x007a:
            r5 = r14 & 24576(0x6000, float:3.4438E-41)
            if (r5 != 0) goto L_0x0077
            r5 = r29
            boolean r8 = r7.F(r5)
            if (r8 == 0) goto L_0x0089
            r8 = 16384(0x4000, float:2.2959E-41)
            goto L_0x008b
        L_0x0089:
            r8 = 8192(0x2000, float:1.14794E-41)
        L_0x008b:
            r4 = r4 | r8
        L_0x008c:
            r8 = r33 & 32
            r9 = 196608(0x30000, float:2.75506E-40)
            if (r8 == 0) goto L_0x0096
            r4 = r4 | r9
        L_0x0093:
            r9 = r30
            goto L_0x00a7
        L_0x0096:
            r9 = r9 & r14
            if (r9 != 0) goto L_0x0093
            r9 = r30
            boolean r10 = r7.V(r9)
            if (r10 == 0) goto L_0x00a4
            r10 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00a6
        L_0x00a4:
            r10 = 65536(0x10000, float:9.18355E-41)
        L_0x00a6:
            r4 = r4 | r10
        L_0x00a7:
            r10 = 74899(0x12493, float:1.04956E-40)
            r10 = r10 & r4
            r11 = 74898(0x12492, float:1.04954E-40)
            if (r10 != r11) goto L_0x00bf
            boolean r10 = r7.l()
            if (r10 != 0) goto L_0x00b7
            goto L_0x00bf
        L_0x00b7:
            r7.L()
            r20 = r7
            r6 = r9
            goto L_0x015f
        L_0x00bf:
            if (r8 == 0) goto L_0x00c6
            androidx.compose.ui.d$a r8 = androidx.compose.ui.d.f18749a
            r22 = r8
            goto L_0x00c8
        L_0x00c6:
            r22 = r9
        L_0x00c8:
            boolean r8 = U0.C4895p.J()
            if (r8 == 0) goto L_0x00d4
            r8 = -1
            java.lang.String r9 = "com.ingka.ikea.app.purchasehistory.impl.presentation.compose.ManageOrderEntryPoint (ManageOrderContent.kt:78)"
            U0.C4895p.S(r3, r4, r8, r9)
        L_0x00d4:
            r3 = r4 & 14
            java.lang.String r3 = J1.j.b(r1, r7, r3)
            r8 = -668020542(0xffffffffd82ed0c2, float:-7.6884652E14)
            r7.W(r8)
            r8 = 0
            if (r2 != 0) goto L_0x00e6
            r23 = r8
            goto L_0x00f1
        L_0x00e6:
            int r9 = r26.intValue()
            r10 = 0
            java.lang.String r9 = J1.j.b(r9, r7, r10)
            r23 = r9
        L_0x00f1:
            r7.P()
            SC.c1$a r24 = new SC.c1$a
            r9 = -668013363(0xffffffffd82eeccd, float:-7.693283E14)
            r7.W(r9)
            if (r0 == 0) goto L_0x0101
        L_0x00fe:
            r19 = r8
            goto L_0x0112
        L_0x0101:
            tK.v r8 = tK.C18030v.f147664a
            int r9 = tK.C18030v.f147665b
            tK.h r8 = r8.a(r7, r9)
            long r8 = r8.K()
            p1.v0 r8 = p1.C5747v0.k(r8)
            goto L_0x00fe
        L_0x0112:
            r7.P()
            r20 = 4
            r21 = 0
            r17 = 0
            r18 = 0
            r15 = r24
            r16 = r27
            r15.<init>(r16, r17, r18, r19, r20, r21)
            SC.b1$d r8 = SC.C13569b1.d.f116148b
            int r9 = r4 >> 9
            r9 = r9 & 1008(0x3f0, float:1.413E-42)
            int r10 = SC.C13573c1.a.f116164f
            int r10 = r10 << 12
            r9 = r9 | r10
            int r10 = SC.C13569b1.d.f116149c
            int r10 = r10 << 15
            r17 = r9 | r10
            int r4 = r4 >> 6
            r4 = r4 & 112(0x70, float:1.57E-43)
            r18 = r4 | 6
            r19 = 5056(0x13c0, float:7.085E-42)
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 1
            r15 = 0
            r4 = r29
            r5 = r22
            r6 = r23
            r20 = r7
            r7 = r24
            r14 = r28
            r16 = r20
            SC.C13585f1.c(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            boolean r3 = U0.C4895p.J()
            if (r3 == 0) goto L_0x015d
            U0.C4895p.R()
        L_0x015d:
            r6 = r22
        L_0x015f:
            U0.Y0 r9 = r20.n()
            if (r9 == 0) goto L_0x017c
            Ai.O r10 = new Ai.O
            r0 = r10
            r1 = r25
            r2 = r26
            r3 = r27
            r4 = r28
            r5 = r29
            r7 = r32
            r8 = r33
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.a(r10)
        L_0x017c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Ai.P.g(int, java.lang.Integer, int, boolean, nI.a, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N h(int i10, Integer num, int i11, boolean z10, C17631a aVar, d dVar, int i12, int i13, C4889m mVar, int i14) {
        g(i10, num, i11, z10, aVar, dVar, mVar, M0.a(i12 | 1), i13);
        return C16807N.f139792a;
    }

    private static final String i(c.d dVar) {
        if (dVar instanceof c.d.b) {
            return "MANAGE_ORDER_CANCEL_ORDER_TEST_TAG";
        }
        if (dVar instanceof c.d.C2665c) {
            return "MANAGE_ORDER_EXPRESS_RETURN_TEST_TAG";
        }
        if (dVar instanceof c.d.e) {
            return "MANAGE_ORDER_RESCHEDULE_TEST_TAG";
        }
        if (dVar instanceof c.d.f) {
            return "MANAGE_SHOW_RECEIPT";
        }
        if (dVar instanceof c.d.a) {
            return "MANAGE_ASSEMBLY_TEST_TAG";
        }
        throw new t();
    }
}
