package U0;

import XH.C16807N;
import h1.C5410a;
import h1.b;
import j0.E;
import j0.F;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import oI.C17693a;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010(\n\u0002\b,\b\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\nJ\u0015\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\b¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\b¢\u0006\u0004\b\u0019\u0010\u001aJ?\u0010!\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u000b2&\u0010\u001f\u001a\"\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001cj\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u001d\u0018\u0001`\u001eH\u0000¢\u0006\u0004\b!\u0010\"J\u0001\u00101\u001a\u00020 2\u0006\u0010#\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u00062\u000e\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010(0'2\u0006\u0010*\u001a\u00020\u00062\u0016\u0010-\u001a\u0012\u0012\u0004\u0012\u00020\b0+j\b\u0012\u0004\u0012\u00020\b`,2&\u0010\u001f\u001a\"\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001cj\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u001d\u0018\u0001`\u001e2\u000e\u00100\u001a\n\u0012\u0004\u0012\u00020/\u0018\u00010.H\u0000¢\u0006\u0004\b1\u00102J\u0001\u00103\u001a\u00020 2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u00062\u000e\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010(0'2\u0006\u0010*\u001a\u00020\u00062\u0016\u0010-\u001a\u0012\u0012\u0004\u0012\u00020\b0+j\b\u0012\u0004\u0012\u00020\b`,2&\u0010\u001f\u001a\"\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001cj\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u001d\u0018\u0001`\u001e2\u000e\u00100\u001a\n\u0012\u0004\u0012\u00020/\u0018\u00010.H\u0000¢\u0006\u0004\b3\u00104J\r\u00105\u001a\u00020\u0015¢\u0006\u0004\b5\u00106J\u0017\u00108\u001a\u0004\u0018\u00010\u001d2\u0006\u00107\u001a\u00020\u0006¢\u0006\u0004\b8\u00109J\r\u0010:\u001a\u00020 ¢\u0006\u0004\b:\u0010\u0005J\r\u0010;\u001a\u00020 ¢\u0006\u0004\b;\u0010\u0005J!\u0010=\u001a\u0004\u0018\u00010(2\u0006\u00107\u001a\u00020\u00062\u0006\u0010<\u001a\u00020\u0006H\u0000¢\u0006\u0004\b=\u0010>J\u0016\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00030?H\u0002¢\u0006\u0004\b@\u0010AR$\u0010%\u001a\u00020$2\u0006\u0010B\u001a\u00020$8\u0006@BX\u000e¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR$\u0010&\u001a\u00020\u00062\u0006\u0010B\u001a\u00020\u00068\u0006@BX\u000e¢\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\bG\u0010HR4\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010(0'2\u000e\u0010B\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010(0'8\u0006@BX\u000e¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR$\u0010*\u001a\u00020\u00062\u0006\u0010B\u001a\u00020\u00068\u0006@BX\u000e¢\u0006\f\n\u0004\bM\u0010\f\u001a\u0004\bN\u0010HR\u0016\u0010P\u001a\u00020\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bO\u0010\fR$\u0010#\u001a\u00020\u00152\u0006\u0010B\u001a\u00020\u00158\u0000@BX\u000e¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bS\u00106R\"\u0010X\u001a\u00020\u00068\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\bT\u0010\f\u001a\u0004\bU\u0010H\"\u0004\bV\u0010WR2\u0010-\u001a\u0012\u0012\u0004\u0012\u00020\b0+j\b\u0012\u0004\u0012\u00020\b`,8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^RB\u0010\u001f\u001a\"\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001cj\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u001d\u0018\u0001`\u001e8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010_\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR*\u00100\u001a\n\u0012\u0004\u0012\u00020/\u0018\u00010.8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\bd\u0010e\u001a\u0004\bf\u0010g\"\u0004\bh\u0010iR\u0014\u0010j\u001a\u00020\u00158VX\u0004¢\u0006\u0006\u001a\u0004\bj\u00106¨\u0006k"}, d2 = {"LU0/c1;", "Lh1/a;", "", "Lh1/b;", "<init>", "()V", "", "index", "LU0/d;", "P", "(I)LU0/d;", "LU0/b1;", "I", "()LU0/b1;", "LU0/f1;", "J", "()LU0/f1;", "b", "anchor", "i", "(LU0/d;)I", "", "K", "(LU0/d;)Z", "groupIndex", "H", "(ILU0/d;)Z", "reader", "Ljava/util/HashMap;", "LU0/V;", "Lkotlin/collections/HashMap;", "sourceInformationMap", "LXH/N;", "k", "(LU0/b1;Ljava/util/HashMap;)V", "writer", "", "groups", "groupsSize", "", "", "slots", "slotsSize", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "anchors", "Lj0/E;", "Lj0/F;", "calledByMap", "m", "(LU0/f1;[II[Ljava/lang/Object;ILjava/util/ArrayList;Ljava/util/HashMap;Lj0/E;)V", "L", "([II[Ljava/lang/Object;ILjava/util/ArrayList;Ljava/util/HashMap;Lj0/E;)V", "s", "()Z", "group", "O", "(I)LU0/V;", "p", "q", "slotIndex", "M", "(II)Ljava/lang/Object;", "", "iterator", "()Ljava/util/Iterator;", "<set-?>", "a", "[I", "A", "()[I", "B", "()I", "c", "[Ljava/lang/Object;", "C", "()[Ljava/lang/Object;", "d", "D", "e", "readers", "f", "Z", "G", "g", "F", "setVersion$runtime_release", "(I)V", "version", "h", "Ljava/util/ArrayList;", "t", "()Ljava/util/ArrayList;", "setAnchors$runtime_release", "(Ljava/util/ArrayList;)V", "Ljava/util/HashMap;", "E", "()Ljava/util/HashMap;", "setSourceInformationMap$runtime_release", "(Ljava/util/HashMap;)V", "j", "Lj0/E;", "x", "()Lj0/E;", "setCalledByMap$runtime_release", "(Lj0/E;)V", "isEmpty", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: U0.c1  reason: case insensitive filesystem */
public final class C4865c1 implements C5410a, Iterable<b>, C17693a {

    /* renamed from: a  reason: collision with root package name */
    private int[] f13935a = new int[0];

    /* renamed from: b  reason: collision with root package name */
    private int f13936b;

    /* renamed from: c  reason: collision with root package name */
    private Object[] f13937c = new Object[0];

    /* renamed from: d  reason: collision with root package name */
    private int f13938d;

    /* renamed from: e  reason: collision with root package name */
    private int f13939e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f13940f;

    /* renamed from: g  reason: collision with root package name */
    private int f13941g;

    /* renamed from: h  reason: collision with root package name */
    private ArrayList<C4866d> f13942h = new ArrayList<>();

    /* renamed from: i  reason: collision with root package name */
    private HashMap<C4866d, V> f13943i;

    /* renamed from: j  reason: collision with root package name */
    private E<F> f13944j;

    private final C4866d P(int i10) {
        int i11;
        if (this.f13940f) {
            C4895p.s("use active SlotWriter to crate an anchor for location instead");
        }
        if (i10 < 0 || i10 >= (i11 = this.f13936b)) {
            return null;
        }
        return C4871e1.G(this.f13942h, i10, i11);
    }

    public final int[] A() {
        return this.f13935a;
    }

    public final int B() {
        return this.f13936b;
    }

    public final Object[] C() {
        return this.f13937c;
    }

    public final int D() {
        return this.f13938d;
    }

    public final HashMap<C4866d, V> E() {
        return this.f13943i;
    }

    public final int F() {
        return this.f13941g;
    }

    public final boolean G() {
        return this.f13940f;
    }

    public final boolean H(int i10, C4866d dVar) {
        if (this.f13940f) {
            C4895p.s("Writer is active");
        }
        if (!(i10 >= 0 && i10 < this.f13936b)) {
            C4895p.s("Invalid group index");
        }
        if (K(dVar)) {
            int h10 = C4871e1.I(this.f13935a, i10) + i10;
            int a10 = dVar.a();
            if (i10 <= a10 && a10 < h10) {
                return true;
            }
        }
        return false;
    }

    public final C4862b1 I() {
        if (!this.f13940f) {
            this.f13939e++;
            return new C4862b1(this);
        }
        throw new IllegalStateException("Cannot read while a writer is pending");
    }

    public final C4874f1 J() {
        if (this.f13940f) {
            C4895p.s("Cannot start a writer when another writer is pending");
        }
        if (!(this.f13939e <= 0)) {
            C4895p.s("Cannot start a writer when a reader is pending");
        }
        this.f13940f = true;
        this.f13941g++;
        return new C4874f1(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = U0.C4871e1.t(r3.f13942h, r4.a(), r3.f13936b);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean K(U0.C4866d r4) {
        /*
            r3 = this;
            boolean r0 = r4.b()
            if (r0 == 0) goto L_0x0022
            java.util.ArrayList<U0.d> r0 = r3.f13942h
            int r1 = r4.a()
            int r2 = r3.f13936b
            int r0 = U0.C4871e1.U(r0, r1, r2)
            if (r0 < 0) goto L_0x0022
            java.util.ArrayList<U0.d> r1 = r3.f13942h
            java.lang.Object r0 = r1.get(r0)
            boolean r4 = kotlin.jvm.internal.C17542s.e(r0, r4)
            if (r4 == 0) goto L_0x0022
            r4 = 1
            goto L_0x0023
        L_0x0022:
            r4 = 0
        L_0x0023:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: U0.C4865c1.K(U0.d):boolean");
    }

    public final void L(int[] iArr, int i10, Object[] objArr, int i11, ArrayList<C4866d> arrayList, HashMap<C4866d, V> hashMap, E<F> e10) {
        this.f13935a = iArr;
        this.f13936b = i10;
        this.f13937c = objArr;
        this.f13938d = i11;
        this.f13942h = arrayList;
        this.f13943i = hashMap;
        this.f13944j = e10;
    }

    public final Object M(int i10, int i11) {
        int u10 = C4871e1.V(this.f13935a, i10);
        int i12 = i10 + 1;
        return (i11 < 0 || i11 >= (i12 < this.f13936b ? C4871e1.F(this.f13935a, i12) : this.f13937c.length) - u10) ? C4889m.f14007a.a() : this.f13937c[u10 + i11];
    }

    public final V O(int i10) {
        C4866d P10;
        HashMap<C4866d, V> hashMap = this.f13943i;
        if (hashMap == null || (P10 = P(i10)) == null) {
            return null;
        }
        return hashMap.get(P10);
    }

    public final C4866d b(int i10) {
        if (this.f13940f) {
            C4895p.s("use active SlotWriter to create an anchor location instead");
        }
        boolean z10 = false;
        if (i10 >= 0 && i10 < this.f13936b) {
            z10 = true;
        }
        if (!z10) {
            C0.a("Parameter index is out of range");
        }
        ArrayList<C4866d> arrayList = this.f13942h;
        int t10 = C4871e1.U(arrayList, i10, this.f13936b);
        if (t10 >= 0) {
            return arrayList.get(t10);
        }
        C4866d dVar = new C4866d(i10);
        arrayList.add(-(t10 + 1), dVar);
        return dVar;
    }

    public final int i(C4866d dVar) {
        if (this.f13940f) {
            C4895p.s("Use active SlotWriter to determine anchor location instead");
        }
        if (!dVar.b()) {
            C0.a("Anchor refers to a group that was removed");
        }
        return dVar.a();
    }

    public boolean isEmpty() {
        return this.f13936b == 0;
    }

    public Iterator<b> iterator() {
        return new T(this, 0, this.f13936b);
    }

    public final void k(C4862b1 b1Var, HashMap<C4866d, V> hashMap) {
        if (!(b1Var.y() == this && this.f13939e > 0)) {
            C4895p.s("Unexpected reader close()");
        }
        this.f13939e--;
        if (hashMap != null) {
            synchronized (this) {
                try {
                    HashMap<C4866d, V> hashMap2 = this.f13943i;
                    if (hashMap2 != null) {
                        hashMap2.putAll(hashMap);
                    } else {
                        this.f13943i = hashMap;
                    }
                    C16807N n10 = C16807N.f139792a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final void m(C4874f1 f1Var, int[] iArr, int i10, Object[] objArr, int i11, ArrayList<C4866d> arrayList, HashMap<C4866d, V> hashMap, E<F> e10) {
        if (!(f1Var.h0() == this && this.f13940f)) {
            C0.a("Unexpected writer close()");
        }
        this.f13940f = false;
        L(iArr, i10, objArr, i11, arrayList, hashMap, e10);
    }

    public final void p() {
        this.f13944j = new E<>(0, 1, (DefaultConstructorMarker) null);
    }

    public final void q() {
        this.f13943i = new HashMap<>();
    }

    public final boolean s() {
        return this.f13936b > 0 && C4871e1.D(this.f13935a, 0);
    }

    public final ArrayList<C4866d> t() {
        return this.f13942h;
    }

    public final E<F> x() {
        return this.f13944j;
    }
}
