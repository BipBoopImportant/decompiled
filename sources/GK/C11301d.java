package gk;

import Bx.a;
import Oo.b;
import QA.C13352d;
import QJ.Q;
import U0.A1;
import U0.C4889m;
import U0.M0;
import XH.C16807N;
import XH.t;
import XH.y;
import android.content.Context;
import dI.C17164e;
import eI.C17187b;
import fk.C11269a;
import fk.C11270b;
import fk.c;
import fk.d;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import x4.C8948l;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a]\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u00052\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\t2\b\b\u0002\u0010\r\u001a\u00020\fH\u0001¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0012²\u0006\f\u0010\u0011\u001a\u00020\u00108\nX\u0002"}, d2 = {"Lx4/l;", "fragmentNavBackStackEntry", "Lkotlin/Function0;", "LXH/N;", "onClose", "Lkotlin/Function2;", "", "LQA/d;", "onOpenShoppingListDetails", "Lkotlin/Function1;", "LBx/a;", "onOpenLoginPromotion", "Lfk/d;", "viewModel", "d", "(Lx4/l;LnI/a;LnI/p;LnI/l;Lfk/d;LU0/m;II)V", "Lfk/c;", "state", "sharedlist-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: gk.d  reason: case insensitive filesystem */
public final class C11301d {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.sharedlist.impl.presentation.ui.SharedListDestinationKt$SharedListDestination$1$1", f = "SharedListDestination.kt", l = {}, m = "invokeSuspend")
    /* renamed from: gk.d$a */
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f97630c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ c.a f97631d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C17642l<Bx.a, C16807N> f97632e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ d f97633f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ p<String, C13352d, C16807N> f97634g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(c.a aVar, C17642l<? super Bx.a, C16807N> lVar, d dVar, p<? super String, ? super C13352d, C16807N> pVar, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f97631d = aVar;
            this.f97632e = lVar;
            this.f97633f = dVar;
            this.f97634g = pVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f97631d, this.f97632e, this.f97633f, this.f97634g, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f97630c == 0) {
                y.b(obj);
                c.a aVar = this.f97631d;
                if (aVar instanceof c.a.C2163a) {
                    this.f97632e.invoke(this.f97633f.Q());
                    this.f97633f.U(C11270b.C2162b.f97277a);
                } else if (aVar instanceof c.a.d) {
                    this.f97634g.invoke(((c.a.d) aVar).a(), this.f97633f.R());
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00cc, code lost:
        if ((r28 & 16) != 0) goto L_0x00ce;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x01b2  */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x01b7  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0219  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0192  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0194  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x019f  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01a1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void d(x4.C8948l r21, nI.C17631a<XH.C16807N> r22, nI.p<? super java.lang.String, ? super QA.C13352d, XH.C16807N> r23, nI.C17642l<? super Bx.a, XH.C16807N> r24, fk.d r25, U0.C4889m r26, int r27, int r28) {
        /*
            r1 = r21
            r2 = r22
            r9 = r23
            r10 = r24
            r11 = r27
            java.lang.String r0 = "fragmentNavBackStackEntry"
            kotlin.jvm.internal.C17542s.j(r1, r0)
            java.lang.String r0 = "onClose"
            kotlin.jvm.internal.C17542s.j(r2, r0)
            java.lang.String r0 = "onOpenShoppingListDetails"
            kotlin.jvm.internal.C17542s.j(r9, r0)
            java.lang.String r0 = "onOpenLoginPromotion"
            kotlin.jvm.internal.C17542s.j(r10, r0)
            r0 = 613864865(0x2496d5a1, float:6.541403E-17)
            r3 = r26
            U0.m r8 = r3.k(r0)
            r3 = r28 & 1
            if (r3 == 0) goto L_0x002e
            r3 = r11 | 6
            goto L_0x003e
        L_0x002e:
            r3 = r11 & 6
            if (r3 != 0) goto L_0x003d
            boolean r3 = r8.F(r1)
            if (r3 == 0) goto L_0x003a
            r3 = 4
            goto L_0x003b
        L_0x003a:
            r3 = 2
        L_0x003b:
            r3 = r3 | r11
            goto L_0x003e
        L_0x003d:
            r3 = r11
        L_0x003e:
            r4 = r28 & 2
            r5 = 32
            if (r4 == 0) goto L_0x0047
            r3 = r3 | 48
            goto L_0x0056
        L_0x0047:
            r4 = r11 & 48
            if (r4 != 0) goto L_0x0056
            boolean r4 = r8.F(r2)
            if (r4 == 0) goto L_0x0053
            r4 = r5
            goto L_0x0055
        L_0x0053:
            r4 = 16
        L_0x0055:
            r3 = r3 | r4
        L_0x0056:
            r4 = r28 & 4
            r6 = 256(0x100, float:3.59E-43)
            if (r4 == 0) goto L_0x005f
            r3 = r3 | 384(0x180, float:5.38E-43)
            goto L_0x006e
        L_0x005f:
            r4 = r11 & 384(0x180, float:5.38E-43)
            if (r4 != 0) goto L_0x006e
            boolean r4 = r8.F(r9)
            if (r4 == 0) goto L_0x006b
            r4 = r6
            goto L_0x006d
        L_0x006b:
            r4 = 128(0x80, float:1.794E-43)
        L_0x006d:
            r3 = r3 | r4
        L_0x006e:
            r4 = r28 & 8
            r7 = 2048(0x800, float:2.87E-42)
            if (r4 == 0) goto L_0x0077
            r3 = r3 | 3072(0xc00, float:4.305E-42)
            goto L_0x0086
        L_0x0077:
            r4 = r11 & 3072(0xc00, float:4.305E-42)
            if (r4 != 0) goto L_0x0086
            boolean r4 = r8.F(r10)
            if (r4 == 0) goto L_0x0083
            r4 = r7
            goto L_0x0085
        L_0x0083:
            r4 = 1024(0x400, float:1.435E-42)
        L_0x0085:
            r3 = r3 | r4
        L_0x0086:
            r4 = r11 & 24576(0x6000, float:3.4438E-41)
            if (r4 != 0) goto L_0x009f
            r4 = r28 & 16
            if (r4 != 0) goto L_0x0099
            r4 = r25
            boolean r12 = r8.F(r4)
            if (r12 == 0) goto L_0x009b
            r12 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009d
        L_0x0099:
            r4 = r25
        L_0x009b:
            r12 = 8192(0x2000, float:1.14794E-41)
        L_0x009d:
            r3 = r3 | r12
            goto L_0x00a1
        L_0x009f:
            r4 = r25
        L_0x00a1:
            r12 = r3 & 9363(0x2493, float:1.312E-41)
            r13 = 9362(0x2492, float:1.3119E-41)
            if (r12 != r13) goto L_0x00b5
            boolean r12 = r8.l()
            if (r12 != 0) goto L_0x00ae
            goto L_0x00b5
        L_0x00ae:
            r8.L()
            r5 = r4
            r9 = r8
            goto L_0x021d
        L_0x00b5:
            r8.G()
            r12 = r11 & 1
            r20 = -57345(0xffffffffffff1fff, float:NaN)
            r15 = 0
            if (r12 == 0) goto L_0x00d1
            boolean r12 = r8.O()
            if (r12 == 0) goto L_0x00c7
            goto L_0x00d1
        L_0x00c7:
            r8.L()
            r12 = r28 & 16
            if (r12 == 0) goto L_0x0120
        L_0x00ce:
            r3 = r3 & r20
            goto L_0x0120
        L_0x00d1:
            r12 = r28 & 16
            if (r12 == 0) goto L_0x0120
            r4 = 1890788296(0x70b323c8, float:4.435286E29)
            r8.C(r4)
            m3.a r4 = m3.a.f26247a
            int r12 = m3.a.f26249c
            androidx.lifecycle.k0 r13 = r4.a(r8, r12)
            if (r13 == 0) goto L_0x0118
            androidx.lifecycle.i0$c r4 = f3.a.a(r13, r8, r15)
            r12 = 1729797275(0x671a9c9b, float:7.301333E23)
            r8.C(r12)
            boolean r12 = r13 instanceof androidx.lifecycle.C5212o
            if (r12 == 0) goto L_0x00fd
            r12 = r13
            androidx.lifecycle.o r12 = (androidx.lifecycle.C5212o) r12
            l3.a r12 = r12.getDefaultViewModelCreationExtras()
        L_0x00fa:
            r16 = r12
            goto L_0x0100
        L_0x00fd:
            l3.a$a r12 = l3.a.C0407a.f25486b
            goto L_0x00fa
        L_0x0100:
            r18 = 36936(0x9048, float:5.1758E-41)
            r19 = 0
            java.lang.Class<fk.d> r12 = fk.d.class
            r14 = 0
            r15 = r4
            r17 = r8
            androidx.lifecycle.f0 r4 = m3.c.b(r12, r13, r14, r15, r16, r17, r18, r19)
            r8.U()
            r8.U()
            fk.d r4 = (fk.d) r4
            goto L_0x00ce
        L_0x0118:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"
            r0.<init>(r1)
            throw r0
        L_0x0120:
            r8.y()
            boolean r12 = U0.C4895p.J()
            if (r12 == 0) goto L_0x012f
            r12 = -1
            java.lang.String r13 = "com.ingka.ikea.app.sharedlist.impl.presentation.ui.SharedListDestination (SharedListDestination.kt:29)"
            U0.C4895p.S(r0, r3, r12, r13)
        L_0x012f:
            U0.I0 r0 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.g()
            java.lang.Object r0 = r8.Q(r0)
            android.content.Context r0 = (android.content.Context) r0
            TJ.P r12 = r4.getState()
            r17 = 0
            r18 = 7
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = r8
            U0.A1 r12 = j3.a.c(r12, r13, r14, r15, r16, r17, r18)
            r13 = -594005482(0xffffffffdc983216, float:-3.42714132E17)
            r8.W(r13)
            boolean r13 = r8.F(r4)
            boolean r14 = r8.F(r0)
            r13 = r13 | r14
            r14 = r3 & 112(0x70, float:1.57E-43)
            if (r14 != r5) goto L_0x015f
            r5 = 1
            goto L_0x0160
        L_0x015f:
            r5 = 0
        L_0x0160:
            r5 = r5 | r13
            java.lang.Object r13 = r8.D()
            if (r5 != 0) goto L_0x016f
            U0.m$a r5 = U0.C4889m.f14007a
            java.lang.Object r5 = r5.a()
            if (r13 != r5) goto L_0x0177
        L_0x016f:
            gk.a r13 = new gk.a
            r13.<init>(r4, r0, r2)
            r8.u(r13)
        L_0x0177:
            nI.l r13 = (nI.C17642l) r13
            r8.P()
            fk.c r5 = e(r12)
            fk.c$a r14 = r5.c()
            r5 = -593984901(0xffffffffdc98827b, float:-3.4342129E17)
            r8.W(r5)
            boolean r5 = r8.F(r14)
            r15 = r3 & 7168(0x1c00, float:1.0045E-41)
            if (r15 != r7) goto L_0x0194
            r15 = 1
            goto L_0x0195
        L_0x0194:
            r15 = 0
        L_0x0195:
            r5 = r5 | r15
            boolean r7 = r8.F(r4)
            r5 = r5 | r7
            r7 = r3 & 896(0x380, float:1.256E-42)
            if (r7 != r6) goto L_0x01a1
            r15 = 1
            goto L_0x01a2
        L_0x01a1:
            r15 = 0
        L_0x01a2:
            r5 = r5 | r15
            java.lang.Object r6 = r8.D()
            if (r5 != 0) goto L_0x01b7
            U0.m$a r5 = U0.C4889m.f14007a
            java.lang.Object r5 = r5.a()
            if (r6 != r5) goto L_0x01b2
            goto L_0x01b7
        L_0x01b2:
            r17 = r3
            r2 = r4
            r9 = r8
            goto L_0x01d0
        L_0x01b7:
            gk.d$a r15 = new gk.d$a
            r16 = 0
            r17 = r3
            r3 = r15
            r7 = r4
            r4 = r14
            r5 = r24
            r6 = r7
            r2 = r7
            r7 = r23
            r9 = r8
            r8 = r16
            r3.<init>(r4, r5, r6, r7, r8)
            r9.u(r15)
            r6 = r15
        L_0x01d0:
            nI.p r6 = (nI.p) r6
            r9.P()
            r3 = 0
            U0.P.g(r14, r6, r9, r3)
            r4 = -593964360(0xffffffffdc98d2b8, float:-3.44127073E17)
            r9.W(r4)
            boolean r4 = r9.F(r2)
            boolean r5 = r9.F(r0)
            r4 = r4 | r5
            java.lang.Object r5 = r9.D()
            if (r4 != 0) goto L_0x01f6
            U0.m$a r4 = U0.C4889m.f14007a
            java.lang.Object r4 = r4.a()
            if (r5 != r4) goto L_0x01fe
        L_0x01f6:
            gk.b r5 = new gk.b
            r5.<init>(r2, r0)
            r9.u(r5)
        L_0x01fe:
            nI.l r5 = (nI.C17642l) r5
            r9.P()
            r0 = r17 & 14
            r0 = r0 | 48
            java.lang.String r4 = "login_signup_promotion_signup"
            qw.l.c(r1, r4, r5, r9, r0)
            fk.c r0 = e(r12)
            gk.v.w(r0, r13, r9, r3)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x021c
            U0.C4895p.R()
        L_0x021c:
            r5 = r2
        L_0x021d:
            U0.Y0 r8 = r9.n()
            if (r8 == 0) goto L_0x0238
            gk.c r9 = new gk.c
            r0 = r9
            r1 = r21
            r2 = r22
            r3 = r23
            r4 = r24
            r6 = r27
            r7 = r28
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.a(r9)
        L_0x0238:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: gk.C11301d.d(x4.l, nI.a, nI.p, nI.l, fk.d, U0.m, int, int):void");
    }

    private static final c e(A1<c> a12) {
        return a12.getValue();
    }

    /* access modifiers changed from: private */
    public static final C16807N f(d dVar, Context context, C17631a aVar, C11269a aVar2) {
        C17542s.j(aVar2, "event");
        if (C17542s.e(aVar2, C11269a.C2161a.f97271a)) {
            String string = context.getString(b.f84762q8);
            C17542s.i(string, "getString(...)");
            dVar.U(new C11270b.a(string));
        } else if (C17542s.e(aVar2, C11269a.c.f97273a)) {
            aVar.invoke();
        } else if (C17542s.e(aVar2, C11269a.d.f97274a)) {
            aVar.invoke();
        } else if (C17542s.e(aVar2, C11269a.e.f97275a)) {
            dVar.U(C11270b.c.f97278a);
        } else if (C17542s.e(aVar2, C11269a.b.f97272a)) {
            dVar.U(C11270b.C2162b.f97277a);
        } else {
            throw new t();
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N g(d dVar, Context context, a.b bVar) {
        C17542s.j(bVar, "result");
        if (C17542s.e(bVar, a.b.c.f108192a)) {
            String string = context.getString(b.f84762q8);
            C17542s.i(string, "getString(...)");
            dVar.U(new C11270b.a(string));
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N h(C8948l lVar, C17631a aVar, p pVar, C17642l lVar2, d dVar, int i10, int i11, C4889m mVar, int i12) {
        d(lVar, aVar, pVar, lVar2, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
