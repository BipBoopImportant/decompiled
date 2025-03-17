package V0;

import U0.C4862b1;
import U0.C4865c1;
import U0.C4866d;
import U0.C4888l0;
import U0.C4890m0;
import U0.C4891n;
import U0.C4895p;
import U0.C4897q;
import U0.F;
import U0.T0;
import U0.W;
import U0.r;
import U0.z1;
import XH.C16807N;
import c1.d;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;
import nI.C17642l;
import nI.p;

@Metadata(d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00102\u00020\u0001:\u00011B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u0019\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0010\u0010\nJ\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0016\u001a\u00020\b2\b\b\u0002\u0010\u0015\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0016\u0010\u000fJ\u000f\u0010\u0017\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0017\u0010\nJ\u001f\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010 \u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u0018H\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\bH\u0002¢\u0006\u0004\b\"\u0010\nJ\u0015\u0010$\u001a\u00020\b2\u0006\u0010#\u001a\u00020\u0018¢\u0006\u0004\b$\u0010%J\u0015\u0010&\u001a\u00020\b2\u0006\u0010#\u001a\u00020\u0018¢\u0006\u0004\b&\u0010%J\r\u0010'\u001a\u00020\b¢\u0006\u0004\b'\u0010\nJ\u0015\u0010*\u001a\u00020\b2\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+J\u001f\u0010-\u001a\u00020\b2\b\u0010)\u001a\u0004\u0018\u00010\u00012\u0006\u0010,\u001a\u00020\u0018¢\u0006\u0004\b-\u0010.J'\u0010/\u001a\u00020\b2\b\u0010)\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010,\u001a\u00020\u0018¢\u0006\u0004\b/\u00100J\u001f\u00101\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010)\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b1\u00102J\u0015\u00103\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u0018¢\u0006\u0004\b3\u0010%J\r\u00104\u001a\u00020\b¢\u0006\u0004\b4\u0010\nJ\u0017\u00106\u001a\u00020\b2\b\u00105\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b6\u00107J\r\u00108\u001a\u00020\b¢\u0006\u0004\b8\u0010\nJ\r\u00109\u001a\u00020\b¢\u0006\u0004\b9\u0010\nJ\r\u0010:\u001a\u00020\b¢\u0006\u0004\b:\u0010\nJ\r\u0010;\u001a\u00020\b¢\u0006\u0004\b;\u0010\nJ\u001d\u0010=\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020<¢\u0006\u0004\b=\u0010>J%\u0010A\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020<2\u0006\u0010@\u001a\u00020?¢\u0006\u0004\bA\u0010BJ\u0015\u0010D\u001a\u00020\b2\u0006\u0010C\u001a\u00020\u0018¢\u0006\u0004\bD\u0010%J)\u0010I\u001a\u00020\b2\u0012\u0010G\u001a\u000e\u0012\u0004\u0012\u00020F\u0012\u0004\u0012\u00020\b0E2\u0006\u0010H\u001a\u00020F¢\u0006\u0004\bI\u0010JJ\u0017\u0010L\u001a\u00020\b2\b\u0010K\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\bL\u00107J;\u0010Q\u001a\u00020\b\"\u0004\b\u0000\u0010M\"\u0004\b\u0001\u0010N2\u0006\u0010)\u001a\u00028\u00012\u0018\u0010P\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\b0O¢\u0006\u0004\bQ\u0010RJ\u001d\u0010T\u001a\u00020\b2\u0006\u0010S\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u0018¢\u0006\u0004\bT\u0010\u001cJ%\u0010U\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u0018¢\u0006\u0004\bU\u0010!J\r\u0010V\u001a\u00020\b¢\u0006\u0004\bV\u0010\nJ\r\u0010W\u001a\u00020\b¢\u0006\u0004\bW\u0010\nJ\u001d\u0010Y\u001a\u00020\b2\u0006\u0010S\u001a\u00020\u00182\u0006\u0010X\u001a\u00020\u0018¢\u0006\u0004\bY\u0010\u001cJ\r\u0010Z\u001a\u00020\b¢\u0006\u0004\bZ\u0010\nJ\u0017\u0010[\u001a\u00020\b2\b\u0010K\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b[\u00107J\u001b\u0010N\u001a\u00020\b2\f\u0010]\u001a\b\u0012\u0004\u0012\u00020\b0\\¢\u0006\u0004\bN\u0010^J\u001d\u0010a\u001a\u00020\b2\u0006\u0010`\u001a\u00020_2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\ba\u0010bJ%\u0010f\u001a\u00020\b2\u000e\u0010d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010c2\u0006\u0010e\u001a\u00020_¢\u0006\u0004\bf\u0010gJ/\u0010m\u001a\u00020\b2\b\u0010i\u001a\u0004\u0018\u00010h2\u0006\u0010k\u001a\u00020j2\u0006\u0010\u001e\u001a\u00020l2\u0006\u0010\u001d\u001a\u00020l¢\u0006\u0004\bm\u0010nJ%\u0010q\u001a\u00020\b2\u0006\u0010H\u001a\u00020o2\u0006\u0010k\u001a\u00020j2\u0006\u0010p\u001a\u00020l¢\u0006\u0004\bq\u0010rJ\r\u0010s\u001a\u00020\b¢\u0006\u0004\bs\u0010\nJ!\u0010u\u001a\u00020\b2\u0006\u0010t\u001a\u00020\u00042\n\b\u0002\u0010e\u001a\u0004\u0018\u00010_¢\u0006\u0004\bu\u0010vJ\r\u0010w\u001a\u00020\b¢\u0006\u0004\bw\u0010\nJ\r\u0010x\u001a\u00020\b¢\u0006\u0004\bx\u0010\nJ\r\u0010y\u001a\u00020\b¢\u0006\u0004\by\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b1\u0010zR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bf\u0010{\u001a\u0004\b|\u0010}\"\u0004\bM\u0010~R\u0016\u0010\u001a\u00020\f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bm\u00106R\u0017\u0010\u0001\u001a\u00030\u00018\u0002X\u0004¢\u0006\u0007\n\u0005\by\u0010\u0001R&\u0010\u0001\u001a\u00020\f8\u0006@\u0006X\u000e¢\u0006\u0015\n\u0004\ba\u00106\u001a\u0006\b\u0001\u0010\u0001\"\u0005\b\u0001\u0010\u000fR\u0017\u0010\u0001\u001a\u00020\u00188\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bI\u0010\u0016R\u0017\u0010\u0001\u001a\u00020\u00188\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b9\u0010\u0016R!\u0010\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00018\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\bs\u0010\u0001R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bW\u0010\u0016R\u0017\u0010\u0001\u001a\u00020\u00188\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bY\u0010\u0016R\u0017\u0010\u0001\u001a\u00020\u00188\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b8\u0010\u0016R\u0016\u0010\u001a\u001a\u00020\u00188\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0016R\u0018\u0010\u0001\u001a\u00030\u00018BX\u0004¢\u0006\b\u001a\u0006\b\u0001\u0010\u0001R\u0014\u0010\u0001\u001a\u00020\f8F¢\u0006\b\u001a\u0006\b\u0001\u0010\u0001¨\u0006\u0001"}, d2 = {"LV0/b;", "", "LU0/n;", "composer", "LV0/a;", "changeList", "<init>", "(LU0/n;LV0/a;)V", "LXH/N;", "B", "()V", "D", "", "useParentSlot", "E", "(Z)V", "m", "LU0/d;", "anchor", "l", "(LU0/d;)V", "forParent", "I", "H", "", "removeFrom", "moveCount", "K", "(II)V", "to", "from", "count", "G", "(III)V", "C", "location", "y", "(I)V", "z", "L", "LU0/T0;", "value", "O", "(LU0/T0;)V", "groupSlotIndex", "b0", "(Ljava/lang/Object;I)V", "Y", "(Ljava/lang/Object;LU0/d;I)V", "a", "(LU0/d;Ljava/lang/Object;)V", "X", "R", "data", "Z", "(Ljava/lang/Object;)V", "k", "g", "W", "P", "LU0/c1;", "t", "(LU0/d;LU0/c1;)V", "LV0/c;", "fixups", "u", "(LU0/d;LU0/c1;LV0/c;)V", "offset", "v", "Lkotlin/Function1;", "LU0/q;", "action", "composition", "f", "(LnI/l;LU0/q;)V", "node", "c0", "T", "V", "Lkotlin/Function2;", "block", "a0", "(Ljava/lang/Object;LnI/p;)V", "nodeIndex", "Q", "x", "M", "i", "group", "j", "A", "w", "Lkotlin/Function0;", "effect", "(LnI/a;)V", "Lc1/d;", "effectiveNodeIndexOut", "e", "(Lc1/d;LU0/d;)V", "", "nodes", "effectiveNodeIndex", "b", "(Ljava/util/List;Lc1/d;)V", "LU0/l0;", "resolvedState", "LU0/r;", "parentContext", "LU0/m0;", "c", "(LU0/l0;LU0/r;LU0/m0;LU0/m0;)V", "LU0/F;", "reference", "N", "(LU0/F;LU0/r;LU0/m0;)V", "h", "other", "s", "(LV0/a;Lc1/d;)V", "n", "S", "d", "LU0/n;", "LV0/a;", "o", "()LV0/a;", "(LV0/a;)V", "startedGroup", "LU0/W;", "LU0/W;", "startedGroups", "p", "()Z", "U", "implicitRootStart", "writersReaderDelta", "pendingUps", "LU0/z1;", "LU0/z1;", "pendingDownNodes", "moveFrom", "moveTo", "LU0/b1;", "r", "()LU0/b1;", "reader", "q", "pastParent", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class b {

    /* renamed from: m  reason: collision with root package name */
    public static final a f14489m = new a((DefaultConstructorMarker) null);

    /* renamed from: n  reason: collision with root package name */
    public static final int f14490n = 8;

    /* renamed from: a  reason: collision with root package name */
    private final C4891n f14491a;

    /* renamed from: b  reason: collision with root package name */
    private a f14492b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f14493c;

    /* renamed from: d  reason: collision with root package name */
    private final W f14494d = new W();

    /* renamed from: e  reason: collision with root package name */
    private boolean f14495e = true;

    /* renamed from: f  reason: collision with root package name */
    private int f14496f;

    /* renamed from: g  reason: collision with root package name */
    private int f14497g;

    /* renamed from: h  reason: collision with root package name */
    private z1<Object> f14498h = new z1<>();

    /* renamed from: i  reason: collision with root package name */
    private int f14499i = -1;

    /* renamed from: j  reason: collision with root package name */
    private int f14500j = -1;

    /* renamed from: k  reason: collision with root package name */
    private int f14501k = -1;

    /* renamed from: l  reason: collision with root package name */
    private int f14502l;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LV0/b$a;", "", "<init>", "()V", "", "invalidGroupLocation", "I", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public b(C4891n nVar, a aVar) {
        this.f14491a = nVar;
        this.f14492b = aVar;
    }

    private final void B() {
        C();
    }

    private final void C() {
        int i10 = this.f14497g;
        if (i10 > 0) {
            this.f14492b.H(i10);
            this.f14497g = 0;
        }
        if (this.f14498h.d()) {
            this.f14492b.k(this.f14498h.i());
            this.f14498h.a();
        }
    }

    private final void D() {
        J(this, false, 1, (Object) null);
        L();
    }

    private final void E(boolean z10) {
        I(z10);
    }

    static /* synthetic */ void F(b bVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        bVar.E(z10);
    }

    private final void G(int i10, int i11, int i12) {
        B();
        this.f14492b.u(i10, i11, i12);
    }

    private final void H() {
        int i10 = this.f14502l;
        if (i10 > 0) {
            int i11 = this.f14499i;
            if (i11 >= 0) {
                K(i11, i10);
                this.f14499i = -1;
            } else {
                G(this.f14501k, this.f14500j, i10);
                this.f14500j = -1;
                this.f14501k = -1;
            }
            this.f14502l = 0;
        }
    }

    private final void I(boolean z10) {
        int u10 = z10 ? r().u() : r().k();
        int i10 = u10 - this.f14496f;
        if (!(i10 >= 0)) {
            C4895p.s("Tried to seek backward");
        }
        if (i10 > 0) {
            this.f14492b.e(i10);
            this.f14496f = u10;
        }
    }

    static /* synthetic */ void J(b bVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        bVar.I(z10);
    }

    private final void K(int i10, int i11) {
        B();
        this.f14492b.y(i10, i11);
    }

    private final void l(C4866d dVar) {
        F(this, false, 1, (Object) null);
        this.f14492b.o(dVar);
        this.f14493c = true;
    }

    private final void m() {
        if (!this.f14493c && this.f14495e) {
            F(this, false, 1, (Object) null);
            this.f14492b.p();
            this.f14493c = true;
        }
    }

    private final C4862b1 r() {
        return this.f14491a.J0();
    }

    public final void A() {
        H();
        if (this.f14498h.d()) {
            this.f14498h.g();
        } else {
            this.f14497g++;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r0 = r();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void L() {
        /*
            r4 = this;
            U0.b1 r0 = r4.r()
            int r0 = r0.x()
            if (r0 <= 0) goto L_0x002c
            U0.b1 r0 = r4.r()
            int r1 = r0.u()
            U0.W r2 = r4.f14494d
            r3 = -2
            int r2 = r2.h(r3)
            if (r2 == r1) goto L_0x002c
            r4.m()
            if (r1 <= 0) goto L_0x002c
            U0.d r0 = r0.a(r1)
            U0.W r2 = r4.f14494d
            r2.j(r1)
            r4.l(r0)
        L_0x002c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: V0.b.L():void");
    }

    public final void M() {
        C();
        if (this.f14493c) {
            W();
            k();
        }
    }

    public final void N(F f10, r rVar, C4890m0 m0Var) {
        this.f14492b.v(f10, rVar, m0Var);
    }

    public final void O(T0 t02) {
        this.f14492b.w(t02);
    }

    public final void P() {
        D();
        this.f14492b.x();
        this.f14496f += r().p();
    }

    public final void Q(int i10, int i11) {
        if (i11 > 0) {
            if (!(i10 >= 0)) {
                C4895p.s("Invalid remove index " + i10);
            }
            if (this.f14499i == i10) {
                this.f14502l += i11;
                return;
            }
            H();
            this.f14499i = i10;
            this.f14502l = i11;
        }
    }

    public final void R() {
        this.f14492b.z();
    }

    public final void S() {
        this.f14493c = false;
        this.f14494d.a();
        this.f14496f = 0;
    }

    public final void T(a aVar) {
        this.f14492b = aVar;
    }

    public final void U(boolean z10) {
        this.f14495e = z10;
    }

    public final void V(C17631a<C16807N> aVar) {
        this.f14492b.A(aVar);
    }

    public final void W() {
        this.f14492b.B();
    }

    public final void X(int i10) {
        if (i10 > 0) {
            D();
            this.f14492b.C(i10);
        }
    }

    public final void Y(Object obj, C4866d dVar, int i10) {
        this.f14492b.D(obj, dVar, i10);
    }

    public final void Z(Object obj) {
        F(this, false, 1, (Object) null);
        this.f14492b.E(obj);
    }

    public final void a(C4866d dVar, Object obj) {
        this.f14492b.f(dVar, obj);
    }

    public final <T, V> void a0(V v10, p<? super T, ? super V, C16807N> pVar) {
        B();
        this.f14492b.F(v10, pVar);
    }

    public final void b(List<? extends Object> list, d dVar) {
        this.f14492b.g(list, dVar);
    }

    public final void b0(Object obj, int i10) {
        E(true);
        this.f14492b.G(obj, i10);
    }

    public final void c(C4888l0 l0Var, r rVar, C4890m0 m0Var, C4890m0 m0Var2) {
        this.f14492b.h(l0Var, rVar, m0Var, m0Var2);
    }

    public final void c0(Object obj) {
        B();
        this.f14492b.I(obj);
    }

    public final void d() {
        F(this, false, 1, (Object) null);
        this.f14492b.i();
    }

    public final void e(d dVar, C4866d dVar2) {
        C();
        this.f14492b.j(dVar, dVar2);
    }

    public final void f(C17642l<? super C4897q, C16807N> lVar, C4897q qVar) {
        this.f14492b.l(lVar, qVar);
    }

    public final void g() {
        int u10 = r().u();
        if (!(this.f14494d.h(-1) <= u10)) {
            C4895p.s("Missed recording an endGroup");
        }
        if (this.f14494d.h(-1) == u10) {
            F(this, false, 1, (Object) null);
            this.f14494d.i();
            this.f14492b.m();
        }
    }

    public final void h() {
        this.f14492b.n();
        this.f14496f = 0;
    }

    public final void i() {
        H();
    }

    public final void j(int i10, int i11) {
        i();
        C();
        int N10 = r().J(i11) ? 1 : r().N(i11);
        if (N10 > 0) {
            Q(i10, N10);
        }
    }

    public final void k() {
        if (this.f14493c) {
            F(this, false, 1, (Object) null);
            F(this, false, 1, (Object) null);
            this.f14492b.m();
            this.f14493c = false;
        }
    }

    public final void n() {
        C();
        if (!this.f14494d.d()) {
            C4895p.s("Missed recording an endGroup()");
        }
    }

    public final a o() {
        return this.f14492b;
    }

    public final boolean p() {
        return this.f14495e;
    }

    public final boolean q() {
        return r().u() - this.f14496f < 0;
    }

    public final void s(a aVar, d dVar) {
        this.f14492b.q(aVar, dVar);
    }

    public final void t(C4866d dVar, C4865c1 c1Var) {
        C();
        D();
        H();
        this.f14492b.r(dVar, c1Var);
    }

    public final void u(C4866d dVar, C4865c1 c1Var, c cVar) {
        C();
        D();
        H();
        this.f14492b.s(dVar, c1Var, cVar);
    }

    public final void v(int i10) {
        D();
        this.f14492b.t(i10);
    }

    public final void w(Object obj) {
        H();
        this.f14498h.h(obj);
    }

    public final void x(int i10, int i11, int i12) {
        if (i12 > 0) {
            int i13 = this.f14502l;
            if (i13 > 0 && this.f14500j == i10 - i13 && this.f14501k == i11 - i13) {
                this.f14502l = i13 + i12;
                return;
            }
            H();
            this.f14500j = i10;
            this.f14501k = i11;
            this.f14502l = i12;
        }
    }

    public final void y(int i10) {
        this.f14496f += i10 - r().k();
    }

    public final void z(int i10) {
        this.f14496f = i10;
    }
}
