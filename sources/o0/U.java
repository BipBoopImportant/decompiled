package O0;

import U0.C4889m;
import U0.M0;
import XH.C16807N;
import androidx.compose.ui.d;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import nI.C17631a;
import nI.p;
import r0.m;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aU\u0010\f\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lkotlin/Function0;", "LXH/N;", "onClick", "Landroidx/compose/ui/d;", "modifier", "", "enabled", "LO0/S;", "colors", "Lr0/m;", "interactionSource", "content", "a", "(LnI/a;Landroidx/compose/ui/d;ZLO0/S;Lr0/m;LnI/p;LU0/m;II)V", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class U {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f10005c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ d f10006d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f10007e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ S f10008f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ m f10009g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f10010h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ int f10011i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ int f10012j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C17631a<C16807N> aVar, d dVar, boolean z10, S s10, m mVar, p<? super C4889m, ? super Integer, C16807N> pVar, int i10, int i11) {
            super(2);
            this.f10005c = aVar;
            this.f10006d = dVar;
            this.f10007e = z10;
            this.f10008f = s10;
            this.f10009g = mVar;
            this.f10010h = pVar;
            this.f10011i = i10;
            this.f10012j = i11;
        }

        public final void a(C4889m mVar, int i10) {
            U.a(this.f10005c, this.f10006d, this.f10007e, this.f10008f, this.f10009g, this.f10010h, mVar, M0.a(this.f10011i | 1), this.f10012j);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:111:0x021d  */
    /* JADX WARNING: Removed duplicated region for block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00cd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(nI.C17631a<XH.C16807N> r22, androidx.compose.ui.d r23, boolean r24, O0.S r25, r0.m r26, nI.p<? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r27, U0.C4889m r28, int r29, int r30) {
        /*
            r6 = r27
            r7 = r29
            r0 = 16
            r1 = 32
            r2 = 4
            r3 = 6
            r4 = -1142896114(0xffffffffbbe0ca0e, float:-0.0068600243)
            r5 = r28
            U0.m r5 = r5.k(r4)
            r8 = 1
            r9 = r30 & 1
            r10 = 2
            if (r9 == 0) goto L_0x001e
            r9 = r7 | 6
            r15 = r22
            goto L_0x0030
        L_0x001e:
            r9 = r7 & 6
            r15 = r22
            if (r9 != 0) goto L_0x002f
            boolean r9 = r5.F(r15)
            if (r9 == 0) goto L_0x002c
            r9 = r2
            goto L_0x002d
        L_0x002c:
            r9 = r10
        L_0x002d:
            r9 = r9 | r7
            goto L_0x0030
        L_0x002f:
            r9 = r7
        L_0x0030:
            r11 = r30 & 2
            if (r11 == 0) goto L_0x0039
            r9 = r9 | 48
        L_0x0036:
            r12 = r23
            goto L_0x0049
        L_0x0039:
            r12 = r7 & 48
            if (r12 != 0) goto L_0x0036
            r12 = r23
            boolean r13 = r5.V(r12)
            if (r13 == 0) goto L_0x0047
            r13 = r1
            goto L_0x0048
        L_0x0047:
            r13 = r0
        L_0x0048:
            r9 = r9 | r13
        L_0x0049:
            r2 = r30 & 4
            if (r2 == 0) goto L_0x0052
            r9 = r9 | 384(0x180, float:5.38E-43)
        L_0x004f:
            r13 = r24
            goto L_0x0064
        L_0x0052:
            r13 = r7 & 384(0x180, float:5.38E-43)
            if (r13 != 0) goto L_0x004f
            r13 = r24
            boolean r14 = r5.b(r13)
            if (r14 == 0) goto L_0x0061
            r14 = 256(0x100, float:3.59E-43)
            goto L_0x0063
        L_0x0061:
            r14 = 128(0x80, float:1.794E-43)
        L_0x0063:
            r9 = r9 | r14
        L_0x0064:
            r14 = r7 & 3072(0xc00, float:4.305E-42)
            if (r14 != 0) goto L_0x007e
            r14 = r30 & 8
            if (r14 != 0) goto L_0x0077
            r14 = r25
            boolean r16 = r5.V(r14)
            if (r16 == 0) goto L_0x0079
            r16 = 2048(0x800, float:2.87E-42)
            goto L_0x007b
        L_0x0077:
            r14 = r25
        L_0x0079:
            r16 = 1024(0x400, float:1.435E-42)
        L_0x007b:
            r9 = r9 | r16
            goto L_0x0080
        L_0x007e:
            r14 = r25
        L_0x0080:
            r0 = r30 & 16
            if (r0 == 0) goto L_0x0089
            r9 = r9 | 24576(0x6000, float:3.4438E-41)
        L_0x0086:
            r10 = r26
            goto L_0x009c
        L_0x0089:
            r10 = r7 & 24576(0x6000, float:3.4438E-41)
            if (r10 != 0) goto L_0x0086
            r10 = r26
            boolean r16 = r5.V(r10)
            if (r16 == 0) goto L_0x0098
            r16 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009a
        L_0x0098:
            r16 = 8192(0x2000, float:1.14794E-41)
        L_0x009a:
            r9 = r9 | r16
        L_0x009c:
            r1 = r30 & 32
            r16 = 196608(0x30000, float:2.75506E-40)
            if (r1 == 0) goto L_0x00a5
            r9 = r9 | r16
            goto L_0x00b5
        L_0x00a5:
            r1 = r7 & r16
            if (r1 != 0) goto L_0x00b5
            boolean r1 = r5.F(r6)
            if (r1 == 0) goto L_0x00b2
            r1 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b4
        L_0x00b2:
            r1 = 65536(0x10000, float:9.18355E-41)
        L_0x00b4:
            r9 = r9 | r1
        L_0x00b5:
            r1 = 74899(0x12493, float:1.04956E-40)
            r1 = r1 & r9
            r4 = 74898(0x12492, float:1.04954E-40)
            if (r1 != r4) goto L_0x00cd
            boolean r1 = r5.l()
            if (r1 != 0) goto L_0x00c5
            goto L_0x00cd
        L_0x00c5:
            r5.L()
            r2 = r12
            r3 = r13
            r4 = r14
            goto L_0x0217
        L_0x00cd:
            r5.G()
            r1 = r7 & 1
            if (r1 == 0) goto L_0x00ea
            boolean r1 = r5.O()
            if (r1 == 0) goto L_0x00db
            goto L_0x00ea
        L_0x00db:
            r5.L()
            r0 = r30 & 8
            if (r0 == 0) goto L_0x00e4
            r9 = r9 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x00e4:
            r4 = r10
            r0 = r12
            r1 = r13
        L_0x00e7:
            r2 = r14
            r14 = r9
            goto L_0x010a
        L_0x00ea:
            if (r11 == 0) goto L_0x00ef
            androidx.compose.ui.d$a r1 = androidx.compose.ui.d.f18749a
            r12 = r1
        L_0x00ef:
            if (r2 == 0) goto L_0x00f2
            goto L_0x00f3
        L_0x00f2:
            r8 = r13
        L_0x00f3:
            r1 = r30 & 8
            if (r1 == 0) goto L_0x0100
            O0.T r1 = O0.T.f10004a
            O0.S r1 = r1.b(r5, r3)
            r9 = r9 & -7169(0xffffffffffffe3ff, float:NaN)
            r14 = r1
        L_0x0100:
            if (r0 == 0) goto L_0x0107
            r0 = 0
            r4 = r0
            r1 = r8
        L_0x0105:
            r0 = r12
            goto L_0x00e7
        L_0x0107:
            r1 = r8
            r4 = r10
            goto L_0x0105
        L_0x010a:
            r5.y()
            boolean r8 = U0.C4895p.J()
            if (r8 == 0) goto L_0x011c
            r8 = -1
            java.lang.String r9 = "androidx.compose.material3.IconButton (IconButton.kt:88)"
            r10 = -1142896114(0xffffffffbbe0ca0e, float:-0.0068600243)
            U0.C4895p.S(r10, r14, r8, r9)
        L_0x011c:
            androidx.compose.ui.d r8 = O0.W.b(r0)
            S0.k r9 = S0.k.f12906a
            float r10 = r9.c()
            androidx.compose.ui.d r8 = androidx.compose.foundation.layout.J.t(r8, r10)
            S0.v r10 = r9.b()
            p1.i1 r3 = O0.D0.d(r10, r5, r3)
            androidx.compose.ui.d r16 = m1.e.a(r8, r3)
            long r17 = r2.a(r1)
            r20 = 2
            r21 = 0
            r19 = 0
            androidx.compose.ui.d r3 = androidx.compose.foundation.b.d(r16, r17, r19, r20, r21)
            L1.i$a r8 = L1.i.f8936b
            int r16 = r8.a()
            float r8 = r9.c()
            r9 = 2
            float r9 = (float) r9
            float r8 = r8 / r9
            float r9 = c2.h.B(r8)
            r13 = 54
            r17 = 4
            r8 = 0
            r10 = 0
            r12 = r5
            r20 = r14
            r14 = r17
            n0.G r13 = O0.C4756u0.d(r8, r9, r10, r12, r13, r14)
            L1.i r16 = L1.i.h(r16)
            r18 = 8
            r8 = 0
            r11 = r3
            r12 = r4
            r14 = r1
            r15 = r8
            r17 = r22
            androidx.compose.ui.d r3 = androidx.compose.foundation.d.b(r11, r12, r13, r14, r15, r16, r17, r18, r19)
            i1.c$a r8 = i1.C5437c.f24302a
            i1.c r8 = r8.e()
            r9 = 0
            E1.I r8 = androidx.compose.foundation.layout.C5077h.h(r8, r9)
            int r9 = U0.C4883j.a(r5, r9)
            U0.y r10 = r5.s()
            androidx.compose.ui.d r3 = androidx.compose.ui.c.e(r5, r3)
            G1.g$a r11 = G1.C4504g.f6515W
            nI.a r12 = r11.a()
            U0.f r13 = r5.m()
            if (r13 != 0) goto L_0x019c
            U0.C4883j.c()
        L_0x019c:
            r5.I()
            boolean r13 = r5.i()
            if (r13 == 0) goto L_0x01a9
            r5.p(r12)
            goto L_0x01ac
        L_0x01a9:
            r5.t()
        L_0x01ac:
            U0.m r12 = U0.F1.a(r5)
            nI.p r13 = r11.c()
            U0.F1.c(r12, r8, r13)
            nI.p r8 = r11.e()
            U0.F1.c(r12, r10, r8)
            nI.p r8 = r11.b()
            boolean r10 = r12.i()
            if (r10 != 0) goto L_0x01d6
            java.lang.Object r10 = r12.D()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r9)
            boolean r10 = kotlin.jvm.internal.C17542s.e(r10, r13)
            if (r10 != 0) goto L_0x01e4
        L_0x01d6:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r9)
            r12.u(r10)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r12.w(r9, r8)
        L_0x01e4:
            nI.p r8 = r11.d()
            U0.F1.c(r12, r3, r8)
            androidx.compose.foundation.layout.j r3 = androidx.compose.foundation.layout.C5079j.f18125a
            long r8 = r2.b(r1)
            U0.I0 r3 = O0.E.a()
            p1.v0 r8 = p1.C5747v0.k(r8)
            U0.J0 r3 = r3.d(r8)
            int r8 = U0.J0.f13770i
            int r9 = r20 >> 12
            r9 = r9 & 112(0x70, float:1.57E-43)
            r8 = r8 | r9
            U0.C4910x.a(r3, r6, r5, r8)
            r5.x()
            boolean r3 = U0.C4895p.J()
            if (r3 == 0) goto L_0x0213
            U0.C4895p.R()
        L_0x0213:
            r3 = r1
            r10 = r4
            r4 = r2
            r2 = r0
        L_0x0217:
            U0.Y0 r9 = r5.n()
            if (r9 == 0) goto L_0x022f
            O0.U$a r11 = new O0.U$a
            r0 = r11
            r1 = r22
            r5 = r10
            r6 = r27
            r7 = r29
            r8 = r30
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.a(r11)
        L_0x022f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: O0.U.a(nI.a, androidx.compose.ui.d, boolean, O0.S, r0.m, nI.p, U0.m, int, int):void");
    }
}
