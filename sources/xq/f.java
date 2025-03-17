package Xq;

import Dl.q;
import IC.C13023e;
import TC.C13679b;
import U0.C4889m;
import U0.C4895p;
import U0.C4899r0;
import U0.M0;
import U0.o1;
import XH.C16807N;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.C5116k1;
import kotlin.Metadata;
import nI.p;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a)\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n²\u0006\u000e\u0010\t\u001a\u00020\b8\n@\nX\u0002"}, d2 = {"LIC/e;", "title", "body", "Landroidx/compose/ui/d;", "modifier", "LXH/N;", "d", "(LIC/e;LIC/e;Landroidx/compose/ui/d;LU0/m;II)V", "", "isExpanded", "familyrewards-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class f {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C13023e f89238a;

        a(C13023e eVar) {
            this.f89238a = eVar;
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-103489011, i10, -1, "com.ingka.ikea.familyrewards.implementation.compose.details.component.TermsOfUse.<anonymous>.<anonymous> (TermsOfUse.kt:40)");
                }
                q.c(this.f89238a, C13679b.a.C2856b.f116680a, C5116k1.a(d.f18749a, "TestTag-TermsBody"), mVar, C13023e.f110931a | 432, 0);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v14, resolved type: nI.l} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01d6  */
    /* JADX WARNING: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void d(IC.C13023e r23, IC.C13023e r24, androidx.compose.ui.d r25, U0.C4889m r26, int r27, int r28) {
        /*
            r1 = r23
            r2 = r24
            r4 = r27
            r0 = 2
            r3 = 4
            java.lang.String r5 = "title"
            kotlin.jvm.internal.C17542s.j(r1, r5)
            java.lang.String r5 = "body"
            kotlin.jvm.internal.C17542s.j(r2, r5)
            r5 = -41774333(0xfffffffffd829303, float:-2.169537E37)
            r6 = r26
            U0.m r15 = r6.k(r5)
            r13 = 1
            r6 = r28 & 1
            if (r6 == 0) goto L_0x0023
            r6 = r4 | 6
            goto L_0x003c
        L_0x0023:
            r6 = r4 & 6
            if (r6 != 0) goto L_0x003b
            r6 = r4 & 8
            if (r6 != 0) goto L_0x0030
            boolean r6 = r15.V(r1)
            goto L_0x0034
        L_0x0030:
            boolean r6 = r15.F(r1)
        L_0x0034:
            if (r6 == 0) goto L_0x0038
            r6 = r3
            goto L_0x0039
        L_0x0038:
            r6 = r0
        L_0x0039:
            r6 = r6 | r4
            goto L_0x003c
        L_0x003b:
            r6 = r4
        L_0x003c:
            r0 = r28 & 2
            if (r0 == 0) goto L_0x0043
            r6 = r6 | 48
            goto L_0x005c
        L_0x0043:
            r0 = r4 & 48
            if (r0 != 0) goto L_0x005c
            r0 = r4 & 64
            if (r0 != 0) goto L_0x0050
            boolean r0 = r15.V(r2)
            goto L_0x0054
        L_0x0050:
            boolean r0 = r15.F(r2)
        L_0x0054:
            if (r0 == 0) goto L_0x0059
            r0 = 32
            goto L_0x005b
        L_0x0059:
            r0 = 16
        L_0x005b:
            r6 = r6 | r0
        L_0x005c:
            r0 = r28 & 4
            if (r0 == 0) goto L_0x0066
            r6 = r6 | 384(0x180, float:5.38E-43)
        L_0x0062:
            r3 = r25
        L_0x0064:
            r14 = r6
            goto L_0x0079
        L_0x0066:
            r3 = r4 & 384(0x180, float:5.38E-43)
            if (r3 != 0) goto L_0x0062
            r3 = r25
            boolean r7 = r15.V(r3)
            if (r7 == 0) goto L_0x0075
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x0077
        L_0x0075:
            r7 = 128(0x80, float:1.794E-43)
        L_0x0077:
            r6 = r6 | r7
            goto L_0x0064
        L_0x0079:
            r6 = r14 & 147(0x93, float:2.06E-43)
            r7 = 146(0x92, float:2.05E-43)
            if (r6 != r7) goto L_0x008d
            boolean r6 = r15.l()
            if (r6 != 0) goto L_0x0086
            goto L_0x008d
        L_0x0086:
            r15.L()
            r5 = r3
            r3 = r15
            goto L_0x01d0
        L_0x008d:
            if (r0 == 0) goto L_0x0092
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            goto L_0x0093
        L_0x0092:
            r0 = r3
        L_0x0093:
            boolean r3 = U0.C4895p.J()
            if (r3 == 0) goto L_0x009f
            r3 = -1
            java.lang.String r6 = "com.ingka.ikea.familyrewards.implementation.compose.details.component.TermsOfUse (TermsOfUse.kt:27)"
            U0.C4895p.S(r5, r14, r3, r6)
        L_0x009f:
            androidx.compose.foundation.layout.d r3 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r3 = r3.g()
            i1.c$a r5 = i1.C5437c.f24302a
            i1.c$b r5 = r5.k()
            r12 = 0
            E1.I r3 = androidx.compose.foundation.layout.C5080k.a(r3, r5, r15, r12)
            int r5 = U0.C4883j.a(r15, r12)
            U0.y r6 = r15.s()
            androidx.compose.ui.d r7 = androidx.compose.ui.c.e(r15, r0)
            G1.g$a r8 = G1.C4504g.f6515W
            nI.a r9 = r8.a()
            U0.f r10 = r15.m()
            if (r10 != 0) goto L_0x00cb
            U0.C4883j.c()
        L_0x00cb:
            r15.I()
            boolean r10 = r15.i()
            if (r10 == 0) goto L_0x00d8
            r15.p(r9)
            goto L_0x00db
        L_0x00d8:
            r15.t()
        L_0x00db:
            U0.m r9 = U0.F1.a(r15)
            nI.p r10 = r8.c()
            U0.F1.c(r9, r3, r10)
            nI.p r3 = r8.e()
            U0.F1.c(r9, r6, r3)
            nI.p r3 = r8.b()
            boolean r6 = r9.i()
            if (r6 != 0) goto L_0x0105
            java.lang.Object r6 = r9.D()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r5)
            boolean r6 = kotlin.jvm.internal.C17542s.e(r6, r10)
            if (r6 != 0) goto L_0x0113
        L_0x0105:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            r9.u(r6)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r9.w(r5, r3)
        L_0x0113:
            nI.p r3 = r8.d()
            U0.F1.c(r9, r7, r3)
            s0.h r3 = s0.C5862h.f28810a
            r11 = 0
            r3 = 7
            r6 = 0
            r7 = 0
            r8 = 0
            r10 = r15
            r5 = r12
            r12 = r3
            SC.C13643u0.c(r6, r7, r8, r10, r11, r12)
            java.lang.Object[] r6 = new java.lang.Object[r5]
            r3 = -719525989(0xffffffffd51ce79b, float:-1.07824095E13)
            r15.W(r3)
            java.lang.Object r3 = r15.D()
            U0.m$a r5 = U0.C4889m.f14007a
            java.lang.Object r7 = r5.a()
            if (r3 != r7) goto L_0x0144
            Xq.c r3 = new Xq.c
            r3.<init>()
            r15.u(r3)
        L_0x0144:
            r9 = r3
            nI.a r9 = (nI.C17631a) r9
            r15.P()
            r11 = 3072(0xc00, float:4.305E-42)
            r12 = 6
            r7 = 0
            r8 = 0
            r10 = r15
            java.lang.Object r3 = f1.C5301c.e(r6, r7, r8, r9, r10, r11, r12)
            U0.r0 r3 = (U0.C4899r0) r3
            int r6 = IC.C13023e.f110931a
            r7 = r14 & 14
            r6 = r6 | r7
            java.lang.String r6 = r1.a(r15, r6)
            boolean r11 = f(r3)
            float r19 = Rq.d.j()
            androidx.compose.ui.d$a r7 = androidx.compose.ui.d.f18749a
            java.lang.String r8 = "TestTag-TermsTitle"
            androidx.compose.ui.d r8 = androidx.compose.ui.platform.C5116k1.a(r7, r8)
            r7 = -719516875(0xffffffffd51d0b35, float:-1.07919662E13)
            r15.W(r7)
            boolean r7 = r15.V(r3)
            java.lang.Object r9 = r15.D()
            if (r7 != 0) goto L_0x0185
            java.lang.Object r5 = r5.a()
            if (r9 != r5) goto L_0x018d
        L_0x0185:
            Xq.d r9 = new Xq.d
            r9.<init>(r3)
            r15.u(r9)
        L_0x018d:
            r7 = r9
            nI.l r7 = (nI.C17642l) r7
            r15.P()
            Xq.f$a r3 = new Xq.f$a
            r3.<init>(r2)
            r5 = 54
            r9 = -103489011(0xfffffffff9d4e20d, float:-1.3816897E35)
            c1.a r18 = c1.c.e(r9, r13, r3, r15, r5)
            r21 = 384(0x180, float:5.38E-43)
            r22 = 3288(0xcd8, float:4.607E-42)
            r9 = 0
            r10 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r16 = 0
            r17 = 0
            r20 = 905970048(0x36000180, float:1.907436E-6)
            r3 = r15
            r15 = r19
            r19 = r3
            SC.C13627q.b(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r11 = 0
            r12 = 7
            r6 = 0
            r7 = 0
            r8 = 0
            r10 = r3
            SC.C13643u0.c(r6, r7, r8, r10, r11, r12)
            r3.x()
            boolean r5 = U0.C4895p.J()
            if (r5 == 0) goto L_0x01cf
            U0.C4895p.R()
        L_0x01cf:
            r5 = r0
        L_0x01d0:
            U0.Y0 r6 = r3.n()
            if (r6 == 0) goto L_0x01e8
            Xq.e r7 = new Xq.e
            r0 = r7
            r1 = r23
            r2 = r24
            r3 = r5
            r4 = r27
            r5 = r28
            r0.<init>(r1, r2, r3, r4, r5)
            r6.a(r7)
        L_0x01e8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Xq.f.d(IC.e, IC.e, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C4899r0 e() {
        return u1.e(Boolean.FALSE, (o1) null, 2, (Object) null);
    }

    private static final boolean f(C4899r0<Boolean> r0Var) {
        return r0Var.getValue().booleanValue();
    }

    private static final void g(C4899r0<Boolean> r0Var, boolean z10) {
        r0Var.setValue(Boolean.valueOf(z10));
    }

    /* access modifiers changed from: private */
    public static final C16807N h(C4899r0 r0Var, boolean z10) {
        g(r0Var, z10);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N i(C13023e eVar, C13023e eVar2, d dVar, int i10, int i11, C4889m mVar, int i12) {
        d(eVar, eVar2, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
