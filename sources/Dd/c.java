package Dd;

import Jd.i;
import U0.C4889m;
import U0.M0;
import XH.C16807N;
import androidx.compose.ui.d;
import i1.C5437c;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a+\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LJd/i;", "storeViewModel", "Landroidx/compose/ui/d;", "modifier", "Li1/c;", "contentAlignment", "LXH/N;", "c", "(LJd/i;Landroidx/compose/ui/d;Li1/c;LU0/m;II)V", "KompassMap_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class c {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v0, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v3, resolved type: androidx.compose.ui.d$a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x018c  */
    /* JADX WARNING: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void c(Jd.i r26, androidx.compose.ui.d r27, i1.C5437c r28, U0.C4889m r29, int r30, int r31) {
        /*
            r1 = r26
            r4 = r30
            r0 = 4
            java.lang.String r2 = "storeViewModel"
            kotlin.jvm.internal.C17542s.j(r1, r2)
            r2 = 1994419406(0x76e06cce, float:2.27594E33)
            r3 = r29
            U0.m r3 = r3.k(r2)
            r5 = r31 & 1
            r6 = 2
            if (r5 == 0) goto L_0x001b
            r5 = r4 | 6
            goto L_0x002b
        L_0x001b:
            r5 = r4 & 6
            if (r5 != 0) goto L_0x002a
            boolean r5 = r3.F(r1)
            if (r5 == 0) goto L_0x0027
            r5 = r0
            goto L_0x0028
        L_0x0027:
            r5 = r6
        L_0x0028:
            r5 = r5 | r4
            goto L_0x002b
        L_0x002a:
            r5 = r4
        L_0x002b:
            r7 = r31 & 2
            if (r7 == 0) goto L_0x0034
            r5 = r5 | 48
        L_0x0031:
            r8 = r27
            goto L_0x0046
        L_0x0034:
            r8 = r4 & 48
            if (r8 != 0) goto L_0x0031
            r8 = r27
            boolean r9 = r3.V(r8)
            if (r9 == 0) goto L_0x0043
            r9 = 32
            goto L_0x0045
        L_0x0043:
            r9 = 16
        L_0x0045:
            r5 = r5 | r9
        L_0x0046:
            r0 = r31 & 4
            if (r0 == 0) goto L_0x004f
            r5 = r5 | 384(0x180, float:5.38E-43)
        L_0x004c:
            r9 = r28
            goto L_0x0061
        L_0x004f:
            r9 = r4 & 384(0x180, float:5.38E-43)
            if (r9 != 0) goto L_0x004c
            r9 = r28
            boolean r10 = r3.V(r9)
            if (r10 == 0) goto L_0x005e
            r10 = 256(0x100, float:3.59E-43)
            goto L_0x0060
        L_0x005e:
            r10 = 128(0x80, float:1.794E-43)
        L_0x0060:
            r5 = r5 | r10
        L_0x0061:
            r10 = r5 & 147(0x93, float:2.06E-43)
            r11 = 146(0x92, float:2.05E-43)
            if (r10 != r11) goto L_0x0074
            boolean r10 = r3.l()
            if (r10 != 0) goto L_0x006e
            goto L_0x0074
        L_0x006e:
            r3.L()
            r2 = r8
            goto L_0x0186
        L_0x0074:
            if (r7 == 0) goto L_0x007a
            androidx.compose.ui.d$a r7 = androidx.compose.ui.d.f18749a
            r15 = r7
            goto L_0x007b
        L_0x007a:
            r15 = r8
        L_0x007b:
            if (r0 == 0) goto L_0x0084
            i1.c$a r0 = i1.C5437c.f24302a
            i1.c r0 = r0.c()
            goto L_0x0085
        L_0x0084:
            r0 = r9
        L_0x0085:
            boolean r7 = U0.C4895p.J()
            if (r7 == 0) goto L_0x0091
            r7 = -1
            java.lang.String r8 = "com.ikea.kompassmap.ui.components.CenterButton (CenterButton.kt:23)"
            U0.C4895p.S(r2, r5, r7, r8)
        L_0x0091:
            r2 = 0
            E1.I r5 = androidx.compose.foundation.layout.C5077h.h(r0, r2)
            int r2 = U0.C4883j.a(r3, r2)
            U0.y r7 = r3.s()
            androidx.compose.ui.d r8 = androidx.compose.ui.c.e(r3, r15)
            G1.g$a r9 = G1.C4504g.f6515W
            nI.a r10 = r9.a()
            U0.f r11 = r3.m()
            if (r11 != 0) goto L_0x00b1
            U0.C4883j.c()
        L_0x00b1:
            r3.I()
            boolean r11 = r3.i()
            if (r11 == 0) goto L_0x00be
            r3.p(r10)
            goto L_0x00c1
        L_0x00be:
            r3.t()
        L_0x00c1:
            U0.m r10 = U0.F1.a(r3)
            nI.p r11 = r9.c()
            U0.F1.c(r10, r5, r11)
            nI.p r5 = r9.e()
            U0.F1.c(r10, r7, r5)
            nI.p r5 = r9.b()
            boolean r7 = r10.i()
            if (r7 != 0) goto L_0x00eb
            java.lang.Object r7 = r10.D()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r2)
            boolean r7 = kotlin.jvm.internal.C17542s.e(r7, r11)
            if (r7 != 0) goto L_0x00f9
        L_0x00eb:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r2)
            r10.u(r7)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r10.w(r2, r5)
        L_0x00f9:
            nI.p r2 = r9.d()
            U0.F1.c(r10, r8, r2)
            androidx.compose.foundation.layout.j r2 = androidx.compose.foundation.layout.C5079j.f18125a
            uK.c r2 = uK.C18148c.Crosshair
            int r5 = r2.m()
            wK.m3$g r9 = wK.C18405m3.g.f151252b
            wK.k3 r10 = wK.C18381k3.Small
            androidx.compose.ui.d$a r16 = androidx.compose.ui.d.f18749a
            float r2 = (float) r6
            float r17 = c2.h.B(r2)
            r2 = 50
            A0.f r18 = A0.g.a(r2)
            r24 = 28
            r25 = 0
            r19 = 0
            r20 = 0
            r22 = 0
            androidx.compose.ui.d r2 = m1.m.b(r16, r17, r18, r19, r20, r22, r24, r25)
            tK.v r6 = tK.C18030v.f147664a
            int r7 = tK.C18030v.f147665b
            tK.h r6 = r6.a(r3, r7)
            long r6 = r6.U()
            A0.f r8 = A0.g.h()
            androidx.compose.ui.d r7 = androidx.compose.foundation.b.c(r2, r6, r8)
            r2 = 1635801861(0x61805b05, float:2.9596774E20)
            r3.W(r2)
            boolean r2 = r3.F(r1)
            java.lang.Object r6 = r3.D()
            if (r2 != 0) goto L_0x0153
            U0.m$a r2 = U0.C4889m.f14007a
            java.lang.Object r2 = r2.a()
            if (r6 != r2) goto L_0x015b
        L_0x0153:
            Dd.a r6 = new Dd.a
            r6.<init>(r1)
            r3.u(r6)
        L_0x015b:
            r13 = r6
            nI.a r13 = (nI.C17631a) r13
            r3.P()
            int r2 = wK.C18405m3.g.f151253c
            int r2 = r2 << 12
            r6 = 12779568(0xc30030, float:1.7907989E-38)
            r2 = r2 | r6
            r16 = 72
            java.lang.String r6 = "Center Map Button"
            r8 = 0
            r11 = 0
            r12 = 0
            r14 = r3
            r17 = r15
            r15 = r2
            wK.C18357i3.c(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r3.x()
            boolean r2 = U0.C4895p.J()
            if (r2 == 0) goto L_0x0183
            U0.C4895p.R()
        L_0x0183:
            r9 = r0
            r2 = r17
        L_0x0186:
            U0.Y0 r6 = r3.n()
            if (r6 == 0) goto L_0x019c
            Dd.b r7 = new Dd.b
            r0 = r7
            r1 = r26
            r3 = r9
            r4 = r30
            r5 = r31
            r0.<init>(r1, r2, r3, r4, r5)
            r6.a(r7)
        L_0x019c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Dd.c.c(Jd.i, androidx.compose.ui.d, i1.c, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N d(i iVar) {
        iVar.J();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N e(i iVar, d dVar, C5437c cVar, int i10, int i11, C4889m mVar, int i12) {
        c(iVar, dVar, cVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
