package en;

import KJ.C15987c;
import O0.C4731h0;
import O0.C4735j0;
import U0.C4889m;
import U0.C4895p;
import U0.M0;
import XH.C16807N;
import YH.C16877v;
import androidx.compose.ui.d;
import c1.c;
import c2.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import nI.q;
import o1.C5673m;
import ow.f;
import p1.C5749w0;
import r0.m;
import r1.C5817c;
import r1.g;
import s0.C5842M;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aC\u0010\n\u001a\u00020\b2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\b0\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"LKJ/c;", "Low/f;", "tabs", "", "selectedIndex", "Landroidx/compose/ui/d;", "modifier", "Lkotlin/Function1;", "LXH/N;", "onTabSelected", "c", "(LKJ/c;ILandroidx/compose/ui/d;LnI/l;LU0/m;II)V", "bottomnavigationbar_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: en.d  reason: case insensitive filesystem */
public final class C11253d {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: en.d$a */
    static final class a implements q<C5842M, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C15987c<f> f97144a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f97145b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17642l<f, C16807N> f97146c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C4731h0 f97147d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: en.d$a$a  reason: collision with other inner class name */
        static final class C2154a implements p<C4889m, Integer, C16807N> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ f f97148a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ boolean f97149b;

            C2154a(f fVar, boolean z10) {
                this.f97148a = fVar;
                this.f97149b = z10;
            }

            public final void a(C4889m mVar, int i10) {
                if ((i10 & 3) != 2 || !mVar.l()) {
                    if (C4895p.J()) {
                        C4895p.S(-12263914, i10, -1, "com.ingka.ikea.bottomnavigationbar.BottomNavigationBar.<anonymous>.<anonymous>.<anonymous> (BottomNavigationBar.kt:60)");
                    }
                    this.f97148a.d(this.f97149b, d.f18749a, mVar, 48);
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

        a(C15987c<? extends f> cVar, int i10, C17642l<? super f, C16807N> lVar, C4731h0 h0Var) {
            this.f97144a = cVar;
            this.f97145b = i10;
            this.f97146c = lVar;
            this.f97147d = h0Var;
        }

        /* access modifiers changed from: private */
        public static final C16807N c(C17642l lVar, f fVar) {
            lVar.invoke(fVar);
            return C16807N.f139792a;
        }

        public final void b(C5842M m10, C4889m mVar, int i10) {
            int i11;
            C5842M m11 = m10;
            C4889m mVar2 = mVar;
            C17542s.j(m11, "$this$NavigationBar");
            if ((i10 & 6) == 0) {
                i11 = i10 | (mVar2.V(m11) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i11 & 19) != 18 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(498099831, i11, -1, "com.ingka.ikea.bottomnavigationbar.BottomNavigationBar.<anonymous> (BottomNavigationBar.kt:50)");
                }
                C15987c<f> cVar = this.f97144a;
                int i12 = this.f97145b;
                C17642l<f, C16807N> lVar = this.f97146c;
                C4731h0 h0Var = this.f97147d;
                int i13 = 0;
                for (T next : cVar) {
                    int i14 = i13 + 1;
                    if (i13 < 0) {
                        C16877v.x();
                    }
                    f fVar = (f) next;
                    boolean z10 = i13 == i12;
                    mVar2.W(-742139099);
                    boolean V10 = mVar2.V(lVar) | mVar2.F(fVar);
                    Object D10 = mVar.D();
                    if (V10 || D10 == C4889m.f14007a.a()) {
                        D10 = new C11252c(lVar, fVar);
                        mVar2.u(D10);
                    }
                    mVar.P();
                    C4735j0.b(m10, z10, (C17631a) D10, c.e(-12263914, true, new C2154a(fVar, z10), mVar2, 54), (d) null, false, (p<? super C4889m, ? super Integer, C16807N>) null, false, h0Var, (m) null, mVar, (i11 & 14) | 12585984, 312);
                    i13 = i14;
                    i11 = i11;
                    h0Var = h0Var;
                    lVar = lVar;
                    i12 = i12;
                }
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            b((C5842M) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0165  */
    /* JADX WARNING: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void c(KJ.C15987c<? extends ow.f> r25, int r26, androidx.compose.ui.d r27, nI.C17642l<? super ow.f, XH.C16807N> r28, U0.C4889m r29, int r30, int r31) {
        /*
            r1 = r25
            r2 = r26
            r4 = r28
            r5 = r30
            java.lang.String r0 = "tabs"
            kotlin.jvm.internal.C17542s.j(r1, r0)
            java.lang.String r0 = "onTabSelected"
            kotlin.jvm.internal.C17542s.j(r4, r0)
            r0 = -626441090(0xffffffffdaa9447e, float:-2.38222895E16)
            r3 = r29
            U0.m r3 = r3.k(r0)
            r6 = r31 & 1
            if (r6 == 0) goto L_0x0022
            r6 = r5 | 6
            goto L_0x0032
        L_0x0022:
            r6 = r5 & 6
            if (r6 != 0) goto L_0x0031
            boolean r6 = r3.F(r1)
            if (r6 == 0) goto L_0x002e
            r6 = 4
            goto L_0x002f
        L_0x002e:
            r6 = 2
        L_0x002f:
            r6 = r6 | r5
            goto L_0x0032
        L_0x0031:
            r6 = r5
        L_0x0032:
            r7 = r31 & 2
            if (r7 == 0) goto L_0x0039
            r6 = r6 | 48
            goto L_0x0049
        L_0x0039:
            r7 = r5 & 48
            if (r7 != 0) goto L_0x0049
            boolean r7 = r3.d(r2)
            if (r7 == 0) goto L_0x0046
            r7 = 32
            goto L_0x0048
        L_0x0046:
            r7 = 16
        L_0x0048:
            r6 = r6 | r7
        L_0x0049:
            r7 = r31 & 4
            if (r7 == 0) goto L_0x0052
            r6 = r6 | 384(0x180, float:5.38E-43)
        L_0x004f:
            r8 = r27
            goto L_0x0064
        L_0x0052:
            r8 = r5 & 384(0x180, float:5.38E-43)
            if (r8 != 0) goto L_0x004f
            r8 = r27
            boolean r9 = r3.V(r8)
            if (r9 == 0) goto L_0x0061
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x0063
        L_0x0061:
            r9 = 128(0x80, float:1.794E-43)
        L_0x0063:
            r6 = r6 | r9
        L_0x0064:
            r9 = r31 & 8
            if (r9 == 0) goto L_0x006b
            r6 = r6 | 3072(0xc00, float:4.305E-42)
            goto L_0x007b
        L_0x006b:
            r9 = r5 & 3072(0xc00, float:4.305E-42)
            if (r9 != 0) goto L_0x007b
            boolean r9 = r3.F(r4)
            if (r9 == 0) goto L_0x0078
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x007a
        L_0x0078:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x007a:
            r6 = r6 | r9
        L_0x007b:
            r9 = r6 & 1171(0x493, float:1.641E-42)
            r10 = 1170(0x492, float:1.64E-42)
            if (r9 != r10) goto L_0x008d
            boolean r9 = r3.l()
            if (r9 != 0) goto L_0x0088
            goto L_0x008d
        L_0x0088:
            r3.L()
            goto L_0x015f
        L_0x008d:
            if (r7 == 0) goto L_0x0093
            androidx.compose.ui.d$a r7 = androidx.compose.ui.d.f18749a
            r11 = r7
            goto L_0x0094
        L_0x0093:
            r11 = r8
        L_0x0094:
            boolean r7 = U0.C4895p.J()
            if (r7 == 0) goto L_0x00a0
            r7 = -1
            java.lang.String r8 = "com.ingka.ikea.bottomnavigationbar.BottomNavigationBar (BottomNavigationBar.kt:25)"
            U0.C4895p.S(r0, r6, r7, r8)
        L_0x00a0:
            O0.i0 r6 = O0.C4733i0.f10846a
            r0 = 0
            tK.h r7 = SC.C13575d.a(r3, r0)
            long r7 = r7.G0()
            tK.h r9 = SC.C13575d.a(r3, r0)
            long r9 = r9.G0()
            tK.h r12 = SC.C13575d.a(r3, r0)
            long r13 = r12.o0()
            tK.h r12 = SC.C13575d.a(r3, r0)
            long r15 = r12.o0()
            tK.h r12 = SC.C13575d.a(r3, r0)
            long r17 = r12.K()
            tK.h r12 = SC.C13575d.a(r3, r0)
            long r19 = r12.K()
            tK.h r12 = SC.C13575d.a(r3, r0)
            long r21 = r12.L0()
            r24 = r11
            r11 = r21
            int r21 = O0.C4733i0.f10847b
            int r22 = r21 << 21
            r23 = 0
            r21 = r3
            O0.h0 r6 = r6.b(r7, r9, r11, r13, r15, r17, r19, r21, r22, r23)
            tK.h r7 = SC.C13575d.a(r3, r0)
            long r7 = r7.l0()
            r9 = -1530033077(0xffffffffa4cd8c4b, float:-8.9142244E-17)
            r3.W(r9)
            boolean r9 = r3.e(r7)
            java.lang.Object r10 = r3.D()
            if (r9 != 0) goto L_0x010b
            U0.m$a r9 = U0.C4889m.f14007a
            java.lang.Object r9 = r9.a()
            if (r10 != r9) goto L_0x0113
        L_0x010b:
            en.a r10 = new en.a
            r10.<init>(r7)
            r3.u(r10)
        L_0x0113:
            nI.l r10 = (nI.C17642l) r10
            r3.P()
            r15 = r24
            androidx.compose.ui.d r7 = androidx.compose.ui.draw.b.d(r15, r10)
            tK.h r8 = SC.C13575d.a(r3, r0)
            long r8 = r8.k0()
            tK.h r10 = SC.C13575d.a(r3, r0)
            long r10 = r10.G0()
            float r0 = (float) r0
            float r0 = c2.h.B(r0)
            en.d$a r12 = new en.d$a
            r12.<init>(r1, r2, r4, r6)
            r6 = 54
            r13 = 498099831(0x1db06677, float:4.669276E-21)
            r14 = 1
            c1.a r13 = c1.c.e(r13, r14, r12, r3, r6)
            r16 = 199680(0x30c00, float:2.79811E-40)
            r17 = 16
            r12 = 0
            r6 = r7
            r7 = r8
            r9 = r10
            r11 = r0
            r14 = r3
            r0 = r15
            r15 = r16
            r16 = r17
            O0.C4735j0.a(r6, r7, r9, r11, r12, r13, r14, r15, r16)
            boolean r6 = U0.C4895p.J()
            if (r6 == 0) goto L_0x015e
            U0.C4895p.R()
        L_0x015e:
            r8 = r0
        L_0x015f:
            U0.Y0 r7 = r3.n()
            if (r7 == 0) goto L_0x0179
            en.b r9 = new en.b
            r0 = r9
            r1 = r25
            r2 = r26
            r3 = r8
            r4 = r28
            r5 = r30
            r6 = r31
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.a(r9)
        L_0x0179:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: en.C11253d.c(KJ.c, int, androidx.compose.ui.d, nI.l, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N d(long j10, C5817c cVar) {
        C17542s.j(cVar, "$this$drawWithContent");
        cVar.V1();
        r1.f.q1(cVar, j10, 0, C5673m.f(cVar.b(), 0.0f, cVar.H1(h.B((float) 1)), 1, (Object) null), 0.0f, (g) null, (C5749w0) null, 0, 122, (Object) null);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N e(C15987c cVar, int i10, d dVar, C17642l lVar, int i11, int i12, C4889m mVar, int i13) {
        c(cVar, i10, dVar, lVar, mVar, M0.a(i11 | 1), i12);
        return C16807N.f139792a;
    }
}
