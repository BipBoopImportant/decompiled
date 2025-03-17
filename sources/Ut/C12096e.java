package ut;

import IJ.C15906b;
import IJ.C15908d;
import IJ.C15909e;
import KJ.C15987c;
import N1.P;
import QJ.C16297b0;
import QJ.Q;
import S1.C;
import S1.C4820m;
import S1.C4830x;
import SC.C13607l;
import TC.C13679b;
import U0.C4889m;
import U0.C4895p;
import U0.C4899r0;
import U0.M0;
import U0.Y0;
import U0.o1;
import XH.C16807N;
import XH.y;
import Y1.j;
import Y1.k;
import YH.C16877v;
import androidx.compose.foundation.b;
import androidx.compose.foundation.layout.D;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.C5116k1;
import c2.h;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import m0.C5548j;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import p1.i1;
import tK.C18029u;
import tK.C18030v;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a5\u0010\b\u001a\u00020\u00062\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0001¢\u0006\u0004\b\b\u0010\t\u001a\u001d\u0010\n\u001a\u00020\u00062\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0003¢\u0006\u0004\b\n\u0010\u000b\"\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0011²\u0006\u000e\u0010\u0010\u001a\u00020\u00018\n@\nX\u0002"}, d2 = {"LKJ/c;", "", "storeNames", "Landroidx/compose/ui/d;", "modifier", "Lkotlin/Function0;", "LXH/N;", "onSelectStoreClick", "g", "(LKJ/c;Landroidx/compose/ui/d;LnI/a;LU0/m;II)V", "c", "(LKJ/c;LU0/m;I)V", "Lc2/h;", "a", "F", "ButtonSize", "currentStoreName", "instore-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: ut.e  reason: case insensitive filesystem */
public final class C12096e {

    /* renamed from: a  reason: collision with root package name */
    private static final float f104256a = h.B((float) 56);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.instore.impl.composables.ChangeStoreKt$AnimatedStoreNamesLabel$1$1", f = "ChangeStore.kt", l = {106}, m = "invokeSuspend")
    /* renamed from: ut.e$a */
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f104257c;

        /* renamed from: d  reason: collision with root package name */
        int f104258d;

        /* renamed from: e  reason: collision with root package name */
        int f104259e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C15987c<String> f104260f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C4899r0<String> f104261g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C15987c<String> cVar, C4899r0<String> r0Var, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f104260f = cVar;
            this.f104261g = r0Var;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f104260f, this.f104261g, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f104259e;
            if (i10 == 0) {
                y.b(obj);
                C15906b.a aVar = C15906b.f135496b;
                long s10 = C15908d.s(2, C15909e.SECONDS);
                this.f104257c = aVar;
                this.f104258d = 2;
                this.f104259e = 1;
                if (C16297b0.c(s10, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                C15906b.a aVar2 = (C15906b.a) this.f104257c;
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C4899r0<String> r0Var = this.f104261g;
            C15987c<String> cVar = this.f104260f;
            int indexOf = cVar.indexOf(C12096e.d(r0Var)) + 1;
            C12096e.e(r0Var, (indexOf < 0 || indexOf >= cVar.size()) ? (String) C16877v.w0(this.f104260f) : cVar.get(indexOf));
            return C16807N.f139792a;
        }
    }

    private static final void c(C15987c<String> cVar, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        C15987c<String> cVar2 = cVar;
        int i12 = i10;
        C4889m k10 = mVar.k(-417883768);
        if ((i12 & 6) == 0) {
            i11 = (k10.V(cVar2) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i11 & 3) != 2 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-417883768, i11, -1, "com.ingka.ikea.instore.impl.composables.AnimatedStoreNamesLabel (ChangeStore.kt:86)");
            }
            k10.W(-1105449694);
            Object D10 = k10.D();
            C4889m.a aVar = C4889m.f14007a;
            if (D10 == aVar.a()) {
                D10 = u1.e(C16877v.w0(cVar), (o1) null, 2, (Object) null);
                k10.u(D10);
            }
            C4899r0 r0Var = (C4899r0) D10;
            k10.P();
            String d10 = d(r0Var);
            C13679b.C2857b.c cVar3 = C13679b.C2857b.c.f116685a;
            C18030v vVar = C18030v.f147664a;
            int i13 = C18030v.f147665b;
            C4889m mVar3 = k10;
            C13607l.j(d10, cVar3, C5116k1.a(D.i(androidx.compose.animation.f.b(b.d(d.f18749a, vVar.a(k10, i13).F0(), (i1) null, 2, (Object) null), C5548j.h(0.0f, 200.0f, (Object) null, 5, (Object) null), (p) null, 2, (Object) null), C18029u.f147649a.j()), "animated_store_name_label"), vVar.a(k10, i13).x0(), 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (j) null, (Y1.f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar3, 48, 0, 262128);
            String d11 = d(r0Var);
            mVar2 = mVar3;
            mVar2.W(-1105431056);
            boolean z10 = (i11 & 14) == 4;
            Object D11 = mVar2.D();
            if (z10 || D11 == aVar.a()) {
                D11 = new a(cVar2, r0Var, (C17164e<? super a>) null);
                mVar2.u(D11);
            }
            mVar2.P();
            U0.P.g(d11, (p) D11, mVar2, 0);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            mVar2 = k10;
        }
        Y0 n10 = mVar2.n();
        if (n10 != null) {
            n10.a(new C12094d(cVar2, i12));
        }
    }

    /* access modifiers changed from: private */
    public static final String d(C4899r0<String> r0Var) {
        return r0Var.getValue();
    }

    /* access modifiers changed from: private */
    public static final void e(C4899r0<String> r0Var, String str) {
        r0Var.setValue(str);
    }

    /* access modifiers changed from: private */
    public static final C16807N f(C15987c cVar, int i10, C4889m mVar, int i11) {
        c(cVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0207  */
    /* JADX WARNING: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void g(KJ.C15987c<java.lang.String> r45, androidx.compose.ui.d r46, nI.C17631a<XH.C16807N> r47, U0.C4889m r48, int r49, int r50) {
        /*
            r1 = r45
            r14 = r47
            r15 = r49
            r0 = 2
            r2 = 4
            r9 = 48
            java.lang.String r3 = "storeNames"
            kotlin.jvm.internal.C17542s.j(r1, r3)
            java.lang.String r3 = "onSelectStoreClick"
            kotlin.jvm.internal.C17542s.j(r14, r3)
            r3 = 109399176(0x6854c88, float:5.014149E-35)
            r4 = r48
            U0.m r13 = r4.k(r3)
            r4 = 1
            r5 = r50 & 1
            if (r5 == 0) goto L_0x0025
            r5 = r15 | 6
            goto L_0x0035
        L_0x0025:
            r5 = r15 & 6
            if (r5 != 0) goto L_0x0034
            boolean r5 = r13.V(r1)
            if (r5 == 0) goto L_0x0031
            r5 = r2
            goto L_0x0032
        L_0x0031:
            r5 = r0
        L_0x0032:
            r5 = r5 | r15
            goto L_0x0035
        L_0x0034:
            r5 = r15
        L_0x0035:
            r0 = r50 & 2
            if (r0 == 0) goto L_0x003d
            r5 = r5 | r9
        L_0x003a:
            r6 = r46
            goto L_0x004f
        L_0x003d:
            r6 = r15 & 48
            if (r6 != 0) goto L_0x003a
            r6 = r46
            boolean r7 = r13.V(r6)
            if (r7 == 0) goto L_0x004c
            r7 = 32
            goto L_0x004e
        L_0x004c:
            r7 = 16
        L_0x004e:
            r5 = r5 | r7
        L_0x004f:
            r2 = r50 & 4
            if (r2 == 0) goto L_0x0057
            r5 = r5 | 384(0x180, float:5.38E-43)
        L_0x0055:
            r12 = r5
            goto L_0x0068
        L_0x0057:
            r2 = r15 & 384(0x180, float:5.38E-43)
            if (r2 != 0) goto L_0x0055
            boolean r2 = r13.F(r14)
            if (r2 == 0) goto L_0x0064
            r2 = 256(0x100, float:3.59E-43)
            goto L_0x0066
        L_0x0064:
            r2 = 128(0x80, float:1.794E-43)
        L_0x0066:
            r5 = r5 | r2
            goto L_0x0055
        L_0x0068:
            r2 = r12 & 147(0x93, float:2.06E-43)
            r5 = 146(0x92, float:2.05E-43)
            if (r2 != r5) goto L_0x007c
            boolean r2 = r13.l()
            if (r2 != 0) goto L_0x0075
            goto L_0x007c
        L_0x0075:
            r13.L()
            r2 = r6
            r0 = r13
            goto L_0x0201
        L_0x007c:
            if (r0 == 0) goto L_0x0081
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            goto L_0x0082
        L_0x0081:
            r0 = r6
        L_0x0082:
            boolean r2 = U0.C4895p.J()
            if (r2 == 0) goto L_0x008e
            r2 = -1
            java.lang.String r5 = "com.ingka.ikea.instore.impl.composables.ChangeStore (ChangeStore.kt:50)"
            U0.C4895p.S(r3, r12, r2, r5)
        L_0x008e:
            androidx.compose.ui.d$a r11 = androidx.compose.ui.d.f18749a
            r2 = 0
            r3 = 0
            androidx.compose.ui.d r16 = androidx.compose.foundation.layout.J.h(r11, r2, r4, r3)
            tK.v r10 = tK.C18030v.f147664a
            int r8 = tK.C18030v.f147665b
            tK.h r2 = r10.a(r13, r8)
            long r17 = r2.B0()
            r20 = 2
            r21 = 0
            r19 = 0
            androidx.compose.ui.d r2 = androidx.compose.foundation.b.d(r16, r17, r19, r20, r21)
            r7 = 7
            r16 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = r47
            r42 = r8
            r8 = r16
            androidx.compose.ui.d r2 = androidx.compose.foundation.d.d(r2, r3, r4, r5, r6, r7, r8)
            androidx.compose.ui.d r2 = r2.s(r0)
            i1.c$a r3 = i1.C5437c.f24302a
            i1.c$b r3 = r3.g()
            androidx.compose.foundation.layout.d r4 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r4 = r4.g()
            E1.I r3 = androidx.compose.foundation.layout.C5080k.a(r4, r3, r13, r9)
            r9 = 0
            int r4 = U0.C4883j.a(r13, r9)
            U0.y r5 = r13.s()
            androidx.compose.ui.d r2 = androidx.compose.ui.c.e(r13, r2)
            G1.g$a r6 = G1.C4504g.f6515W
            nI.a r7 = r6.a()
            U0.f r8 = r13.m()
            if (r8 != 0) goto L_0x00ec
            U0.C4883j.c()
        L_0x00ec:
            r13.I()
            boolean r8 = r13.i()
            if (r8 == 0) goto L_0x00f9
            r13.p(r7)
            goto L_0x00fc
        L_0x00f9:
            r13.t()
        L_0x00fc:
            U0.m r7 = U0.F1.a(r13)
            nI.p r8 = r6.c()
            U0.F1.c(r7, r3, r8)
            nI.p r3 = r6.e()
            U0.F1.c(r7, r5, r3)
            nI.p r3 = r6.b()
            boolean r5 = r7.i()
            if (r5 != 0) goto L_0x0126
            java.lang.Object r5 = r7.D()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r4)
            boolean r5 = kotlin.jvm.internal.C17542s.e(r5, r8)
            if (r5 != 0) goto L_0x0134
        L_0x0126:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r7.u(r5)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r7.w(r4, r3)
        L_0x0134:
            nI.p r3 = r6.d()
            U0.F1.c(r7, r2, r3)
            s0.h r2 = s0.C5862h.f28810a
            tK.u r43 = tK.C18029u.f147649a
            float r2 = r43.h()
            androidx.compose.ui.d r2 = androidx.compose.foundation.layout.J.i(r11, r2)
            s0.C5844O.a(r2, r13, r9)
            int r2 = st.c.f102699A
            java.lang.String r16 = J1.j.b(r2, r13, r9)
            TC.b$b$b r17 = TC.C13679b.C2857b.C2858b.f116684a
            r2 = r42
            tK.h r2 = r10.a(r13, r2)
            long r19 = r2.x0()
            androidx.compose.ui.d r18 = TC.e.i(r11)
            r40 = 0
            r41 = 262128(0x3fff0, float:3.6732E-40)
            r21 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            r37 = 0
            r39 = 48
            r38 = r13
            SC.C13607l.j(r16, r17, r18, r19, r21, r23, r24, r25, r26, r28, r29, r30, r31, r33, r34, r35, r36, r37, r38, r39, r40, r41)
            float r2 = r43.d()
            androidx.compose.ui.d r2 = androidx.compose.foundation.layout.J.i(r11, r2)
            s0.C5844O.a(r2, r13, r9)
            int r2 = uK.C18146a.f148109K
            int r3 = st.c.f102826z
            java.lang.String r3 = J1.j.b(r3, r13, r9)
            SC.G0 r7 = SC.G0.Medium
            SC.H0 r6 = SC.H0.PrimaryInverseStatic
            java.lang.String r4 = "change_store_button"
            androidx.compose.ui.d r4 = androidx.compose.ui.platform.C5116k1.a(r11, r4)
            int r5 = r12 << 18
            r8 = 234881024(0xe000000, float:1.5777218E-30)
            r5 = r5 & r8
            r8 = 221568(0x36180, float:3.10483E-40)
            r16 = r5 | r8
            r17 = 200(0xc8, float:2.8E-43)
            r5 = 0
            r8 = 0
            r10 = 0
            r9 = r10
            r10 = r47
            r44 = r11
            r11 = r13
            r18 = r12
            r12 = r16
            r16 = r0
            r0 = r13
            r13 = r17
            SC.F0.b(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            float r2 = r43.d()
            r3 = r44
            androidx.compose.ui.d r2 = androidx.compose.foundation.layout.J.i(r3, r2)
            r4 = 0
            s0.C5844O.a(r2, r0, r4)
            r2 = -1789684092(0xffffffff95539684, float:-4.2729847E-26)
            r0.W(r2)
            boolean r2 = r45.isEmpty()
            if (r2 != 0) goto L_0x01f0
            r2 = r18 & 14
            c(r1, r0, r2)
            float r2 = r43.h()
            androidx.compose.ui.d r2 = androidx.compose.foundation.layout.J.i(r3, r2)
            s0.C5844O.a(r2, r0, r4)
        L_0x01f0:
            r0.P()
            r0.x()
            boolean r2 = U0.C4895p.J()
            if (r2 == 0) goto L_0x01ff
            U0.C4895p.R()
        L_0x01ff:
            r2 = r16
        L_0x0201:
            U0.Y0 r6 = r0.n()
            if (r6 == 0) goto L_0x0218
            ut.c r7 = new ut.c
            r0 = r7
            r1 = r45
            r3 = r47
            r4 = r49
            r5 = r50
            r0.<init>(r1, r2, r3, r4, r5)
            r6.a(r7)
        L_0x0218:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ut.C12096e.g(KJ.c, androidx.compose.ui.d, nI.a, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N h(C15987c cVar, d dVar, C17631a aVar, int i10, int i11, C4889m mVar, int i12) {
        g(cVar, dVar, aVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
