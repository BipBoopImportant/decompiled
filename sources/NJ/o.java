package nj;

import E1.I;
import G1.C4504g;
import QJ.Q;
import S1.C;
import S1.C4820m;
import S1.C4830x;
import SC.C13607l;
import TC.C13679b;
import TC.e;
import U0.A1;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.C4912y;
import U0.F1;
import U0.M0;
import U0.P;
import U0.Y0;
import U0.p1;
import XH.C16807N;
import XH.y;
import Y1.j;
import Y1.k;
import androidx.compose.foundation.b;
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.foundation.layout.C5077h;
import androidx.compose.foundation.layout.C5079j;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.G;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import c2.h;
import dI.C17164e;
import eI.C17187b;
import i1.C5437c;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import oj.C11680a;
import p1.i1;
import s0.C5843N;
import tK.C18030v;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0003¢\u0006\u0004\b\n\u0010\u000b\u001a!\u0010\u000e\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\fH\u0003¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0011²\u0006\u0018\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\nX\u0002"}, d2 = {"Loj/f;", "model", "Lkotlin/Function1;", "Loj/a;", "LXH/N;", "onAnalyticsEvent", "d", "(Loj/f;LnI/l;LU0/m;I)V", "", "count", "g", "(ILU0/m;I)V", "Landroidx/compose/ui/d;", "modifier", "i", "(ILandroidx/compose/ui/d;LU0/m;II)V", "sendAnalyticsEvent", "scanandgo-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class o {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.scanandgoonlineredesign.dialog.bottomsheet.composable.MultiPackageContentKt$MultiPackageContent$1$1", f = "MultiPackageContent.kt", l = {}, m = "invokeSuspend")
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f99767c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ oj.f f99768d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ A1<C17642l<C11680a, C16807N>> f99769e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(oj.f fVar, A1<? extends C17642l<? super C11680a, C16807N>> a12, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f99768d = fVar;
            this.f99769e = a12;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f99768d, this.f99769e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f99767c == 0) {
                y.b(obj);
                o.e(this.f99769e).invoke(this.f99768d.g());
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public static final void d(oj.f fVar, C17642l<? super C11680a, C16807N> lVar, C4889m mVar, int i10) {
        int i11;
        C17542s.j(fVar, "model");
        C17542s.j(lVar, "onAnalyticsEvent");
        C4889m k10 = mVar.k(1438683194);
        if ((i10 & 6) == 0) {
            i11 = (k10.V(fVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= k10.F(lVar) ? 32 : 16;
        }
        if ((i11 & 19) != 18 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(1438683194, i11, -1, "com.ingka.ikea.app.scanandgoonlineredesign.dialog.bottomsheet.composable.MultiPackageContent (MultiPackageContent.kt:35)");
            }
            A1<T> q10 = p1.q(lVar, k10, (i11 >> 3) & 14);
            C16807N n10 = C16807N.f139792a;
            k10.W(268838529);
            boolean V10 = ((i11 & 14) == 4) | k10.V(q10);
            Object D10 = k10.D();
            if (V10 || D10 == C4889m.f14007a.a()) {
                D10 = new a(fVar, q10, (C17164e<? super a>) null);
                k10.u(D10);
            }
            k10.P();
            P.g(n10, (p) D10, k10, 6);
            C5437c.C0386c i12 = C5437c.f24302a.i();
            C5073d.f a10 = C11608B.f99715a.a(k10, 6);
            d k11 = D.k(e.i(d.f18749a), 0.0f, h.B((float) 24), 1, (Object) null);
            I b10 = G.b(a10, i12, k10, 48);
            int a11 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            d e10 = c.e(k10, k11);
            C4504g.a aVar = C4504g.f6515W;
            C17631a<C4504g> a12 = aVar.a();
            if (k10.m() == null) {
                C4883j.c();
            }
            k10.I();
            if (k10.i()) {
                k10.p(a12);
            } else {
                k10.t();
            }
            C4889m a13 = F1.a(k10);
            F1.c(a13, b10, aVar.c());
            F1.c(a13, s10, aVar.e());
            p<C4504g, Integer, C16807N> b11 = aVar.b();
            if (a13.i() || !C17542s.e(a13.D(), Integer.valueOf(a11))) {
                a13.u(Integer.valueOf(a11));
                a13.w(Integer.valueOf(a11), b11);
            }
            F1.c(a13, e10, aVar.d());
            C5843N n11 = C5843N.f28726a;
            g(fVar.h(), k10, 0);
            i(fVar.h(), (d) null, k10, 0, 2);
            k10.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n12 = k10.n();
        if (n12 != null) {
            n12.a(new l(fVar, lVar, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C17642l<C11680a, C16807N> e(A1<? extends C17642l<? super C11680a, C16807N>> a12) {
        return (C17642l) a12.getValue();
    }

    /* access modifiers changed from: private */
    public static final C16807N f(oj.f fVar, C17642l lVar, int i10, C4889m mVar, int i11) {
        d(fVar, lVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    private static final void g(int i10, C4889m mVar, int i11) {
        int i12;
        C4889m mVar2;
        int i13 = i10;
        int i14 = i11;
        C4889m k10 = mVar.k(593813062);
        if ((i14 & 6) == 0) {
            i12 = (k10.d(i13) ? 4 : 2) | i14;
        } else {
            i12 = i14;
        }
        if ((i12 & 3) != 2 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(593813062, i12, -1, "com.ingka.ikea.app.scanandgoonlineredesign.dialog.bottomsheet.composable.PackageCountImage (MultiPackageContent.kt:56)");
            }
            d t10 = J.t(d.f18749a, C11608B.f99715a.b());
            C18030v vVar = C18030v.f147664a;
            int i15 = C18030v.f147665b;
            d d10 = b.d(t10, vVar.a(k10, i15).B0(), (i1) null, 2, (Object) null);
            I h10 = C5077h.h(C5437c.f24302a.e(), false);
            int a10 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            d e10 = c.e(k10, d10);
            C4504g.a aVar = C4504g.f6515W;
            C17631a<C4504g> a11 = aVar.a();
            if (k10.m() == null) {
                C4883j.c();
            }
            k10.I();
            if (k10.i()) {
                k10.p(a11);
            } else {
                k10.t();
            }
            C4889m a12 = F1.a(k10);
            F1.c(a12, h10, aVar.c());
            F1.c(a12, s10, aVar.e());
            p<C4504g, Integer, C16807N> b10 = aVar.b();
            if (a12.i() || !C17542s.e(a12.D(), Integer.valueOf(a10))) {
                a12.u(Integer.valueOf(a10));
                a12.w(Integer.valueOf(a10), b10);
            }
            F1.c(a12, e10, aVar.d());
            C5079j jVar = C5079j.f18125a;
            mVar2 = k10;
            C13607l.j(String.valueOf(i10), C13679b.C2857b.a.f116683a, (d) null, vVar.a(k10, i15).x0(), 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (j) null, (Y1.f) null, 0, 0, false, 0, 0, (C17642l<? super N1.P, C16807N>) null, mVar2, 48, 0, 262132);
            mVar2.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            mVar2 = k10;
        }
        Y0 n10 = mVar2.n();
        if (n10 != null) {
            n10.a(new n(i13, i14));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N h(int i10, int i11, C4889m mVar, int i12) {
        g(i10, mVar, M0.a(i11 | 1));
        return C16807N.f139792a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void i(int r31, androidx.compose.ui.d r32, U0.C4889m r33, int r34, int r35) {
        /*
            r0 = r31
            r1 = r34
            r2 = r35
            r3 = 2
            r4 = 1474302035(0x57e01053, float:4.92721433E14)
            r5 = r33
            U0.m r15 = r5.k(r4)
            r5 = r2 & 1
            if (r5 == 0) goto L_0x0017
            r5 = r1 | 6
            goto L_0x0027
        L_0x0017:
            r5 = r1 & 6
            if (r5 != 0) goto L_0x0026
            boolean r5 = r15.d(r0)
            if (r5 == 0) goto L_0x0023
            r5 = 4
            goto L_0x0024
        L_0x0023:
            r5 = r3
        L_0x0024:
            r5 = r5 | r1
            goto L_0x0027
        L_0x0026:
            r5 = r1
        L_0x0027:
            r3 = r3 & r2
            if (r3 == 0) goto L_0x002f
            r5 = r5 | 48
        L_0x002c:
            r6 = r32
            goto L_0x0041
        L_0x002f:
            r6 = r1 & 48
            if (r6 != 0) goto L_0x002c
            r6 = r32
            boolean r7 = r15.V(r6)
            if (r7 == 0) goto L_0x003e
            r7 = 32
            goto L_0x0040
        L_0x003e:
            r7 = 16
        L_0x0040:
            r5 = r5 | r7
        L_0x0041:
            r7 = r5 & 19
            r8 = 18
            if (r7 != r8) goto L_0x0055
            boolean r7 = r15.l()
            if (r7 != 0) goto L_0x004e
            goto L_0x0055
        L_0x004e:
            r15.L()
            r3 = r6
            r4 = r15
            goto L_0x0144
        L_0x0055:
            if (r3 == 0) goto L_0x005a
            androidx.compose.ui.d$a r3 = androidx.compose.ui.d.f18749a
            goto L_0x005b
        L_0x005a:
            r3 = r6
        L_0x005b:
            boolean r6 = U0.C4895p.J()
            if (r6 == 0) goto L_0x0067
            r6 = -1
            java.lang.String r7 = "com.ingka.ikea.app.scanandgoonlineredesign.dialog.bottomsheet.composable.PackageCountText (MultiPackageContent.kt:72)"
            U0.C4895p.S(r4, r5, r6, r7)
        L_0x0067:
            androidx.compose.foundation.layout.d r4 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r4 = r4.g()
            i1.c$a r5 = i1.C5437c.f24302a
            i1.c$b r5 = r5.k()
            r14 = 0
            E1.I r4 = androidx.compose.foundation.layout.C5080k.a(r4, r5, r15, r14)
            int r5 = U0.C4883j.a(r15, r14)
            U0.y r6 = r15.s()
            androidx.compose.ui.d r7 = androidx.compose.ui.c.e(r15, r3)
            G1.g$a r8 = G1.C4504g.f6515W
            nI.a r9 = r8.a()
            U0.f r10 = r15.m()
            if (r10 != 0) goto L_0x0093
            U0.C4883j.c()
        L_0x0093:
            r15.I()
            boolean r10 = r15.i()
            if (r10 == 0) goto L_0x00a0
            r15.p(r9)
            goto L_0x00a3
        L_0x00a0:
            r15.t()
        L_0x00a3:
            U0.m r9 = U0.F1.a(r15)
            nI.p r10 = r8.c()
            U0.F1.c(r9, r4, r10)
            nI.p r4 = r8.e()
            U0.F1.c(r9, r6, r4)
            nI.p r4 = r8.b()
            boolean r6 = r9.i()
            if (r6 != 0) goto L_0x00cd
            java.lang.Object r6 = r9.D()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r5)
            boolean r6 = kotlin.jvm.internal.C17542s.e(r6, r10)
            if (r6 != 0) goto L_0x00db
        L_0x00cd:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            r9.u(r6)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r9.w(r5, r4)
        L_0x00db:
            nI.p r4 = r8.d()
            U0.F1.c(r9, r7, r4)
            s0.h r4 = s0.C5862h.f28810a
            int r4 = Ez.f.f109696e0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r31)
            java.lang.Object[] r5 = new java.lang.Object[]{r5}
            java.lang.String r5 = J1.j.c(r4, r5, r15, r14)
            TC.b$b$f r6 = TC.C13679b.C2857b.f.f116688a
            r29 = 0
            r30 = 262140(0x3fffc, float:3.67336E-40)
            r7 = 0
            r8 = 0
            r10 = 0
            r12 = 0
            r13 = 0
            r4 = 0
            r14 = r4
            r16 = 0
            r4 = r15
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
            r28 = 48
            r27 = r4
            SC.C13607l.j(r5, r6, r7, r8, r10, r12, r13, r14, r15, r17, r18, r19, r20, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            int r5 = Ez.f.f109694d0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r31)
            java.lang.Object[] r6 = new java.lang.Object[]{r6}
            r7 = 0
            java.lang.String r5 = J1.j.c(r5, r6, r4, r7)
            TC.b$a$c r6 = TC.C13679b.a.c.f116681a
            r7 = 0
            r14 = 0
            r15 = 0
            SC.C13607l.j(r5, r6, r7, r8, r10, r12, r13, r14, r15, r17, r18, r19, r20, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r4.x()
            boolean r5 = U0.C4895p.J()
            if (r5 == 0) goto L_0x0144
            U0.C4895p.R()
        L_0x0144:
            U0.Y0 r4 = r4.n()
            if (r4 == 0) goto L_0x0152
            nj.m r5 = new nj.m
            r5.<init>(r0, r3, r1, r2)
            r4.a(r5)
        L_0x0152:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: nj.o.i(int, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N j(int i10, d dVar, int i11, int i12, C4889m mVar, int i13) {
        i(i10, dVar, mVar, M0.a(i11 | 1), i12);
        return C16807N.f139792a;
    }
}
