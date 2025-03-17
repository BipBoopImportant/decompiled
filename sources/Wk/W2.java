package wK;

import E1.L;
import HJ.C15854t;
import J1.e;
import L1.i;
import L1.o;
import L1.v;
import L1.x;
import O0.V;
import U0.C4889m;
import U0.C4895p;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import XH.t;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.d;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import p1.C5747v0;
import s0.C5842M;
import s0.C5844O;
import sK.C17950a;
import t1.C5942c;
import tK.C18029u;
import tK.C18030v;
import vK.C18205e;

@Metadata(d1 = {"\u0000\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a)\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u001b\u0010\n\u001a\u00020\u0006*\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\n\u0010\u000b\u001a\u0019\u0010\f\u001a\u00020\u00062\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0001¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"", "label", "LwK/Z2;", "state", "Landroidx/compose/ui/d;", "modifier", "LXH/N;", "l", "(Ljava/lang/String;LwK/Z2;Landroidx/compose/ui/d;LU0/m;II)V", "Ls0/M;", "g", "(Ls0/M;LwK/Z2;LU0/m;I)V", "n", "(Ljava/lang/String;LU0/m;I)V", "design_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class W2 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f150308a;

        /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        static {
            /*
                wK.Z2[] r0 = wK.Z2.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                wK.Z2 r1 = wK.Z2.Regular     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                wK.Z2 r1 = wK.Z2.Success     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                wK.Z2 r1 = wK.Z2.Error     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                wK.Z2 r1 = wK.Z2.Warning     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                f150308a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: wK.W2.a.<clinit>():void");
        }
    }

    private static final void g(C5842M m10, Z2 z22, C4889m mVar, int i10) {
        int i11;
        int i12;
        C5842M m11 = m10;
        Z2 z23 = z22;
        int i13 = i10;
        C4889m k10 = mVar.k(950570225);
        if ((i13 & 6) == 0) {
            i11 = (k10.V(m11) ? 4 : 2) | i13;
        } else {
            i11 = i13;
        }
        if ((i13 & 48) == 0) {
            i11 |= k10.V(z23) ? 32 : 16;
        }
        if ((i11 & 19) != 18 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(950570225, i11, -1, "net.ikea.skapa.ui.components.HelperIndicator (HelperText.kt:62)");
            }
            int i14 = a.f150308a[z22.ordinal()];
            if (i14 != 1) {
                if (i14 == 2) {
                    i12 = C17950a.f147162k;
                } else if (i14 == 3) {
                    i12 = C17950a.f147161j;
                } else if (i14 == 4) {
                    i12 = C17950a.f147163l;
                } else {
                    throw new t();
                }
                float e10 = C18205e.e(C18030v.f147664a.b(k10, C18030v.f147665b).a().c(), k10, 0);
                C5942c c10 = e.c(i12, k10, 0);
                long i15 = C5747v0.f27350b.i();
                d.a aVar = d.f18749a;
                Y2 y22 = Y2.f150442a;
                d t10 = J.t(D.m(aVar, 0.0f, y22.e(), y22.d(), 0.0f, 9, (Object) null), y22.c());
                k10.W(2146123667);
                boolean c11 = k10.c(e10);
                Object D10 = k10.D();
                if (c11 || D10 == C4889m.f14007a.a()) {
                    D10 = new S2(e10);
                    k10.u(D10);
                }
                k10.P();
                d d10 = m11.d(t10, (C17642l) D10);
                k10.W(2146126533);
                Object D11 = k10.D();
                if (D11 == C4889m.f14007a.a()) {
                    D11 = new T2();
                    k10.u(D11);
                }
                k10.P();
                V.a(c10, (String) null, o.d(d10, false, (C17642l) D11, 1, (Object) null), i15, k10, 3120, 0);
                if (C4895p.J()) {
                    C4895p.R();
                }
            } else {
                if (C4895p.J()) {
                    C4895p.R();
                }
                Y0 n10 = k10.n();
                if (n10 != null) {
                    n10.a(new R2(m11, z23, i13));
                    return;
                }
                return;
            }
        } else {
            k10.L();
        }
        Y0 n11 = k10.n();
        if (n11 != null) {
            n11.a(new U2(m11, z23, i13));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N h(C5842M m10, Z2 z22, int i10, C4889m mVar, int i11) {
        g(m10, z22, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final int i(float f10, L l10) {
        C17542s.j(l10, "it");
        return C18205e.d(l10.z(), f10);
    }

    /* access modifiers changed from: private */
    public static final C16807N j(x xVar) {
        C17542s.j(xVar, "$this$semantics");
        v.l0(xVar, i.f8936b.d());
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N k(C5842M m10, Z2 z22, int i10, C4889m mVar, int i11) {
        g(m10, z22, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0183  */
    /* JADX WARNING: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void l(java.lang.String r29, wK.Z2 r30, androidx.compose.ui.d r31, U0.C4889m r32, int r33, int r34) {
        /*
            r2 = r29
            r3 = r30
            r0 = r33
            java.lang.String r1 = "label"
            kotlin.jvm.internal.C17542s.j(r2, r1)
            java.lang.String r1 = "state"
            kotlin.jvm.internal.C17542s.j(r3, r1)
            r1 = -1052303759(0xffffffffc1471e71, float:-12.444932)
            r4 = r32
            U0.m r15 = r4.k(r1)
            r4 = r34 & 1
            r5 = 2
            if (r4 == 0) goto L_0x0021
            r4 = r0 | 6
            goto L_0x0031
        L_0x0021:
            r4 = r0 & 6
            if (r4 != 0) goto L_0x0030
            boolean r4 = r15.V(r2)
            if (r4 == 0) goto L_0x002d
            r4 = 4
            goto L_0x002e
        L_0x002d:
            r4 = r5
        L_0x002e:
            r4 = r4 | r0
            goto L_0x0031
        L_0x0030:
            r4 = r0
        L_0x0031:
            r6 = r34 & 2
            if (r6 == 0) goto L_0x0038
            r4 = r4 | 48
            goto L_0x0048
        L_0x0038:
            r6 = r0 & 48
            if (r6 != 0) goto L_0x0048
            boolean r6 = r15.V(r3)
            if (r6 == 0) goto L_0x0045
            r6 = 32
            goto L_0x0047
        L_0x0045:
            r6 = 16
        L_0x0047:
            r4 = r4 | r6
        L_0x0048:
            r6 = r34 & 4
            if (r6 == 0) goto L_0x0051
            r4 = r4 | 384(0x180, float:5.38E-43)
        L_0x004e:
            r7 = r31
            goto L_0x0063
        L_0x0051:
            r7 = r0 & 384(0x180, float:5.38E-43)
            if (r7 != 0) goto L_0x004e
            r7 = r31
            boolean r8 = r15.V(r7)
            if (r8 == 0) goto L_0x0060
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0062
        L_0x0060:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0062:
            r4 = r4 | r8
        L_0x0063:
            r8 = r4 & 147(0x93, float:2.06E-43)
            r9 = 146(0x92, float:2.05E-43)
            if (r8 != r9) goto L_0x0078
            boolean r8 = r15.l()
            if (r8 != 0) goto L_0x0070
            goto L_0x0078
        L_0x0070:
            r15.L()
            r3 = r7
            r28 = r15
            goto L_0x017d
        L_0x0078:
            if (r6 == 0) goto L_0x007e
            androidx.compose.ui.d$a r6 = androidx.compose.ui.d.f18749a
            r13 = r6
            goto L_0x007f
        L_0x007e:
            r13 = r7
        L_0x007f:
            boolean r6 = U0.C4895p.J()
            if (r6 == 0) goto L_0x008b
            r6 = -1
            java.lang.String r7 = "net.ikea.skapa.ui.components.HelperText (HelperText.kt:46)"
            U0.C4895p.S(r1, r4, r6, r7)
        L_0x008b:
            wK.Y2 r1 = wK.Y2.f150442a
            int r6 = r4 >> 3
            r6 = r6 & 14
            r6 = r6 | 48
            long r25 = r1.a(r3, r15, r6)
            androidx.compose.foundation.layout.d r6 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$e r6 = r6.f()
            i1.c$a r7 = i1.C5437c.f24302a
            i1.c$c r7 = r7.l()
            r8 = 0
            E1.I r6 = androidx.compose.foundation.layout.G.b(r6, r7, r15, r8)
            int r7 = U0.C4883j.a(r15, r8)
            U0.y r8 = r15.s()
            androidx.compose.ui.d r9 = androidx.compose.ui.c.e(r15, r13)
            G1.g$a r10 = G1.C4504g.f6515W
            nI.a r11 = r10.a()
            U0.f r12 = r15.m()
            if (r12 != 0) goto L_0x00c3
            U0.C4883j.c()
        L_0x00c3:
            r15.I()
            boolean r12 = r15.i()
            if (r12 == 0) goto L_0x00d0
            r15.p(r11)
            goto L_0x00d3
        L_0x00d0:
            r15.t()
        L_0x00d3:
            U0.m r11 = U0.F1.a(r15)
            nI.p r12 = r10.c()
            U0.F1.c(r11, r6, r12)
            nI.p r6 = r10.e()
            U0.F1.c(r11, r8, r6)
            nI.p r6 = r10.b()
            boolean r8 = r11.i()
            if (r8 != 0) goto L_0x00fd
            java.lang.Object r8 = r11.D()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r7)
            boolean r8 = kotlin.jvm.internal.C17542s.e(r8, r12)
            if (r8 != 0) goto L_0x010b
        L_0x00fd:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            r11.u(r8)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r11.w(r7, r6)
        L_0x010b:
            nI.p r6 = r10.d()
            U0.F1.c(r11, r9, r6)
            s0.N r6 = s0.C5843N.f28726a
            r7 = r4 & 112(0x70, float:1.57E-43)
            r8 = 6
            r7 = r7 | r8
            g(r6, r3, r15, r7)
            tK.v r7 = tK.C18030v.f147664a
            int r8 = tK.C18030v.f147665b
            tK.w r7 = r7.b(r15, r8)
            tK.c r7 = r7.a()
            N1.Y r20 = r7.c()
            Y1.j$a r7 = Y1.j.f14783b
            int r7 = r7.f()
            androidx.compose.ui.d$a r8 = androidx.compose.ui.d.f18749a
            float r1 = r1.b()
            r9 = 0
            r10 = 0
            androidx.compose.ui.d r1 = androidx.compose.foundation.layout.J.k(r8, r1, r9, r5, r10)
            androidx.compose.ui.d r1 = r6.b(r1)
            Y1.j r12 = Y1.j.h(r7)
            r22 = r4 & 14
            r23 = 0
            r24 = 65016(0xfdf8, float:9.1107E-41)
            r4 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r11 = 0
            r16 = 0
            r27 = r13
            r13 = r16
            r16 = 0
            r28 = r15
            r15 = r16
            r17 = 0
            r18 = 0
            r19 = 0
            r0 = r29
            r2 = r25
            r21 = r28
            O0.d1.b(r0, r1, r2, r4, r6, r7, r8, r9, r11, r12, r13, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r28.x()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x017b
            U0.C4895p.R()
        L_0x017b:
            r3 = r27
        L_0x017d:
            U0.Y0 r6 = r28.n()
            if (r6 == 0) goto L_0x0194
            wK.Q2 r7 = new wK.Q2
            r0 = r7
            r1 = r29
            r2 = r30
            r4 = r33
            r5 = r34
            r0.<init>(r1, r2, r3, r4, r5)
            r6.a(r7)
        L_0x0194:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wK.W2.l(java.lang.String, wK.Z2, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N m(String str, Z2 z22, d dVar, int i10, int i11, C4889m mVar, int i12) {
        l(str, z22, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    public static final void n(String str, C4889m mVar, int i10) {
        int i11;
        C4889m k10 = mVar.k(266939094);
        if ((i10 & 6) == 0) {
            i11 = (k10.V(str) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) != 2 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(266939094, i11, -1, "net.ikea.skapa.ui.components.HelperTextEmbeddedError (HelperText.kt:111)");
            }
            if (str != null && !C15854t.v0(str)) {
                d.a aVar = d.f18749a;
                C5844O.a(J.i(aVar, C18029u.f147649a.j()), k10, 0);
                l(str, Z2.Error, Z1.o(aVar, C18245N.Error, str), k10, (i11 & 14) | 48, 0);
            }
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new V2(str, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N o(String str, int i10, C4889m mVar, int i11) {
        n(str, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }
}
