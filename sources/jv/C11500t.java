package jv;

import U0.C4889m;
import U0.C4895p;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import androidx.compose.foundation.layout.D;
import androidx.compose.ui.d;
import c1.c;
import c2.h;
import hv.C11387c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.p;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a/\u0010\t\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00072\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\t\u0010\n\u001a/\u0010\f\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00072\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\f\u0010\r\u001a'\u0010\u000e\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00072\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lhv/c;", "show", "Landroidx/compose/ui/d;", "modifier", "LXH/N;", "g", "(Lhv/c;Landroidx/compose/ui/d;LU0/m;II)V", "Lkotlin/Function0;", "onAddToCalendarClick", "i", "(Lhv/c;LnI/a;Landroidx/compose/ui/d;LU0/m;II)V", "innerContent", "k", "(Lhv/c;LnI/p;Landroidx/compose/ui/d;LU0/m;II)V", "e", "(LnI/a;Landroidx/compose/ui/d;LU0/m;II)V", "liveshopping-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: jv.t  reason: case insensitive filesystem */
public final class C11500t {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: jv.t$a */
    static final class a implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f98950a;

        a(C17631a<C16807N> aVar) {
            this.f98950a = aVar;
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(12767429, i10, -1, "com.ingka.ikea.liveshopping.impl.presentation.compose.EventTextDescriptionWithAddToCalendarButton.<anonymous> (EventTextDescription.kt:60)");
                }
                C11500t.e(this.f98950a, D.k(d.f18749a, 0.0f, h.B((float) 32), 1, (Object) null), mVar, 48, 0);
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

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void e(nI.C17631a<XH.C16807N> r19, androidx.compose.ui.d r20, U0.C4889m r21, int r22, int r23) {
        /*
            r13 = r19
            r14 = r22
            r15 = r23
            r0 = -130562375(0xfffffffff837c6b9, float:-1.4909702E34)
            r1 = r21
            U0.m r12 = r1.k(r0)
            r1 = r15 & 1
            if (r1 == 0) goto L_0x0016
            r1 = r14 | 6
            goto L_0x0026
        L_0x0016:
            r1 = r14 & 6
            if (r1 != 0) goto L_0x0025
            boolean r1 = r12.F(r13)
            if (r1 == 0) goto L_0x0022
            r1 = 4
            goto L_0x0023
        L_0x0022:
            r1 = 2
        L_0x0023:
            r1 = r1 | r14
            goto L_0x0026
        L_0x0025:
            r1 = r14
        L_0x0026:
            r2 = r15 & 2
            if (r2 == 0) goto L_0x002f
            r1 = r1 | 48
        L_0x002c:
            r3 = r20
            goto L_0x0041
        L_0x002f:
            r3 = r14 & 48
            if (r3 != 0) goto L_0x002c
            r3 = r20
            boolean r4 = r12.V(r3)
            if (r4 == 0) goto L_0x003e
            r4 = 32
            goto L_0x0040
        L_0x003e:
            r4 = 16
        L_0x0040:
            r1 = r1 | r4
        L_0x0041:
            r4 = r1 & 19
            r5 = 18
            if (r4 != r5) goto L_0x0054
            boolean r4 = r12.l()
            if (r4 != 0) goto L_0x004e
            goto L_0x0054
        L_0x004e:
            r12.L()
            r16 = r12
            goto L_0x00ad
        L_0x0054:
            if (r2 == 0) goto L_0x005a
            androidx.compose.ui.d$a r2 = androidx.compose.ui.d.f18749a
            r11 = r2
            goto L_0x005b
        L_0x005a:
            r11 = r3
        L_0x005b:
            boolean r2 = U0.C4895p.J()
            if (r2 == 0) goto L_0x0067
            r2 = -1
            java.lang.String r3 = "com.ingka.ikea.liveshopping.impl.presentation.compose.AddToCalendarButton (EventTextDescription.kt:107)"
            U0.C4895p.S(r0, r1, r2, r3)
        L_0x0067:
            int r0 = bv.C11131a.f90752a
            r2 = 0
            java.lang.String r0 = J1.j.b(r0, r12, r2)
            r2 = 0
            r3 = 0
            r4 = 1
            androidx.compose.ui.d r2 = androidx.compose.foundation.layout.J.h(r11, r2, r4, r3)
            SC.N r3 = SC.N.Secondary
            int r4 = uK.C18146a.f148290W0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)
            SC.K0 r7 = SC.K0.TRAILING
            int r1 = r1 << 27
            r4 = 1879048192(0x70000000, float:1.58456325E29)
            r1 = r1 & r4
            r4 = 12585984(0xc00c00, float:1.763672E-38)
            r16 = r1 | r4
            r17 = 308(0x134, float:4.32E-43)
            r4 = 0
            r5 = 0
            r8 = 0
            r9 = 0
            r1 = r2
            r2 = r4
            r4 = r5
            r5 = r8
            r8 = r9
            r9 = r19
            r10 = r12
            r18 = r11
            r11 = r16
            r16 = r12
            r12 = r17
            SC.L.b(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x00ab
            U0.C4895p.R()
        L_0x00ab:
            r3 = r18
        L_0x00ad:
            U0.Y0 r0 = r16.n()
            if (r0 == 0) goto L_0x00bb
            jv.s r1 = new jv.s
            r1.<init>(r13, r3, r14, r15)
            r0.a(r1)
        L_0x00bb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: jv.C11500t.e(nI.a, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N f(C17631a aVar, d dVar, int i10, int i11, C4889m mVar, int i12) {
        e(aVar, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    public static final void g(C11387c cVar, d dVar, C4889m mVar, int i10, int i11) {
        int i12;
        C17542s.j(cVar, "show");
        C4889m k10 = mVar.k(1013544869);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (k10.F(cVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 2;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= k10.V(dVar) ? 32 : 16;
        }
        if ((i12 & 19) != 18 || !k10.l()) {
            if (i13 != 0) {
                dVar = d.f18749a;
            }
            if (C4895p.J()) {
                C4895p.S(1013544869, i12, -1, "com.ingka.ikea.liveshopping.impl.presentation.compose.EventTextDescription (EventTextDescription.kt:36)");
            }
            k(cVar, C11485e.f98841a.a(), dVar, k10, (i12 & 14) | 48 | ((i12 << 3) & 896), 0);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new C11496p(cVar, dVar, i10, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N h(C11387c cVar, d dVar, int i10, int i11, C4889m mVar, int i12) {
        g(cVar, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    public static final void i(C11387c cVar, C17631a<C16807N> aVar, d dVar, C4889m mVar, int i10, int i11) {
        int i12;
        C17542s.j(cVar, "show");
        C17542s.j(aVar, "onAddToCalendarClick");
        C4889m k10 = mVar.k(53043353);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (k10.F(cVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= k10.F(aVar) ? 32 : 16;
        }
        int i13 = i11 & 4;
        if (i13 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= k10.V(dVar) ? 256 : 128;
        }
        if ((i12 & 147) != 146 || !k10.l()) {
            if (i13 != 0) {
                dVar = d.f18749a;
            }
            if (C4895p.J()) {
                C4895p.S(53043353, i12, -1, "com.ingka.ikea.liveshopping.impl.presentation.compose.EventTextDescriptionWithAddToCalendarButton (EventTextDescription.kt:55)");
            }
            k(cVar, c.e(12767429, true, new a(aVar), k10, 54), dVar, k10, (i12 & 14) | 48 | (i12 & 896), 0);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        d dVar2 = dVar;
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new C11498r(cVar, aVar, dVar2, i10, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N j(C11387c cVar, C17631a aVar, d dVar, int i10, int i11, C4889m mVar, int i12) {
        i(cVar, aVar, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01f8  */
    /* JADX WARNING: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void k(hv.C11387c r32, nI.p<? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r33, androidx.compose.ui.d r34, U0.C4889m r35, int r36, int r37) {
        /*
            r2 = r33
            r4 = r36
            r0 = 2
            r1 = 4
            r3 = -145435505(0xfffffffff754d48f, float:-4.3167115E33)
            r5 = r35
            U0.m r5 = r5.k(r3)
            r6 = r37 & 1
            if (r6 == 0) goto L_0x0018
            r6 = r4 | 6
            r15 = r32
            goto L_0x002a
        L_0x0018:
            r6 = r4 & 6
            r15 = r32
            if (r6 != 0) goto L_0x0029
            boolean r6 = r5.F(r15)
            if (r6 == 0) goto L_0x0026
            r6 = r1
            goto L_0x0027
        L_0x0026:
            r6 = r0
        L_0x0027:
            r6 = r6 | r4
            goto L_0x002a
        L_0x0029:
            r6 = r4
        L_0x002a:
            r0 = r37 & 2
            if (r0 == 0) goto L_0x0031
            r6 = r6 | 48
            goto L_0x0041
        L_0x0031:
            r0 = r4 & 48
            if (r0 != 0) goto L_0x0041
            boolean r0 = r5.F(r2)
            if (r0 == 0) goto L_0x003e
            r0 = 32
            goto L_0x0040
        L_0x003e:
            r0 = 16
        L_0x0040:
            r6 = r6 | r0
        L_0x0041:
            r0 = r37 & 4
            if (r0 == 0) goto L_0x004b
            r6 = r6 | 384(0x180, float:5.38E-43)
        L_0x0047:
            r1 = r34
        L_0x0049:
            r14 = r6
            goto L_0x005e
        L_0x004b:
            r1 = r4 & 384(0x180, float:5.38E-43)
            if (r1 != 0) goto L_0x0047
            r1 = r34
            boolean r7 = r5.V(r1)
            if (r7 == 0) goto L_0x005a
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x005c
        L_0x005a:
            r7 = 128(0x80, float:1.794E-43)
        L_0x005c:
            r6 = r6 | r7
            goto L_0x0049
        L_0x005e:
            r6 = r14 & 147(0x93, float:2.06E-43)
            r7 = 146(0x92, float:2.05E-43)
            if (r6 != r7) goto L_0x0072
            boolean r6 = r5.l()
            if (r6 != 0) goto L_0x006b
            goto L_0x0072
        L_0x006b:
            r5.L()
            r3 = r5
            r5 = r1
            goto L_0x01f2
        L_0x0072:
            if (r0 == 0) goto L_0x0077
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            goto L_0x0078
        L_0x0077:
            r0 = r1
        L_0x0078:
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x0084
            r1 = -1
            java.lang.String r6 = "com.ingka.ikea.liveshopping.impl.presentation.compose.EventTextDescriptionWithInnerContent (EventTextDescription.kt:73)"
            U0.C4895p.S(r3, r14, r1, r6)
        L_0x0084:
            androidx.compose.foundation.layout.d r1 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r1 = r1.g()
            i1.c$a r3 = i1.C5437c.f24302a
            i1.c$b r3 = r3.k()
            r6 = 0
            E1.I r1 = androidx.compose.foundation.layout.C5080k.a(r1, r3, r5, r6)
            int r3 = U0.C4883j.a(r5, r6)
            U0.y r6 = r5.s()
            androidx.compose.ui.d r7 = androidx.compose.ui.c.e(r5, r0)
            G1.g$a r8 = G1.C4504g.f6515W
            nI.a r9 = r8.a()
            U0.f r10 = r5.m()
            if (r10 != 0) goto L_0x00b0
            U0.C4883j.c()
        L_0x00b0:
            r5.I()
            boolean r10 = r5.i()
            if (r10 == 0) goto L_0x00bd
            r5.p(r9)
            goto L_0x00c0
        L_0x00bd:
            r5.t()
        L_0x00c0:
            U0.m r9 = U0.F1.a(r5)
            nI.p r10 = r8.c()
            U0.F1.c(r9, r1, r10)
            nI.p r1 = r8.e()
            U0.F1.c(r9, r6, r1)
            nI.p r1 = r8.b()
            boolean r6 = r9.i()
            if (r6 != 0) goto L_0x00ea
            java.lang.Object r6 = r9.D()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r3)
            boolean r6 = kotlin.jvm.internal.C17542s.e(r6, r10)
            if (r6 != 0) goto L_0x00f8
        L_0x00ea:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r3)
            r9.u(r6)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r9.w(r3, r1)
        L_0x00f8:
            nI.p r1 = r8.d()
            U0.F1.c(r9, r7, r1)
            s0.h r1 = s0.C5862h.f28810a
            java.lang.String r1 = r32.j()
            r3 = -1875612830(0xffffffff90346b62, float:-3.5581465E-29)
            r5.W(r3)
            if (r1 != 0) goto L_0x0111
            r3 = r5
            r31 = r14
            goto L_0x0168
        L_0x0111:
            TC.b$a$b r6 = TC.C13679b.a.C2856b.f116680a
            tK.v r3 = tK.C18030v.f147664a
            int r7 = tK.C18030v.f147665b
            tK.h r3 = r3.a(r5, r7)
            long r8 = r3.H0()
            androidx.compose.ui.d$a r16 = androidx.compose.ui.d.f18749a
            r3 = 8
            float r3 = (float) r3
            float r20 = c2.h.B(r3)
            r21 = 7
            r22 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            androidx.compose.ui.d r3 = androidx.compose.foundation.layout.D.m(r16, r17, r18, r19, r20, r21, r22)
            java.lang.String r7 = "formattedScheduledDate"
            androidx.compose.ui.d r7 = androidx.compose.ui.platform.C5116k1.a(r3, r7)
            r29 = 0
            r30 = 262128(0x3fff0, float:3.6732E-40)
            r10 = 0
            r12 = 0
            r13 = 0
            r3 = 0
            r31 = r14
            r14 = r3
            r16 = 0
            r15 = r16
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r28 = 432(0x1b0, float:6.05E-43)
            r3 = r5
            r5 = r1
            r27 = r3
            SC.C13607l.j(r5, r6, r7, r8, r10, r12, r13, r14, r15, r17, r18, r19, r20, r22, r23, r24, r25, r26, r27, r28, r29, r30)
        L_0x0168:
            r3.P()
            java.lang.String r5 = r32.o()
            TC.b$b$a r6 = TC.C13679b.C2857b.a.f116683a
            r29 = 0
            r30 = 262140(0x3fffc, float:3.67336E-40)
            r7 = 0
            r8 = 0
            r10 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r28 = 48
            r27 = r3
            SC.C13607l.j(r5, r6, r7, r8, r10, r12, r13, r14, r15, r17, r18, r19, r20, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            int r1 = r31 >> 3
            r1 = r1 & 14
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.invoke(r3, r1)
            java.lang.String r5 = r32.i()
            r1 = -1875597092(0xffffffff9034a8dc, float:-3.5628825E-29)
            r3.W(r1)
            if (r5 != 0) goto L_0x01b1
            goto L_0x01e2
        L_0x01b1:
            TC.b$a$a r6 = TC.C13679b.a.C2855a.f116679a
            androidx.compose.ui.d$a r1 = androidx.compose.ui.d.f18749a
            java.lang.String r7 = "eventTextDescription"
            androidx.compose.ui.d r7 = androidx.compose.ui.platform.C5116k1.a(r1, r7)
            r29 = 0
            r30 = 262136(0x3fff8, float:3.67331E-40)
            r8 = 0
            r10 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r28 = 432(0x1b0, float:6.05E-43)
            r27 = r3
            SC.C13607l.j(r5, r6, r7, r8, r10, r12, r13, r14, r15, r17, r18, r19, r20, r22, r23, r24, r25, r26, r27, r28, r29, r30)
        L_0x01e2:
            r3.P()
            r3.x()
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x01f1
            U0.C4895p.R()
        L_0x01f1:
            r5 = r0
        L_0x01f2:
            U0.Y0 r6 = r3.n()
            if (r6 == 0) goto L_0x020a
            jv.q r7 = new jv.q
            r0 = r7
            r1 = r32
            r2 = r33
            r3 = r5
            r4 = r36
            r5 = r37
            r0.<init>(r1, r2, r3, r4, r5)
            r6.a(r7)
        L_0x020a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: jv.C11500t.k(hv.c, nI.p, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N l(C11387c cVar, p pVar, d dVar, int i10, int i11, C4889m mVar, int i12) {
        k(cVar, pVar, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
