package ut;

import Gh.b;
import Gh.d;
import Gt.c;
import IC.C13023e;
import It.B;
import It.C10749l;
import It.q;
import KJ.C15985a;
import KJ.C15990f;
import U0.C4889m;
import U0.C4895p;
import U0.M0;
import XH.C16807N;
import YH.C16877v;
import java.util.ArrayList;
import kotlin.Metadata;
import nI.C17642l;
import nI.p;
import tt.C11991a;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aG\u0010\n\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0004H\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a\u001f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\f*\b\u0012\u0004\u0012\u00020\r0\fH\u0003¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"LIt/B$b;", "state", "LT0/d;", "widthSizeClass", "Lkotlin/Function1;", "LIt/q;", "LXH/N;", "action", "LIt/l;", "analyticsAction", "d", "(LIt/B$b;ILnI/l;LnI/l;LU0/m;I)V", "LKJ/f;", "LGt/c;", "LGh/b;", "h", "(LKJ/f;LU0/m;I)LKJ/f;", "instore-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class n0 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C17642l<q, C16807N> f104298a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C17642l<C10749l, C16807N> f104299b;

        a(C17642l<? super q, C16807N> lVar, C17642l<? super C10749l, C16807N> lVar2) {
            this.f104298a = lVar;
            this.f104299b = lVar2;
        }

        /* access modifiers changed from: private */
        public static final C16807N c(C17642l lVar, C17642l lVar2) {
            lVar.invoke(q.x.f82408a);
            lVar2.invoke(new C10749l.j(C11991a.C2461a.SELECT_STORE_BUTTON));
            return C16807N.f139792a;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: nI.a} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(U0.C4889m r15, int r16) {
            /*
                r14 = this;
                r0 = r14
                r11 = r15
                r1 = r16
                r2 = r1 & 3
                r3 = 2
                if (r2 != r3) goto L_0x0014
                boolean r2 = r15.l()
                if (r2 != 0) goto L_0x0010
                goto L_0x0014
            L_0x0010:
                r15.L()
                goto L_0x0084
            L_0x0014:
                boolean r2 = U0.C4895p.J()
                if (r2 == 0) goto L_0x0023
                r2 = -1
                java.lang.String r3 = "com.ingka.ikea.instore.impl.composables.OnboardingScreen.<anonymous>.<anonymous> (OnboardingScreen.kt:59)"
                r4 = 2001629044(0x774e6f74, float:4.1870066E33)
                U0.C4895p.S(r4, r1, r2, r3)
            L_0x0023:
                int r1 = st.c.f102775i
                r2 = 0
                java.lang.String r1 = J1.j.b(r1, r15, r2)
                androidx.compose.ui.d$a r2 = androidx.compose.ui.d.f18749a
                r3 = 1
                r4 = 0
                r5 = 0
                androidx.compose.ui.d r2 = androidx.compose.foundation.layout.J.h(r2, r5, r3, r4)
                java.lang.String r3 = "SELECT_STORE_BUTTON"
                androidx.compose.ui.d r2 = androidx.compose.ui.platform.C5116k1.a(r2, r3)
                r3 = 1319486697(0x4ea5c4e9, float:1.39057267E9)
                r15.W(r3)
                nI.l<It.q, XH.N> r3 = r0.f104298a
                boolean r3 = r15.V(r3)
                nI.l<It.l, XH.N> r4 = r0.f104299b
                boolean r4 = r15.V(r4)
                r3 = r3 | r4
                nI.l<It.q, XH.N> r4 = r0.f104298a
                nI.l<It.l, XH.N> r5 = r0.f104299b
                java.lang.Object r6 = r15.D()
                if (r3 != 0) goto L_0x005e
                U0.m$a r3 = U0.C4889m.f14007a
                java.lang.Object r3 = r3.a()
                if (r6 != r3) goto L_0x0066
            L_0x005e:
                ut.m0 r6 = new ut.m0
                r6.<init>(r4, r5)
                r15.u(r6)
            L_0x0066:
                r10 = r6
                nI.a r10 = (nI.C17631a) r10
                r15.P()
                r12 = 48
                r13 = 508(0x1fc, float:7.12E-43)
                r3 = 0
                r4 = 0
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                r9 = 0
                r11 = r15
                SC.L.b(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
                boolean r1 = U0.C4895p.J()
                if (r1 == 0) goto L_0x0084
                U0.C4895p.R()
            L_0x0084:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ut.n0.a.b(U0.m, int):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v0, resolved type: nI.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void d(It.B.b r25, int r26, nI.C17642l<? super It.q, XH.C16807N> r27, nI.C17642l<? super It.C10749l, XH.C16807N> r28, U0.C4889m r29, int r30) {
        /*
            r1 = r25
            r3 = r27
            r4 = r28
            r5 = r30
            java.lang.String r0 = "state"
            kotlin.jvm.internal.C17542s.j(r1, r0)
            java.lang.String r0 = "action"
            kotlin.jvm.internal.C17542s.j(r3, r0)
            java.lang.String r0 = "analyticsAction"
            kotlin.jvm.internal.C17542s.j(r4, r0)
            r0 = -1929231469(0xffffffff8d024393, float:-4.014068E-31)
            r2 = r29
            U0.m r2 = r2.k(r0)
            r6 = r5 & 6
            if (r6 != 0) goto L_0x0038
            r6 = r5 & 8
            if (r6 != 0) goto L_0x002d
            boolean r6 = r2.V(r1)
            goto L_0x0031
        L_0x002d:
            boolean r6 = r2.F(r1)
        L_0x0031:
            if (r6 == 0) goto L_0x0035
            r6 = 4
            goto L_0x0036
        L_0x0035:
            r6 = 2
        L_0x0036:
            r6 = r6 | r5
            goto L_0x0039
        L_0x0038:
            r6 = r5
        L_0x0039:
            r7 = r5 & 48
            r15 = r26
            if (r7 != 0) goto L_0x004b
            boolean r7 = r2.d(r15)
            if (r7 == 0) goto L_0x0048
            r7 = 32
            goto L_0x004a
        L_0x0048:
            r7 = 16
        L_0x004a:
            r6 = r6 | r7
        L_0x004b:
            r7 = r5 & 384(0x180, float:5.38E-43)
            r13 = 256(0x100, float:3.59E-43)
            if (r7 != 0) goto L_0x005c
            boolean r7 = r2.F(r3)
            if (r7 == 0) goto L_0x0059
            r7 = r13
            goto L_0x005b
        L_0x0059:
            r7 = 128(0x80, float:1.794E-43)
        L_0x005b:
            r6 = r6 | r7
        L_0x005c:
            r7 = r5 & 3072(0xc00, float:4.305E-42)
            if (r7 != 0) goto L_0x006c
            boolean r7 = r2.F(r4)
            if (r7 == 0) goto L_0x0069
            r7 = 2048(0x800, float:2.87E-42)
            goto L_0x006b
        L_0x0069:
            r7 = 1024(0x400, float:1.435E-42)
        L_0x006b:
            r6 = r6 | r7
        L_0x006c:
            r14 = r6
            r6 = r14 & 1171(0x493, float:1.641E-42)
            r7 = 1170(0x492, float:1.64E-42)
            if (r6 != r7) goto L_0x007f
            boolean r6 = r2.l()
            if (r6 != 0) goto L_0x007a
            goto L_0x007f
        L_0x007a:
            r2.L()
            goto L_0x01e4
        L_0x007f:
            boolean r6 = U0.C4895p.J()
            if (r6 == 0) goto L_0x008b
            r6 = -1
            java.lang.String r7 = "com.ingka.ikea.instore.impl.composables.OnboardingScreen (OnboardingScreen.kt:40)"
            U0.C4895p.S(r0, r14, r6, r7)
        L_0x008b:
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            androidx.compose.foundation.layout.d r6 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r6 = r6.g()
            i1.c$a r7 = i1.C5437c.f24302a
            i1.c$b r7 = r7.k()
            r12 = 0
            E1.I r6 = androidx.compose.foundation.layout.C5080k.a(r6, r7, r2, r12)
            int r7 = U0.C4883j.a(r2, r12)
            U0.y r8 = r2.s()
            androidx.compose.ui.d r9 = androidx.compose.ui.c.e(r2, r0)
            G1.g$a r10 = G1.C4504g.f6515W
            nI.a r11 = r10.a()
            U0.f r16 = r2.m()
            if (r16 != 0) goto L_0x00b9
            U0.C4883j.c()
        L_0x00b9:
            r2.I()
            boolean r16 = r2.i()
            if (r16 == 0) goto L_0x00c6
            r2.p(r11)
            goto L_0x00c9
        L_0x00c6:
            r2.t()
        L_0x00c9:
            U0.m r11 = U0.F1.a(r2)
            nI.p r12 = r10.c()
            U0.F1.c(r11, r6, r12)
            nI.p r6 = r10.e()
            U0.F1.c(r11, r8, r6)
            nI.p r6 = r10.b()
            boolean r8 = r11.i()
            if (r8 != 0) goto L_0x00f3
            java.lang.Object r8 = r11.D()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r7)
            boolean r8 = kotlin.jvm.internal.C17542s.e(r8, r12)
            if (r8 != 0) goto L_0x0101
        L_0x00f3:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            r11.u(r8)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r11.w(r7, r6)
        L_0x0101:
            nI.p r6 = r10.d()
            U0.F1.c(r11, r9, r6)
            s0.h r6 = s0.C5862h.f28810a
            r11 = 0
            r12 = 7
            r6 = 0
            r7 = 0
            r9 = 0
            r10 = r2
            r16 = 0
            kC.C14673d.b(r6, r7, r9, r10, r11, r12)
            Gt.c r6 = r25.a()
            int r7 = IC.C13023e.f110931a
            int r8 = Gh.d.f60739b
            r9 = r7 | r8
            int r10 = Gh.c.f60737b
            r9 = r9 | r10
            Gh.b r6 = r6.a(r2, r9)
            KJ.f r9 = r25.b()
            r7 = r7 | r8
            r7 = r7 | r10
            KJ.f r7 = h(r9, r2, r7)
            r8 = 942094733(0x3827398d, float:3.98695E-5)
            r2.W(r8)
            r8 = r14 & 896(0x380, float:1.256E-42)
            if (r8 != r13) goto L_0x013d
            r9 = 1
            goto L_0x013f
        L_0x013d:
            r9 = r16
        L_0x013f:
            java.lang.Object r10 = r2.D()
            if (r9 != 0) goto L_0x014d
            U0.m$a r9 = U0.C4889m.f14007a
            java.lang.Object r9 = r9.a()
            if (r10 != r9) goto L_0x0155
        L_0x014d:
            ut.j0 r10 = new ut.j0
            r10.<init>(r3)
            r2.u(r10)
        L_0x0155:
            r9 = r10
            nI.a r9 = (nI.C17631a) r9
            r2.P()
            r10 = 942100516(0x38275024, float:3.989054E-5)
            r2.W(r10)
            java.lang.Object r10 = r2.D()
            U0.m$a r11 = U0.C4889m.f14007a
            java.lang.Object r12 = r11.a()
            if (r10 != r12) goto L_0x0174
            r0.m r10 = r0.l.a()
            r2.u(r10)
        L_0x0174:
            r17 = r10
            r0.m r17 = (r0.m) r17
            r2.P()
            r10 = 942103701(0x38275c95, float:3.9902126E-5)
            r2.W(r10)
            if (r8 != r13) goto L_0x0185
            r12 = 1
            goto L_0x0187
        L_0x0185:
            r12 = r16
        L_0x0187:
            java.lang.Object r8 = r2.D()
            if (r12 != 0) goto L_0x0193
            java.lang.Object r10 = r11.a()
            if (r8 != r10) goto L_0x019b
        L_0x0193:
            ut.k0 r8 = new ut.k0
            r8.<init>(r3)
            r2.u(r8)
        L_0x019b:
            r22 = r8
            nI.a r22 = (nI.C17631a) r22
            r2.P()
            r23 = 28
            r24 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r16 = r0
            androidx.compose.ui.d r0 = androidx.compose.foundation.d.b(r16, r17, r18, r19, r20, r21, r22, r23, r24)
            java.lang.String r8 = "CLICK_ANYWHERE_FOR_NEXT_FEATURE"
            androidx.compose.ui.d r10 = androidx.compose.ui.platform.C5116k1.a(r0, r8)
            ut.n0$a r0 = new ut.n0$a
            r0.<init>(r3, r4)
            r8 = 54
            r11 = 2001629044(0x774e6f74, float:4.1870066E33)
            r12 = 1
            c1.a r11 = c1.c.e(r11, r12, r0, r2, r8)
            int r0 = r14 << 3
            r0 = r0 & 896(0x380, float:1.256E-42)
            r8 = 196608(0x30000, float:2.75506E-40)
            r13 = r0 | r8
            r14 = 0
            r8 = r26
            r12 = r2
            Eh.w.p(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r2.x()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x01e4
            U0.C4895p.R()
        L_0x01e4:
            U0.Y0 r6 = r2.n()
            if (r6 == 0) goto L_0x01fd
            ut.l0 r7 = new ut.l0
            r0 = r7
            r1 = r25
            r2 = r26
            r3 = r27
            r4 = r28
            r5 = r30
            r0.<init>(r1, r2, r3, r4, r5)
            r6.a(r7)
        L_0x01fd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ut.n0.d(It.B$b, int, nI.l, nI.l, U0.m, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N e(C17642l lVar) {
        lVar.invoke(q.m.f82391a);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N f(C17642l lVar) {
        lVar.invoke(q.m.f82391a);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N g(B.b bVar, int i10, C17642l lVar, C17642l lVar2, int i11, C4889m mVar, int i12) {
        d(bVar, i10, lVar, lVar2, mVar, M0.a(i11 | 1));
        return C16807N.f139792a;
    }

    private static final C15990f<b> h(C15990f<c> fVar, C4889m mVar, int i10) {
        mVar.W(-773531076);
        if (C4895p.J()) {
            C4895p.S(-773531076, i10, -1, "com.ingka.ikea.instore.impl.composables.asOnboardingFeatures (OnboardingScreen.kt:77)");
        }
        ArrayList arrayList = new ArrayList(C16877v.y(fVar, 10));
        for (c a10 : fVar) {
            arrayList.add(a10.a(mVar, C13023e.f110931a | d.f60739b | Gh.c.f60737b));
        }
        C15990f<b> l10 = C15985a.l(arrayList);
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
        return l10;
    }
}
