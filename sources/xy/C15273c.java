package xy;

import E1.I;
import G1.C4504g;
import KJ.C15987c;
import N1.P;
import S1.C;
import S1.C4820m;
import S1.C4830x;
import SC.C13607l;
import TC.C13679b;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.C4899r0;
import U0.C4912y;
import U0.F1;
import U0.M0;
import U0.Y0;
import U0.o1;
import XH.C16807N;
import Y1.f;
import Y1.j;
import Y1.k;
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.foundation.layout.C5080k;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.C5100f0;
import androidx.compose.ui.platform.C5116k1;
import c1.c;
import c2.h;
import c2.r;
import com.ingka.ikea.core.model.Link;
import i1.C5437c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import nI.q;
import p0.s;
import s0.C5834E;
import s0.C5858d;
import s0.C5859e;
import s0.C5862h;
import sy.C15053a;
import t0.C5934A;
import t0.C5937b;
import t0.C5938c;
import t0.x;
import tI.C17978n;

@Metadata(d1 = {"\u0000(\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a9\u0010\t\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0001¢\u0006\u0004\b\t\u0010\n\"\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r\"\u0014\u0010\u000f\u001a\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\r¨\u0006\u0011²\u0006\u000e\u0010\u0010\u001a\u00020\u000b8\n@\nX\u0002"}, d2 = {"", "title", "LKJ/c;", "Lsy/a$a;", "cards", "Lkotlin/Function1;", "Lcom/ingka/ikea/core/model/Link;", "LXH/N;", "onCardClicked", "b", "(Ljava/lang/String;LKJ/c;LnI/l;LU0/m;I)V", "Lc2/h;", "a", "F", "MIN_WIDTH", "MAX_WIDTH", "minCardHeight", "room-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: xy.c  reason: case insensitive filesystem */
public final class C15273c {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final float f132096a = h.B((float) 320);
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final float f132097b = h.B((float) 480);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: xy.c$a */
    static final class a implements q<C5859e, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f132098a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C15987c<C15053a.C3241a> f132099b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ c2.d f132100c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17642l<Link, C16807N> f132101d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C4899r0<h> f132102e;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: xy.c$a$a  reason: collision with other inner class name */
        static final class C3264a implements C17642l<r, C16807N> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c2.d f132103a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C4899r0<h> f132104b;

            C3264a(c2.d dVar, C4899r0<h> r0Var) {
                this.f132103a = dVar;
                this.f132104b = r0Var;
            }

            public final void a(long j10) {
                float H10 = this.f132103a.H(r.g(j10));
                if (h.v(H10, C15273c.c(this.f132104b)) > 0) {
                    C15273c.d(this.f132104b, H10);
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a(((r) obj).k());
                return C16807N.f139792a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: xy.c$a$b */
        static final class b implements C17631a<C16807N> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C15053a.C3241a f132105a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C17642l<Link, C16807N> f132106b;

            b(C15053a.C3241a aVar, C17642l<? super Link, C16807N> lVar) {
                this.f132105a = aVar;
                this.f132106b = lVar;
            }

            public final void a() {
                Link b10 = this.f132105a.b();
                if (b10 != null) {
                    this.f132106b.invoke(b10);
                }
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return C16807N.f139792a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Void;"}, k = 3, mv = {2, 1, 0})
        /* renamed from: xy.c$a$c  reason: collision with other inner class name */
        public static final class C3265c extends C17544u implements C17642l {

            /* renamed from: c  reason: collision with root package name */
            public static final C3265c f132107c = new C3265c();

            public C3265c() {
                super(1);
            }

            /* renamed from: a */
            public final Void invoke(C15053a.C3241a aVar) {
                return null;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
        /* renamed from: xy.c$a$d */
        public static final class d extends C17544u implements C17642l<Integer, Object> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C17642l f132108c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ List f132109d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public d(C17642l lVar, List list) {
                super(1);
                this.f132108c = lVar;
                this.f132109d = list;
            }

            public final Object a(int i10) {
                return this.f132108c.invoke(this.f132109d.get(i10));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return a(((Number) obj).intValue());
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lt0/c;", "", "it", "LXH/N;", "a", "(Lt0/c;ILU0/m;I)V"}, k = 3, mv = {2, 1, 0})
        /* renamed from: xy.c$a$e */
        public static final class e extends C17544u implements nI.r<C5938c, Integer, C4889m, Integer, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ List f132110c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ float f132111d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ c2.d f132112e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ C17642l f132113f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ C4899r0 f132114g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public e(List list, float f10, c2.d dVar, C17642l lVar, C4899r0 r0Var) {
                super(4);
                this.f132110c = list;
                this.f132111d = f10;
                this.f132112e = dVar;
                this.f132113f = lVar;
                this.f132114g = r0Var;
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: nI.a} */
            /* JADX WARNING: Multi-variable type inference failed */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void a(t0.C5938c r19, int r20, U0.C4889m r21, int r22) {
                /*
                    r18 = this;
                    r0 = r18
                    r1 = r20
                    r15 = r21
                    r2 = r22 & 6
                    if (r2 != 0) goto L_0x0018
                    r2 = r19
                    boolean r2 = r15.V(r2)
                    if (r2 == 0) goto L_0x0014
                    r2 = 4
                    goto L_0x0015
                L_0x0014:
                    r2 = 2
                L_0x0015:
                    r2 = r22 | r2
                    goto L_0x001a
                L_0x0018:
                    r2 = r22
                L_0x001a:
                    r3 = r22 & 48
                    if (r3 != 0) goto L_0x002a
                    boolean r3 = r15.d(r1)
                    if (r3 == 0) goto L_0x0027
                    r3 = 32
                    goto L_0x0029
                L_0x0027:
                    r3 = 16
                L_0x0029:
                    r2 = r2 | r3
                L_0x002a:
                    r3 = r2 & 147(0x93, float:2.06E-43)
                    r4 = 146(0x92, float:2.05E-43)
                    if (r3 != r4) goto L_0x003c
                    boolean r3 = r21.l()
                    if (r3 != 0) goto L_0x0037
                    goto L_0x003c
                L_0x0037:
                    r21.L()
                    goto L_0x010e
                L_0x003c:
                    boolean r3 = U0.C4895p.J()
                    if (r3 == 0) goto L_0x004b
                    r3 = -1
                    java.lang.String r4 = "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:152)"
                    r5 = -632812321(0xffffffffda480cdf, float:-1.40772868E16)
                    U0.C4895p.S(r5, r2, r3, r4)
                L_0x004b:
                    java.util.List r2 = r0.f132110c
                    java.lang.Object r1 = r2.get(r1)
                    sy.a$a r1 = (sy.C15053a.C3241a) r1
                    r2 = -728218166(0xffffffffd49845ca, float:-5.2320472E12)
                    r15.W(r2)
                    androidx.compose.ui.d$a r2 = androidx.compose.ui.d.f18749a
                    U0.r0 r3 = r0.f132114g
                    float r3 = xy.C15273c.c(r3)
                    r4 = 0
                    r5 = 1
                    r6 = 0
                    androidx.compose.ui.d r2 = androidx.compose.foundation.layout.J.b(r2, r4, r3, r5, r6)
                    float r3 = r0.f132111d
                    androidx.compose.ui.d r2 = androidx.compose.foundation.layout.J.A(r2, r4, r3, r5, r6)
                    s0.z r3 = s0.C5880z.Min
                    androidx.compose.ui.d r2 = androidx.compose.foundation.layout.x.a(r2, r3)
                    r3 = 1777632344(0x69f48458, float:3.695036E25)
                    r15.W(r3)
                    c2.d r3 = r0.f132112e
                    boolean r3 = r15.V(r3)
                    java.lang.Object r4 = r21.D()
                    if (r3 != 0) goto L_0x008e
                    U0.m$a r3 = U0.C4889m.f14007a
                    java.lang.Object r3 = r3.a()
                    if (r4 != r3) goto L_0x009a
                L_0x008e:
                    xy.c$a$a r4 = new xy.c$a$a
                    c2.d r3 = r0.f132112e
                    U0.r0 r5 = r0.f132114g
                    r4.<init>(r3, r5)
                    r15.u(r4)
                L_0x009a:
                    nI.l r4 = (nI.C17642l) r4
                    r21.P()
                    androidx.compose.ui.d r2 = androidx.compose.ui.layout.g.a(r2, r4)
                    java.lang.String r3 = "AssistanceCard"
                    androidx.compose.ui.d r2 = androidx.compose.ui.platform.C5116k1.a(r2, r3)
                    SC.O$d r4 = SC.O.d.f115869a
                    java.lang.String r3 = r1.c()
                    java.lang.String r6 = r1.a()
                    r5 = 1777654797(0x69f4dc0d, float:3.7002133E25)
                    r15.W(r5)
                    boolean r5 = r15.V(r1)
                    nI.l r7 = r0.f132113f
                    boolean r7 = r15.V(r7)
                    r5 = r5 | r7
                    java.lang.Object r7 = r21.D()
                    if (r5 != 0) goto L_0x00d2
                    U0.m$a r5 = U0.C4889m.f14007a
                    java.lang.Object r5 = r5.a()
                    if (r7 != r5) goto L_0x00dc
                L_0x00d2:
                    xy.c$a$b r7 = new xy.c$a$b
                    nI.l r5 = r0.f132113f
                    r7.<init>(r1, r5)
                    r15.u(r7)
                L_0x00dc:
                    r12 = r7
                    nI.a r12 = (nI.C17631a) r12
                    r21.P()
                    int r1 = SC.O.d.f115870b
                    int r14 = r1 << 9
                    r16 = 0
                    r17 = 2004(0x7d4, float:2.808E-42)
                    r5 = 0
                    r7 = 0
                    r8 = 0
                    r9 = 0
                    r10 = 0
                    r11 = 0
                    r13 = 0
                    r1 = r3
                    r3 = r5
                    r5 = r7
                    r7 = r8
                    r8 = r9
                    r9 = r10
                    r10 = r11
                    r11 = r13
                    r13 = r21
                    r15 = r16
                    r16 = r17
                    SC.T.b(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
                    r21.P()
                    boolean r1 = U0.C4895p.J()
                    if (r1 == 0) goto L_0x010e
                    U0.C4895p.R()
                L_0x010e:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: xy.C15273c.a.e.a(t0.c, int, U0.m, int):void");
            }

            public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3, Object obj4) {
                a((C5938c) obj, ((Number) obj2).intValue(), (C4889m) obj3, ((Number) obj4).intValue());
                return C16807N.f139792a;
            }
        }

        a(String str, C15987c<C15053a.C3241a> cVar, c2.d dVar, C17642l<? super Link, C16807N> lVar, C4899r0<h> r0Var) {
            this.f132098a = str;
            this.f132099b = cVar;
            this.f132100c = dVar;
            this.f132101d = lVar;
            this.f132102e = r0Var;
        }

        /* access modifiers changed from: private */
        public static final C16807N c(C15987c cVar, float f10, c2.d dVar, C17642l lVar, C4899r0 r0Var, x xVar) {
            C17542s.j(xVar, "$this$LazyRow");
            xVar.e(cVar.size(), (C17642l<? super Integer, ? extends Object>) null, new d(C3265c.f132107c, cVar), c.c(-632812321, true, new e(cVar, f10, dVar, lVar, r0Var)));
            return C16807N.f139792a;
        }

        public final void b(C5859e eVar, C4889m mVar, int i10) {
            int i11;
            C5859e eVar2 = eVar;
            C4889m mVar2 = mVar;
            C17542s.j(eVar2, "$this$BoxWithConstraints");
            if ((i10 & 6) == 0) {
                i11 = i10 | (mVar2.V(eVar2) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i11 & 19) != 18 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(1809662139, i11, -1, "com.ingka.ikea.room.impl.presentation.composables.assistancecards.AssistanceCards.<anonymous> (AssistanceCards.kt:60)");
                }
                float B10 = h.B(C17978n.l(h.B(eVar.c() - h.B(TC.e.g() * ((float) 2))), C15273c.f132096a, C15273c.f132097b));
                C5073d dVar = C5073d.f18068a;
                C5073d.f n10 = dVar.n(h.B((float) 16));
                String str = this.f132098a;
                C15987c<C15053a.C3241a> cVar = this.f132099b;
                c2.d dVar2 = this.f132100c;
                C17642l<Link, C16807N> lVar = this.f132101d;
                C4899r0<h> r0Var = this.f132102e;
                d.a aVar = androidx.compose.ui.d.f18749a;
                I a10 = C5080k.a(n10, C5437c.f24302a.k(), mVar2, 6);
                int a11 = C4883j.a(mVar2, 0);
                C4912y s10 = mVar.s();
                androidx.compose.ui.d e10 = androidx.compose.ui.c.e(mVar2, aVar);
                C4504g.a aVar2 = C4504g.f6515W;
                C17631a<C4504g> a12 = aVar2.a();
                if (mVar.m() == null) {
                    C4883j.c();
                }
                mVar.I();
                if (mVar.i()) {
                    mVar2.p(a12);
                } else {
                    mVar.t();
                }
                C4889m a13 = F1.a(mVar);
                F1.c(a13, a10, aVar2.c());
                F1.c(a13, s10, aVar2.e());
                p<C4504g, Integer, C16807N> b10 = aVar2.b();
                if (a13.i() || !C17542s.e(a13.D(), Integer.valueOf(a11))) {
                    a13.u(Integer.valueOf(a11));
                    a13.w(Integer.valueOf(a11), b10);
                }
                F1.c(a13, e10, aVar2.d());
                C5862h hVar = C5862h.f28810a;
                C4899r0<h> r0Var2 = r0Var;
                C17642l<Link, C16807N> lVar2 = lVar;
                float f10 = B10;
                C13607l.j(str, C13679b.C2857b.C2858b.f116684a, C5116k1.a(TC.e.i(aVar), "AssistanceCardsTitle"), 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (j) null, (f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar, 48, 0, 262136);
                androidx.compose.ui.d h10 = J.h(aVar, 0.0f, 1, (Object) null);
                C5834E c10 = D.c(TC.e.g(), 0.0f, 2, (Object) null);
                C5073d.f n11 = dVar.n(h.B((float) 12));
                C4889m mVar3 = mVar;
                mVar3.W(807467720);
                C15987c<C15053a.C3241a> cVar2 = cVar;
                float f11 = f10;
                c2.d dVar3 = dVar2;
                C17642l<Link, C16807N> lVar3 = lVar2;
                boolean V10 = mVar3.V(cVar2) | mVar3.c(f11) | mVar3.V(dVar3) | mVar3.V(lVar3);
                Object D10 = mVar.D();
                if (V10 || D10 == C4889m.f14007a.a()) {
                    C15272b bVar = new C15272b(cVar2, f11, dVar3, lVar3, r0Var2);
                    mVar3.u(bVar);
                    D10 = bVar;
                }
                mVar.P();
                C5937b.b(h10, (C5934A) null, c10, false, n11, (C5437c.C0386c) null, (s) null, false, (C17642l) D10, mVar, 24582, 234);
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
            b((C5859e) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    public static final void b(String str, C15987c<C15053a.C3241a> cVar, C17642l<? super Link, C16807N> lVar, C4889m mVar, int i10) {
        int i11;
        C17542s.j(str, "title");
        C17542s.j(cVar, "cards");
        C17542s.j(lVar, "onCardClicked");
        C4889m k10 = mVar.k(561481317);
        if ((i10 & 6) == 0) {
            i11 = (k10.V(str) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= k10.V(cVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= k10.F(lVar) ? 256 : 128;
        }
        if ((i11 & 147) != 146 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(561481317, i11, -1, "com.ingka.ikea.room.impl.presentation.composables.assistancecards.AssistanceCards (AssistanceCards.kt:55)");
            }
            c2.d dVar = (c2.d) k10.Q(C5100f0.e());
            k10.W(1692020245);
            Object D10 = k10.D();
            if (D10 == C4889m.f14007a.a()) {
                D10 = u1.e(h.m(h.B((float) 0)), (o1) null, 2, (Object) null);
                k10.u(D10);
            }
            k10.P();
            C5858d.a((d) null, (C5437c) null, false, c.e(1809662139, true, new a(str, cVar, dVar, lVar, (C4899r0) D10), k10, 54), k10, 3072, 7);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new C15271a(str, cVar, lVar, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final float c(C4899r0<h> r0Var) {
        return r0Var.getValue().G();
    }

    /* access modifiers changed from: private */
    public static final void d(C4899r0<h> r0Var, float f10) {
        r0Var.setValue(h.m(f10));
    }

    /* access modifiers changed from: private */
    public static final C16807N e(String str, C15987c cVar, C17642l lVar, int i10, C4889m mVar, int i11) {
        b(str, cVar, lVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }
}
