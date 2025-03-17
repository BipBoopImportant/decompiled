package V0;

import U0.C0;
import U0.C4872f;
import U0.C4874f1;
import U0.S0;
import XH.C16814e;
import YH.C16870n;
import java.util.Arrays;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mI.C17604b;
import tI.C17978n;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0000\u0018\u0000 I2\u00020\u0001:\u0003037B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u000fJ\u001e\u0010\u0017\u001a\u00020\u00042\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u0016H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u000fJ\r\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u0018¢\u0006\u0004\b\u001b\u0010\u001aJ\r\u0010\u001c\u001a\u00020\t¢\u0006\u0004\b\u001c\u0010\u0003J\u0017\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010 \u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u0010¢\u0006\u0004\b \u0010\u001fJ\u0015\u0010\"\u001a\u00020\t2\u0006\u0010!\u001a\u00020\u0000¢\u0006\u0004\b\"\u0010#J)\u0010*\u001a\u00020\t2\n\u0010%\u001a\u0006\u0012\u0002\b\u00030$2\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+J\u000f\u0010-\u001a\u00020,H\u0017¢\u0006\u0004\b-\u0010.R\u001e\u00102\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100/8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00105\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00109\u001a\u0002068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u0010;\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b:\u00104R\u001e\u0010?\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010<0/8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010A\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b@\u00104R\u0016\u0010C\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bB\u00104R\u0016\u0010E\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bD\u00104R\u0011\u0010H\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\bF\u0010G\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006J"}, d2 = {"LV0/g;", "LV0/h;", "<init>", "()V", "", "currentSize", "requiredSize", "o", "(II)I", "LXH/N;", "p", "(I)V", "q", "paramCount", "n", "(I)I", "LV0/d;", "v", "()LV0/d;", "LV0/d$q;", "parameter", "z", "LV0/d$t;", "A", "", "t", "()Z", "u", "m", "operation", "y", "(LV0/d;)V", "x", "other", "w", "(LV0/g;)V", "LU0/f;", "applier", "LU0/f1;", "slots", "LU0/S0;", "rememberManager", "r", "(LU0/f;LU0/f1;LU0/S0;)V", "", "toString", "()Ljava/lang/String;", "", "a", "[LV0/d;", "opCodes", "b", "I", "opCodesSize", "", "c", "[I", "intArgs", "d", "intArgsSize", "", "e", "[Ljava/lang/Object;", "objectArgs", "f", "objectArgsSize", "g", "pushedIntMask", "h", "pushedObjectMask", "s", "()I", "size", "i", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class g extends h {

    /* renamed from: i  reason: collision with root package name */
    public static final a f14542i = new a((DefaultConstructorMarker) null);

    /* renamed from: j  reason: collision with root package name */
    public static final int f14543j = 8;
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public d[] f14544a = new d[16];
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public int f14545b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public int[] f14546c = new int[16];

    /* renamed from: d  reason: collision with root package name */
    private int f14547d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public Object[] f14548e = new Object[16];

    /* renamed from: f  reason: collision with root package name */
    private int f14549f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public int f14550g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public int f14551h;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"LV0/g$a;", "", "<init>", "()V", "", "InitialCapacity", "I", "MaxResizeAmount", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\u000e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\f2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\t8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010R\u0016\u0010\u0012\u001a\u00020\t8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0010R\u0016\u0010\u0014\u001a\u00020\t8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0010R\u0011\u0010\u0017\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0016\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0018"}, d2 = {"LV0/g$b;", "LV0/e;", "<init>", "(LV0/g;)V", "", "d", "()Z", "LV0/d$q;", "parameter", "", "b", "(I)I", "T", "LV0/d$t;", "a", "(I)Ljava/lang/Object;", "I", "opIdx", "intIdx", "c", "objIdx", "LV0/d;", "()LV0/d;", "operation", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class b implements e {

        /* renamed from: a  reason: collision with root package name */
        private int f14552a;

        /* renamed from: b  reason: collision with root package name */
        private int f14553b;

        /* renamed from: c  reason: collision with root package name */
        private int f14554c;

        public b() {
        }

        public <T> T a(int i10) {
            return g.this.f14548e[this.f14554c + i10];
        }

        public int b(int i10) {
            return g.this.f14546c[this.f14553b + i10];
        }

        public final d c() {
            d dVar = g.this.f14544a[this.f14552a];
            C17542s.g(dVar);
            return dVar;
        }

        public final boolean d() {
            if (this.f14552a >= g.this.f14545b) {
                return false;
            }
            d c10 = c();
            this.f14553b += c10.b();
            this.f14554c += c10.d();
            int i10 = this.f14552a + 1;
            this.f14552a = i10;
            return i10 < g.this.f14545b;
        }
    }

    @C17604b
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ,\u0010\u000f\u001a\u00020\n\"\u0004\b\u0000\u0010\r2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\t\u001a\u00028\u0000ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0014\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013\u0001\u0003\u0001\u00020\u0002\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0015"}, d2 = {"LV0/g$c;", "", "LV0/g;", "stack", "a", "(LV0/g;)LV0/g;", "LV0/d$q;", "parameter", "", "value", "LXH/N;", "c", "(LV0/g;II)V", "T", "LV0/d$t;", "d", "(LV0/g;ILjava/lang/Object;)V", "LV0/d;", "b", "(LV0/g;)LV0/d;", "operation", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c {
        public static g a(g gVar) {
            return gVar;
        }

        public static final d b(g gVar) {
            return gVar.v();
        }

        public static final void c(g gVar, int i10, int i11) {
            boolean z10 = true;
            int i12 = 1 << i10;
            if ((gVar.f14550g & i12) != 0) {
                z10 = false;
            }
            if (!z10) {
                C0.b("Already pushed argument " + b(gVar).e(i10));
            }
            gVar.f14550g = gVar.f14550g | i12;
            gVar.f14546c[gVar.z(i10)] = i11;
        }

        public static final <T> void d(g gVar, int i10, T t10) {
            boolean z10 = true;
            int i11 = 1 << i10;
            if ((gVar.f14551h & i11) != 0) {
                z10 = false;
            }
            if (!z10) {
                C0.b("Already pushed argument " + b(gVar).f(i10));
            }
            gVar.f14551h = gVar.f14551h | i11;
            gVar.f14548e[gVar.A(i10)] = t10;
        }
    }

    /* access modifiers changed from: private */
    public final int A(int i10) {
        return (this.f14549f - v().d()) + i10;
    }

    /* access modifiers changed from: private */
    public final int n(int i10) {
        if (i10 == 0) {
            return 0;
        }
        return -1 >>> (32 - i10);
    }

    private final int o(int i10, int i11) {
        return C17978n.e(i10 + C17978n.i(i10, 1024), i11);
    }

    private final void p(int i10) {
        int[] iArr = this.f14546c;
        int length = iArr.length;
        if (i10 > length) {
            int[] copyOf = Arrays.copyOf(iArr, o(length, i10));
            C17542s.i(copyOf, "copyOf(this, newSize)");
            this.f14546c = copyOf;
        }
    }

    private final void q(int i10) {
        Object[] objArr = this.f14548e;
        int length = objArr.length;
        if (i10 > length) {
            Object[] copyOf = Arrays.copyOf(objArr, o(length, i10));
            C17542s.i(copyOf, "copyOf(this, newSize)");
            this.f14548e = copyOf;
        }
    }

    /* access modifiers changed from: private */
    public final d v() {
        d dVar = this.f14544a[this.f14545b - 1];
        C17542s.g(dVar);
        return dVar;
    }

    /* access modifiers changed from: private */
    public final int z(int i10) {
        return (this.f14547d - v().b()) + i10;
    }

    public final void m() {
        this.f14545b = 0;
        this.f14547d = 0;
        C16870n.x(this.f14548e, null, 0, this.f14549f);
        this.f14549f = 0;
    }

    public final void r(C4872f<?> fVar, C4874f1 f1Var, S0 s02) {
        if (u()) {
            b bVar = new b();
            do {
                bVar.c().a(bVar, fVar, f1Var, s02);
            } while (bVar.d());
        }
        m();
    }

    public final int s() {
        return this.f14545b;
    }

    public final boolean t() {
        return s() == 0;
    }

    @C16814e
    public String toString() {
        return super.toString();
    }

    public final boolean u() {
        return s() != 0;
    }

    public final void w(g gVar) {
        if (!t()) {
            d[] dVarArr = this.f14544a;
            int i10 = this.f14545b - 1;
            this.f14545b = i10;
            d dVar = dVarArr[i10];
            C17542s.g(dVar);
            this.f14544a[this.f14545b] = null;
            gVar.y(dVar);
            int i11 = this.f14549f;
            int i12 = gVar.f14549f;
            int d10 = dVar.d();
            for (int i13 = 0; i13 < d10; i13++) {
                i12--;
                i11--;
                Object[] objArr = gVar.f14548e;
                Object[] objArr2 = this.f14548e;
                objArr[i12] = objArr2[i11];
                objArr2[i11] = null;
            }
            int i14 = this.f14547d;
            int i15 = gVar.f14547d;
            int b10 = dVar.b();
            for (int i16 = 0; i16 < b10; i16++) {
                i15--;
                i14--;
                int[] iArr = gVar.f14546c;
                int[] iArr2 = this.f14546c;
                iArr[i15] = iArr2[i14];
                iArr2[i14] = 0;
            }
            this.f14549f -= dVar.d();
            this.f14547d -= dVar.b();
            return;
        }
        throw new NoSuchElementException("Cannot pop(), because the stack is empty.");
    }

    public final void x(d dVar) {
        if (!(dVar.b() == 0 && dVar.d() == 0)) {
            C0.a("Cannot push " + dVar + " without arguments because it expects " + dVar.b() + " ints and " + dVar.d() + " objects.");
        }
        y(dVar);
    }

    public final void y(d dVar) {
        this.f14550g = 0;
        this.f14551h = 0;
        int i10 = this.f14545b;
        if (i10 == this.f14544a.length) {
            Object[] copyOf = Arrays.copyOf(this.f14544a, this.f14545b + C17978n.i(i10, 1024));
            C17542s.i(copyOf, "copyOf(this, newSize)");
            this.f14544a = (d[]) copyOf;
        }
        p(this.f14547d + dVar.b());
        q(this.f14549f + dVar.d());
        d[] dVarArr = this.f14544a;
        int i11 = this.f14545b;
        this.f14545b = i11 + 1;
        dVarArr[i11] = dVar;
        this.f14547d += dVar.b();
        this.f14549f += dVar.d();
    }
}
