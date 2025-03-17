package bg;

import KJ.C15987c;
import LC.C13178b;
import O0.C4762x0;
import O0.H0;
import O0.L0;
import Op.A;
import Op.C10872z0;
import Op.c1;
import Op.d1;
import SC.P1;
import SC.Y2;
import U0.A1;
import U0.C4889m;
import U0.C4895p;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import androidx.compose.foundation.layout.D;
import androidx.compose.ui.d;
import c1.c;
import c2.h;
import eg.C9651a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import nI.q;
import nI.r;
import s0.C5834E;
import s0.C5848T;
import t0.C5938c;
import t0.x;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0007\u0010\b\u001a\u0013\u0010\n\u001a\u00020\u0002*\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u0002"}, d2 = {"Leg/a;", "viewModel", "LXH/N;", "c", "(Leg/a;LU0/m;II)V", "Leg/a$a;", "uiState", "f", "(Leg/a$a;LU0/m;I)V", "Lt0/x;", "i", "(Lt0/x;)V", "cart-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: bg.d  reason: case insensitive filesystem */
public final class C9434d {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: bg.d$a */
    static final class a implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ L0 f65466a;

        a(L0 l02) {
            this.f65466a = l02;
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(14159008, i10, -1, "com.ingka.ikea.app.cart.impl.presentation.compose.availability.ReplacementProductsScreenImpl.<anonymous> (ReplacementProductsScreen.kt:62)");
                }
                Y2.c(this.f65466a, (d) null, (r<? super H0, ? super p<? super C4889m, ? super Integer, C16807N>, ? super C4889m, ? super Integer, C16807N>) null, mVar, 6, 6);
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: bg.d$b */
    static final class b implements q<C5834E, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C9651a.C1245a f65467a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: bg.d$b$a */
        static final class a implements C17642l<c1, C16807N> {

            /* renamed from: a  reason: collision with root package name */
            public static final a f65468a = new a();

            a() {
            }

            public final void a(c1 c1Var) {
                C17542s.j(c1Var, "it");
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((c1) obj);
                return C16807N.f139792a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: bg.d$b$b  reason: collision with other inner class name */
        public static final class C1151b implements C17642l {

            /* renamed from: a  reason: collision with root package name */
            public static final C1151b f65469a = new C1151b();

            /* renamed from: a */
            public final Void invoke(d1 d1Var) {
                C17542s.j(d1Var, "it");
                return null;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: bg.d$b$c */
        public static final class c implements C17642l<d1, Object> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ String f65470a;

            public c(String str) {
                this.f65470a = str;
            }

            /* renamed from: a */
            public final Object invoke(d1 d1Var) {
                C17542s.j(d1Var, "item");
                String str = this.f65470a;
                if (str != null) {
                    String str2 = str + ":" + d1Var.f();
                    if (str2 != null) {
                        return str2;
                    }
                }
                return Long.valueOf(d1Var.f());
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;", "ul/a"}, k = 3, mv = {2, 1, 0})
        /* renamed from: bg.d$b$d  reason: collision with other inner class name */
        public static final class C1152d extends C17544u implements C17642l<Integer, Object> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C17642l f65471c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ List f65472d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C1152d(C17642l lVar, List list) {
                super(1);
                this.f65471c = lVar;
                this.f65472d = list;
            }

            public final Object a(int i10) {
                return this.f65471c.invoke(this.f65472d.get(i10));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return a(((Number) obj).intValue());
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;", "ul/b"}, k = 3, mv = {2, 1, 0})
        /* renamed from: bg.d$b$e */
        public static final class e extends C17544u implements C17642l<Integer, Object> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C17642l f65473c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ List f65474d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public e(C17642l lVar, List list) {
                super(1);
                this.f65473c = lVar;
                this.f65474d = list;
            }

            public final Object a(int i10) {
                return this.f65473c.invoke(this.f65474d.get(i10));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return a(((Number) obj).intValue());
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lt0/c;", "", "it", "LXH/N;", "a", "(Lt0/c;ILU0/m;I)V"}, k = 3, mv = {2, 1, 0})
        /* renamed from: bg.d$b$f */
        public static final class f extends C17544u implements r<C5938c, Integer, C4889m, Integer, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ List f65475c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public f(List list) {
                super(4);
                this.f65475c = list;
            }

            public final void a(C5938c cVar, int i10, C4889m mVar, int i11) {
                int i12;
                int i13 = i10;
                C4889m mVar2 = mVar;
                if ((i11 & 6) == 0) {
                    i12 = i11 | (mVar2.V(cVar) ? 4 : 2);
                } else {
                    i12 = i11;
                }
                if ((i11 & 48) == 0) {
                    i12 |= mVar2.d(i13) ? 32 : 16;
                }
                if ((i12 & 147) != 146 || !mVar.l()) {
                    if (C4895p.J()) {
                        C4895p.S(-632812321, i12, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:152)");
                    }
                    d1 d1Var = (d1) this.f65475c.get(i13);
                    mVar2.W(1198581671);
                    C5834E a10 = D.a(h.B((float) 16));
                    mVar2.W(-792616962);
                    Object D10 = mVar.D();
                    if (D10 == C4889m.f14007a.a()) {
                        D10 = a.f65468a;
                        mVar2.u(D10);
                    }
                    mVar.P();
                    C10872z0.y0(d1Var, (C17642l) D10, false, (d) null, (P1) null, (C13178b) null, a10, (C5834E) null, false, (A0.f) null, (A) null, (C17631a<C16807N>) null, (C17631a<C16807N>) null, mVar, 102236592, 0, 7864);
                    mVar.P();
                    if (C4895p.J()) {
                        C4895p.R();
                        return;
                    }
                    return;
                }
                mVar.L();
            }

            public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3, Object obj4) {
                a((C5938c) obj, ((Number) obj2).intValue(), (C4889m) obj3, ((Number) obj4).intValue());
                return C16807N.f139792a;
            }
        }

        b(C9651a.C1245a aVar) {
            this.f65467a = aVar;
        }

        /* access modifiers changed from: private */
        public static final C16807N c(C9651a.C1245a aVar, x xVar) {
            C17542s.j(xVar, "$this$LazyColumn");
            if (aVar.a()) {
                C9434d.i(xVar);
            } else {
                C15987c<d1> b10 = aVar.b();
                C1151b bVar = C1151b.f65469a;
                xVar.e(b10.size(), new C1152d(new c((String) null), b10), new e(bVar, b10), c1.c.c(-632812321, true, new f(b10)));
            }
            return C16807N.f139792a;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: nI.l} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(s0.C5834E r13, U0.C4889m r14, int r15) {
            /*
                r12 = this;
                java.lang.String r0 = "paddingValues"
                kotlin.jvm.internal.C17542s.j(r13, r0)
                r0 = r15 & 6
                if (r0 != 0) goto L_0x0013
                boolean r0 = r14.V(r13)
                if (r0 == 0) goto L_0x0011
                r0 = 4
                goto L_0x0012
            L_0x0011:
                r0 = 2
            L_0x0012:
                r15 = r15 | r0
            L_0x0013:
                r0 = r15 & 19
                r1 = 18
                if (r0 != r1) goto L_0x0024
                boolean r0 = r14.l()
                if (r0 != 0) goto L_0x0020
                goto L_0x0024
            L_0x0020:
                r14.L()
                goto L_0x007a
            L_0x0024:
                boolean r0 = U0.C4895p.J()
                if (r0 == 0) goto L_0x0033
                r0 = -1
                java.lang.String r1 = "com.ingka.ikea.app.cart.impl.presentation.compose.availability.ReplacementProductsScreenImpl.<anonymous> (ReplacementProductsScreen.kt:65)"
                r2 = 188547959(0xb3d0377, float:3.6402683E-32)
                U0.C4895p.S(r2, r15, r0, r1)
            L_0x0033:
                androidx.compose.ui.d$a r15 = androidx.compose.ui.d.f18749a
                androidx.compose.ui.d r0 = androidx.compose.foundation.layout.D.h(r15, r13)
                r13 = 1253933225(0x4abd80a9, float:6209620.5)
                r14.W(r13)
                eg.a$a r13 = r12.f65467a
                boolean r13 = r14.V(r13)
                eg.a$a r15 = r12.f65467a
                java.lang.Object r1 = r14.D()
                if (r13 != 0) goto L_0x0055
                U0.m$a r13 = U0.C4889m.f14007a
                java.lang.Object r13 = r13.a()
                if (r1 != r13) goto L_0x005d
            L_0x0055:
                bg.e r1 = new bg.e
                r1.<init>(r15)
                r14.u(r1)
            L_0x005d:
                r8 = r1
                nI.l r8 = (nI.C17642l) r8
                r14.P()
                r10 = 0
                r11 = 254(0xfe, float:3.56E-43)
                r1 = 0
                r2 = 0
                r3 = 0
                r4 = 0
                r5 = 0
                r6 = 0
                r7 = 0
                r9 = r14
                t0.C5937b.a(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                boolean r13 = U0.C4895p.J()
                if (r13 == 0) goto L_0x007a
                U0.C4895p.R()
            L_0x007a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: bg.C9434d.b.b(s0.E, U0.m, int):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            b((C5834E) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0041, code lost:
        if ((r14 & 1) != 0) goto L_0x0043;
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00bb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void c(eg.C9651a r11, U0.C4889m r12, int r13, int r14) {
        /*
            r0 = -1093827821(0xffffffffbecd8313, float:-0.40139064)
            U0.m r12 = r12.k(r0)
            r1 = r13 & 6
            r2 = 2
            if (r1 != 0) goto L_0x001c
            r1 = r14 & 1
            if (r1 != 0) goto L_0x0018
            boolean r1 = r12.F(r11)
            if (r1 == 0) goto L_0x0018
            r1 = 4
            goto L_0x0019
        L_0x0018:
            r1 = r2
        L_0x0019:
            r1 = r1 | r13
            r9 = r1
            goto L_0x001d
        L_0x001c:
            r9 = r13
        L_0x001d:
            r1 = r9 & 3
            if (r1 != r2) goto L_0x002d
            boolean r1 = r12.l()
            if (r1 != 0) goto L_0x0028
            goto L_0x002d
        L_0x0028:
            r12.L()
            goto L_0x00be
        L_0x002d:
            r12.G()
            r1 = r13 & 1
            r10 = 0
            if (r1 == 0) goto L_0x0046
            boolean r1 = r12.O()
            if (r1 == 0) goto L_0x003c
            goto L_0x0046
        L_0x003c:
            r12.L()
            r1 = r14 & 1
            if (r1 == 0) goto L_0x0091
        L_0x0043:
            r9 = r9 & -15
            goto L_0x0091
        L_0x0046:
            r1 = r14 & 1
            if (r1 == 0) goto L_0x0091
            r11 = 1890788296(0x70b323c8, float:4.435286E29)
            r12.C(r11)
            m3.a r11 = m3.a.f26247a
            int r1 = m3.a.f26249c
            androidx.lifecycle.k0 r2 = r11.a(r12, r1)
            if (r2 == 0) goto L_0x0089
            androidx.lifecycle.i0$c r4 = f3.a.a(r2, r12, r10)
            r11 = 1729797275(0x671a9c9b, float:7.301333E23)
            r12.C(r11)
            boolean r11 = r2 instanceof androidx.lifecycle.C5212o
            if (r11 == 0) goto L_0x0071
            r11 = r2
            androidx.lifecycle.o r11 = (androidx.lifecycle.C5212o) r11
            l3.a r11 = r11.getDefaultViewModelCreationExtras()
        L_0x006f:
            r5 = r11
            goto L_0x0074
        L_0x0071:
            l3.a$a r11 = l3.a.C0407a.f25486b
            goto L_0x006f
        L_0x0074:
            r7 = 36936(0x9048, float:5.1758E-41)
            r8 = 0
            java.lang.Class<eg.a> r1 = eg.C9651a.class
            r3 = 0
            r6 = r12
            androidx.lifecycle.f0 r11 = m3.c.b(r1, r2, r3, r4, r5, r6, r7, r8)
            r12.U()
            r12.U()
            eg.a r11 = (eg.C9651a) r11
            goto L_0x0043
        L_0x0089:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"
            r11.<init>(r12)
            throw r11
        L_0x0091:
            r12.y()
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x00a0
            r1 = -1
            java.lang.String r2 = "com.ingka.ikea.app.cart.impl.presentation.compose.availability.ReplacementProductsScreen (ReplacementProductsScreen.kt:35)"
            U0.C4895p.S(r0, r9, r1, r2)
        L_0x00a0:
            TJ.P r1 = r11.m()
            r6 = 0
            r7 = 7
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = r12
            U0.A1 r0 = j3.a.c(r1, r2, r3, r4, r5, r6, r7)
            eg.a$a r0 = d(r0)
            f(r0, r12, r10)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x00be
            U0.C4895p.R()
        L_0x00be:
            U0.Y0 r12 = r12.n()
            if (r12 == 0) goto L_0x00cc
            bg.c r0 = new bg.c
            r0.<init>(r11, r13, r14)
            r12.a(r0)
        L_0x00cc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bg.C9434d.c(eg.a, U0.m, int, int):void");
    }

    private static final C9651a.C1245a d(A1<C9651a.C1245a> a12) {
        return a12.getValue();
    }

    /* access modifiers changed from: private */
    public static final C16807N e(C9651a aVar, int i10, int i11, C4889m mVar, int i12) {
        c(aVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    private static final void f(C9651a.C1245a aVar, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        C9651a.C1245a aVar2 = aVar;
        int i12 = i10;
        C4889m k10 = mVar.k(-1619469914);
        if ((i12 & 6) == 0) {
            i11 = (k10.V(aVar2) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i11 & 3) != 2 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-1619469914, i11, -1, "com.ingka.ikea.app.cart.impl.presentation.compose.availability.ReplacementProductsScreenImpl (ReplacementProductsScreen.kt:46)");
            }
            k10.W(-1297216955);
            Object D10 = k10.D();
            if (D10 == C4889m.f14007a.a()) {
                D10 = new L0();
                k10.u(D10);
            }
            k10.P();
            mVar2 = k10;
            C4762x0.a((d) null, (p<? super C4889m, ? super Integer, C16807N>) null, (p<? super C4889m, ? super Integer, C16807N>) null, c.e(14159008, true, new a((L0) D10), k10, 54), (p<? super C4889m, ? super Integer, C16807N>) null, 0, 0, 0, (C5848T) null, c.e(188547959, true, new b(aVar2), k10, 54), k10, 805309440, 503);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            mVar2 = k10;
        }
        Y0 n10 = mVar2.n();
        if (n10 != null) {
            n10.a(new C9432b(aVar2, i12));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N g(C9651a.C1245a aVar, int i10, C4889m mVar, int i11) {
        f(aVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void i(x xVar) {
        for (int i10 = 0; i10 < 4; i10++) {
            x.i(xVar, (Object) null, (Object) null, C9431a.f65458a.a(), 3, (Object) null);
        }
    }
}
