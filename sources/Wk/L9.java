package wK;

import U0.A1;
import U0.C4889m;
import U0.C4892n0;
import U0.C4895p;
import U0.M0;
import XH.C16807N;
import XH.v;
import androidx.compose.ui.d;
import androidx.compose.ui.draw.b;
import c2.r;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import n0.Z;
import nI.C17642l;
import nI.q;
import p1.C5728l0;
import p1.C5747v0;
import p1.C5749w0;
import r1.f;
import r1.g;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\u001a#\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0017\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\r²\u0006\u000e\u0010\b\u001a\u00020\u00078\n@\nX\u0002²\u0006\f\u0010\u000b\u001a\u00020\u00078\nX\u0002²\u0006\f\u0010\f\u001a\u00020\u00078\nX\u0002"}, d2 = {"Landroidx/compose/ui/d;", "modifier", "", "loading", "LXH/N;", "c", "(Landroidx/compose/ui/d;ZLU0/m;II)V", "", "widthInPx", "l", "(F)F", "startX", "endX", "design_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class L9 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements q<d, C4889m, Integer, d> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ v<Float, C5747v0>[] f149790a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ A1<Float> f149791b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ A1<Float> f149792c;

        a(v<Float, C5747v0>[] vVarArr, A1<Float> a12, A1<Float> a13) {
            this.f149790a = vVarArr;
            this.f149791b = a12;
            this.f149792c = a13;
        }

        /* access modifiers changed from: private */
        public static final C16807N c(v[] vVarArr, A1 a12, A1 a13, f fVar) {
            f fVar2 = fVar;
            C17542s.j(fVar2, "$this$drawBehind");
            f.M0(fVar2, C5728l0.a.d(C5728l0.f27325b, (v[]) Arrays.copyOf(vVarArr, vVarArr.length), L9.f(a12), L9.g(a13), 0, 8, (Object) null), 0, 0, 0.0f, (g) null, (C5749w0) null, 0, 126, (Object) null);
            return C16807N.f139792a;
        }

        public final d b(d dVar, C4889m mVar, int i10) {
            C17542s.j(dVar, "$this$thenCheckTrue");
            mVar.W(-995376134);
            if (C4895p.J()) {
                C4895p.S(-995376134, i10, -1, "net.ikea.skapa.ui.components.Skeleton.<anonymous> (Skeleton.kt:84)");
            }
            mVar.W(633441823);
            boolean F10 = mVar.F(this.f149790a) | mVar.V(this.f149791b) | mVar.V(this.f149792c);
            v<Float, C5747v0>[] vVarArr = this.f149790a;
            A1<Float> a12 = this.f149791b;
            A1<Float> a13 = this.f149792c;
            Object D10 = mVar.D();
            if (F10 || D10 == C4889m.f14007a.a()) {
                D10 = new K9(vVarArr, a12, a13);
                mVar.u(D10);
            }
            mVar.P();
            d a10 = Z.a(b.b(dVar, (C17642l) D10));
            if (C4895p.J()) {
                C4895p.R();
            }
            mVar.P();
            return a10;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return b((d) obj, (C4889m) obj2, ((Number) obj3).intValue());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0209  */
    /* JADX WARNING: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void c(androidx.compose.ui.d r37, boolean r38, U0.C4889m r39, int r40, int r41) {
        /*
            r0 = r40
            r1 = r41
            r2 = -2008761560(0xffffffff8844bb28, float:-5.9201606E-34)
            r3 = r39
            U0.m r11 = r3.k(r2)
            r3 = r1 & 1
            if (r3 == 0) goto L_0x0017
            r4 = r0 | 6
            r5 = r4
            r4 = r37
            goto L_0x002b
        L_0x0017:
            r4 = r0 & 6
            if (r4 != 0) goto L_0x0028
            r4 = r37
            boolean r5 = r11.V(r4)
            if (r5 == 0) goto L_0x0025
            r5 = 4
            goto L_0x0026
        L_0x0025:
            r5 = 2
        L_0x0026:
            r5 = r5 | r0
            goto L_0x002b
        L_0x0028:
            r4 = r37
            r5 = r0
        L_0x002b:
            r6 = r1 & 2
            if (r6 == 0) goto L_0x0035
            r5 = r5 | 48
        L_0x0031:
            r7 = r38
        L_0x0033:
            r12 = r5
            goto L_0x0048
        L_0x0035:
            r7 = r0 & 48
            if (r7 != 0) goto L_0x0031
            r7 = r38
            boolean r8 = r11.b(r7)
            if (r8 == 0) goto L_0x0044
            r8 = 32
            goto L_0x0046
        L_0x0044:
            r8 = 16
        L_0x0046:
            r5 = r5 | r8
            goto L_0x0033
        L_0x0048:
            r5 = r12 & 19
            r8 = 18
            if (r5 != r8) goto L_0x005c
            boolean r5 = r11.l()
            if (r5 != 0) goto L_0x0055
            goto L_0x005c
        L_0x0055:
            r11.L()
            r13 = r4
            r15 = r7
            goto L_0x0203
        L_0x005c:
            if (r3 == 0) goto L_0x0062
            androidx.compose.ui.d$a r3 = androidx.compose.ui.d.f18749a
            r13 = r3
            goto L_0x0063
        L_0x0062:
            r13 = r4
        L_0x0063:
            if (r6 == 0) goto L_0x0067
            r15 = 1
            goto L_0x0068
        L_0x0067:
            r15 = r7
        L_0x0068:
            boolean r3 = U0.C4895p.J()
            if (r3 == 0) goto L_0x0074
            r3 = -1
            java.lang.String r4 = "net.ikea.skapa.ui.components.Skeleton (Skeleton.kt:42)"
            U0.C4895p.S(r2, r12, r3, r4)
        L_0x0074:
            r2 = 0
            boolean r3 = vK.C18205e.f(r11, r2)
            tK.v r10 = tK.C18030v.f147664a
            int r9 = tK.C18030v.f147665b
            tK.h r4 = r10.a(r11, r9)
            long r4 = r4.l0()
            XH.v r6 = new XH.v
            r7 = 1048576000(0x3e800000, float:0.25)
            java.lang.Float r7 = java.lang.Float.valueOf(r7)
            r22 = 14
            r23 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r16 = r4
            long r16 = p1.C5747v0.o(r16, r18, r19, r20, r21, r22, r23)
            p1.v0 r8 = p1.C5747v0.k(r16)
            r6.<init>(r7, r8)
            XH.v r7 = new XH.v
            r8 = 1056964608(0x3f000000, float:0.5)
            java.lang.Float r8 = java.lang.Float.valueOf(r8)
            r18 = 1056964608(0x3f000000, float:0.5)
            r16 = r4
            long r16 = p1.C5747v0.o(r16, r18, r19, r20, r21, r22, r23)
            p1.v0 r14 = p1.C5747v0.k(r16)
            r7.<init>(r8, r14)
            XH.v r8 = new XH.v
            r14 = 1061158912(0x3f400000, float:0.75)
            java.lang.Float r14 = java.lang.Float.valueOf(r14)
            r18 = 0
            r16 = r4
            long r4 = p1.C5747v0.o(r16, r18, r19, r20, r21, r22, r23)
            p1.v0 r4 = p1.C5747v0.k(r4)
            r8.<init>(r14, r4)
            XH.v[] r14 = new XH.v[]{r6, r7, r8}
            java.lang.String r4 = "Infinite Loading"
            r5 = 6
            m0.W r16 = m0.X.c(r4, r11, r5, r2)
            r4 = 688442946(0x2908ce42, float:3.0376966E-14)
            r11.W(r4)
            java.lang.Object r4 = r11.D()
            U0.m$a r17 = U0.C4889m.f14007a
            java.lang.Object r5 = r17.a()
            r8 = 0
            if (r4 != r5) goto L_0x00f9
            U0.n0 r4 = U0.D0.a(r8)
            r11.u(r4)
        L_0x00f9:
            r7 = r4
            U0.n0 r7 = (U0.C4892n0) r7
            r11.P()
            float r4 = d(r7)
            float r4 = l(r4)
            if (r3 == 0) goto L_0x010f
            float r5 = d(r7)
            float r5 = r5 + r4
            goto L_0x0110
        L_0x010f:
            float r5 = -r4
        L_0x0110:
            if (r3 == 0) goto L_0x0114
            float r6 = -r4
            goto L_0x0119
        L_0x0114:
            float r6 = d(r7)
            float r6 = r6 + r4
        L_0x0119:
            if (r3 == 0) goto L_0x0120
            float r18 = d(r7)
            goto L_0x0122
        L_0x0120:
            r18 = r8
        L_0x0122:
            r19 = 1073741824(0x40000000, float:2.0)
            if (r3 == 0) goto L_0x0131
            float r3 = d(r7)
            float r4 = r4 * r19
            float r3 = r3 + r4
            float r3 = -r3
        L_0x012e:
            r19 = r3
            goto L_0x0139
        L_0x0131:
            float r3 = d(r7)
            float r4 = r4 * r19
            float r3 = r3 + r4
            goto L_0x012e
        L_0x0139:
            tK.t r20 = tK.C18028t.f147640a
            m0.x r3 = r20.a()
            r4 = 2000(0x7d0, float:2.803E-42)
            m0.y0 r21 = m0.C5548j.i(r4, r2, r3)
            r25 = 6
            r26 = 0
            r22 = 0
            r23 = 0
            m0.V r21 = m0.C5548j.e(r21, r22, r23, r25, r26)
            int r3 = m0.W.f25632f
            r4 = r3 | 24576(0x6000, float:3.4438E-41)
            int r22 = m0.V.f25628d
            int r23 = r22 << 9
            r23 = r4 | r23
            r24 = 0
            java.lang.String r25 = "Skeleton start"
            r4 = r3
            r3 = r16
            r27 = r4
            r4 = r5
            r5 = r6
            r6 = r21
            r28 = r7
            r7 = r25
            r8 = r11
            r29 = r9
            r9 = r23
            r30 = r10
            r10 = r24
            U0.A1 r10 = m0.X.a(r3, r4, r5, r6, r7, r8, r9, r10)
            m0.x r3 = r20.a()
            r4 = 2000(0x7d0, float:2.803E-42)
            m0.y0 r31 = m0.C5548j.i(r4, r2, r3)
            r35 = 6
            r36 = 0
            r32 = 0
            r33 = 0
            m0.V r6 = m0.C5548j.e(r31, r32, r33, r35, r36)
            r3 = r27
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
            int r4 = r22 << 9
            r9 = r3 | r4
            r20 = 0
            java.lang.String r7 = "Skeleton end"
            r3 = r16
            r4 = r18
            r5 = r19
            r2 = r10
            r10 = r20
            U0.A1 r3 = m0.X.a(r3, r4, r5, r6, r7, r8, r9, r10)
            androidx.compose.ui.d$a r4 = androidx.compose.ui.d.f18749a
            r5 = 688479584(0x29095d60, float:3.05011E-14)
            r11.W(r5)
            java.lang.Object r5 = r11.D()
            java.lang.Object r6 = r17.a()
            if (r5 != r6) goto L_0x01c4
            wK.I9 r5 = new wK.I9
            r6 = r28
            r5.<init>(r6)
            r11.u(r5)
        L_0x01c4:
            nI.l r5 = (nI.C17642l) r5
            r11.P()
            androidx.compose.ui.d r4 = androidx.compose.ui.layout.g.a(r4, r5)
            androidx.compose.ui.d r5 = r4.s(r13)
            r6 = r29
            r4 = r30
            tK.h r4 = r4.a(r11, r6)
            long r6 = r4.m0()
            r9 = 2
            r10 = 0
            r8 = 0
            androidx.compose.ui.d r4 = androidx.compose.foundation.b.d(r5, r6, r8, r9, r10)
            r5 = 0
            r6 = 1
            r7 = 0
            androidx.compose.ui.d r4 = androidx.compose.foundation.layout.J.f(r4, r7, r6, r5)
            wK.L9$a r5 = new wK.L9$a
            r5.<init>(r14, r2, r3)
            r2 = r12 & 112(0x70, float:1.57E-43)
            androidx.compose.ui.d r2 = vK.C18205e.h(r4, r15, r5, r11, r2)
            r3 = 0
            androidx.compose.foundation.layout.C5077h.a(r2, r11, r3)
            boolean r2 = U0.C4895p.J()
            if (r2 == 0) goto L_0x0203
            U0.C4895p.R()
        L_0x0203:
            U0.Y0 r2 = r11.n()
            if (r2 == 0) goto L_0x0211
            wK.J9 r3 = new wK.J9
            r3.<init>(r13, r15, r0, r1)
            r2.a(r3)
        L_0x0211:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wK.L9.c(androidx.compose.ui.d, boolean, U0.m, int, int):void");
    }

    private static final float d(C4892n0 n0Var) {
        return n0Var.a();
    }

    private static final void e(C4892n0 n0Var, float f10) {
        n0Var.n(f10);
    }

    /* access modifiers changed from: private */
    public static final float f(A1<Float> a12) {
        return a12.getValue().floatValue();
    }

    /* access modifiers changed from: private */
    public static final float g(A1<Float> a12) {
        return a12.getValue().floatValue();
    }

    /* access modifiers changed from: private */
    public static final C16807N h(C4892n0 n0Var, r rVar) {
        e(n0Var, (float) r.h(rVar.k()));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N i(d dVar, boolean z10, int i10, int i11, C4889m mVar, int i12) {
        c(dVar, z10, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    private static final float l(float f10) {
        return f10 * 0.75f;
    }
}
