package Yn;

import E1.I;
import G1.C4504g;
import HJ.C15854t;
import Op.Y0;
import Op.Z0;
import Op.a1;
import SC.Q1;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.C4899r0;
import U0.C4912y;
import U0.F1;
import U0.M0;
import U0.o1;
import XH.C16807N;
import YH.C16877v;
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.foundation.layout.C5080k;
import androidx.compose.foundation.layout.D;
import androidx.compose.ui.platform.C5116k1;
import c2.h;
import com.sugarcube.core.logger.DslKt;
import eo.c;
import i1.C5437c;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;
import s0.C5861g;
import s0.C5862h;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007²\u0006\u000e\u0010\u0006\u001a\u00020\u00058\n@\nX\u0002"}, d2 = {"Leo/c;", "uiState", "LXH/N;", "d", "(Leo/c;LU0/m;I)V", "", "isExpanded", "checkout-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class g0 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f89448a;

        a(c cVar) {
            this.f89448a = cVar;
        }

        /* access modifiers changed from: private */
        public static final C16807N c(C5861g gVar, Z0 z02) {
            C17542s.j(z02, "event");
            IllegalStateException illegalStateException = new IllegalStateException("No events expected here, got: " + z02);
            e eVar = e.ERROR;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str = null;
            String str2 = null;
            for (C11819b bVar : arrayList) {
                if (str == null) {
                    String a10 = C11818a.a((String) null, illegalStateException);
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
                }
                String str3 = str;
                if (str2 == null) {
                    String name = gVar.getClass().getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str4 = str2;
                bVar.a(eVar, str4, false, illegalStateException, str3);
                str = str3;
                str2 = str4;
            }
            return C16807N.f139792a;
        }

        public final void b(C4889m mVar, int i10) {
            C4889m mVar2 = mVar;
            int i11 = i10;
            if ((i11 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(1343094147, i11, -1, "com.ingka.ikea.checkout.impl.compose.OrderProductSummaryContent.<anonymous> (OrderProductSummaryContent.kt:62)");
                }
                androidx.compose.ui.d a10 = C5116k1.a(androidx.compose.ui.d.f18749a, "OrderProductSummaryTestTags.PRODUCT_CONTENT");
                c cVar = this.f89448a;
                I a11 = C5080k.a(C5073d.f18068a.g(), C5437c.f24302a.k(), mVar2, 0);
                int a12 = C4883j.a(mVar2, 0);
                C4912y s10 = mVar.s();
                androidx.compose.ui.d e10 = androidx.compose.ui.c.e(mVar2, a10);
                C4504g.a aVar = C4504g.f6515W;
                C17631a<C4504g> a13 = aVar.a();
                if (mVar.m() == null) {
                    C4883j.c();
                }
                mVar.I();
                if (mVar.i()) {
                    mVar2.p(a13);
                } else {
                    mVar.t();
                }
                C4889m a14 = F1.a(mVar);
                F1.c(a14, a11, aVar.c());
                F1.c(a14, s10, aVar.e());
                p<C4504g, Integer, C16807N> b10 = aVar.b();
                if (a14.i() || !C17542s.e(a14.D(), Integer.valueOf(a12))) {
                    a14.u(Integer.valueOf(a12));
                    a14.w(Integer.valueOf(a12), b10);
                }
                F1.c(a14, e10, aVar.d());
                C5862h hVar = C5862h.f28810a;
                mVar2.W(1423784671);
                int i12 = 0;
                for (Object next : cVar.b()) {
                    int i13 = i12 + 1;
                    if (i12 < 0) {
                        C16877v.x();
                    }
                    a1 a1Var = (a1) next;
                    androidx.compose.ui.d m10 = D.m(androidx.compose.ui.d.f18749a, 0.0f, h.B(i12 > 0 ? (float) 24 : (float) 0), 0.0f, 0.0f, 13, (Object) null);
                    float B10 = h.B((float) 0);
                    mVar2.W(-452163593);
                    Object D10 = mVar.D();
                    if (D10 == C4889m.f14007a.a()) {
                        D10 = new f0(hVar);
                        mVar2.u(D10);
                    }
                    mVar.P();
                    Y0.O(a1Var, m10, (Q1) null, B10, 0.0f, 0.0f, (C17642l) D10, mVar, 3072, 52);
                    i12 = i13;
                }
                mVar.P();
                mVar.x();
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: nI.l} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void d(eo.c r21, U0.C4889m r22, int r23) {
        /*
            r0 = r21
            r1 = r23
            java.lang.String r2 = "uiState"
            kotlin.jvm.internal.C17542s.j(r0, r2)
            r2 = 52696343(0x3241517, float:4.821948E-37)
            r3 = r22
            U0.m r14 = r3.k(r2)
            r3 = r1 & 6
            r4 = 2
            if (r3 != 0) goto L_0x0022
            boolean r3 = r14.F(r0)
            if (r3 == 0) goto L_0x001f
            r3 = 4
            goto L_0x0020
        L_0x001f:
            r3 = r4
        L_0x0020:
            r3 = r3 | r1
            goto L_0x0023
        L_0x0022:
            r3 = r1
        L_0x0023:
            r5 = r3 & 3
            if (r5 != r4) goto L_0x0035
            boolean r4 = r14.l()
            if (r4 != 0) goto L_0x002e
            goto L_0x0035
        L_0x002e:
            r14.L()
            r20 = r14
            goto L_0x00fc
        L_0x0035:
            boolean r4 = U0.C4895p.J()
            if (r4 == 0) goto L_0x0041
            r4 = -1
            java.lang.String r5 = "com.ingka.ikea.checkout.impl.compose.OrderProductSummaryContent (OrderProductSummaryContent.kt:41)"
            U0.C4895p.S(r2, r3, r4, r5)
        L_0x0041:
            r2 = 0
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r4 = 1611934803(0x60142c53, float:4.2708E19)
            r14.W(r4)
            boolean r4 = r14.F(r0)
            java.lang.Object r5 = r14.D()
            if (r4 != 0) goto L_0x005c
            U0.m$a r4 = U0.C4889m.f14007a
            java.lang.Object r4 = r4.a()
            if (r5 != r4) goto L_0x0064
        L_0x005c:
            Yn.c0 r5 = new Yn.c0
            r5.<init>(r0)
            r14.u(r5)
        L_0x0064:
            r6 = r5
            nI.a r6 = (nI.C17631a) r6
            r14.P()
            r8 = 0
            r9 = 6
            r4 = 0
            r5 = 0
            r7 = r14
            java.lang.Object r3 = f1.C5301c.e(r3, r4, r5, r6, r7, r8, r9)
            U0.r0 r3 = (U0.C4899r0) r3
            androidx.compose.ui.d$a r4 = androidx.compose.ui.d.f18749a
            java.lang.String r5 = "OrderProductSummaryTestTags.CONTENT"
            androidx.compose.ui.d r4 = androidx.compose.ui.platform.C5116k1.a(r4, r5)
            r5 = 0
            r6 = 0
            r7 = 1
            androidx.compose.ui.d r5 = androidx.compose.foundation.layout.J.h(r4, r5, r7, r6)
            int r4 = rv.C11849b.f102353u1
            java.lang.String r8 = J1.j.b(r4, r14, r2)
            int r4 = rv.C11848a.f102160c
            int r6 = r21.c()
            int r9 = r21.c()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.Object[] r9 = new java.lang.Object[]{r9}
            java.lang.String r2 = J1.j.a(r4, r6, r9, r14, r2)
            SC.r r9 = SC.r.Large
            boolean r16 = f(r3)
            r4 = 1611952170(0x6014702a, float:4.278438E19)
            r14.W(r4)
            boolean r4 = r14.V(r3)
            java.lang.Object r6 = r14.D()
            if (r4 != 0) goto L_0x00be
            U0.m$a r4 = U0.C4889m.f14007a
            java.lang.Object r4 = r4.a()
            if (r6 != r4) goto L_0x00c6
        L_0x00be:
            Yn.d0 r6 = new Yn.d0
            r6.<init>(r3)
            r14.u(r6)
        L_0x00c6:
            r4 = r6
            nI.l r4 = (nI.C17642l) r4
            r14.P()
            Yn.g0$a r3 = new Yn.g0$a
            r3.<init>(r0)
            r6 = 54
            r10 = 1343094147(0x500dfd83, float:9.5288064E9)
            c1.a r15 = c1.c.e(r10, r7, r3, r14, r6)
            r18 = 384(0x180, float:5.38E-43)
            r19 = 3720(0xe88, float:5.213E-42)
            r6 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r3 = 0
            r20 = r14
            r14 = r3
            r17 = 102236544(0x6180180, float:2.8589125E-35)
            r3 = r8
            r7 = r2
            r8 = r16
            r16 = r20
            SC.C13627q.b(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            boolean r2 = U0.C4895p.J()
            if (r2 == 0) goto L_0x00fc
            U0.C4895p.R()
        L_0x00fc:
            U0.Y0 r2 = r20.n()
            if (r2 == 0) goto L_0x010a
            Yn.e0 r3 = new Yn.e0
            r3.<init>(r0, r1)
            r2.a(r3)
        L_0x010a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Yn.g0.d(eo.c, U0.m, int):void");
    }

    /* access modifiers changed from: private */
    public static final C4899r0 e(c cVar) {
        return u1.e(Boolean.valueOf(cVar.a()), (o1) null, 2, (Object) null);
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
    public static final C16807N i(c cVar, int i10, C4889m mVar, int i11) {
        d(cVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }
}
