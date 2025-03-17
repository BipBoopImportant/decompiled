package ki;

import O0.e1;
import O0.g1;
import U0.C4889m;
import U0.C4895p;
import XH.C16807N;
import androidx.compose.ui.d;
import ji.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import mi.i;
import nI.C17631a;
import nI.C17642l;
import nI.q;
import ol.p;
import ol.u;
import ol.v;
import s0.C5842M;
import s0.C5848T;
import t0.C5938c;
import t0.x;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a/\u0010\u0007\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lt0/x;", "Lmi/i;", "shareButtonUiState", "Lkotlin/Function1;", "Lji/c;", "LXH/N;", "screenUiEvent", "a", "(Lt0/x;Lmi/i;LnI/l;)V", "productinformationpage-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class e0 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements q<C5938c, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f75148a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C17642l<c, C16807N> f75149b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: ki.e0$a$a  reason: collision with other inner class name */
        static final class C1363a implements q<C5842M, C4889m, Integer, C16807N> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ i f75150a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C17642l<c, C16807N> f75151b;

            C1363a(i iVar, C17642l<? super c, C16807N> lVar) {
                this.f75150a = iVar;
                this.f75151b = lVar;
            }

            /* access modifiers changed from: private */
            public static final C16807N c(C17642l lVar, i iVar) {
                i.b bVar = (i.b) iVar;
                lVar.invoke(new c.g(bVar.a(), bVar.b(), bVar.d(), bVar.c()));
                return C16807N.f139792a;
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: nI.a} */
            /* JADX WARNING: Multi-variable type inference failed */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void b(s0.C5842M r13, U0.C4889m r14, int r15) {
                /*
                    r12 = this;
                    java.lang.String r0 = "$this$IkeaTopAppBar"
                    kotlin.jvm.internal.C17542s.j(r13, r0)
                    r13 = r15 & 17
                    r0 = 16
                    if (r13 != r0) goto L_0x0017
                    boolean r13 = r14.l()
                    if (r13 != 0) goto L_0x0012
                    goto L_0x0017
                L_0x0012:
                    r14.L()
                    goto L_0x0096
                L_0x0017:
                    boolean r13 = U0.C4895p.J()
                    if (r13 == 0) goto L_0x0026
                    r13 = -1
                    java.lang.String r0 = "com.ingka.ikea.app.productinformationpage.v3.compose.pipTopAppBar.<anonymous>.<anonymous> (PipTopAppBar.kt:33)"
                    r1 = -1674213360(0xffffffff9c358810, float:-6.0063733E-22)
                    U0.C4895p.S(r1, r15, r13, r0)
                L_0x0026:
                    mi.i r13 = r12.f75150a
                    mi.i$a r15 = mi.i.a.f75477a
                    boolean r15 = kotlin.jvm.internal.C17542s.e(r13, r15)
                    if (r15 != 0) goto L_0x008d
                    boolean r13 = r13 instanceof mi.i.b
                    if (r13 == 0) goto L_0x0087
                    int r0 = uK.C18146a.f148150Ma
                    SC.H0 r4 = SC.H0.Tertiary
                    int r13 = Oo.b.f84729n8
                    r15 = 0
                    java.lang.String r1 = J1.j.b(r13, r14, r15)
                    androidx.compose.ui.d$a r13 = androidx.compose.ui.d.f18749a
                    java.lang.String r15 = "ShareButton"
                    androidx.compose.ui.d r2 = androidx.compose.ui.platform.C5116k1.a(r13, r15)
                    r13 = 107755394(0x66c3782, float:4.4427447E-35)
                    r14.W(r13)
                    nI.l<ji.c, XH.N> r13 = r12.f75151b
                    boolean r13 = r14.V(r13)
                    mi.i r15 = r12.f75150a
                    boolean r15 = r14.F(r15)
                    r13 = r13 | r15
                    nI.l<ji.c, XH.N> r15 = r12.f75151b
                    mi.i r3 = r12.f75150a
                    java.lang.Object r5 = r14.D()
                    if (r13 != 0) goto L_0x006c
                    U0.m$a r13 = U0.C4889m.f14007a
                    java.lang.Object r13 = r13.a()
                    if (r5 != r13) goto L_0x0074
                L_0x006c:
                    ki.d0 r5 = new ki.d0
                    r5.<init>(r15, r3)
                    r14.u(r5)
                L_0x0074:
                    r8 = r5
                    nI.a r8 = (nI.C17631a) r8
                    r14.P()
                    r10 = 24960(0x6180, float:3.4976E-41)
                    r11 = 232(0xe8, float:3.25E-43)
                    r3 = 0
                    r5 = 0
                    r6 = 0
                    r7 = 0
                    r9 = r14
                    SC.F0.b(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                    goto L_0x008d
                L_0x0087:
                    XH.t r13 = new XH.t
                    r13.<init>()
                    throw r13
                L_0x008d:
                    boolean r13 = U0.C4895p.J()
                    if (r13 == 0) goto L_0x0096
                    U0.C4895p.R()
                L_0x0096:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: ki.e0.a.C1363a.b(s0.M, U0.m, int):void");
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                b((C5842M) obj, (C4889m) obj2, ((Number) obj3).intValue());
                return C16807N.f139792a;
            }
        }

        a(i iVar, C17642l<? super c, C16807N> lVar) {
            this.f75148a = iVar;
            this.f75149b = lVar;
        }

        /* access modifiers changed from: private */
        public static final C16807N c() {
            return C16807N.f139792a;
        }

        public final void b(C5938c cVar, C4889m mVar, int i10) {
            C17542s.j(cVar, "$this$item");
            if ((i10 & 17) != 16 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-1458547967, i10, -1, "com.ingka.ikea.app.productinformationpage.v3.compose.pipTopAppBar.<anonymous> (PipTopAppBar.kt:28)");
                }
                mVar.W(-1151084938);
                Object D10 = mVar.D();
                if (D10 == C4889m.f14007a.a()) {
                    D10 = new c0();
                    mVar.u(D10);
                }
                mVar.P();
                p.c((v) null, (C17631a) D10, (d) null, "", (u) null, c1.c.e(-1674213360, true, new C1363a(this.f75148a, this.f75149b), mVar, 54), (C5848T) null, (e1) null, (g1) null, mVar, 199734, 468);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            b((C5938c) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    public static final void a(x xVar, i iVar, C17642l<? super c, C16807N> lVar) {
        C17542s.j(xVar, "<this>");
        C17542s.j(iVar, "shareButtonUiState");
        C17542s.j(lVar, "screenUiEvent");
        xVar.b("pip:TopAppBar", "TopAppBar", c1.c.c(-1458547967, true, new a(iVar, lVar)));
    }
}
