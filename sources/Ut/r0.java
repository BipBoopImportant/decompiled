package ut;

import E1.I;
import G1.C4504g;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.C4912y;
import U0.F1;
import U0.M0;
import XH.C16807N;
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.G;
import androidx.compose.foundation.layout.x;
import androidx.compose.foundation.m;
import androidx.compose.foundation.o;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import c2.h;
import i1.C5437c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.p;
import nI.q;
import p0.s;
import s0.C5834E;
import s0.C5843N;
import s0.C5859e;
import s0.C5880z;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aU\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0001¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/d;", "modifier", "Landroidx/compose/foundation/o;", "scrollState", "Ls0/E;", "contentPadding", "Landroidx/compose/foundation/layout/d$e;", "horizontalArrangement", "Li1/c$c;", "verticalAlignment", "Lkotlin/Function1;", "Lc2/h;", "LXH/N;", "content", "b", "(Landroidx/compose/ui/d;Landroidx/compose/foundation/o;Ls0/E;Landroidx/compose/foundation/layout/d$e;Li1/c$c;LnI/q;LU0/m;II)V", "instore-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class r0 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements q<C5859e, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ float f104341a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ float f104342b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ o f104343c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C5834E f104344d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C5073d.e f104345e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C5437c.C0386c f104346f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ q<h, C4889m, Integer, C16807N> f104347g;

        a(float f10, float f11, o oVar, C5834E e10, C5073d.e eVar, C5437c.C0386c cVar, q<? super h, ? super C4889m, ? super Integer, C16807N> qVar) {
            this.f104341a = f10;
            this.f104342b = f11;
            this.f104343c = oVar;
            this.f104344d = e10;
            this.f104345e = eVar;
            this.f104346f = cVar;
            this.f104347g = qVar;
        }

        public final void a(C5859e eVar, C4889m mVar, int i10) {
            C17542s.j(eVar, "$this$BoxWithConstraints");
            if ((i10 & 6) == 0) {
                i10 |= mVar.V(eVar) ? 4 : 2;
            }
            if ((i10 & 19) != 18 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-1723817915, i10, -1, "com.ingka.ikea.instore.impl.composables.ScrollableRow.<anonymous> (ScrollableRow.kt:55)");
                }
                float B10 = h.B(eVar.c() - h.B(this.f104341a + this.f104342b));
                d a10 = x.a(D.h(m.b(d.f18749a, this.f104343c, false, (s) null, false, 14, (Object) null), this.f104344d), C5880z.Max);
                C5073d.e eVar2 = this.f104345e;
                C5437c.C0386c cVar = this.f104346f;
                q<h, C4889m, Integer, C16807N> qVar = this.f104347g;
                I b10 = G.b(eVar2, cVar, mVar, 0);
                int a11 = C4883j.a(mVar, 0);
                C4912y s10 = mVar.s();
                d e10 = c.e(mVar, a10);
                C4504g.a aVar = C4504g.f6515W;
                C17631a<C4504g> a12 = aVar.a();
                if (mVar.m() == null) {
                    C4883j.c();
                }
                mVar.I();
                if (mVar.i()) {
                    mVar.p(a12);
                } else {
                    mVar.t();
                }
                C4889m a13 = F1.a(mVar);
                F1.c(a13, b10, aVar.c());
                F1.c(a13, s10, aVar.e());
                p<C4504g, Integer, C16807N> b11 = aVar.b();
                if (a13.i() || !C17542s.e(a13.D(), Integer.valueOf(a11))) {
                    a13.u(Integer.valueOf(a11));
                    a13.w(Integer.valueOf(a11), b11);
                }
                F1.c(a13, e10, aVar.d());
                C5843N n10 = C5843N.f28726a;
                qVar.invoke(h.m(B10), mVar, 0);
                mVar.x();
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((C5859e) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x0193  */
    /* JADX WARNING: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00ce  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(androidx.compose.ui.d r18, androidx.compose.foundation.o r19, s0.C5834E r20, androidx.compose.foundation.layout.C5073d.e r21, i1.C5437c.C0386c r22, nI.q<? super c2.h, ? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r23, U0.C4889m r24, int r25, int r26) {
        /*
            r8 = r23
            r9 = r25
            java.lang.String r0 = "content"
            kotlin.jvm.internal.C17542s.j(r8, r0)
            r0 = 1219671151(0x48b2b46f, float:365987.47)
            r1 = r24
            U0.m r10 = r1.k(r0)
            r1 = r26 & 1
            if (r1 == 0) goto L_0x001c
            r2 = r9 | 6
            r3 = r2
            r2 = r18
            goto L_0x0030
        L_0x001c:
            r2 = r9 & 6
            if (r2 != 0) goto L_0x002d
            r2 = r18
            boolean r3 = r10.V(r2)
            if (r3 == 0) goto L_0x002a
            r3 = 4
            goto L_0x002b
        L_0x002a:
            r3 = 2
        L_0x002b:
            r3 = r3 | r9
            goto L_0x0030
        L_0x002d:
            r2 = r18
            r3 = r9
        L_0x0030:
            r4 = r9 & 48
            if (r4 != 0) goto L_0x0049
            r4 = r26 & 2
            if (r4 != 0) goto L_0x0043
            r4 = r19
            boolean r5 = r10.V(r4)
            if (r5 == 0) goto L_0x0045
            r5 = 32
            goto L_0x0047
        L_0x0043:
            r4 = r19
        L_0x0045:
            r5 = 16
        L_0x0047:
            r3 = r3 | r5
            goto L_0x004b
        L_0x0049:
            r4 = r19
        L_0x004b:
            r5 = r26 & 4
            if (r5 == 0) goto L_0x0054
            r3 = r3 | 384(0x180, float:5.38E-43)
        L_0x0051:
            r6 = r20
            goto L_0x0066
        L_0x0054:
            r6 = r9 & 384(0x180, float:5.38E-43)
            if (r6 != 0) goto L_0x0051
            r6 = r20
            boolean r7 = r10.V(r6)
            if (r7 == 0) goto L_0x0063
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x0065
        L_0x0063:
            r7 = 128(0x80, float:1.794E-43)
        L_0x0065:
            r3 = r3 | r7
        L_0x0066:
            r7 = r26 & 8
            if (r7 == 0) goto L_0x006f
            r3 = r3 | 3072(0xc00, float:4.305E-42)
        L_0x006c:
            r11 = r21
            goto L_0x0081
        L_0x006f:
            r11 = r9 & 3072(0xc00, float:4.305E-42)
            if (r11 != 0) goto L_0x006c
            r11 = r21
            boolean r12 = r10.V(r11)
            if (r12 == 0) goto L_0x007e
            r12 = 2048(0x800, float:2.87E-42)
            goto L_0x0080
        L_0x007e:
            r12 = 1024(0x400, float:1.435E-42)
        L_0x0080:
            r3 = r3 | r12
        L_0x0081:
            r12 = r26 & 16
            if (r12 == 0) goto L_0x008a
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
        L_0x0087:
            r13 = r22
            goto L_0x009c
        L_0x008a:
            r13 = r9 & 24576(0x6000, float:3.4438E-41)
            if (r13 != 0) goto L_0x0087
            r13 = r22
            boolean r14 = r10.V(r13)
            if (r14 == 0) goto L_0x0099
            r14 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009b
        L_0x0099:
            r14 = 8192(0x2000, float:1.14794E-41)
        L_0x009b:
            r3 = r3 | r14
        L_0x009c:
            r14 = r26 & 32
            r15 = 196608(0x30000, float:2.75506E-40)
            if (r14 == 0) goto L_0x00a4
            r3 = r3 | r15
            goto L_0x00b4
        L_0x00a4:
            r14 = r9 & r15
            if (r14 != 0) goto L_0x00b4
            boolean r14 = r10.F(r8)
            if (r14 == 0) goto L_0x00b1
            r14 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b3
        L_0x00b1:
            r14 = 65536(0x10000, float:9.18355E-41)
        L_0x00b3:
            r3 = r3 | r14
        L_0x00b4:
            r14 = 74899(0x12493, float:1.04956E-40)
            r14 = r14 & r3
            r15 = 74898(0x12492, float:1.04954E-40)
            if (r14 != r15) goto L_0x00ce
            boolean r14 = r10.l()
            if (r14 != 0) goto L_0x00c4
            goto L_0x00ce
        L_0x00c4:
            r10.L()
            r1 = r2
            r2 = r4
            r3 = r6
            r4 = r11
            r5 = r13
            goto L_0x018d
        L_0x00ce:
            r10.G()
            r14 = r9 & 1
            r15 = 1
            if (r14 == 0) goto L_0x00ee
            boolean r14 = r10.O()
            if (r14 == 0) goto L_0x00dd
            goto L_0x00ee
        L_0x00dd:
            r10.L()
            r1 = r26 & 2
            if (r1 == 0) goto L_0x00e6
            r3 = r3 & -113(0xffffffffffffff8f, float:NaN)
        L_0x00e6:
            r7 = r3
            r12 = r4
            r14 = r11
            r16 = r13
            r11 = r2
            r13 = r6
            goto L_0x012e
        L_0x00ee:
            if (r1 == 0) goto L_0x00f3
            androidx.compose.ui.d$a r1 = androidx.compose.ui.d.f18749a
            goto L_0x00f4
        L_0x00f3:
            r1 = r2
        L_0x00f4:
            r2 = r26 & 2
            r14 = 0
            if (r2 == 0) goto L_0x0100
            androidx.compose.foundation.o r2 = androidx.compose.foundation.m.c(r14, r10, r14, r15)
            r3 = r3 & -113(0xffffffffffffff8f, float:NaN)
            goto L_0x0101
        L_0x0100:
            r2 = r4
        L_0x0101:
            if (r5 == 0) goto L_0x010d
            float r4 = (float) r14
            float r4 = c2.h.B(r4)
            s0.E r4 = androidx.compose.foundation.layout.D.a(r4)
            goto L_0x010e
        L_0x010d:
            r4 = r6
        L_0x010e:
            if (r7 == 0) goto L_0x0117
            androidx.compose.foundation.layout.d r5 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$e r5 = r5.f()
            r11 = r5
        L_0x0117:
            if (r12 == 0) goto L_0x0127
            i1.c$a r5 = i1.C5437c.f24302a
            i1.c$c r5 = r5.l()
            r12 = r2
            r7 = r3
            r13 = r4
            r16 = r5
            r14 = r11
            r11 = r1
            goto L_0x012e
        L_0x0127:
            r12 = r2
            r7 = r3
            r14 = r11
            r16 = r13
            r11 = r1
            r13 = r4
        L_0x012e:
            r10.y()
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x013d
            r1 = -1
            java.lang.String r2 = "com.ingka.ikea.instore.impl.composables.ScrollableRow (ScrollableRow.kt:50)"
            U0.C4895p.S(r0, r7, r1, r2)
        L_0x013d:
            U0.I0 r0 = androidx.compose.ui.platform.C5100f0.k()
            java.lang.Object r0 = r10.Q(r0)
            c2.t r0 = (c2.t) r0
            float r1 = androidx.compose.foundation.layout.D.g(r13, r0)
            U0.I0 r0 = androidx.compose.ui.platform.C5100f0.k()
            java.lang.Object r0 = r10.Q(r0)
            c2.t r0 = (c2.t) r0
            float r2 = androidx.compose.foundation.layout.D.f(r13, r0)
            ut.r0$a r6 = new ut.r0$a
            r0 = r6
            r3 = r12
            r4 = r13
            r5 = r14
            r8 = r6
            r6 = r16
            r17 = r7
            r7 = r23
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r0 = 54
            r1 = -1723817915(0xffffffff9940a045, float:-9.9585335E-24)
            c1.a r4 = c1.c.e(r1, r15, r8, r10, r0)
            r0 = r17 & 14
            r6 = r0 | 3072(0xc00, float:4.305E-42)
            r7 = 6
            r2 = 0
            r3 = 0
            r1 = r11
            r5 = r10
            s0.C5858d.a(r1, r2, r3, r4, r5, r6, r7)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0187
            U0.C4895p.R()
        L_0x0187:
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r16
        L_0x018d:
            U0.Y0 r10 = r10.n()
            if (r10 == 0) goto L_0x01a2
            ut.q0 r11 = new ut.q0
            r0 = r11
            r6 = r23
            r7 = r25
            r8 = r26
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r10.a(r11)
        L_0x01a2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ut.r0.b(androidx.compose.ui.d, androidx.compose.foundation.o, s0.E, androidx.compose.foundation.layout.d$e, i1.c$c, nI.q, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N c(d dVar, o oVar, C5834E e10, C5073d.e eVar, C5437c.C0386c cVar, q qVar, int i10, int i11, C4889m mVar, int i12) {
        b(dVar, oVar, e10, eVar, cVar, qVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
