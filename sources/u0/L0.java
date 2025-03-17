package U0;

import XH.C16807N;
import j0.K;
import j0.N;
import j0.Z;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;
import nI.p;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\"\b\u0000\u0018\u0000 .2\u00020\u00012\u00020\u0002:\u0001\u001eB\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J1\u0010\f\u001a\u00020\u000b*\u0006\u0012\u0002\b\u00030\u00072\u0018\u0010\n\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0010¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0019\u0010\u0006J\u000f\u0010\u001a\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001a\u0010\u0018J)\u0010\u001e\u001a\u00020\u00102\u0018\u0010\u001d\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00100\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010!\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u001c¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020\u0010¢\u0006\u0004\b#\u0010\u0018J\u0015\u0010%\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020\t¢\u0006\u0004\b%\u0010&J#\u0010'\u001a\u00020\u00102\n\u0010$\u001a\u0006\u0012\u0002\b\u00030\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020\u000b2\b\u0010)\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b*\u0010&J\r\u0010+\u001a\u00020\u0010¢\u0006\u0004\b+\u0010\u0018J#\u0010.\u001a\u0010\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\u0010\u0018\u00010,2\u0006\u0010 \u001a\u00020\u001c¢\u0006\u0004\b.\u0010/R\u0016\u00100\u001a\u00020\u001c8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010!R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b1\u00102R$\u0010:\u001a\u0004\u0018\u0001038\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R*\u0010\u001d\u001a\u0016\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u001b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010=\u001a\u00020\u001c8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010!R\u001e\u0010@\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010>8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\f\u0010?R*\u0010B\u001a\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010AR$\u0010G\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000b8B@BX\u000e¢\u0006\f\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR$\u0010J\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000b8@@BX\u000e¢\u0006\f\u001a\u0004\bH\u0010D\"\u0004\bI\u0010FR\u0011\u0010L\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\bK\u0010DR\u0011\u0010N\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\bM\u0010DR$\u0010Q\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000b8F@FX\u000e¢\u0006\f\u001a\u0004\bO\u0010D\"\u0004\bP\u0010FR$\u0010T\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000b8F@FX\u000e¢\u0006\f\u001a\u0004\bR\u0010D\"\u0004\bS\u0010FR$\u0010W\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000b8F@FX\u000e¢\u0006\f\u001a\u0004\bU\u0010D\"\u0004\bV\u0010FR$\u0010Z\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000b8F@FX\u000e¢\u0006\f\u001a\u0004\bX\u0010D\"\u0004\bY\u0010FR$\u0010]\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000b8F@FX\u000e¢\u0006\f\u001a\u0004\b[\u0010D\"\u0004\b\\\u0010FR\u0011\u0010_\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b^\u0010D¨\u0006`"}, d2 = {"LU0/L0;", "LU0/Y0;", "LU0/K0;", "LU0/N0;", "owner", "<init>", "(LU0/N0;)V", "LU0/I;", "Lj0/N;", "", "dependencies", "", "f", "(LU0/I;Lj0/N;)Z", "LU0/m;", "composer", "LXH/N;", "g", "(LU0/m;)V", "value", "LU0/Z;", "s", "(Ljava/lang/Object;)LU0/Z;", "x", "()V", "e", "invalidate", "Lkotlin/Function2;", "", "block", "a", "(LnI/p;)V", "token", "I", "(I)V", "z", "instance", "w", "(Ljava/lang/Object;)Z", "v", "(LU0/I;Ljava/lang/Object;)V", "instances", "u", "y", "Lkotlin/Function1;", "LU0/q;", "h", "(I)LnI/l;", "flags", "b", "LU0/N0;", "LU0/d;", "c", "LU0/d;", "i", "()LU0/d;", "A", "(LU0/d;)V", "anchor", "d", "LnI/p;", "currentToken", "Lj0/K;", "Lj0/K;", "trackedInstances", "Lj0/N;", "trackedDependencies", "o", "()Z", "F", "(Z)V", "rereading", "p", "G", "skipped", "r", "valid", "j", "canRecompose", "q", "H", "used", "k", "B", "defaultsInScope", "l", "C", "defaultsInvalid", "n", "E", "requiresRecompose", "m", "D", "forcedRecompose", "t", "isConditional", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class L0 implements Y0, K0 {

    /* renamed from: h  reason: collision with root package name */
    public static final a f13781h = new a((DefaultConstructorMarker) null);

    /* renamed from: i  reason: collision with root package name */
    public static final int f13782i = 8;

    /* renamed from: a  reason: collision with root package name */
    private int f13783a;

    /* renamed from: b  reason: collision with root package name */
    private N0 f13784b;

    /* renamed from: c  reason: collision with root package name */
    private C4866d f13785c;

    /* renamed from: d  reason: collision with root package name */
    private p<? super C4889m, ? super Integer, C16807N> f13786d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public int f13787e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public K<Object> f13788f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public N<I<?>, Object> f13789g;

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\f\u0010\rJ%\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u000e2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0000¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"LU0/L0$a;", "", "<init>", "()V", "LU0/f1;", "slots", "", "LU0/d;", "anchors", "LU0/N0;", "newOwner", "LXH/N;", "a", "(LU0/f1;Ljava/util/List;LU0/N0;)V", "LU0/c1;", "", "b", "(LU0/c1;Ljava/util/List;)Z", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(C4874f1 f1Var, List<C4866d> list, N0 n02) {
            if (!list.isEmpty()) {
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    Object b12 = f1Var.b1(list.get(i10), 0);
                    L0 l02 = b12 instanceof L0 ? (L0) b12 : null;
                    if (l02 != null) {
                        l02.e(n02);
                    }
                }
            }
        }

        public final boolean b(C4865c1 c1Var, List<C4866d> list) {
            if (list.isEmpty()) {
                return false;
            }
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                C4866d dVar = list.get(i10);
                if (c1Var.K(dVar) && (c1Var.M(c1Var.i(dVar), 0) instanceof L0)) {
                    return true;
                }
            }
            return false;
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LU0/q;", "composition", "LXH/N;", "a", "(LU0/q;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends C17544u implements C17642l<C4897q, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ L0 f13790c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f13791d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ K<Object> f13792e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(L0 l02, int i10, K<Object> k10) {
            super(1);
            this.f13790c = l02;
            this.f13791d = i10;
            this.f13792e = k10;
        }

        public final void a(C4897q qVar) {
            int i10;
            C4897q qVar2 = qVar;
            if (this.f13790c.f13787e == this.f13791d && C17542s.e(this.f13792e, this.f13790c.f13788f) && (qVar2 instanceof C4902t)) {
                K<Object> k10 = this.f13792e;
                int i11 = this.f13791d;
                L0 l02 = this.f13790c;
                long[] jArr = k10.f24551a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i12 = 0;
                    while (true) {
                        long j10 = jArr[i12];
                        if ((((~j10) << 7) & j10 & -9187201950435737472L) != -9187201950435737472L) {
                            int i13 = 8;
                            int i14 = 8 - ((~(i12 - length)) >>> 31);
                            int i15 = 0;
                            while (i15 < i14) {
                                if ((255 & j10) < 128) {
                                    int i16 = (i12 << 3) + i15;
                                    Object obj = k10.f24552b[i16];
                                    boolean z10 = k10.f24553c[i16] != i11;
                                    if (z10) {
                                        C4902t tVar = (C4902t) qVar2;
                                        tVar.L(obj, l02);
                                        if (obj instanceof I) {
                                            tVar.K((I) obj);
                                            N c10 = l02.f13789g;
                                            if (c10 != null) {
                                                c10.p(obj);
                                            }
                                        }
                                    }
                                    if (z10) {
                                        k10.q(i16);
                                    }
                                    i10 = 8;
                                } else {
                                    i10 = i13;
                                }
                                j10 >>= i10;
                                i15++;
                                i13 = i10;
                            }
                            if (i14 != i13) {
                                return;
                            }
                        }
                        if (i12 != length) {
                            i12++;
                        } else {
                            return;
                        }
                    }
                }
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C4897q) obj);
            return C16807N.f139792a;
        }
    }

    public L0(N0 n02) {
        this.f13784b = n02;
    }

    private final void F(boolean z10) {
        if (z10) {
            this.f13783a |= 32;
        } else {
            this.f13783a &= -33;
        }
    }

    private final void G(boolean z10) {
        if (z10) {
            this.f13783a |= 16;
        } else {
            this.f13783a &= -17;
        }
    }

    private final boolean f(I<?> i10, N<I<?>, Object> n10) {
        C17542s.h(i10, "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>");
        o1<?> c10 = i10.c();
        if (c10 == null) {
            c10 = p1.s();
        }
        return !c10.b(i10.r().a(), n10.c(i10));
    }

    private final boolean o() {
        return (this.f13783a & 32) != 0;
    }

    public final void A(C4866d dVar) {
        this.f13785c = dVar;
    }

    public final void B(boolean z10) {
        if (z10) {
            this.f13783a |= 2;
        } else {
            this.f13783a &= -3;
        }
    }

    public final void C(boolean z10) {
        if (z10) {
            this.f13783a |= 4;
        } else {
            this.f13783a &= -5;
        }
    }

    public final void D(boolean z10) {
        if (z10) {
            this.f13783a |= 64;
        } else {
            this.f13783a &= -65;
        }
    }

    public final void E(boolean z10) {
        if (z10) {
            this.f13783a |= 8;
        } else {
            this.f13783a &= -9;
        }
    }

    public final void H(boolean z10) {
        if (z10) {
            this.f13783a |= 1;
        } else {
            this.f13783a &= -2;
        }
    }

    public final void I(int i10) {
        this.f13787e = i10;
        G(false);
    }

    public void a(p<? super C4889m, ? super Integer, C16807N> pVar) {
        this.f13786d = pVar;
    }

    public final void e(N0 n02) {
        this.f13784b = n02;
    }

    public final void g(C4889m mVar) {
        C16807N n10;
        p<? super C4889m, ? super Integer, C16807N> pVar = this.f13786d;
        if (pVar != null) {
            pVar.invoke(mVar, 1);
            n10 = C16807N.f139792a;
        } else {
            n10 = null;
        }
        if (n10 == null) {
            throw new IllegalStateException("Invalid restart scope");
        }
    }

    public final C17642l<C4897q, C16807N> h(int i10) {
        int i11 = i10;
        K<Object> k10 = this.f13788f;
        if (k10 == null || p()) {
            return null;
        }
        Object[] objArr = k10.f24552b;
        int[] iArr = k10.f24553c;
        long[] jArr = k10.f24551a;
        int length = jArr.length - 2;
        if (length < 0) {
            return null;
        }
        int i12 = 0;
        while (true) {
            long j10 = jArr[i12];
            if ((((~j10) << 7) & j10 & -9187201950435737472L) != -9187201950435737472L) {
                int i13 = 8 - ((~(i12 - length)) >>> 31);
                for (int i14 = 0; i14 < i13; i14++) {
                    if ((255 & j10) < 128) {
                        int i15 = (i12 << 3) + i14;
                        Object obj = objArr[i15];
                        if (iArr[i15] != i11) {
                            return new b(this, i11, k10);
                        }
                    }
                    j10 >>= 8;
                }
                if (i13 != 8) {
                    return null;
                }
            }
            if (i12 == length) {
                return null;
            }
            i12++;
        }
    }

    public final C4866d i() {
        return this.f13785c;
    }

    public void invalidate() {
        N0 n02 = this.f13784b;
        if (n02 != null) {
            n02.c(this, (Object) null);
        }
    }

    public final boolean j() {
        return this.f13786d != null;
    }

    public final boolean k() {
        return (this.f13783a & 2) != 0;
    }

    public final boolean l() {
        return (this.f13783a & 4) != 0;
    }

    public final boolean m() {
        return (this.f13783a & 64) != 0;
    }

    public final boolean n() {
        return (this.f13783a & 8) != 0;
    }

    public final boolean p() {
        return (this.f13783a & 16) != 0;
    }

    public final boolean q() {
        return (this.f13783a & 1) != 0;
    }

    public final boolean r() {
        if (this.f13784b == null) {
            return false;
        }
        C4866d dVar = this.f13785c;
        return dVar != null ? dVar.b() : false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r2 = r0.c(r1, r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final U0.Z s(java.lang.Object r2) {
        /*
            r1 = this;
            U0.N0 r0 = r1.f13784b
            if (r0 == 0) goto L_0x000a
            U0.Z r2 = r0.c(r1, r2)
            if (r2 != 0) goto L_0x000c
        L_0x000a:
            U0.Z r2 = U0.Z.IGNORED
        L_0x000c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: U0.L0.s(java.lang.Object):U0.Z");
    }

    public final boolean t() {
        return this.f13789g != null;
    }

    public final boolean u(Object obj) {
        N<I<?>, Object> n10;
        Object obj2 = obj;
        if (obj2 == null || (n10 = this.f13789g) == null) {
            return true;
        }
        if (obj2 instanceof I) {
            return f((I) obj2, n10);
        }
        if (!(obj2 instanceof Z)) {
            return true;
        }
        Z z10 = (Z) obj2;
        if (z10.e()) {
            Object[] objArr = z10.f24576b;
            long[] jArr = z10.f24575a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i10 = 0;
                while (true) {
                    long j10 = jArr[i10];
                    if ((((~j10) << 7) & j10 & -9187201950435737472L) != -9187201950435737472L) {
                        int i11 = 8 - ((~(i10 - length)) >>> 31);
                        for (int i12 = 0; i12 < i11; i12++) {
                            if ((255 & j10) < 128) {
                                Object obj3 = objArr[(i10 << 3) + i12];
                                if (!(obj3 instanceof I) || f((I) obj3, n10)) {
                                    return true;
                                }
                            }
                            j10 >>= 8;
                        }
                        if (i11 != 8) {
                            break;
                        }
                    }
                    if (i10 == length) {
                        break;
                    }
                    i10++;
                }
            }
        }
        return false;
    }

    public final void v(I<?> i10, Object obj) {
        N<I<?>, Object> n10 = this.f13789g;
        if (n10 == null) {
            n10 = new N<>(0, 1, (DefaultConstructorMarker) null);
            this.f13789g = n10;
        }
        n10.s(i10, obj);
    }

    public final boolean w(Object obj) {
        if (o()) {
            return false;
        }
        K<Object> k10 = this.f13788f;
        if (k10 == null) {
            k10 = new K<>(0, 1, (DefaultConstructorMarker) null);
            this.f13788f = k10;
        }
        return k10.p(obj, this.f13787e, -1) == this.f13787e;
    }

    public final void x() {
        N0 n02 = this.f13784b;
        if (n02 != null) {
            n02.e(this);
        }
        this.f13784b = null;
        this.f13788f = null;
        this.f13789g = null;
    }

    public final void y() {
        K<Object> k10;
        N0 n02 = this.f13784b;
        if (n02 != null && (k10 = this.f13788f) != null) {
            F(true);
            try {
                Object[] objArr = k10.f24552b;
                int[] iArr = k10.f24553c;
                long[] jArr = k10.f24551a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i10 = 0;
                    while (true) {
                        long j10 = jArr[i10];
                        if ((((~j10) << 7) & j10 & -9187201950435737472L) != -9187201950435737472L) {
                            int i11 = 8 - ((~(i10 - length)) >>> 31);
                            for (int i12 = 0; i12 < i11; i12++) {
                                if ((255 & j10) < 128) {
                                    int i13 = (i10 << 3) + i12;
                                    Object obj = objArr[i13];
                                    int i14 = iArr[i13];
                                    n02.a(obj);
                                }
                                j10 >>= 8;
                            }
                            if (i11 != 8) {
                                break;
                            }
                        }
                        if (i10 == length) {
                            break;
                        }
                        i10++;
                    }
                }
            } finally {
                F(false);
            }
        }
    }

    public final void z() {
        G(true);
    }
}
