package ut;

import It.C10738a;
import It.C10740c;
import It.C10741d;
import It.C10742e;
import It.C10743f;
import It.C10744g;
import It.q;
import QJ.Q;
import U0.A1;
import U0.C4889m;
import U0.M0;
import XH.C16807N;
import XH.t;
import XH.y;
import android.net.Uri;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.p;
import x4.C8951o;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a'\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t²\u0006\f\u0010\b\u001a\u00020\u00078\nX\u0002"}, d2 = {"LIt/g;", "viewModel", "Lkotlin/Function0;", "LXH/N;", "onDismiss", "c", "(LIt/g;LnI/a;LU0/m;II)V", "LIt/f;", "state", "instore-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class J {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.instore.impl.composables.InstoreAppLinkChangeStoreScreenKt$InstoreAppLinkChangeStoreScreen$1$1", f = "InstoreAppLinkChangeStoreScreen.kt", l = {}, m = "invokeSuspend")
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f104167c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C8951o f104168d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f104169e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C10744g f104170f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ A1<C10743f> f104171g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C8951o oVar, C17631a<C16807N> aVar, C10744g gVar, A1<C10743f> a12, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f104168d = oVar;
            this.f104169e = aVar;
            this.f104170f = gVar;
            this.f104171g = a12;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f104168d, this.f104169e, this.f104170f, this.f104171g, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f104167c == 0) {
                y.b(obj);
                C10742e d10 = J.d(this.f104171g).d();
                if (d10 instanceof C10740c) {
                    this.f104168d.X(Uri.parse(((C10740c) d10).a()));
                    this.f104169e.invoke();
                } else if (d10 instanceof C10741d) {
                    this.f104168d.X(Uri.parse(((C10741d) d10).a()));
                    this.f104169e.invoke();
                } else if (d10 != null) {
                    throw new t();
                }
                this.f104170f.b(C10738a.c.f82300a);
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v2, resolved type: nI.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v14, resolved type: ut.J$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v19, resolved type: ut.J$a} */
    /* JADX WARNING: type inference failed for: r12v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x016c  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01d5  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01de  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void c(It.C10744g r24, nI.C17631a<XH.C16807N> r25, U0.C4889m r26, int r27, int r28) {
        /*
            r6 = r25
            r7 = r27
            r8 = r28
            java.lang.String r0 = "onDismiss"
            kotlin.jvm.internal.C17542s.j(r6, r0)
            r0 = -446244007(0xffffffffe566db59, float:-6.813691E22)
            r1 = r26
            U0.m r5 = r1.k(r0)
            r1 = r7 & 6
            r4 = 4
            if (r1 != 0) goto L_0x002c
            r1 = r8 & 1
            if (r1 != 0) goto L_0x0027
            r1 = r24
            boolean r2 = r5.V(r1)
            if (r2 == 0) goto L_0x0029
            r2 = r4
            goto L_0x002a
        L_0x0027:
            r1 = r24
        L_0x0029:
            r2 = 2
        L_0x002a:
            r2 = r2 | r7
            goto L_0x002f
        L_0x002c:
            r1 = r24
            r2 = r7
        L_0x002f:
            r3 = r8 & 2
            r15 = 32
            if (r3 == 0) goto L_0x0038
            r2 = r2 | 48
            goto L_0x0047
        L_0x0038:
            r3 = r7 & 48
            if (r3 != 0) goto L_0x0047
            boolean r3 = r5.F(r6)
            if (r3 == 0) goto L_0x0044
            r3 = r15
            goto L_0x0046
        L_0x0044:
            r3 = 16
        L_0x0046:
            r2 = r2 | r3
        L_0x0047:
            r3 = r2 & 19
            r9 = 18
            if (r3 != r9) goto L_0x005a
            boolean r3 = r5.l()
            if (r3 != 0) goto L_0x0054
            goto L_0x005a
        L_0x0054:
            r5.L()
            r0 = r5
            goto L_0x01e2
        L_0x005a:
            r5.G()
            r3 = r7 & 1
            r14 = 0
            if (r3 == 0) goto L_0x0079
            boolean r3 = r5.O()
            if (r3 == 0) goto L_0x0069
            goto L_0x0079
        L_0x0069:
            r5.L()
            r3 = r8 & 1
            if (r3 == 0) goto L_0x0072
            r2 = r2 & -15
        L_0x0072:
            r3 = r15
        L_0x0073:
            r23 = r2
            r2 = r1
            r1 = r23
            goto L_0x00ca
        L_0x0079:
            r3 = r8 & 1
            if (r3 == 0) goto L_0x0072
            r1 = 1890788296(0x70b323c8, float:4.435286E29)
            r5.C(r1)
            m3.a r1 = m3.a.f26247a
            int r3 = m3.a.f26249c
            androidx.lifecycle.k0 r10 = r1.a(r5, r3)
            if (r10 == 0) goto L_0x00c2
            androidx.lifecycle.i0$c r12 = f3.a.a(r10, r5, r14)
            r1 = 1729797275(0x671a9c9b, float:7.301333E23)
            r5.C(r1)
            boolean r1 = r10 instanceof androidx.lifecycle.C5212o
            if (r1 == 0) goto L_0x00a4
            r1 = r10
            androidx.lifecycle.o r1 = (androidx.lifecycle.C5212o) r1
            l3.a r1 = r1.getDefaultViewModelCreationExtras()
        L_0x00a2:
            r13 = r1
            goto L_0x00a7
        L_0x00a4:
            l3.a$a r1 = l3.a.C0407a.f25486b
            goto L_0x00a2
        L_0x00a7:
            r1 = 36936(0x9048, float:5.1758E-41)
            r16 = 0
            java.lang.Class<It.h> r9 = It.C10745h.class
            r11 = 0
            r3 = r14
            r14 = r5
            r3 = r15
            r15 = r1
            androidx.lifecycle.f0 r1 = m3.c.b(r9, r10, r11, r12, r13, r14, r15, r16)
            r5.U()
            r5.U()
            It.g r1 = (It.C10744g) r1
            r2 = r2 & -15
            goto L_0x0073
        L_0x00c2:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"
            r0.<init>(r1)
            throw r0
        L_0x00ca:
            r5.y()
            boolean r9 = U0.C4895p.J()
            if (r9 == 0) goto L_0x00d9
            r9 = -1
            java.lang.String r10 = "com.ingka.ikea.instore.impl.composables.InstoreAppLinkChangeStoreScreen (InstoreAppLinkChangeStoreScreen.kt:26)"
            U0.C4895p.S(r0, r1, r9, r10)
        L_0x00d9:
            U0.I0 r0 = Vo.b.c()
            java.lang.Object r0 = r5.Q(r0)
            androidx.fragment.app.o r0 = (androidx.fragment.app.C5187o) r0
            x4.o r0 = androidx.navigation.fragment.a.a(r0)
            TJ.P r9 = r2.getState()
            r14 = 0
            r15 = 7
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = r5
            U0.A1 r9 = j3.a.c(r9, r10, r11, r12, r13, r14, r15)
            It.f r10 = d(r9)
            It.e r10 = r10.d()
            r11 = -340762886(0xffffffffebb05efa, float:-4.264389E26)
            r5.W(r11)
            boolean r11 = r5.V(r9)
            boolean r12 = r5.F(r0)
            r11 = r11 | r12
            r12 = r1 & 112(0x70, float:1.57E-43)
            if (r12 != r3) goto L_0x0112
            r3 = 1
            goto L_0x0113
        L_0x0112:
            r3 = 0
        L_0x0113:
            r3 = r3 | r11
            r11 = r1 & 14
            r11 = r11 ^ 6
            if (r11 <= r4) goto L_0x0120
            boolean r12 = r5.V(r2)
            if (r12 != 0) goto L_0x0124
        L_0x0120:
            r12 = r1 & 6
            if (r12 != r4) goto L_0x0126
        L_0x0124:
            r12 = 1
            goto L_0x0127
        L_0x0126:
            r12 = 0
        L_0x0127:
            r3 = r3 | r12
            java.lang.Object r12 = r5.D()
            if (r3 != 0) goto L_0x013c
            U0.m$a r3 = U0.C4889m.f14007a
            java.lang.Object r3 = r3.a()
            if (r12 != r3) goto L_0x0137
            goto L_0x013c
        L_0x0137:
            r15 = r1
            r24 = r2
            r14 = r5
            goto L_0x0153
        L_0x013c:
            ut.J$a r12 = new ut.J$a
            r13 = 0
            r3 = r0
            r0 = r12
            r15 = r1
            r1 = r3
            r24 = r2
            r2 = r25
            r14 = 0
            r3 = r24
            r4 = r9
            r14 = r5
            r5 = r13
            r0.<init>(r1, r2, r3, r4, r5)
            r14.u(r12)
        L_0x0153:
            nI.p r12 = (nI.p) r12
            r14.P()
            r0 = 0
            U0.P.g(r10, r12, r14, r0)
            It.f r1 = d(r9)
            It.b r1 = r1.c()
            It.b$a r2 = It.C10739b.a.f82301a
            boolean r2 = kotlin.jvm.internal.C17542s.e(r1, r2)
            if (r2 != 0) goto L_0x01d5
            boolean r2 = r1 instanceof It.C10739b.C1614b
            if (r2 == 0) goto L_0x01cf
            It.b$b r1 = (It.C10739b.C1614b) r1
            java.lang.String r9 = r1.b()
            java.lang.String r10 = r1.c()
            boolean r1 = r1.a()
            androidx.compose.ui.window.h r12 = new androidx.compose.ui.window.h
            r21 = 4
            r22 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r17 = r12
            r17.<init>((boolean) r18, (boolean) r19, (boolean) r20, (int) r21, (kotlin.jvm.internal.DefaultConstructorMarker) r22)
            r2 = -340728209(0xffffffffebb0e66f, float:-4.2771827E26)
            r14.W(r2)
            r2 = 4
            r3 = r24
            if (r11 <= r2) goto L_0x01a0
            boolean r4 = r14.V(r3)
            if (r4 != 0) goto L_0x01a4
        L_0x01a0:
            r4 = r15 & 6
            if (r4 != r2) goto L_0x01a7
        L_0x01a4:
            r16 = 1
            goto L_0x01a9
        L_0x01a7:
            r16 = r0
        L_0x01a9:
            java.lang.Object r0 = r14.D()
            if (r16 != 0) goto L_0x01b7
            U0.m$a r2 = U0.C4889m.f14007a
            java.lang.Object r2 = r2.a()
            if (r0 != r2) goto L_0x01bf
        L_0x01b7:
            ut.H r0 = new ut.H
            r0.<init>(r3)
            r14.u(r0)
        L_0x01bf:
            r13 = r0
            nI.l r13 = (nI.C17642l) r13
            r14.P()
            r15 = 3072(0xc00, float:4.305E-42)
            r16 = 0
            r11 = r1
            r0 = r14
            ut.C12117s.d(r9, r10, r11, r12, r13, r14, r15, r16)
            goto L_0x01d8
        L_0x01cf:
            XH.t r0 = new XH.t
            r0.<init>()
            throw r0
        L_0x01d5:
            r3 = r24
            r0 = r14
        L_0x01d8:
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x01e1
            U0.C4895p.R()
        L_0x01e1:
            r1 = r3
        L_0x01e2:
            U0.Y0 r0 = r0.n()
            if (r0 == 0) goto L_0x01f0
            ut.I r2 = new ut.I
            r2.<init>(r1, r6, r7, r8)
            r0.a(r2)
        L_0x01f0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ut.J.c(It.g, nI.a, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C10743f d(A1<C10743f> a12) {
        return a12.getValue();
    }

    /* access modifiers changed from: private */
    public static final C16807N e(C10744g gVar, q.C10757e eVar) {
        Object obj;
        C17542s.j(eVar, "it");
        if (eVar instanceof q.C10757e.a) {
            obj = C10738a.C1613a.f82298a;
        } else if (eVar instanceof q.C10757e.c) {
            obj = C10738a.b.f82299a;
        } else {
            throw new t();
        }
        gVar.b(obj);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N f(C10744g gVar, C17631a aVar, int i10, int i11, C4889m mVar, int i12) {
        c(gVar, aVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
