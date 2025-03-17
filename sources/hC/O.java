package HC;

import U0.C4889m;
import U0.M0;
import XH.C16807N;
import androidx.compose.ui.d;
import androidx.compose.ui.graphics.c;
import com.ingka.ikea.core.model.Image;
import gs.e;
import gs.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a)\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"", "sourceName", "Lcom/ingka/ikea/core/model/Image;", "sourceIcon", "Landroidx/compose/ui/d;", "modifier", "LXH/N;", "d", "(Ljava/lang/String;Lcom/ingka/ikea/core/model/Image;Landroidx/compose/ui/d;LU0/m;II)V", "commercial_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class O {
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0245  */
    /* JADX WARNING: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void d(java.lang.String r31, com.ingka.ikea.core.model.Image r32, androidx.compose.ui.d r33, U0.C4889m r34, int r35, int r36) {
        /*
            r0 = r31
            r15 = r32
            r14 = r35
            java.lang.String r1 = "sourceName"
            kotlin.jvm.internal.C17542s.j(r0, r1)
            java.lang.String r1 = "sourceIcon"
            kotlin.jvm.internal.C17542s.j(r15, r1)
            r1 = -948557248(0xffffffffc7762a40, float:-63018.25)
            r2 = r34
            U0.m r13 = r2.k(r1)
            r2 = r36 & 1
            r3 = 2
            if (r2 == 0) goto L_0x0021
            r2 = r14 | 6
            goto L_0x0031
        L_0x0021:
            r2 = r14 & 6
            if (r2 != 0) goto L_0x0030
            boolean r2 = r13.V(r0)
            if (r2 == 0) goto L_0x002d
            r2 = 4
            goto L_0x002e
        L_0x002d:
            r2 = r3
        L_0x002e:
            r2 = r2 | r14
            goto L_0x0031
        L_0x0030:
            r2 = r14
        L_0x0031:
            r4 = r36 & 2
            if (r4 == 0) goto L_0x0038
            r2 = r2 | 48
            goto L_0x0048
        L_0x0038:
            r4 = r14 & 48
            if (r4 != 0) goto L_0x0048
            boolean r4 = r13.F(r15)
            if (r4 == 0) goto L_0x0045
            r4 = 32
            goto L_0x0047
        L_0x0045:
            r4 = 16
        L_0x0047:
            r2 = r2 | r4
        L_0x0048:
            r4 = r36 & 4
            if (r4 == 0) goto L_0x0052
            r2 = r2 | 384(0x180, float:5.38E-43)
        L_0x004e:
            r5 = r33
        L_0x0050:
            r6 = r2
            goto L_0x0065
        L_0x0052:
            r5 = r14 & 384(0x180, float:5.38E-43)
            if (r5 != 0) goto L_0x004e
            r5 = r33
            boolean r6 = r13.V(r5)
            if (r6 == 0) goto L_0x0061
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x0063
        L_0x0061:
            r6 = 128(0x80, float:1.794E-43)
        L_0x0063:
            r2 = r2 | r6
            goto L_0x0050
        L_0x0065:
            r2 = r6 & 147(0x93, float:2.06E-43)
            r7 = 146(0x92, float:2.05E-43)
            if (r2 != r7) goto L_0x007a
            boolean r2 = r13.l()
            if (r2 != 0) goto L_0x0072
            goto L_0x007a
        L_0x0072:
            r13.L()
            r3 = r5
            r27 = r13
            goto L_0x023f
        L_0x007a:
            if (r4 == 0) goto L_0x0080
            androidx.compose.ui.d$a r2 = androidx.compose.ui.d.f18749a
            r12 = r2
            goto L_0x0081
        L_0x0080:
            r12 = r5
        L_0x0081:
            boolean r2 = U0.C4895p.J()
            if (r2 == 0) goto L_0x008d
            r2 = -1
            java.lang.String r4 = "com.ingka.ikea.ui.commercial.UserContentSourcePill (UserContentSourcePill.kt:40)"
            U0.C4895p.S(r1, r6, r2, r4)
        L_0x008d:
            r1 = 40
            float r1 = (float) r1
            float r1 = c2.h.B(r1)
            androidx.compose.ui.d r1 = androidx.compose.foundation.layout.J.i(r12, r1)
            r2 = 60
            float r2 = (float) r2
            float r2 = c2.h.B(r2)
            r4 = 0
            r5 = 0
            androidx.compose.ui.d r1 = androidx.compose.foundation.layout.J.A(r1, r2, r4, r3, r5)
            r2 = 1911442107(0x71ee4abb, float:2.3599288E30)
            r13.W(r2)
            java.lang.Object r2 = r13.D()
            U0.m$a r3 = U0.C4889m.f14007a
            java.lang.Object r4 = r3.a()
            if (r2 != r4) goto L_0x00bf
            HC.L r2 = new HC.L
            r2.<init>()
            r13.u(r2)
        L_0x00bf:
            nI.l r2 = (nI.C17642l) r2
            r13.P()
            androidx.compose.ui.d r1 = androidx.compose.ui.graphics.b.a(r1, r2)
            tK.v r2 = tK.C18030v.f147664a
            int r4 = tK.C18030v.f147665b
            tK.h r5 = r2.a(r13, r4)
            long r7 = r5.x0()
            r5 = 28
            float r5 = (float) r5
            float r5 = c2.h.B(r5)
            A0.f r5 = A0.g.e(r5)
            androidx.compose.ui.d r1 = androidx.compose.foundation.b.c(r1, r7, r5)
            androidx.compose.foundation.layout.d r5 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$e r5 = r5.f()
            i1.c$a r7 = i1.C5437c.f24302a
            i1.c$c r8 = r7.l()
            r9 = 0
            E1.I r5 = androidx.compose.foundation.layout.G.b(r5, r8, r13, r9)
            int r8 = U0.C4883j.a(r13, r9)
            U0.y r10 = r13.s()
            androidx.compose.ui.d r1 = androidx.compose.ui.c.e(r13, r1)
            G1.g$a r11 = G1.C4504g.f6515W
            nI.a r9 = r11.a()
            U0.f r16 = r13.m()
            if (r16 != 0) goto L_0x010f
            U0.C4883j.c()
        L_0x010f:
            r13.I()
            boolean r16 = r13.i()
            if (r16 == 0) goto L_0x011c
            r13.p(r9)
            goto L_0x011f
        L_0x011c:
            r13.t()
        L_0x011f:
            U0.m r9 = U0.F1.a(r13)
            nI.p r0 = r11.c()
            U0.F1.c(r9, r5, r0)
            nI.p r0 = r11.e()
            U0.F1.c(r9, r10, r0)
            nI.p r0 = r11.b()
            boolean r5 = r9.i()
            if (r5 != 0) goto L_0x0149
            java.lang.Object r5 = r9.D()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r8)
            boolean r5 = kotlin.jvm.internal.C17542s.e(r5, r10)
            if (r5 != 0) goto L_0x0157
        L_0x0149:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r8)
            r9.u(r5)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r8)
            r9.w(r5, r0)
        L_0x0157:
            nI.p r0 = r11.d()
            U0.F1.c(r9, r1, r0)
            s0.N r0 = s0.C5843N.f28726a
            r1 = 435470749(0x19f4c19d, float:2.5307208E-23)
            r13.W(r1)
            boolean r1 = r13.F(r15)
            java.lang.Object r5 = r13.D()
            if (r1 != 0) goto L_0x0176
            java.lang.Object r1 = r3.a()
            if (r5 != r1) goto L_0x017e
        L_0x0176:
            HC.M r5 = new HC.M
            r5.<init>(r15)
            r13.u(r5)
        L_0x017e:
            nI.l r5 = (nI.C17642l) r5
            r13.P()
            r1 = 0
            gs.e r16 = gs.f.a(r5, r13, r1)
            java.lang.String r17 = r32.A0()
            androidx.compose.ui.d$a r5 = androidx.compose.ui.d.f18749a
            r1 = 18
            float r1 = (float) r1
            float r19 = c2.h.B(r1)
            r23 = 14
            r24 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r18 = r5
            androidx.compose.ui.d r1 = androidx.compose.foundation.layout.D.m(r18, r19, r20, r21, r22, r23, r24)
            A0.f r3 = A0.g.h()
            androidx.compose.ui.d r1 = m1.e.a(r1, r3)
            r3 = 24
            float r8 = (float) r3
            float r3 = c2.h.B(r8)
            androidx.compose.ui.d r1 = androidx.compose.foundation.layout.J.t(r1, r3)
            i1.c$c r3 = r7.i()
            androidx.compose.ui.d r18 = r0.c(r1, r3)
            int r28 = gs.e.f97946h
            r29 = 0
            r30 = 2040(0x7f8, float:2.859E-42)
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = r13
            gs.C11352b.b(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            tK.h r1 = r2.a(r13, r4)
            long r3 = r1.F0()
            TC.b$b$f r1 = TC.C13679b.C2857b.f.f116688a
            r2 = 8
            float r2 = (float) r2
            float r19 = c2.h.B(r2)
            float r21 = c2.h.B(r8)
            r23 = 10
            r24 = 0
            r20 = 0
            r22 = 0
            r18 = r5
            androidx.compose.ui.d r2 = androidx.compose.foundation.layout.D.m(r18, r19, r20, r21, r22, r23, r24)
            i1.c$c r5 = r7.i()
            androidx.compose.ui.d r2 = r0.c(r2, r5)
            r0 = r6 & 14
            r23 = r0 | 48
            r24 = 0
            r25 = 262128(0x3fff0, float:3.6732E-40)
            r5 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r0 = 0
            r26 = r12
            r12 = r0
            r13 = r0
            r14 = r0
            r16 = 0
            r15 = r16
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r0 = r31
            r22 = r27
            SC.C13607l.j(r0, r1, r2, r3, r5, r7, r8, r9, r10, r12, r13, r14, r15, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r27.x()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x023d
            U0.C4895p.R()
        L_0x023d:
            r3 = r26
        L_0x023f:
            U0.Y0 r6 = r27.n()
            if (r6 == 0) goto L_0x0256
            HC.N r7 = new HC.N
            r0 = r7
            r1 = r31
            r2 = r32
            r4 = r35
            r5 = r36
            r0.<init>(r1, r2, r3, r4, r5)
            r6.a(r7)
        L_0x0256:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: HC.O.d(java.lang.String, com.ingka.ikea.core.model.Image, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N e(c cVar) {
        C17542s.j(cVar, "$this$graphicsLayer");
        cVar.d(0.6f);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N f(Image image, e.a aVar) {
        C17542s.j(aVar, "$this$ikeaImageRequest");
        aVar.j(image.getUrl());
        aVar.l(h.a.XXXS);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N g(String str, Image image, d dVar, int i10, int i11, C4889m mVar, int i12) {
        d(str, image, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
