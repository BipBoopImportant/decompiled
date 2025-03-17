package L1;

import E1.C4488v;
import E1.C4489w;
import E1.C4492z;
import G1.C4498c0;
import G1.C4502e0;
import G1.C4507j;
import G1.C4508k;
import G1.G;
import G1.w0;
import G1.x0;
import XH.C16807N;
import YH.C16877v;
import androidx.compose.ui.d;
import c2.r;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import nI.C17642l;
import o1.C5667g;
import o1.C5669i;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001B)\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0013\u001a\u00020\r*\u00020\u00062\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00000\u00102\u0006\u0010\u0012\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00000\u00152\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00000\u0010H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u0019\u001a\u00020\r2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00000\u0010H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ0\u0010 \u001a\u00020\u00002\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\r0\u001dH\u0002ø\u0001\u0000¢\u0006\u0004\b \u0010!J)\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00000\u00152\b\b\u0002\u0010\"\u001a\u00020\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u0004H\u0000¢\u0006\u0004\b#\u0010$J3\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00000\u00152\b\b\u0002\u0010%\u001a\u00020\u00042\b\b\u0002\u0010\"\u001a\u00020\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u0004H\u0000¢\u0006\u0004\b&\u0010'J\u0011\u0010)\u001a\u0004\u0018\u00010(H\u0000¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0000H\u0000¢\u0006\u0004\b+\u0010,R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0004¢\u0006\f\n\u0004\b+\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u00100\u001a\u0004\b1\u00102R\u001a\u0010\u0007\u001a\u00020\u00068\u0000X\u0004¢\u0006\f\n\u0004\b \u00103\u001a\u0004\b4\u00105R\u001a\u0010\t\u001a\u00020\b8\u0000X\u0004¢\u0006\f\n\u0004\b\u0013\u00106\u001a\u0004\b7\u00108R\"\u0010<\u001a\u00020\u00048\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b)\u00100\u001a\u0004\b9\u00102\"\u0004\b:\u0010;R\u0018\u0010>\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010=R\u0017\u0010D\u001a\u00020?8\u0006¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u0014\u0010F\u001a\u00020\u00048BX\u0004¢\u0006\u0006\u001a\u0004\bE\u00102R\u0014\u0010H\u001a\u00020\u00048@X\u0004¢\u0006\u0006\u001a\u0004\bG\u00102R\u0011\u0010L\u001a\u00020I8F¢\u0006\u0006\u001a\u0004\bJ\u0010KR\u0011\u0010P\u001a\u00020M8F¢\u0006\u0006\u001a\u0004\bN\u0010OR\u0017\u0010T\u001a\u00020Q8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bR\u0010SR\u0011\u0010V\u001a\u00020M8F¢\u0006\u0006\u001a\u0004\bU\u0010OR\u0017\u0010Y\u001a\u00020W8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bX\u0010SR\u0011\u0010[\u001a\u00020M8F¢\u0006\u0006\u001a\u0004\bZ\u0010OR\u0014\u0010]\u001a\u00020M8@X\u0004¢\u0006\u0006\u001a\u0004\b\\\u0010OR\u0014\u0010_\u001a\u00020\u00048@X\u0004¢\u0006\u0006\u001a\u0004\b^\u00102R\u0011\u0010a\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b`\u00108R\u0017\u0010d\u001a\b\u0012\u0004\u0012\u00020\u00000\u00158F¢\u0006\u0006\u001a\u0004\bb\u0010cR\u001a\u0010f\u001a\b\u0012\u0004\u0012\u00020\u00000\u00158@X\u0004¢\u0006\u0006\u001a\u0004\be\u0010cR\u0013\u0010h\u001a\u0004\u0018\u00010\u00008F¢\u0006\u0006\u001a\u0004\bg\u0010,\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006i"}, d2 = {"LL1/p;", "", "Landroidx/compose/ui/d$c;", "outerSemanticsNode", "", "mergingEnabled", "LG1/G;", "layoutNode", "LL1/l;", "unmergedConfig", "<init>", "(Landroidx/compose/ui/d$c;ZLG1/G;LL1/l;)V", "mergedConfig", "LXH/N;", "B", "(LL1/l;)V", "", "list", "includeDeactivatedNodes", "d", "(LG1/G;Ljava/util/List;Z)V", "", "f", "(Ljava/util/List;)Ljava/util/List;", "unmergedChildren", "b", "(Ljava/util/List;)V", "LL1/i;", "role", "Lkotlin/Function1;", "LL1/x;", "properties", "c", "(LL1/i;LnI/l;)LL1/p;", "includeFakeNodes", "C", "(ZZ)Ljava/util/List;", "includeReplacedSemantics", "l", "(ZZZ)Ljava/util/List;", "LG1/c0;", "e", "()LG1/c0;", "a", "()LL1/p;", "Landroidx/compose/ui/d$c;", "getOuterSemanticsNode$ui_release", "()Landroidx/compose/ui/d$c;", "Z", "getMergingEnabled", "()Z", "LG1/G;", "q", "()LG1/G;", "LL1/l;", "w", "()LL1/l;", "x", "setFake$ui_release", "(Z)V", "isFake", "LL1/p;", "fakeNodeParent", "", "g", "I", "o", "()I", "id", "y", "isMergingSemanticsOfDescendants", "A", "isUnmergedLeafNode", "LE1/z;", "p", "()LE1/z;", "layoutInfo", "Lo1/i;", "v", "()Lo1/i;", "touchBoundsInRoot", "Lc2/r;", "u", "()J", "size", "i", "boundsInRoot", "Lo1/g;", "s", "positionInRoot", "j", "boundsInWindow", "h", "boundsInParent", "z", "isTransparent", "n", "config", "k", "()Ljava/util/List;", "children", "t", "replacedChildren", "r", "parent", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class p {

    /* renamed from: a  reason: collision with root package name */
    private final d.c f8984a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f8985b;

    /* renamed from: c  reason: collision with root package name */
    private final G f8986c;

    /* renamed from: d  reason: collision with root package name */
    private final l f8987d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f8988e;

    /* renamed from: f  reason: collision with root package name */
    private p f8989f;

    /* renamed from: g  reason: collision with root package name */
    private final int f8990g;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LL1/x;", "LXH/N;", "a", "(LL1/x;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends C17544u implements C17642l<x, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ i f8991c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(i iVar) {
            super(1);
            this.f8991c = iVar;
        }

        public final void a(x xVar) {
            v.l0(xVar, this.f8991c.n());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((x) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LL1/x;", "LXH/N;", "a", "(LL1/x;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends C17544u implements C17642l<x, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f8992c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(String str) {
            super(1);
            this.f8992c = str;
        }

        public final void a(x xVar) {
            v.d0(xVar, this.f8992c);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((x) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"L1/p$c", "LG1/w0;", "Landroidx/compose/ui/d$c;", "LL1/x;", "LXH/N;", "m0", "(LL1/x;)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c extends d.c implements w0 {

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ C17642l<x, C16807N> f8993n;

        c(C17642l<? super x, C16807N> lVar) {
            this.f8993n = lVar;
        }

        public void m0(x xVar) {
            this.f8993n.invoke(xVar);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LG1/G;", "it", "", "a", "(LG1/G;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class d extends C17544u implements C17642l<G, Boolean> {

        /* renamed from: c  reason: collision with root package name */
        public static final d f8994c = new d();

        d() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean invoke(G g10) {
            l L10 = g10.L();
            boolean z10 = false;
            if (L10 != null && L10.A()) {
                z10 = true;
            }
            return Boolean.valueOf(z10);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LG1/G;", "it", "", "a", "(LG1/G;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class e extends C17544u implements C17642l<G, Boolean> {

        /* renamed from: c  reason: collision with root package name */
        public static final e f8995c = new e();

        e() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean invoke(G g10) {
            l L10 = g10.L();
            boolean z10 = false;
            if (L10 != null && L10.A()) {
                z10 = true;
            }
            return Boolean.valueOf(z10);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LG1/G;", "it", "", "a", "(LG1/G;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class f extends C17544u implements C17642l<G, Boolean> {

        /* renamed from: c  reason: collision with root package name */
        public static final f f8996c = new f();

        f() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean invoke(G g10) {
            return Boolean.valueOf(g10.m0().r(C4502e0.a(8)));
        }
    }

    public p(d.c cVar, boolean z10, G g10, l lVar) {
        this.f8984a = cVar;
        this.f8985b = z10;
        this.f8986c = g10;
        this.f8987d = lVar;
        this.f8990g = g10.q();
    }

    private final void B(l lVar) {
        if (!this.f8987d.x()) {
            List D10 = D(this, false, false, 3, (Object) null);
            int size = D10.size();
            for (int i10 = 0; i10 < size; i10++) {
                p pVar = (p) D10.get(i10);
                if (!pVar.y()) {
                    lVar.B(pVar.f8987d);
                    pVar.B(lVar);
                }
            }
        }
    }

    public static /* synthetic */ List D(p pVar, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            z11 = false;
        }
        return pVar.C(z10, z11);
    }

    private final void b(List<p> list) {
        i c10 = q.h(this);
        if (c10 != null && this.f8987d.A() && !list.isEmpty()) {
            list.add(c(c10, new a(c10)));
        }
        l lVar = this.f8987d;
        s sVar = s.f9010a;
        if (lVar.k(sVar.d()) && !list.isEmpty() && this.f8987d.A()) {
            List list2 = (List) m.a(this.f8987d, sVar.d());
            String str = list2 != null ? (String) C16877v.y0(list2) : null;
            if (str != null) {
                list.add(0, c((i) null, new b(str)));
            }
        }
    }

    private final p c(i iVar, C17642l<? super x, C16807N> lVar) {
        l lVar2 = new l();
        lVar2.D(false);
        lVar2.C(false);
        lVar.invoke(lVar2);
        p pVar = new p(new c(lVar), false, new G(true, iVar != null ? q.i(this) : q.e(this)), lVar2);
        pVar.f8988e = true;
        pVar.f8989f = this;
        return pVar;
    }

    private final void d(G g10, List<p> list, boolean z10) {
        W0.b<G> w02 = g10.w0();
        int r10 = w02.r();
        if (r10 > 0) {
            Object[] q10 = w02.q();
            int i10 = 0;
            do {
                G g11 = (G) q10[i10];
                if (g11.c() && (z10 || !g11.L0())) {
                    if (g11.m0().r(C4502e0.a(8))) {
                        list.add(q.a(g11, this.f8985b));
                    } else {
                        d(g11, list, z10);
                    }
                }
                i10++;
            } while (i10 < r10);
        }
    }

    private final List<p> f(List<p> list) {
        List D10 = D(this, false, false, 3, (Object) null);
        int size = D10.size();
        for (int i10 = 0; i10 < size; i10++) {
            p pVar = (p) D10.get(i10);
            if (pVar.y()) {
                list.add(pVar);
            } else if (!pVar.f8987d.x()) {
                pVar.f(list);
            }
        }
        return list;
    }

    static /* synthetic */ List g(p pVar, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = new ArrayList();
        }
        return pVar.f(list);
    }

    public static /* synthetic */ List m(p pVar, boolean z10, boolean z11, boolean z12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = !pVar.f8985b;
        }
        if ((i10 & 2) != 0) {
            z11 = false;
        }
        if ((i10 & 4) != 0) {
            z12 = false;
        }
        return pVar.l(z10, z11, z12);
    }

    private final boolean y() {
        return this.f8985b && this.f8987d.A();
    }

    public final boolean A() {
        return !this.f8988e && t().isEmpty() && q.f(this.f8986c, d.f8994c) == null;
    }

    public final List<p> C(boolean z10, boolean z11) {
        if (this.f8988e) {
            return C16877v.n();
        }
        ArrayList arrayList = new ArrayList();
        d(this.f8986c, arrayList, z11);
        if (z10) {
            b(arrayList);
        }
        return arrayList;
    }

    public final p a() {
        return new p(this.f8984a, true, this.f8986c, this.f8987d);
    }

    public final C4498c0 e() {
        if (this.f8988e) {
            p r10 = r();
            if (r10 != null) {
                return r10.e();
            }
            return null;
        }
        C4507j g10 = q.g(this.f8986c);
        if (g10 == null) {
            g10 = this.f8984a;
        }
        return C4508k.h(g10, C4502e0.a(8));
    }

    public final C5669i h() {
        C4488v o12;
        p r10 = r();
        if (r10 == null) {
            return C5669i.f26706e.a();
        }
        C4498c0 e10 = e();
        if (e10 != null) {
            if (!e10.c()) {
                e10 = null;
            }
            if (!(e10 == null || (o12 = e10.o1()) == null)) {
                return C4488v.T(C4508k.h(r10.f8984a, C4502e0.a(8)), o12, false, 2, (Object) null);
            }
        }
        return C5669i.f26706e.a();
    }

    public final C5669i i() {
        C5669i b10;
        C4498c0 e10 = e();
        if (e10 != null) {
            if (!e10.c()) {
                e10 = null;
            }
            if (!(e10 == null || (b10 = C4489w.b(e10)) == null)) {
                return b10;
            }
        }
        return C5669i.f26706e.a();
    }

    public final C5669i j() {
        C5669i c10;
        C4498c0 e10 = e();
        if (e10 != null) {
            if (!e10.c()) {
                e10 = null;
            }
            if (!(e10 == null || (c10 = C4489w.c(e10)) == null)) {
                return c10;
            }
        }
        return C5669i.f26706e.a();
    }

    public final List<p> k() {
        return m(this, false, false, false, 7, (Object) null);
    }

    public final List<p> l(boolean z10, boolean z11, boolean z12) {
        return (z10 || !this.f8987d.x()) ? y() ? g(this, (List) null, 1, (Object) null) : C(z11, z12) : C16877v.n();
    }

    public final l n() {
        if (!y()) {
            return this.f8987d;
        }
        l p10 = this.f8987d.p();
        B(p10);
        return p10;
    }

    public final int o() {
        return this.f8990g;
    }

    public final C4492z p() {
        return this.f8986c;
    }

    public final G q() {
        return this.f8986c;
    }

    public final p r() {
        p pVar = this.f8989f;
        if (pVar != null) {
            return pVar;
        }
        G f10 = this.f8985b ? q.f(this.f8986c, e.f8995c) : null;
        if (f10 == null) {
            f10 = q.f(this.f8986c, f.f8996c);
        }
        if (f10 == null) {
            return null;
        }
        return q.a(f10, this.f8985b);
    }

    public final long s() {
        C4498c0 e10 = e();
        if (e10 != null) {
            if (!e10.c()) {
                e10 = null;
            }
            if (e10 != null) {
                return C4489w.f(e10);
            }
        }
        return C5667g.f26701b.c();
    }

    public final List<p> t() {
        return m(this, false, true, false, 4, (Object) null);
    }

    public final long u() {
        C4498c0 e10 = e();
        return e10 != null ? e10.a() : r.f23053b.a();
    }

    public final C5669i v() {
        C4507j jVar;
        if (this.f8987d.A()) {
            jVar = q.g(this.f8986c);
            if (jVar == null) {
                jVar = this.f8984a;
            }
        } else {
            jVar = this.f8984a;
        }
        return x0.c(jVar.E0(), x0.a(this.f8987d));
    }

    public final l w() {
        return this.f8987d;
    }

    public final boolean x() {
        return this.f8988e;
    }

    public final boolean z() {
        C4498c0 e10 = e();
        if (e10 != null) {
            return e10.V2();
        }
        return false;
    }
}
