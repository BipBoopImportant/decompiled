package Si;

import Dh.C9064b;
import Dh.C9065c;
import Dh.C9066d;
import Dh.D;
import EB.C12832d;
import IC.C13023e;
import IC.C13026h;
import J1.j;
import QJ.Q;
import SC.N;
import U0.A1;
import U0.C4889m;
import U0.C4895p;
import U0.M0;
import U0.Y0;
import Uj.u;
import Uj.v;
import Uj.y;
import XH.C16807N;
import XH.t;
import YH.C16877v;
import androidx.compose.ui.d;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.r;
import c1.c;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import jC.C14615b;
import jC.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;
import nI.p;
import nI.q;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001f\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\t\u0010\n\u001a/\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a%\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a-\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0016\u0010\u0012¨\u0006\u0017²\u0006\f\u0010\b\u001a\u00020\u00078\nX\u0002"}, d2 = {"LUj/q;", "viewModel", "LSi/b;", "actions", "LXH/N;", "k", "(LUj/q;LSi/b;LU0/m;I)V", "LUj/y;", "uiState", "l", "(LUj/y;LSi/b;LU0/m;I)V", "LjC/i;", "systemUi", "LEB/d;", "store", "", "LDh/D;", "u", "(LjC/i;LEB/d;LSi/b;)Ljava/util/List;", "r", "(LjC/i;LSi/b;)Ljava/util/List;", "storeSelection", "v", "scanandgo-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class m {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.scanandgoonlineprovider.compose.ScanAndGoOnboardingScreenKt$ScanAndGoOnboardingScreen$2$1", f = "ScanAndGoOnboardingScreen.kt", l = {}, m = "invokeSuspend")
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f87089c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ y f87090d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C10913b f87091e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(y yVar, C10913b bVar, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f87090d = yVar;
            this.f87091e = bVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f87090d, this.f87091e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f87089c == 0) {
                XH.y.b(obj);
                u e10 = this.f87090d.e();
                C10913b bVar = this.f87091e;
                bVar.b(e10);
                bVar.a(v.a.f88273a);
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C12832d f87092a;

        b(C12832d dVar) {
            this.f87092a = dVar;
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-1941277150, i10, -1, "com.ingka.ikea.app.scanandgoonlineprovider.compose.buildStoreAlreadySelectedOnboarding.<anonymous>.<anonymous> (ScanAndGoOnboardingScreen.kt:182)");
                }
                C13023e c10 = C13026h.c("");
                C13023e c11 = C13026h.c(j.c(Ez.f.f109693d, new Object[]{this.f87092a.getName()}, mVar, 0));
                C13023e a10 = C13026h.a(Ez.f.f109736y0);
                int i11 = C13023e.f110931a;
                Dh.m.l(c10, c11, a10, "https://shop.static.ingka.ikea.com/skanna/scanandgo-onboarding-change-store.png", (d) null, (q<? super String, ? super C4889m, ? super Integer, C16807N>) null, mVar, i11 | 3072 | (i11 << 3) | (i11 << 6), 48);
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

    public static final void k(Uj.q qVar, C10913b bVar, C4889m mVar, int i10) {
        int i11;
        C17542s.j(qVar, "viewModel");
        C17542s.j(bVar, "actions");
        C4889m k10 = mVar.k(542247512);
        if ((i10 & 6) == 0) {
            i11 = (k10.F(qVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= (i10 & 64) == 0 ? k10.V(bVar) : k10.F(bVar) ? 32 : 16;
        }
        int i12 = i11;
        if ((i12 & 19) != 18 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(542247512, i12, -1, "com.ingka.ikea.app.scanandgoonlineprovider.compose.ScanAndGoOnboardingScreen (ScanAndGoOnboardingScreen.kt:41)");
            }
            l(m(j3.a.c(qVar.getState(), (C5221y) null, (r.b) null, (C17168i) null, k10, 0, 7)), bVar, k10, i12 & 112);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new c(qVar, bVar, i10));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v1, resolved type: nI.l} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void l(Uj.y r21, Si.C10913b r22, U0.C4889m r23, int r24) {
        /*
            r0 = r21
            r1 = r22
            r2 = r24
            java.lang.String r3 = "uiState"
            kotlin.jvm.internal.C17542s.j(r0, r3)
            java.lang.String r3 = "actions"
            kotlin.jvm.internal.C17542s.j(r1, r3)
            r3 = 1067165316(0x3f9ba684, float:1.2160192)
            r4 = r23
            U0.m r14 = r4.k(r3)
            r4 = r2 & 6
            if (r4 != 0) goto L_0x0028
            boolean r4 = r14.F(r0)
            if (r4 == 0) goto L_0x0025
            r4 = 4
            goto L_0x0026
        L_0x0025:
            r4 = 2
        L_0x0026:
            r4 = r4 | r2
            goto L_0x0029
        L_0x0028:
            r4 = r2
        L_0x0029:
            r5 = r2 & 48
            r6 = 32
            if (r5 != 0) goto L_0x0043
            r5 = r2 & 64
            if (r5 != 0) goto L_0x0038
            boolean r5 = r14.V(r1)
            goto L_0x003c
        L_0x0038:
            boolean r5 = r14.F(r1)
        L_0x003c:
            if (r5 == 0) goto L_0x0040
            r5 = r6
            goto L_0x0042
        L_0x0040:
            r5 = 16
        L_0x0042:
            r4 = r4 | r5
        L_0x0043:
            r5 = r4 & 19
            r7 = 18
            if (r5 != r7) goto L_0x0055
            boolean r5 = r14.l()
            if (r5 != 0) goto L_0x0050
            goto L_0x0055
        L_0x0050:
            r14.L()
            goto L_0x0168
        L_0x0055:
            boolean r5 = U0.C4895p.J()
            if (r5 == 0) goto L_0x0061
            r5 = -1
            java.lang.String r7 = "com.ingka.ikea.app.scanandgoonlineprovider.compose.ScanAndGoOnboardingScreen (ScanAndGoOnboardingScreen.kt:55)"
            U0.C4895p.S(r3, r4, r5, r7)
        L_0x0061:
            Uj.u r3 = r21.e()
            r5 = 517302889(0x1ed56a69, float:2.2596262E-20)
            r14.W(r5)
            boolean r5 = r14.F(r0)
            r7 = r4 & 112(0x70, float:1.57E-43)
            r8 = 1
            r9 = 0
            if (r7 == r6) goto L_0x0082
            r10 = r4 & 64
            if (r10 == 0) goto L_0x0080
            boolean r10 = r14.F(r1)
            if (r10 == 0) goto L_0x0080
            goto L_0x0082
        L_0x0080:
            r10 = r9
            goto L_0x0083
        L_0x0082:
            r10 = r8
        L_0x0083:
            r5 = r5 | r10
            java.lang.Object r10 = r14.D()
            r11 = 0
            if (r5 != 0) goto L_0x0093
            U0.m$a r5 = U0.C4889m.f14007a
            java.lang.Object r5 = r5.a()
            if (r10 != r5) goto L_0x009b
        L_0x0093:
            Si.m$a r10 = new Si.m$a
            r10.<init>(r0, r1, r11)
            r14.u(r10)
        L_0x009b:
            nI.p r10 = (nI.p) r10
            r14.P()
            U0.P.g(r3, r10, r14, r9)
            jC.i r3 = jC.k.c(r11, r14, r9, r8)
            Uj.w r5 = r21.c()
            if (r5 == 0) goto L_0x00b2
            EB.d r5 = r5.a()
            goto L_0x00b3
        L_0x00b2:
            r5 = r11
        L_0x00b3:
            java.util.List r3 = u(r3, r5, r1)
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            KJ.c r3 = KJ.C15985a.h(r3)
            Dh.d$b r5 = Dh.C9066d.f59179d
            r10 = 517316994(0x1ed5a182, float:2.261905E-20)
            r14.W(r10)
            java.lang.Object r10 = r14.D()
            U0.m$a r12 = U0.C4889m.f14007a
            java.lang.Object r13 = r12.a()
            if (r10 != r13) goto L_0x00d9
            Si.d r10 = new Si.d
            r10.<init>()
            r14.u(r10)
        L_0x00d9:
            nI.l r10 = (nI.C17642l) r10
            r14.P()
            Dh.d r10 = r5.a(r10)
            boolean r13 = r21.f()
            Uj.x r5 = r21.d()
            if (r5 == 0) goto L_0x00f1
            IC.e r5 = r5.a()
            goto L_0x00f2
        L_0x00f1:
            r5 = r11
        L_0x00f2:
            r15 = 517322197(0x1ed5b5d5, float:2.2627456E-20)
            r14.W(r15)
            if (r5 != 0) goto L_0x00fb
            goto L_0x0102
        L_0x00fb:
            int r11 = IC.C13023e.f110931a
            java.lang.String r5 = r5.a(r14, r11)
            r11 = r5
        L_0x0102:
            r14.P()
            float r5 = (float) r9
            float r15 = c2.h.B(r5)
            r19 = 14
            r20 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            s0.T r15 = s0.C5850V.c(r15, r16, r17, r18, r19, r20)
            r5 = 517324984(0x1ed5c0b8, float:2.2631959E-20)
            r14.W(r5)
            if (r7 == r6) goto L_0x012c
            r4 = r4 & 64
            if (r4 == 0) goto L_0x012b
            boolean r4 = r14.F(r1)
            if (r4 == 0) goto L_0x012b
            goto L_0x012c
        L_0x012b:
            r8 = r9
        L_0x012c:
            java.lang.Object r4 = r14.D()
            if (r8 != 0) goto L_0x0138
            java.lang.Object r5 = r12.a()
            if (r4 != r5) goto L_0x0140
        L_0x0138:
            Si.e r4 = new Si.e
            r4.<init>(r1)
            r14.u(r4)
        L_0x0140:
            r12 = r4
            nI.l r12 = (nI.C17642l) r12
            r14.P()
            int r4 = Dh.D.f59167e
            int r5 = Dh.C9066d.f59180e
            int r5 = r5 << 15
            r16 = r4 | r5
            r17 = 2
            r5 = 0
            r4 = r3
            r6 = r15
            r7 = r13
            r8 = r11
            r9 = r10
            r10 = r12
            r11 = r14
            r12 = r16
            r13 = r17
            Dh.x.q(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            boolean r3 = U0.C4895p.J()
            if (r3 == 0) goto L_0x0168
            U0.C4895p.R()
        L_0x0168:
            U0.Y0 r3 = r14.n()
            if (r3 == 0) goto L_0x0176
            Si.f r4 = new Si.f
            r4.<init>(r0, r1, r2)
            r3.a(r4)
        L_0x0176:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Si.m.l(Uj.y, Si.b, U0.m, int):void");
    }

    private static final y m(A1<y> a12) {
        return a12.getValue();
    }

    /* access modifiers changed from: private */
    public static final C16807N n(Uj.q qVar, C10913b bVar, int i10, C4889m mVar, int i11) {
        k(qVar, bVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N o(C9066d.a aVar) {
        C17542s.j(aVar, "$this$create");
        aVar.e(false);
        aVar.f(false);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N p(C10913b bVar, C9065c cVar) {
        C17542s.j(cVar, "it");
        if (C17542s.e(cVar, C9065c.a.f59177a)) {
            bVar.a(v.d.f88276a);
        } else if (C17542s.e(cVar, C9065c.b.f59178a)) {
            bVar.a(v.g.f88279a);
        } else {
            throw new t();
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N q(y yVar, C10913b bVar, int i10, C4889m mVar, int i11) {
        l(yVar, bVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    private static final List<D> r(i iVar, C10913b bVar) {
        List c10 = C16877v.c();
        c10.add(new D(0, C16877v.e(new C9064b(N.Emphasised, C13026h.a(Oo.b.f84369F1), false, new g(bVar), 4, (DefaultConstructorMarker) null)), new h(iVar), C10912a.f87066a.a(), 1, (DefaultConstructorMarker) null));
        return C16877v.a(c10);
    }

    /* access modifiers changed from: private */
    public static final C16807N s(C10913b bVar, int i10) {
        bVar.a(v.f.f88278a);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N t(i iVar) {
        iVar.a().a(C14615b.C3152b.f127857b);
        return C16807N.f139792a;
    }

    private static final List<D> u(i iVar, C12832d dVar, C10913b bVar) {
        boolean z10 = dVar != null && dVar.f();
        if (z10) {
            return v(iVar, dVar, bVar);
        }
        if (!z10) {
            return r(iVar, bVar);
        }
        throw new t();
    }

    private static final List<D> v(i iVar, C12832d dVar, C10913b bVar) {
        i iVar2 = iVar;
        C12832d dVar2 = dVar;
        C10913b bVar2 = bVar;
        List c10 = C16877v.c();
        N n10 = N.Emphasised;
        c10.add(new D(0, C16877v.e(new C9064b(n10, C13026h.a(Oo.b.f84369F1), false, (C17642l) null, 8, (DefaultConstructorMarker) null)), new i(iVar2), C10912a.f87066a.b(), 1, (DefaultConstructorMarker) null));
        c10.add(new D(0, C16877v.q(new C9064b(N.Secondary, C13026h.a(Oo.b.f84678j1), false, new j(bVar2), 4, (DefaultConstructorMarker) null), new C9064b(n10, C13026h.a(Oo.b.f84329B1), false, new k(bVar2, dVar2), 4, (DefaultConstructorMarker) null)), new l(iVar2), c.c(-1941277150, true, new b(dVar2)), 1, (DefaultConstructorMarker) null));
        return C16877v.a(c10);
    }

    /* access modifiers changed from: private */
    public static final C16807N w(i iVar) {
        iVar.a().a(C14615b.C3152b.f127857b);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N x(C10913b bVar, int i10) {
        bVar.a(v.b.f88274a);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N y(C10913b bVar, C12832d dVar, int i10) {
        bVar.a(new v.e(dVar));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N z(i iVar) {
        iVar.a().a(C14615b.c.f127858b);
        return C16807N.f139792a;
    }
}
