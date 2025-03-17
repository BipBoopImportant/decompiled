package Hf;

import Gf.c;
import U0.C4889m;
import U0.C4895p;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.p;
import androidx.compose.foundation.layout.u;
import androidx.compose.ui.d;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.q;
import s0.C5872r;
import xf.h;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a7\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u001e\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0002H\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"LGf/c$e;", "item", "Lkotlin/Function3;", "", "LGf/c$j;", "Lxf/h;", "LXH/N;", "onPillClicked", "b", "(LGf/c$e;LnI/q;LU0/m;I)V", "browse-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class H {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements q<C5872r, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c.e f60836a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ q<String, c.j, h, C16807N> f60837b;

        a(c.e eVar, q<? super String, ? super c.j, ? super h, C16807N> qVar) {
            this.f60836a = eVar;
            this.f60837b = qVar;
        }

        /* access modifiers changed from: private */
        public static final C16807N e(q qVar, c.d dVar) {
            c.d.a aVar = (c.d.a) dVar;
            qVar.invoke(aVar.b(), aVar.d(), h.COMMON_SEARCH_TERM);
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N f(q qVar, c.d dVar) {
            c.d.b bVar = (c.d.b) dVar;
            qVar.invoke(bVar.a(), bVar.b(), h.COMMON_SEARCH_TERM);
            return C16807N.f139792a;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: nI.a} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: nI.a} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void c(s0.C5872r r17, U0.C4889m r18, int r19) {
            /*
                r16 = this;
                r0 = r16
                r13 = r18
                r1 = r19
                java.lang.String r2 = "$this$FlowRow"
                r3 = r17
                kotlin.jvm.internal.C17542s.j(r3, r2)
                r2 = r1 & 17
                r3 = 16
                if (r2 != r3) goto L_0x001f
                boolean r2 = r18.l()
                if (r2 != 0) goto L_0x001a
                goto L_0x001f
            L_0x001a:
                r18.L()
                goto L_0x0117
            L_0x001f:
                boolean r2 = U0.C4895p.J()
                if (r2 == 0) goto L_0x002e
                r2 = -1
                java.lang.String r3 = "com.ingka.ikea.app.browseandsearch.searchv2.compose.PopularSearchesFlowRow.<anonymous> (PopularSearchesFlowRow.kt:33)"
                r4 = 1480479964(0x583e54dc, float:8.3708671E14)
                U0.C4895p.S(r4, r1, r2, r3)
            L_0x002e:
                Gf.c$e r1 = r0.f60836a
                java.util.List r1 = r1.g()
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                nI.q<java.lang.String, Gf.c$j, xf.h, XH.N> r14 = r0.f60837b
                java.util.Iterator r15 = r1.iterator()
            L_0x003c:
                boolean r1 = r15.hasNext()
                if (r1 == 0) goto L_0x010e
                java.lang.Object r1 = r15.next()
                Gf.c$d r1 = (Gf.c.d) r1
                boolean r2 = r1 instanceof Gf.c.d.a
                if (r2 == 0) goto L_0x00a6
                r2 = -1918875372(0xffffffff8da04914, float:-9.878354E-31)
                r13.W(r2)
                r2 = r1
                Gf.c$d$a r2 = (Gf.c.d.a) r2
                java.lang.String r3 = r2.c()
                int r2 = r2.a()
                SC.J1 r5 = SC.J1.Small
                SC.K0 r7 = SC.K0.LEADING
                java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
                r2 = -477538722(0xffffffffe389565e, float:-5.0668547E21)
                r13.W(r2)
                boolean r2 = r13.V(r14)
                boolean r6 = r13.F(r1)
                r2 = r2 | r6
                java.lang.Object r6 = r18.D()
                if (r2 != 0) goto L_0x0082
                U0.m$a r2 = U0.C4889m.f14007a
                java.lang.Object r2 = r2.a()
                if (r6 != r2) goto L_0x008a
            L_0x0082:
                Hf.F r6 = new Hf.F
                r6.<init>(r14, r1)
                r13.u(r6)
            L_0x008a:
                r9 = r6
                nI.a r9 = (nI.C17631a) r9
                r18.P()
                r11 = 1597440(0x186000, float:2.23849E-39)
                r12 = 166(0xa6, float:2.33E-43)
                r2 = 0
                r6 = 0
                r8 = 0
                r10 = 0
                r1 = r3
                r3 = r6
                r6 = r8
                r8 = r10
                r10 = r18
                SC.I1.h(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
                r18.P()
                goto L_0x003c
            L_0x00a6:
                boolean r2 = r1 instanceof Gf.c.d.b
                if (r2 == 0) goto L_0x00ff
                r2 = -1918326455(0xffffffff8da8a949, float:-1.0394553E-30)
                r13.W(r2)
                r2 = r1
                Gf.c$d$b r2 = (Gf.c.d.b) r2
                java.lang.String r2 = r2.a()
                SC.J1 r5 = SC.J1.Small
                r3 = -477520896(0xffffffffe3899c00, float:-5.07689E21)
                r13.W(r3)
                boolean r3 = r13.V(r14)
                boolean r4 = r13.F(r1)
                r3 = r3 | r4
                java.lang.Object r4 = r18.D()
                if (r3 != 0) goto L_0x00d6
                U0.m$a r3 = U0.C4889m.f14007a
                java.lang.Object r3 = r3.a()
                if (r4 != r3) goto L_0x00de
            L_0x00d6:
                Hf.G r4 = new Hf.G
                r4.<init>(r14, r1)
                r13.u(r4)
            L_0x00de:
                r9 = r4
                nI.a r9 = (nI.C17631a) r9
                r18.P()
                r11 = 24576(0x6000, float:3.4438E-41)
                r12 = 238(0xee, float:3.34E-43)
                r3 = 0
                r4 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                r10 = 0
                r1 = r2
                r2 = r3
                r3 = r4
                r4 = r6
                r6 = r7
                r7 = r8
                r8 = r10
                r10 = r18
                SC.I1.h(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
                r18.P()
                goto L_0x003c
            L_0x00ff:
                r1 = -477542825(0xffffffffe3894657, float:-5.064545E21)
                r13.W(r1)
                r18.P()
                XH.t r1 = new XH.t
                r1.<init>()
                throw r1
            L_0x010e:
                boolean r1 = U0.C4895p.J()
                if (r1 == 0) goto L_0x0117
                U0.C4895p.R()
            L_0x0117:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Hf.H.a.c(s0.r, U0.m, int):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            c((C5872r) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    public static final void b(c.e eVar, q<? super String, ? super c.j, ? super h, C16807N> qVar, C4889m mVar, int i10) {
        int i11;
        C17542s.j(eVar, "item");
        C17542s.j(qVar, "onPillClicked");
        C4889m k10 = mVar.k(-489515935);
        if ((i10 & 6) == 0) {
            i11 = (k10.F(eVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= k10.F(qVar) ? 32 : 16;
        }
        if ((i11 & 19) != 18 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-489515935, i11, -1, "com.ingka.ikea.app.browseandsearch.searchv2.compose.PopularSearchesFlowRow (PopularSearchesFlowRow.kt:27)");
            }
            C5073d dVar = C5073d.f18068a;
            p.a(D.k(d.f18749a, c2.h.B((float) 16), 0.0f, 2, (Object) null), dVar.n(c2.h.B((float) 8)), dVar.n(c2.h.B((float) 4)), 0, 0, (u) null, c1.c.e(1480479964, true, new a(eVar, qVar), k10, 54), k10, 1573302, 56);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new E(eVar, qVar, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N c(c.e eVar, q qVar, int i10, C4889m mVar, int i11) {
        b(eVar, qVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }
}
