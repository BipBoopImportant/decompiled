package zf;

import J1.j;
import N1.P;
import Oo.b;
import S1.C;
import S1.C4820m;
import S1.C4830x;
import SC.C13607l;
import SC.C13617n1;
import SC.K0;
import SC.L;
import SC.M;
import SC.N;
import SC.Y0;
import TC.C13679b;
import U0.C4889m;
import U0.C4895p;
import U0.C4899r0;
import U0.M0;
import XH.C16807N;
import XH.t;
import Y1.f;
import Y1.k;
import androidx.compose.foundation.layout.D;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.C5116k1;
import c2.h;
import c2.r;
import com.google.ar.core.ImageMetadata;
import kotlin.Metadata;
import nI.C17631a;
import nI.C17642l;
import r0.m;
import tK.C18030v;
import zf.C10521f0;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a/\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a\u000f\u0010\t\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\t\u0010\n\u001a\u0017\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u000b\u0010\f\u001a-\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0003¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lzf/f0;", "uiState", "Lkotlin/Function0;", "LXH/N;", "onClicked", "Landroidx/compose/ui/d;", "modifier", "j", "(Lzf/f0;LnI/a;Landroidx/compose/ui/d;LU0/m;II)V", "m", "(LU0/m;I)V", "h", "(Lzf/f0;LU0/m;I)V", "Lc2/h;", "parentWidth", "f", "(Lzf/f0;FLnI/a;LU0/m;I)V", "browse-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: zf.e0  reason: case insensitive filesystem */
public final class C10519e0 {
    private static final void f(C10521f0 f0Var, float f10, C17631a<C16807N> aVar, C4889m mVar, int i10) {
        int i11;
        int i12;
        C4889m mVar2;
        C17631a<C16807N> aVar2;
        C10521f0 f0Var2 = f0Var;
        float f11 = f10;
        C17631a<C16807N> aVar3 = aVar;
        int i13 = i10;
        C4889m k10 = mVar.k(-26250881);
        if ((i13 & 6) == 0) {
            i11 = ((i13 & 8) == 0 ? k10.V(f0Var2) : k10.F(f0Var2) ? 4 : 2) | i13;
        } else {
            i11 = i13;
        }
        if ((i13 & 48) == 0) {
            i11 |= k10.c(f11) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i11 |= k10.F(aVar3) ? 256 : 128;
        }
        if ((i11 & 147) != 146 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-26250881, i11, -1, "com.ingka.ikea.app.browseandsearch.browseV2.compose.ButtonAndProgressSection (InAppUpdateComposables.kt:95)");
            }
            Integer a10 = f0Var.a();
            k10.W(821080289);
            if (a10 != null) {
                L.b(j.b(a10.intValue(), k10, 0), C5116k1.a(d.f18749a, "Button"), false, (N) null, M.Small, false, (Integer) null, (K0) null, (m) null, aVar, k10, ((i11 << 21) & 1879048192) | 24624, 492);
            }
            k10.P();
            if ((f0Var2 instanceof C10521f0.a) || (f0Var2 instanceof C10521f0.b)) {
                mVar2 = k10;
                i12 = i13;
                aVar2 = aVar3;
            } else if (f0Var2 instanceof C10521f0.c) {
                mVar2 = k10;
                i12 = i13;
                aVar2 = aVar3;
                C13617n1.b((d) null, (String) null, ((float) ((C10521f0.c) f0Var2).b()) / 100.0f, (Y0) null, false, f10, k10, (i11 << 12) & ImageMetadata.JPEG_GPS_COORDINATES, 27);
            } else {
                throw new t();
            }
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            mVar2 = k10;
            i12 = i13;
            aVar2 = aVar3;
        }
        U0.Y0 n10 = mVar2.n();
        if (n10 != null) {
            n10.a(new C10513b0(f0Var2, f11, aVar2, i12));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N g(C10521f0 f0Var, float f10, C17631a aVar, int i10, C4889m mVar, int i11) {
        f(f0Var, f10, aVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    private static final void h(C10521f0 f0Var, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        C10521f0 f0Var2 = f0Var;
        int i12 = i10;
        C4889m k10 = mVar.k(-534497501);
        if ((i12 & 6) == 0) {
            i11 = ((i12 & 8) == 0 ? k10.V(f0Var2) : k10.F(f0Var2) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i11 & 3) != 2 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-534497501, i11, -1, "com.ingka.ikea.app.browseandsearch.browseV2.compose.DescriptionSection (InAppUpdateComposables.kt:79)");
            }
            mVar2 = k10;
            C13607l.j(j.b(f0Var.getDescription(), k10, 0), C13679b.a.C2856b.f116680a, C5116k1.a(D.k(d.f18749a, 0.0f, h.B((float) 16), 1, (Object) null), "Description"), C18030v.f147664a.a(k10, C18030v.f147665b).H0(), 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (Y1.j) null, (f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar2, 432, 0, 262128);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            mVar2 = k10;
        }
        U0.Y0 n10 = mVar2.n();
        if (n10 != null) {
            n10.a(new C10515c0(f0Var2, i12));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N i(C10521f0 f0Var, int i10, C4889m mVar, int i11) {
        h(f0Var, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0205  */
    /* JADX WARNING: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void j(zf.C10521f0 r20, nI.C17631a<XH.C16807N> r21, androidx.compose.ui.d r22, U0.C4889m r23, int r24, int r25) {
        /*
            r1 = r20
            r2 = r21
            r4 = r24
            java.lang.String r0 = "uiState"
            kotlin.jvm.internal.C17542s.j(r1, r0)
            java.lang.String r0 = "onClicked"
            kotlin.jvm.internal.C17542s.j(r2, r0)
            r0 = 881843253(0x348fdc35, float:2.6796047E-7)
            r3 = r23
            U0.m r3 = r3.k(r0)
            r5 = r25 & 1
            r6 = 2
            if (r5 == 0) goto L_0x0021
            r5 = r4 | 6
            goto L_0x003a
        L_0x0021:
            r5 = r4 & 6
            if (r5 != 0) goto L_0x0039
            r5 = r4 & 8
            if (r5 != 0) goto L_0x002e
            boolean r5 = r3.V(r1)
            goto L_0x0032
        L_0x002e:
            boolean r5 = r3.F(r1)
        L_0x0032:
            if (r5 == 0) goto L_0x0036
            r5 = 4
            goto L_0x0037
        L_0x0036:
            r5 = r6
        L_0x0037:
            r5 = r5 | r4
            goto L_0x003a
        L_0x0039:
            r5 = r4
        L_0x003a:
            r7 = r25 & 2
            if (r7 == 0) goto L_0x0041
            r5 = r5 | 48
            goto L_0x0051
        L_0x0041:
            r7 = r4 & 48
            if (r7 != 0) goto L_0x0051
            boolean r7 = r3.F(r2)
            if (r7 == 0) goto L_0x004e
            r7 = 32
            goto L_0x0050
        L_0x004e:
            r7 = 16
        L_0x0050:
            r5 = r5 | r7
        L_0x0051:
            r7 = r25 & 4
            if (r7 == 0) goto L_0x005a
            r5 = r5 | 384(0x180, float:5.38E-43)
        L_0x0057:
            r8 = r22
            goto L_0x006c
        L_0x005a:
            r8 = r4 & 384(0x180, float:5.38E-43)
            if (r8 != 0) goto L_0x0057
            r8 = r22
            boolean r9 = r3.V(r8)
            if (r9 == 0) goto L_0x0069
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x006b
        L_0x0069:
            r9 = 128(0x80, float:1.794E-43)
        L_0x006b:
            r5 = r5 | r9
        L_0x006c:
            r9 = r5 & 147(0x93, float:2.06E-43)
            r10 = 146(0x92, float:2.05E-43)
            if (r9 != r10) goto L_0x007f
            boolean r9 = r3.l()
            if (r9 != 0) goto L_0x0079
            goto L_0x007f
        L_0x0079:
            r3.L()
            r7 = r8
            goto L_0x01ff
        L_0x007f:
            if (r7 == 0) goto L_0x0084
            androidx.compose.ui.d$a r7 = androidx.compose.ui.d.f18749a
            goto L_0x0085
        L_0x0084:
            r7 = r8
        L_0x0085:
            boolean r8 = U0.C4895p.J()
            if (r8 == 0) goto L_0x0091
            r8 = -1
            java.lang.String r9 = "com.ingka.ikea.app.browseandsearch.browseV2.compose.InAppUpdateComposable (InAppUpdateComposables.kt:40)"
            U0.C4895p.S(r0, r5, r8, r9)
        L_0x0091:
            U0.I0 r0 = androidx.compose.ui.platform.C5100f0.e()
            java.lang.Object r0 = r3.Q(r0)
            c2.d r0 = (c2.d) r0
            r8 = 1724936482(0x66d07122, float:4.9216958E23)
            r3.W(r8)
            java.lang.Object r8 = r3.D()
            U0.m$a r14 = U0.C4889m.f14007a
            java.lang.Object r9 = r14.a()
            r15 = 0
            r13 = 0
            if (r8 != r9) goto L_0x00bf
            float r8 = (float) r13
            float r8 = c2.h.B(r8)
            c2.h r8 = c2.h.m(r8)
            U0.r0 r8 = U0.u1.e(r8, r15, r6, r15)
            r3.u(r8)
        L_0x00bf:
            r12 = r8
            U0.r0 r12 = (U0.C4899r0) r12
            r3.P()
            r8 = 1724940130(0x66d07f62, float:4.92301E23)
            r3.W(r8)
            java.lang.Object r8 = r3.D()
            java.lang.Object r9 = r14.a()
            if (r8 != r9) goto L_0x00e5
            float r8 = (float) r13
            float r8 = c2.h.B(r8)
            c2.h r8 = c2.h.m(r8)
            U0.r0 r8 = U0.u1.e(r8, r15, r6, r15)
            r3.u(r8)
        L_0x00e5:
            r6 = r8
            U0.r0 r6 = (U0.C4899r0) r6
            r3.P()
            tK.v r8 = tK.C18030v.f147664a
            int r9 = tK.C18030v.f147665b
            tK.h r8 = r8.a(r3, r9)
            long r9 = r8.l0()
            r16 = 2
            r17 = 0
            r11 = 0
            r8 = r7
            r22 = r12
            r12 = r16
            r13 = r17
            androidx.compose.ui.d r8 = androidx.compose.foundation.b.d(r8, r9, r11, r12, r13)
            r9 = 24
            float r9 = (float) r9
            float r9 = c2.h.B(r9)
            androidx.compose.ui.d r8 = androidx.compose.foundation.layout.D.i(r8, r9)
            java.lang.Object r9 = r22.getValue()
            c2.h r9 = (c2.h) r9
            float r9 = r9.G()
            r10 = 0
            r11 = 1
            androidx.compose.ui.d r8 = androidx.compose.foundation.layout.J.b(r8, r10, r9, r11, r15)
            r9 = 1724948282(0x66d09f3a, float:4.9259472E23)
            r3.W(r9)
            boolean r9 = r3.V(r0)
            java.lang.Object r10 = r3.D()
            if (r9 != 0) goto L_0x0138
            java.lang.Object r9 = r14.a()
            if (r10 != r9) goto L_0x0142
        L_0x0138:
            zf.Z r10 = new zf.Z
            r9 = r22
            r10.<init>(r0, r9, r6)
            r3.u(r10)
        L_0x0142:
            nI.l r10 = (nI.C17642l) r10
            r3.P()
            androidx.compose.ui.d r0 = androidx.compose.ui.layout.g.a(r8, r10)
            androidx.compose.foundation.layout.d r8 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r8 = r8.g()
            i1.c$a r9 = i1.C5437c.f24302a
            i1.c$b r9 = r9.k()
            r10 = 0
            E1.I r8 = androidx.compose.foundation.layout.C5080k.a(r8, r9, r3, r10)
            int r9 = U0.C4883j.a(r3, r10)
            U0.y r11 = r3.s()
            androidx.compose.ui.d r0 = androidx.compose.ui.c.e(r3, r0)
            G1.g$a r12 = G1.C4504g.f6515W
            nI.a r13 = r12.a()
            U0.f r14 = r3.m()
            if (r14 != 0) goto L_0x0177
            U0.C4883j.c()
        L_0x0177:
            r3.I()
            boolean r14 = r3.i()
            if (r14 == 0) goto L_0x0184
            r3.p(r13)
            goto L_0x0187
        L_0x0184:
            r3.t()
        L_0x0187:
            U0.m r13 = U0.F1.a(r3)
            nI.p r14 = r12.c()
            U0.F1.c(r13, r8, r14)
            nI.p r8 = r12.e()
            U0.F1.c(r13, r11, r8)
            nI.p r8 = r12.b()
            boolean r11 = r13.i()
            if (r11 != 0) goto L_0x01b1
            java.lang.Object r11 = r13.D()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r9)
            boolean r11 = kotlin.jvm.internal.C17542s.e(r11, r14)
            if (r11 != 0) goto L_0x01bf
        L_0x01b1:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r9)
            r13.u(r11)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r13.w(r9, r8)
        L_0x01bf:
            nI.p r8 = r12.d()
            U0.F1.c(r13, r0, r8)
            s0.h r14 = s0.C5862h.f28810a
            m(r3, r10)
            r0 = r5 & 14
            h(r1, r3, r0)
            androidx.compose.ui.d$a r15 = androidx.compose.ui.d.f18749a
            r18 = 2
            r19 = 0
            r16 = 1065353216(0x3f800000, float:1.0)
            r17 = 0
            androidx.compose.ui.d r8 = s0.C5861g.c(r14, r15, r16, r17, r18, r19)
            s0.C5844O.a(r8, r3, r10)
            java.lang.Object r6 = r6.getValue()
            c2.h r6 = (c2.h) r6
            float r6 = r6.G()
            int r5 = r5 << 3
            r5 = r5 & 896(0x380, float:1.256E-42)
            r0 = r0 | r5
            f(r1, r6, r2, r3, r0)
            r3.x()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x01ff
            U0.C4895p.R()
        L_0x01ff:
            U0.Y0 r6 = r3.n()
            if (r6 == 0) goto L_0x0217
            zf.a0 r8 = new zf.a0
            r0 = r8
            r1 = r20
            r2 = r21
            r3 = r7
            r4 = r24
            r5 = r25
            r0.<init>(r1, r2, r3, r4, r5)
            r6.a(r8)
        L_0x0217:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zf.C10519e0.j(zf.f0, nI.a, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N k(c2.d dVar, C4899r0 r0Var, C4899r0 r0Var2, r rVar) {
        float H10 = dVar.H(r.g(rVar.k()));
        if (h.v(H10, ((h) r0Var.getValue()).G()) > 0) {
            r0Var.setValue(h.m(H10));
        }
        r0Var2.setValue(h.m(dVar.H(r.h(rVar.k()))));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N l(C10521f0 f0Var, C17631a aVar, d dVar, int i10, int i11, C4889m mVar, int i12) {
        j(f0Var, aVar, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    private static final void m(C4889m mVar, int i10) {
        C4889m mVar2;
        int i11 = i10;
        C4889m k10 = mVar.k(-1867829465);
        if (i11 != 0 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-1867829465, i11, -1, "com.ingka.ikea.app.browseandsearch.browseV2.compose.TitleSection (InAppUpdateComposables.kt:70)");
            }
            mVar2 = k10;
            C13607l.j(j.b(b.f84582a4, k10, 0), C13679b.C2857b.C2858b.f116684a, C5116k1.a(d.f18749a, "Title"), 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (Y1.j) null, (f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar2, 432, 0, 262136);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            mVar2 = k10;
        }
        U0.Y0 n10 = mVar2.n();
        if (n10 != null) {
            n10.a(new C10517d0(i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N n(int i10, C4889m mVar, int i11) {
        m(mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }
}
