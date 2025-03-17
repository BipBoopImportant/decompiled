package U0;

import XH.C16824o;
import XH.C16825p;
import j0.E;
import j0.N;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\t\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0005¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0005¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001a\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0005¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u0005¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010 \u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b \u0010!J\u0015\u0010\"\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b\"\u0010!J\u0015\u0010#\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b#\u0010!R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b&\u0010(\u001a\u0004\b)\u0010*R\"\u0010.\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b+\u0010(\u001a\u0004\b$\u0010*\"\u0004\b,\u0010-R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010%R\u001a\u00103\u001a\b\u0012\u0004\u0012\u000201008\u0002X\u0004¢\u0006\u0006\n\u0004\b)\u00102R-\u00108\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0003048FX\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b+\u00107R\u0017\u0010:\u001a\b\u0012\u0004\u0012\u00020\u0003098F¢\u0006\u0006\u001a\u0004\b5\u0010'\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006;"}, d2 = {"LU0/A0;", "", "", "LU0/b0;", "keyInfos", "", "startIndex", "<init>", "(Ljava/util/List;I)V", "key", "dataKey", "d", "(ILjava/lang/Object;)LU0/b0;", "keyInfo", "", "h", "(LU0/b0;)Z", "from", "to", "LXH/N;", "k", "(II)V", "count", "j", "(III)V", "insertIndex", "i", "(LU0/b0;I)V", "group", "newCount", "n", "(II)Z", "m", "(LU0/b0;)I", "g", "o", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "I", "e", "()I", "c", "l", "(I)V", "groupIndex", "usedKeys", "Lj0/E;", "LU0/S;", "Lj0/E;", "groupInfos", "LU0/q0;", "f", "LXH/o;", "()Lj0/N;", "keyMap", "", "used", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class A0 {

    /* renamed from: a  reason: collision with root package name */
    private final List<C4861b0> f13731a;

    /* renamed from: b  reason: collision with root package name */
    private final int f13732b;

    /* renamed from: c  reason: collision with root package name */
    private int f13733c;

    /* renamed from: d  reason: collision with root package name */
    private final List<C4861b0> f13734d;

    /* renamed from: e  reason: collision with root package name */
    private final E<S> f13735e;

    /* renamed from: f  reason: collision with root package name */
    private final C16824o f13736f;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LU0/q0;", "", "LU0/b0;", "b", "()Lj0/N;"}, k = 3, mv = {1, 8, 0})
    static final class a extends C17544u implements C17631a<C4898q0<Object, C4861b0>> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ A0 f13737c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(A0 a02) {
            super(0);
            this.f13737c = a02;
        }

        public final N b() {
            N k10 = C4895p.K(this.f13737c.b().size());
            A0 a02 = this.f13737c;
            int size = a02.b().size();
            for (int i10 = 0; i10 < size; i10++) {
                C4861b0 b0Var = a02.b().get(i10);
                C4898q0.f(k10, C4895p.C(b0Var), b0Var);
            }
            return k10;
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            return C4898q0.a(b());
        }
    }

    public A0(List<C4861b0> list, int i10) {
        this.f13731a = list;
        this.f13732b = i10;
        if (!(i10 >= 0)) {
            C0.a("Invalid start index");
        }
        this.f13734d = new ArrayList();
        E<S> e10 = new E<>(0, 1, (DefaultConstructorMarker) null);
        int size = list.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            C4861b0 b0Var = this.f13731a.get(i12);
            e10.t(b0Var.b(), new S(i12, i11, b0Var.c()));
            i11 += b0Var.c();
        }
        this.f13735e = e10;
        this.f13736f = C16825p.b(new a(this));
    }

    public final int a() {
        return this.f13733c;
    }

    public final List<C4861b0> b() {
        return this.f13731a;
    }

    public final N c() {
        return ((C4898q0) this.f13736f.getValue()).h();
    }

    public final C4861b0 d(int i10, Object obj) {
        return (C4861b0) C4898q0.e(c(), obj != null ? new C4858a0(Integer.valueOf(i10), obj) : Integer.valueOf(i10));
    }

    public final int e() {
        return this.f13732b;
    }

    public final List<C4861b0> f() {
        return this.f13734d;
    }

    public final int g(C4861b0 b0Var) {
        S c10 = this.f13735e.c(b0Var.b());
        if (c10 != null) {
            return c10.b();
        }
        return -1;
    }

    public final boolean h(C4861b0 b0Var) {
        return this.f13734d.add(b0Var);
    }

    public final void i(C4861b0 b0Var, int i10) {
        this.f13735e.t(b0Var.b(), new S(-1, i10, 0));
    }

    public final void j(int i10, int i11, int i12) {
        int i13 = i10;
        int i14 = i11;
        char c10 = 7;
        long j10 = -9187201950435737472L;
        if (i13 > i14) {
            E<S> e10 = this.f13735e;
            Object[] objArr = e10.f24635c;
            long[] jArr = e10.f24633a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i15 = 0;
                while (true) {
                    long j11 = jArr[i15];
                    if ((((~j11) << 7) & j11 & j10) != j10) {
                        int i16 = 8 - ((~(i15 - length)) >>> 31);
                        for (int i17 = 0; i17 < i16; i17++) {
                            if ((j11 & 255) < 128) {
                                S s10 = (S) objArr[(i15 << 3) + i17];
                                int b10 = s10.b();
                                if (i13 <= b10 && b10 < i13 + i12) {
                                    s10.e((b10 - i13) + i14);
                                } else if (i14 <= b10 && b10 < i13) {
                                    s10.e(b10 + i12);
                                }
                            }
                            j11 >>= 8;
                        }
                        if (i16 != 8) {
                            return;
                        }
                    }
                    if (i15 != length) {
                        i15++;
                        j10 = -9187201950435737472L;
                    } else {
                        return;
                    }
                }
            }
        } else if (i14 > i13) {
            E<S> e11 = this.f13735e;
            Object[] objArr2 = e11.f24635c;
            long[] jArr2 = e11.f24633a;
            int length2 = jArr2.length - 2;
            if (length2 >= 0) {
                int i18 = 0;
                while (true) {
                    long j12 = jArr2[i18];
                    if ((((~j12) << c10) & j12 & -9187201950435737472L) != -9187201950435737472L) {
                        int i19 = 8 - ((~(i18 - length2)) >>> 31);
                        for (int i20 = 0; i20 < i19; i20++) {
                            if ((j12 & 255) < 128) {
                                S s11 = (S) objArr2[(i18 << 3) + i20];
                                int b11 = s11.b();
                                if (i13 <= b11 && b11 < i13 + i12) {
                                    s11.e((b11 - i13) + i14);
                                } else if (i13 + 1 <= b11 && b11 < i14) {
                                    s11.e(b11 - i12);
                                }
                            }
                            j12 >>= 8;
                        }
                        if (i19 != 8) {
                            return;
                        }
                    }
                    if (i18 != length2) {
                        i18++;
                        c10 = 7;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public final void k(int i10, int i11) {
        int i12 = i10;
        int i13 = i11;
        char c10 = 7;
        long j10 = -9187201950435737472L;
        if (i12 > i13) {
            E<S> e10 = this.f13735e;
            Object[] objArr = e10.f24635c;
            long[] jArr = e10.f24633a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i14 = 0;
                while (true) {
                    long j11 = jArr[i14];
                    if ((((~j11) << 7) & j11 & j10) != j10) {
                        int i15 = 8 - ((~(i14 - length)) >>> 31);
                        for (int i16 = 0; i16 < i15; i16++) {
                            if ((j11 & 255) < 128) {
                                S s10 = (S) objArr[(i14 << 3) + i16];
                                int c11 = s10.c();
                                if (c11 == i12) {
                                    s10.f(i13);
                                } else if (i13 <= c11 && c11 < i12) {
                                    s10.f(c11 + 1);
                                }
                            }
                            j11 >>= 8;
                        }
                        if (i15 != 8) {
                            return;
                        }
                    }
                    if (i14 != length) {
                        i14++;
                        j10 = -9187201950435737472L;
                    } else {
                        return;
                    }
                }
            }
        } else if (i13 > i12) {
            E<S> e11 = this.f13735e;
            Object[] objArr2 = e11.f24635c;
            long[] jArr2 = e11.f24633a;
            int length2 = jArr2.length - 2;
            if (length2 >= 0) {
                int i17 = 0;
                while (true) {
                    long j12 = jArr2[i17];
                    if ((((~j12) << c10) & j12 & -9187201950435737472L) != -9187201950435737472L) {
                        int i18 = 8 - ((~(i17 - length2)) >>> 31);
                        for (int i19 = 0; i19 < i18; i19++) {
                            if ((j12 & 255) < 128) {
                                S s11 = (S) objArr2[(i17 << 3) + i19];
                                int c12 = s11.c();
                                if (c12 == i12) {
                                    s11.f(i13);
                                } else if (i12 + 1 <= c12 && c12 < i13) {
                                    s11.f(c12 - 1);
                                }
                            }
                            j12 >>= 8;
                        }
                        if (i18 != 8) {
                            return;
                        }
                    }
                    if (i17 != length2) {
                        i17++;
                        c10 = 7;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public final void l(int i10) {
        this.f13733c = i10;
    }

    public final int m(C4861b0 b0Var) {
        S c10 = this.f13735e.c(b0Var.b());
        if (c10 != null) {
            return c10.c();
        }
        return -1;
    }

    public final boolean n(int i10, int i11) {
        int b10;
        int i12 = i11;
        S c10 = this.f13735e.c(i10);
        if (c10 == null) {
            return false;
        }
        int b11 = c10.b();
        int a10 = i12 - c10.a();
        c10.d(i12);
        if (a10 == 0) {
            return true;
        }
        E<S> e10 = this.f13735e;
        Object[] objArr = e10.f24635c;
        long[] jArr = e10.f24633a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i13 = 0;
        while (true) {
            long j10 = jArr[i13];
            if ((((~j10) << 7) & j10 & -9187201950435737472L) != -9187201950435737472L) {
                int i14 = 8 - ((~(i13 - length)) >>> 31);
                for (int i15 = 0; i15 < i14; i15++) {
                    if ((255 & j10) < 128) {
                        S s10 = (S) objArr[(i13 << 3) + i15];
                        if (s10.b() >= b11 && !C17542s.e(s10, c10) && (b10 = s10.b() + a10) >= 0) {
                            s10.e(b10);
                        }
                    }
                    j10 >>= 8;
                }
                if (i14 != 8) {
                    return true;
                }
            }
            if (i13 == length) {
                return true;
            }
            i13++;
        }
    }

    public final int o(C4861b0 b0Var) {
        S c10 = this.f13735e.c(b0Var.b());
        return c10 != null ? c10.a() : b0Var.c();
    }
}
