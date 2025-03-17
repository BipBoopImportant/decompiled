package MC;

import U0.C4889m;
import U0.M0;
import XH.C16807N;
import androidx.compose.ui.d;
import gs.e;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import mp.C11590c;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a+\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lmp/c;", "source", "Landroidx/compose/ui/d;", "modifier", "", "maxLines", "LXH/N;", "c", "(Lmp/c;Landroidx/compose/ui/d;ILU0/m;II)V", "inspiration_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: MC.c  reason: case insensitive filesystem */
public final class C13197c {
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0229  */
    /* JADX WARNING: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void c(mp.C11590c r34, androidx.compose.ui.d r35, int r36, U0.C4889m r37, int r38, int r39) {
        /*
            r1 = r34
            r4 = r38
            r0 = 2
            r2 = 4
            r3 = 6
            java.lang.String r5 = "source"
            kotlin.jvm.internal.C17542s.j(r1, r5)
            r5 = -1713151150(0xffffffff99e36352, float:-2.3511365E-23)
            r6 = r37
            U0.m r15 = r6.k(r5)
            r6 = r39 & 1
            if (r6 == 0) goto L_0x001c
            r6 = r4 | 6
            goto L_0x002c
        L_0x001c:
            r6 = r4 & 6
            if (r6 != 0) goto L_0x002b
            boolean r6 = r15.F(r1)
            if (r6 == 0) goto L_0x0028
            r6 = r2
            goto L_0x0029
        L_0x0028:
            r6 = r0
        L_0x0029:
            r6 = r6 | r4
            goto L_0x002c
        L_0x002b:
            r6 = r4
        L_0x002c:
            r0 = r39 & 2
            r7 = 32
            if (r0 == 0) goto L_0x0037
            r6 = r6 | 48
        L_0x0034:
            r8 = r35
            goto L_0x0048
        L_0x0037:
            r8 = r4 & 48
            if (r8 != 0) goto L_0x0034
            r8 = r35
            boolean r9 = r15.V(r8)
            if (r9 == 0) goto L_0x0045
            r9 = r7
            goto L_0x0047
        L_0x0045:
            r9 = 16
        L_0x0047:
            r6 = r6 | r9
        L_0x0048:
            r2 = r39 & 4
            if (r2 == 0) goto L_0x0052
            r6 = r6 | 384(0x180, float:5.38E-43)
        L_0x004e:
            r9 = r36
        L_0x0050:
            r14 = r6
            goto L_0x0065
        L_0x0052:
            r9 = r4 & 384(0x180, float:5.38E-43)
            if (r9 != 0) goto L_0x004e
            r9 = r36
            boolean r10 = r15.d(r9)
            if (r10 == 0) goto L_0x0061
            r10 = 256(0x100, float:3.59E-43)
            goto L_0x0063
        L_0x0061:
            r10 = 128(0x80, float:1.794E-43)
        L_0x0063:
            r6 = r6 | r10
            goto L_0x0050
        L_0x0065:
            r6 = r14 & 147(0x93, float:2.06E-43)
            r10 = 146(0x92, float:2.05E-43)
            if (r6 != r10) goto L_0x0079
            boolean r6 = r15.l()
            if (r6 != 0) goto L_0x0072
            goto L_0x0079
        L_0x0072:
            r15.L()
            r2 = r8
            r3 = r15
            goto L_0x0223
        L_0x0079:
            if (r0 == 0) goto L_0x007e
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            goto L_0x007f
        L_0x007e:
            r0 = r8
        L_0x007f:
            if (r2 == 0) goto L_0x0085
            r2 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x0086
        L_0x0085:
            r2 = r9
        L_0x0086:
            boolean r6 = U0.C4895p.J()
            if (r6 == 0) goto L_0x0092
            r6 = -1
            java.lang.String r8 = "com.ingka.ikea.ui.inspiration.ImageSource (ImageSource.kt:30)"
            U0.C4895p.S(r5, r14, r6, r8)
        L_0x0092:
            androidx.compose.foundation.layout.d r5 = androidx.compose.foundation.layout.C5073d.f18068a
            float r3 = (float) r3
            float r3 = c2.h.B(r3)
            i1.c$a r6 = i1.C5437c.f24302a
            i1.c$b r8 = r6.k()
            androidx.compose.foundation.layout.d$e r3 = r5.o(r3, r8)
            i1.c$c r5 = r6.i()
            tK.v r13 = tK.C18030v.f147664a
            int r12 = tK.C18030v.f147665b
            tK.h r6 = r13.a(r15, r12)
            long r16 = r6.k0()
            r22 = 14
            r23 = 0
            r18 = 1060320051(0x3f333333, float:0.7)
            r19 = 0
            r20 = 0
            r21 = 0
            long r8 = p1.C5747v0.o(r16, r18, r19, r20, r21, r22, r23)
            float r6 = (float) r7
            float r6 = c2.h.B(r6)
            A0.f r6 = A0.g.e(r6)
            androidx.compose.ui.d r6 = androidx.compose.foundation.b.c(r0, r8, r6)
            r7 = 10
            float r7 = (float) r7
            float r7 = c2.h.B(r7)
            androidx.compose.ui.d r6 = androidx.compose.foundation.layout.D.i(r6, r7)
            r7 = 54
            E1.I r3 = androidx.compose.foundation.layout.G.b(r3, r5, r15, r7)
            r5 = 0
            int r7 = U0.C4883j.a(r15, r5)
            U0.y r8 = r15.s()
            androidx.compose.ui.d r6 = androidx.compose.ui.c.e(r15, r6)
            G1.g$a r9 = G1.C4504g.f6515W
            nI.a r10 = r9.a()
            U0.f r11 = r15.m()
            if (r11 != 0) goto L_0x00fe
            U0.C4883j.c()
        L_0x00fe:
            r15.I()
            boolean r11 = r15.i()
            if (r11 == 0) goto L_0x010b
            r15.p(r10)
            goto L_0x010e
        L_0x010b:
            r15.t()
        L_0x010e:
            U0.m r10 = U0.F1.a(r15)
            nI.p r11 = r9.c()
            U0.F1.c(r10, r3, r11)
            nI.p r3 = r9.e()
            U0.F1.c(r10, r8, r3)
            nI.p r3 = r9.b()
            boolean r8 = r10.i()
            if (r8 != 0) goto L_0x0138
            java.lang.Object r8 = r10.D()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r7)
            boolean r8 = kotlin.jvm.internal.C17542s.e(r8, r11)
            if (r8 != 0) goto L_0x0146
        L_0x0138:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            r10.u(r8)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r10.w(r7, r3)
        L_0x0146:
            nI.p r3 = r9.d()
            U0.F1.c(r10, r6, r3)
            s0.N r3 = s0.C5843N.f28726a
            r3 = 1136535258(0x43be26da, float:380.30353)
            r15.W(r3)
            boolean r3 = r15.F(r1)
            java.lang.Object r6 = r15.D()
            if (r3 != 0) goto L_0x0167
            U0.m$a r3 = U0.C4889m.f14007a
            java.lang.Object r3 = r3.a()
            if (r6 != r3) goto L_0x016f
        L_0x0167:
            MC.a r6 = new MC.a
            r6.<init>(r1)
            r15.u(r6)
        L_0x016f:
            nI.l r6 = (nI.C17642l) r6
            r15.P()
            gs.e r6 = gs.f.a(r6, r15, r5)
            com.ingka.ikea.core.model.Image r3 = r34.a()
            java.lang.String r7 = r3.A0()
            androidx.compose.ui.d$a r3 = androidx.compose.ui.d.f18749a
            r5 = 24
            float r5 = (float) r5
            float r5 = c2.h.B(r5)
            androidx.compose.ui.d r8 = androidx.compose.foundation.layout.J.t(r3, r5)
            p1.w0$a r16 = p1.C5749w0.f27365b
            tK.h r3 = r13.a(r15, r12)
            long r17 = r3.p0()
            r20 = 2
            r21 = 0
            r19 = 0
            p1.w0 r3 = p1.C5749w0.a.b(r16, r17, r19, r20, r21)
            int r5 = gs.e.f97946h
            r5 = r5 | 384(0x180, float:5.38E-43)
            r20 = 1528(0x5f8, float:2.141E-42)
            r9 = 0
            r10 = 0
            r11 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r21 = 0
            r32 = r12
            r12 = r16
            r33 = r13
            r13 = r17
            r22 = r14
            r14 = r18
            r35 = r15
            r15 = r3
            r16 = r21
            r17 = r35
            r18 = r5
            gs.C11352b.b(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            java.lang.String r6 = r34.b()
            Y1.t$a r3 = Y1.t.f14827a
            int r23 = r3.b()
            TC.b$a$b r7 = TC.C13679b.a.C2856b.f116680a
            S1.C$a r3 = S1.C.f13316b
            S1.C r14 = r3.a()
            r3 = r35
            r8 = r32
            r5 = r33
            tK.h r5 = r5.a(r3, r8)
            long r9 = r5.G0()
            int r5 = r22 << 9
            r8 = 458752(0x70000, float:6.42848E-40)
            r5 = r5 & r8
            r5 = r5 | 3072(0xc00, float:4.305E-42)
            r30 = r5
            r31 = 221108(0x35fb4, float:3.09838E-40)
            r8 = 0
            r11 = 0
            r13 = 0
            r15 = 0
            r16 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r24 = 0
            r26 = 0
            r27 = 0
            r29 = 1572912(0x180030, float:2.204119E-39)
            r25 = r2
            r28 = r3
            SC.C13607l.j(r6, r7, r8, r9, r11, r13, r14, r15, r16, r18, r19, r20, r21, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            r3.x()
            boolean r5 = U0.C4895p.J()
            if (r5 == 0) goto L_0x0221
            U0.C4895p.R()
        L_0x0221:
            r9 = r2
            r2 = r0
        L_0x0223:
            U0.Y0 r6 = r3.n()
            if (r6 == 0) goto L_0x0239
            MC.b r7 = new MC.b
            r0 = r7
            r1 = r34
            r3 = r9
            r4 = r38
            r5 = r39
            r0.<init>(r1, r2, r3, r4, r5)
            r6.a(r7)
        L_0x0239:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: MC.C13197c.c(mp.c, androidx.compose.ui.d, int, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N d(C11590c cVar, e.a aVar) {
        C17542s.j(aVar, "$this$ikeaImageRequest");
        aVar.j(cVar.a().getUrl());
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N e(C11590c cVar, d dVar, int i10, int i11, int i12, C4889m mVar, int i13) {
        c(cVar, dVar, i10, mVar, M0.a(i11 | 1), i12);
        return C16807N.f139792a;
    }
}
