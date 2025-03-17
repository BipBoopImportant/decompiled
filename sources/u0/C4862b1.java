package U0;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b!\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u0004\u0018\u00010\u0001*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000b\u001a\u0004\u0018\u00010\u0001*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u001d\u0010\f\u001a\u0004\u0018\u00010\u0001*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010\nJ\u0015\u0010\r\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0012\u0010\u000eJ\u0017\u0010\u0013\u001a\u0004\u0018\u00010\u00012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0015\u0010\u000eJ\u0015\u0010\u0016\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0016\u0010\u000eJ\u0015\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0017\u0010\u0011J\u0017\u0010\u0018\u001a\u0004\u0018\u00010\u00012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0018\u0010\u0014J\u0017\u0010\u0019\u001a\u0004\u0018\u00010\u00012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0019\u0010\u0014J\u0015\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u001a\u0010\u0011J\u0015\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u001b\u0010\u0011J\u0017\u0010\u001c\u001a\u0004\u0018\u00010\u00012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u001c\u0010\u0014J\u001f\u0010\u001e\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b \u0010!J\r\u0010#\u001a\u00020\"¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\"¢\u0006\u0004\b%\u0010$J\r\u0010&\u001a\u00020\"¢\u0006\u0004\b&\u0010$J\r\u0010'\u001a\u00020\"¢\u0006\u0004\b'\u0010$J\r\u0010(\u001a\u00020\"¢\u0006\u0004\b(\u0010$J\r\u0010)\u001a\u00020\u0007¢\u0006\u0004\b)\u0010*J\r\u0010+\u001a\u00020\"¢\u0006\u0004\b+\u0010$J\u0015\u0010,\u001a\u00020\"2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b,\u0010-J\u0015\u0010.\u001a\u00020\"2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b.\u0010-J\r\u0010/\u001a\u00020\"¢\u0006\u0004\b/\u0010$J\u0013\u00102\u001a\b\u0012\u0004\u0012\u00020100¢\u0006\u0004\b2\u00103J\u000f\u00105\u001a\u000204H\u0016¢\u0006\u0004\b5\u00106J\u0017\u00108\u001a\u0002072\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b8\u00109R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0004¢\u0006\f\n\u0004\b8\u0010:\u001a\u0004\b;\u0010<R\u0014\u0010>\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010=R\u0014\u0010@\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010?R\u001c\u0010C\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010A8\u0002X\u0004¢\u0006\u0006\n\u0004\b&\u0010BR\u0014\u0010D\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010?R6\u0010I\u001a\"\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020F\u0018\u00010Ej\u0010\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020F\u0018\u0001`G8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b%\u0010HR$\u0010N\u001a\u00020\u000f2\u0006\u0010J\u001a\u00020\u000f8\u0006@BX\u000e¢\u0006\f\n\u0004\b/\u0010K\u001a\u0004\bL\u0010MR$\u0010P\u001a\u00020\u00072\u0006\u0010J\u001a\u00020\u00078\u0006@BX\u000e¢\u0006\f\n\u0004\b2\u0010?\u001a\u0004\bO\u0010*R$\u0010R\u001a\u00020\u00072\u0006\u0010J\u001a\u00020\u00078\u0006@BX\u000e¢\u0006\f\n\u0004\bL\u0010?\u001a\u0004\bQ\u0010*R$\u0010T\u001a\u00020\u00072\u0006\u0010J\u001a\u00020\u00078\u0006@BX\u000e¢\u0006\f\n\u0004\bQ\u0010?\u001a\u0004\bS\u0010*R\u0014\u0010W\u001a\u00020U8\u0002X\u0004¢\u0006\u0006\n\u0004\bO\u0010VR\u0016\u0010Y\u001a\u00020\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bX\u0010?R\u0016\u0010[\u001a\u00020\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bZ\u0010?R\u0016\u0010]\u001a\u00020\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\\\u0010?R$\u0010`\u001a\u00020\u000f2\u0006\u0010J\u001a\u00020\u000f8\u0006@BX\u000e¢\u0006\f\n\u0004\b^\u0010K\u001a\u0004\b_\u0010MR\u0011\u0010b\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\ba\u0010*R\u0011\u0010c\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b?\u0010MR\u0011\u0010e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\bd\u0010MR\u0011\u0010g\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\bf\u0010MR\u0011\u0010i\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bh\u0010*R\u0011\u0010j\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bZ\u0010*R\u0011\u0010k\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\\\u0010*R\u0011\u0010m\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bl\u0010*R\u0011\u0010o\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\bn\u0010MR\u0013\u0010p\u001a\u0004\u0018\u00010\u00018F¢\u0006\u0006\u001a\u0004\b^\u0010!R\u0013\u0010q\u001a\u0004\u0018\u00010\u00018F¢\u0006\u0006\u001a\u0004\bX\u0010!R\u0011\u0010s\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\br\u0010*R\u0011\u0010u\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bt\u0010*¨\u0006v"}, d2 = {"LU0/b1;", "", "LU0/c1;", "table", "<init>", "(LU0/c1;)V", "", "", "index", "M", "([II)Ljava/lang/Object;", "b", "O", "P", "(I)I", "", "J", "(I)Z", "N", "L", "(I)Ljava/lang/Object;", "E", "C", "G", "D", "z", "F", "e", "A", "group", "B", "(II)Ljava/lang/Object;", "K", "()Ljava/lang/Object;", "LXH/N;", "c", "()V", "f", "d", "U", "V", "S", "()I", "T", "Q", "(I)V", "R", "g", "", "LU0/b0;", "h", "()Ljava/util/List;", "", "toString", "()Ljava/lang/String;", "LU0/d;", "a", "(I)LU0/d;", "LU0/c1;", "y", "()LU0/c1;", "[I", "groups", "I", "groupsSize", "", "[Ljava/lang/Object;", "slots", "slotsSize", "Ljava/util/HashMap;", "LU0/V;", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "sourceInformationMap", "<set-?>", "Z", "i", "()Z", "closed", "k", "currentGroup", "j", "currentEnd", "u", "parent", "LU0/W;", "LU0/W;", "currentSlotStack", "l", "emptyCount", "m", "currentSlot", "n", "currentSlotEnd", "o", "r", "hadNext", "x", "size", "isNode", "H", "isGroupEnd", "t", "inEmpty", "p", "groupSize", "groupEnd", "groupKey", "q", "groupSlotIndex", "s", "hasObjectKey", "groupObjectKey", "groupAux", "v", "parentNodes", "w", "remainingSlots", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: U0.b1  reason: case insensitive filesystem */
public final class C4862b1 {

    /* renamed from: a  reason: collision with root package name */
    private final C4865c1 f13914a;

    /* renamed from: b  reason: collision with root package name */
    private final int[] f13915b;

    /* renamed from: c  reason: collision with root package name */
    private final int f13916c;

    /* renamed from: d  reason: collision with root package name */
    private final Object[] f13917d;

    /* renamed from: e  reason: collision with root package name */
    private final int f13918e;

    /* renamed from: f  reason: collision with root package name */
    private HashMap<C4866d, V> f13919f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f13920g;

    /* renamed from: h  reason: collision with root package name */
    private int f13921h;

    /* renamed from: i  reason: collision with root package name */
    private int f13922i;

    /* renamed from: j  reason: collision with root package name */
    private int f13923j = -1;

    /* renamed from: k  reason: collision with root package name */
    private final W f13924k = new W();

    /* renamed from: l  reason: collision with root package name */
    private int f13925l;

    /* renamed from: m  reason: collision with root package name */
    private int f13926m;

    /* renamed from: n  reason: collision with root package name */
    private int f13927n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f13928o;

    public C4862b1(C4865c1 c1Var) {
        this.f13914a = c1Var;
        this.f13915b = c1Var.A();
        int B10 = c1Var.B();
        this.f13916c = B10;
        this.f13917d = c1Var.C();
        this.f13918e = c1Var.D();
        this.f13922i = B10;
    }

    private final Object M(int[] iArr, int i10) {
        return C4871e1.N(iArr, i10) ? this.f13917d[C4871e1.R(iArr, i10)] : C4889m.f14007a.a();
    }

    private final Object O(int[] iArr, int i10) {
        if (C4871e1.L(iArr, i10)) {
            return this.f13917d[C4871e1.S(iArr, i10)];
        }
        return null;
    }

    private final Object b(int[] iArr, int i10) {
        return C4871e1.J(iArr, i10) ? this.f13917d[C4871e1.B(iArr, i10)] : C4889m.f14007a.a();
    }

    public final Object A(int i10) {
        return B(this.f13921h, i10);
    }

    public final Object B(int i10, int i11) {
        int u10 = C4871e1.V(this.f13915b, i10);
        int i12 = i10 + 1;
        int i13 = u10 + i11;
        return i13 < (i12 < this.f13916c ? C4871e1.F(this.f13915b, i12) : this.f13918e) ? this.f13917d[i13] : C4889m.f14007a.a();
    }

    public final int C(int i10) {
        return C4871e1.O(this.f13915b, i10);
    }

    public final Object D(int i10) {
        return O(this.f13915b, i10);
    }

    public final int E(int i10) {
        return C4871e1.I(this.f13915b, i10);
    }

    public final boolean F(int i10) {
        return C4871e1.K(this.f13915b, i10);
    }

    public final boolean G(int i10) {
        return C4871e1.L(this.f13915b, i10);
    }

    public final boolean H() {
        return t() || this.f13921h == this.f13922i;
    }

    public final boolean I() {
        return C4871e1.N(this.f13915b, this.f13921h);
    }

    public final boolean J(int i10) {
        return C4871e1.N(this.f13915b, i10);
    }

    public final Object K() {
        int i10;
        if (this.f13925l > 0 || (i10 = this.f13926m) >= this.f13927n) {
            this.f13928o = false;
            return C4889m.f14007a.a();
        }
        this.f13928o = true;
        Object[] objArr = this.f13917d;
        this.f13926m = i10 + 1;
        return objArr[i10];
    }

    public final Object L(int i10) {
        if (C4871e1.N(this.f13915b, i10)) {
            return M(this.f13915b, i10);
        }
        return null;
    }

    public final int N(int i10) {
        return C4871e1.Q(this.f13915b, i10);
    }

    public final int P(int i10) {
        return C4871e1.T(this.f13915b, i10);
    }

    public final void Q(int i10) {
        if (!(this.f13925l == 0)) {
            C4895p.s("Cannot reposition while in an empty region");
        }
        this.f13921h = i10;
        int s10 = i10 < this.f13916c ? C4871e1.T(this.f13915b, i10) : -1;
        this.f13923j = s10;
        if (s10 < 0) {
            this.f13922i = this.f13916c;
        } else {
            this.f13922i = s10 + C4871e1.I(this.f13915b, s10);
        }
        this.f13926m = 0;
        this.f13927n = 0;
    }

    public final void R(int i10) {
        int h10 = C4871e1.I(this.f13915b, i10) + i10;
        int i11 = this.f13921h;
        if (!(i11 >= i10 && i11 <= h10)) {
            C4895p.s("Index " + i10 + " is not a parent of " + i11);
        }
        this.f13923j = i10;
        this.f13922i = h10;
        this.f13926m = 0;
        this.f13927n = 0;
    }

    public final int S() {
        int i10 = 1;
        if (!(this.f13925l == 0)) {
            C4895p.s("Cannot skip while in an empty region");
        }
        if (!C4871e1.N(this.f13915b, this.f13921h)) {
            i10 = C4871e1.Q(this.f13915b, this.f13921h);
        }
        int i11 = this.f13921h;
        this.f13921h = i11 + C4871e1.I(this.f13915b, i11);
        return i10;
    }

    public final void T() {
        if (!(this.f13925l == 0)) {
            C4895p.s("Cannot skip the enclosing group while in an empty region");
        }
        this.f13921h = this.f13922i;
        this.f13926m = 0;
        this.f13927n = 0;
    }

    public final void U() {
        V v10;
        if (this.f13925l <= 0) {
            int i10 = this.f13923j;
            int i11 = this.f13921h;
            if (!(C4871e1.T(this.f13915b, i11) == i10)) {
                C0.a("Invalid slot table detected");
            }
            HashMap<C4866d, V> hashMap = this.f13919f;
            if (!(hashMap == null || (v10 = hashMap.get(a(i10))) == null)) {
                v10.h(this.f13914a, i11);
            }
            W w10 = this.f13924k;
            int i12 = this.f13926m;
            int i13 = this.f13927n;
            if (i12 == 0 && i13 == 0) {
                w10.j(-1);
            } else {
                w10.j(i12);
            }
            this.f13923j = i11;
            this.f13922i = C4871e1.I(this.f13915b, i11) + i11;
            int i14 = i11 + 1;
            this.f13921h = i14;
            this.f13926m = C4871e1.V(this.f13915b, i11);
            this.f13927n = i11 >= this.f13916c - 1 ? this.f13918e : C4871e1.F(this.f13915b, i14);
        }
    }

    public final void V() {
        if (this.f13925l <= 0) {
            if (!C4871e1.N(this.f13915b, this.f13921h)) {
                C0.a("Expected a node group");
            }
            U();
        }
    }

    public final C4866d a(int i10) {
        ArrayList<C4866d> t10 = this.f13914a.t();
        int t11 = C4871e1.U(t10, i10, this.f13916c);
        if (t11 >= 0) {
            return t10.get(t11);
        }
        C4866d dVar = new C4866d(i10);
        t10.add(-(t11 + 1), dVar);
        return dVar;
    }

    public final void c() {
        this.f13925l++;
    }

    public final void d() {
        this.f13920g = true;
        this.f13914a.k(this, this.f13919f);
    }

    public final boolean e(int i10) {
        return C4871e1.D(this.f13915b, i10);
    }

    public final void f() {
        if (!(this.f13925l > 0)) {
            C0.a("Unbalanced begin/end empty");
        }
        this.f13925l--;
    }

    public final void g() {
        if (this.f13925l == 0) {
            if (!(this.f13921h == this.f13922i)) {
                C4895p.s("endGroup() not called at the end of a group");
            }
            int s10 = C4871e1.T(this.f13915b, this.f13923j);
            this.f13923j = s10;
            this.f13922i = s10 < 0 ? this.f13916c : C4871e1.I(this.f13915b, s10) + s10;
            int i10 = this.f13924k.i();
            if (i10 < 0) {
                this.f13926m = 0;
                this.f13927n = 0;
                return;
            }
            this.f13926m = i10;
            this.f13927n = s10 >= this.f13916c - 1 ? this.f13918e : C4871e1.F(this.f13915b, s10 + 1);
        }
    }

    public final List<C4861b0> h() {
        ArrayList arrayList = new ArrayList();
        if (this.f13925l > 0) {
            return arrayList;
        }
        int i10 = this.f13921h;
        int i11 = 0;
        while (i10 < this.f13922i) {
            arrayList.add(new C4861b0(C4871e1.O(this.f13915b, i10), O(this.f13915b, i10), i10, C4871e1.N(this.f13915b, i10) ? 1 : C4871e1.Q(this.f13915b, i10), i11));
            i10 += C4871e1.I(this.f13915b, i10);
            i11++;
        }
        return arrayList;
    }

    public final boolean i() {
        return this.f13920g;
    }

    public final int j() {
        return this.f13922i;
    }

    public final int k() {
        return this.f13921h;
    }

    public final Object l() {
        int i10 = this.f13921h;
        if (i10 < this.f13922i) {
            return b(this.f13915b, i10);
        }
        return 0;
    }

    public final int m() {
        return this.f13922i;
    }

    public final int n() {
        int i10 = this.f13921h;
        if (i10 < this.f13922i) {
            return C4871e1.O(this.f13915b, i10);
        }
        return 0;
    }

    public final Object o() {
        int i10 = this.f13921h;
        if (i10 < this.f13922i) {
            return O(this.f13915b, i10);
        }
        return null;
    }

    public final int p() {
        return C4871e1.I(this.f13915b, this.f13921h);
    }

    public final int q() {
        return this.f13926m - C4871e1.V(this.f13915b, this.f13923j);
    }

    public final boolean r() {
        return this.f13928o;
    }

    public final boolean s() {
        int i10 = this.f13921h;
        return i10 < this.f13922i && C4871e1.L(this.f13915b, i10);
    }

    public final boolean t() {
        return this.f13925l > 0;
    }

    public String toString() {
        return "SlotReader(current=" + this.f13921h + ", key=" + n() + ", parent=" + this.f13923j + ", end=" + this.f13922i + ')';
    }

    public final int u() {
        return this.f13923j;
    }

    public final int v() {
        int i10 = this.f13923j;
        if (i10 >= 0) {
            return C4871e1.Q(this.f13915b, i10);
        }
        return 0;
    }

    public final int w() {
        return this.f13927n - this.f13926m;
    }

    public final int x() {
        return this.f13916c;
    }

    public final C4865c1 y() {
        return this.f13914a;
    }

    public final Object z(int i10) {
        return b(this.f13915b, i10);
    }
}
