package U0;

import XH.C16807N;
import j0.N;
import j0.O;
import j0.a0;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000~\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0001\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002\u001a/\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u000f\u0010\f\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\r\u001a\u001b\u0010\u0011\u001a\u00020\t*\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001b\u0010\u0013\u001a\u00020\t*\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0013\u0010\u0012\u001a-\u0010\u0018\u001a\u00020\t*\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019\u001a3\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001d\"\u0004\b\u0000\u0010\u001a\"\b\b\u0001\u0010\u001b*\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u001a\u0010\u001e\u001a!\u0010\"\u001a\u00020\u0003*\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010!\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\"\u0010#\u001a!\u0010$\u001a\u00020\u0003*\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010!\u001a\u00020\u0003H\u0002¢\u0006\u0004\b$\u0010#\u001a3\u0010(\u001a\u00020\t*\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010!\u001a\u00020\u00032\u0006\u0010&\u001a\u00020%2\b\u0010'\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b(\u0010)\u001a+\u0010,\u001a\u0004\u0018\u00010 *\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010*\u001a\u00020\u00032\u0006\u0010+\u001a\u00020\u0003H\u0002¢\u0006\u0004\b,\u0010-\u001a#\u0010.\u001a\u0004\u0018\u00010 *\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010!\u001a\u00020\u0003H\u0002¢\u0006\u0004\b.\u0010/\u001a)\u00100\u001a\u00020\t*\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010*\u001a\u00020\u00032\u0006\u0010+\u001a\u00020\u0003H\u0002¢\u0006\u0004\b0\u00101\u001a/\u00102\u001a\b\u0012\u0004\u0012\u00020 0\u001f*\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010*\u001a\u00020\u00032\u0006\u0010+\u001a\u00020\u0003H\u0002¢\u0006\u0004\b2\u00103\u001a\u0013\u00104\u001a\u00020\u0003*\u00020\u0000H\u0002¢\u0006\u0004\b4\u00105\u001a\u0013\u00106\u001a\u00020\u0000*\u00020\u0003H\u0002¢\u0006\u0004\b6\u00107\u001a#\u0010<\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160;*\u0002082\u0006\u0010:\u001a\u000209H\u0002¢\u0006\u0004\b<\u0010=\u001a#\u0010@\u001a\u00020\u0003*\u00020>2\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010?\u001a\u00020\u0003H\u0002¢\u0006\u0004\b@\u0010A\u001a+\u0010E\u001a\u00020\u0003*\u00020>2\u0006\u0010B\u001a\u00020\u00032\u0006\u0010C\u001a\u00020\u00032\u0006\u0010D\u001a\u00020\u0003H\u0002¢\u0006\u0004\bE\u0010F\u001a\u0017\u0010H\u001a\u00020\t2\u0006\u0010G\u001a\u00020\u0000H\u0000¢\u0006\u0004\bH\u0010I\u001a\u0017\u0010L\u001a\u00020K2\u0006\u0010J\u001a\u00020\u0007H\u0000¢\u0006\u0004\bL\u0010M\u001a\u0017\u0010N\u001a\u00020\t2\u0006\u0010J\u001a\u00020\u0007H\u0000¢\u0006\u0004\bN\u0010O\" \u0010T\u001a\u00020\u00168\u0000X\u0004¢\u0006\u0012\n\u0004\bB\u0010P\u0012\u0004\bS\u0010\r\u001a\u0004\bQ\u0010R\" \u0010W\u001a\u00020\u00168\u0000X\u0004¢\u0006\u0012\n\u0004\bC\u0010P\u0012\u0004\bV\u0010\r\u001a\u0004\bU\u0010R\" \u0010[\u001a\u00020\u00168\u0000X\u0004¢\u0006\u0012\n\u0004\bX\u0010P\u0012\u0004\bZ\u0010\r\u001a\u0004\bY\u0010R\" \u0010_\u001a\u00020\u00168\u0000X\u0004¢\u0006\u0012\n\u0004\b\\\u0010P\u0012\u0004\b^\u0010\r\u001a\u0004\b]\u0010R\" \u0010c\u001a\u00020\u00168\u0000X\u0004¢\u0006\u0012\n\u0004\b`\u0010P\u0012\u0004\bb\u0010\r\u001a\u0004\ba\u0010R\" \u0010g\u001a\u00020\u00168\u0000X\u0004¢\u0006\u0012\n\u0004\bd\u0010P\u0012\u0004\bf\u0010\r\u001a\u0004\be\u0010R\"\u001a\u0010k\u001a\b\u0012\u0004\u0012\u00020 0h8\u0002X\u0004¢\u0006\u0006\n\u0004\bi\u0010j\"\u0018\u0010n\u001a\u00020\u0000*\u00020\u000e8@X\u0004¢\u0006\u0006\u001a\u0004\bl\u0010m\"\u0018\u0010n\u001a\u00020\u0000*\u00020>8@X\u0004¢\u0006\u0006\u001a\u0004\bo\u0010p\"\u0018\u0010t\u001a\u00020\u0016*\u00020q8BX\u0004¢\u0006\u0006\u001a\u0004\br\u0010s¨\u0006u"}, d2 = {"", "J", "()Z", "", "key", "dirty1", "dirty2", "", "info", "LXH/N;", "S", "(IIILjava/lang/String;)V", "R", "()V", "LU0/f1;", "LU0/S0;", "rememberManager", "M", "(LU0/f1;LU0/S0;)V", "u", "group", "index", "", "data", "N", "(LU0/f1;IILjava/lang/Object;)V", "K", "V", "initialCapacity", "LU0/q0;", "(I)Lj0/N;", "", "LU0/Y;", "location", "y", "(Ljava/util/List;I)I", "x", "LU0/L0;", "scope", "instance", "G", "(Ljava/util/List;ILU0/L0;Ljava/lang/Object;)V", "start", "end", "z", "(Ljava/util/List;II)LU0/Y;", "O", "(Ljava/util/List;I)LU0/Y;", "P", "(Ljava/util/List;II)V", "w", "(Ljava/util/List;II)Ljava/util/List;", "p", "(Z)I", "o", "(I)Z", "LU0/c1;", "LU0/d;", "anchor", "", "q", "(LU0/c1;LU0/d;)Ljava/util/List;", "LU0/b1;", "root", "v", "(LU0/b1;II)I", "a", "b", "common", "L", "(LU0/b1;III)I", "value", "Q", "(Z)V", "message", "", "t", "(Ljava/lang/String;)Ljava/lang/Void;", "s", "(Ljava/lang/String;)V", "Ljava/lang/Object;", "B", "()Ljava/lang/Object;", "getInvocation$annotations", "invocation", "D", "getProvider$annotations", "provider", "c", "A", "getCompositionLocalMap$annotations", "compositionLocalMap", "d", "getProviderValues", "getProviderValues$annotations", "providerValues", "e", "E", "getProviderMaps$annotations", "providerMaps", "f", "F", "getReference$annotations", "reference", "Ljava/util/Comparator;", "g", "Ljava/util/Comparator;", "InvalidationLocationAscending", "I", "(LU0/f1;)Z", "isAfterFirstChild", "H", "(LU0/b1;)Z", "LU0/b0;", "C", "(LU0/b0;)Ljava/lang/Object;", "joinedKey", "runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: U0.p  reason: case insensitive filesystem */
public final class C4895p {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f14086a = new C4905u0("provider");

    /* renamed from: b  reason: collision with root package name */
    private static final Object f14087b = new C4905u0("provider");

    /* renamed from: c  reason: collision with root package name */
    private static final Object f14088c = new C4905u0("compositionLocalMap");

    /* renamed from: d  reason: collision with root package name */
    private static final Object f14089d = new C4905u0("providerValues");

    /* renamed from: e  reason: collision with root package name */
    private static final Object f14090e = new C4905u0("providers");

    /* renamed from: f  reason: collision with root package name */
    private static final Object f14091f = new C4905u0("reference");
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final Comparator<Y> f14092g = new C4893o();

    public static final Object A() {
        return f14088c;
    }

    public static final Object B() {
        return f14086a;
    }

    /* access modifiers changed from: private */
    public static final Object C(C4861b0 b0Var) {
        return b0Var.d() != null ? new C4858a0(Integer.valueOf(b0Var.a()), b0Var.d()) : Integer.valueOf(b0Var.a());
    }

    public static final Object D() {
        return f14087b;
    }

    public static final Object E() {
        return f14090e;
    }

    public static final Object F() {
        return f14091f;
    }

    /* access modifiers changed from: private */
    public static final void G(List<Y> list, int i10, L0 l02, Object obj) {
        int y10 = y(list, i10);
        if (y10 < 0) {
            int i11 = -(y10 + 1);
            if (!(obj instanceof I)) {
                obj = null;
            }
            list.add(i11, new Y(l02, i10, obj));
            return;
        }
        Y y11 = list.get(y10);
        if (obj instanceof I) {
            Object a10 = y11.a();
            if (a10 == null) {
                y11.e(obj);
            } else if (a10 instanceof O) {
                ((O) a10).h(obj);
            } else {
                y11.e(a0.b(a10, obj));
            }
        } else {
            y11.e((Object) null);
        }
    }

    public static final boolean H(C4862b1 b1Var) {
        return b1Var.k() > b1Var.u() + 1;
    }

    public static final boolean I(C4874f1 f1Var) {
        return f1Var.c0() > f1Var.e0() + 1;
    }

    public static final boolean J() {
        return false;
    }

    /* access modifiers changed from: private */
    public static final <K, V> N<K, Object> K(int i10) {
        return C4898q0.b(new N(i10));
    }

    /* access modifiers changed from: private */
    public static final int L(C4862b1 b1Var, int i10, int i11, int i12) {
        if (i10 == i11) {
            return i10;
        }
        if (i10 == i12 || i11 == i12) {
            return i12;
        }
        if (b1Var.P(i10) == i11) {
            return i11;
        }
        if (b1Var.P(i11) == i10) {
            return i10;
        }
        if (b1Var.P(i10) == b1Var.P(i11)) {
            return b1Var.P(i10);
        }
        int v10 = v(b1Var, i10, i12);
        int v11 = v(b1Var, i11, i12);
        int i13 = v10 - v11;
        for (int i14 = 0; i14 < i13; i14++) {
            i10 = b1Var.P(i10);
        }
        int i15 = v11 - v10;
        for (int i16 = 0; i16 < i15; i16++) {
            i11 = b1Var.P(i11);
        }
        while (i10 != i11) {
            i10 = b1Var.P(i10);
            i11 = b1Var.P(i11);
        }
        return i10;
    }

    public static final void M(C4874f1 f1Var, S0 s02) {
        int i10;
        int c10 = f1Var.Q(f1Var.f13957b, f1Var.j0(f1Var.c0() + f1Var.m0(f1Var.c0())));
        for (int c11 = f1Var.Q(f1Var.f13957b, f1Var.j0(f1Var.c0())); c11 < c10; c11++) {
            Object obj = f1Var.f13958c[f1Var.R(c11)];
            int i11 = -1;
            if (obj instanceof C4885k) {
                s02.e((C4885k) obj, f1Var.g0() - c11, -1, -1);
            }
            if (obj instanceof U0) {
                int g02 = f1Var.g0() - c11;
                U0 u02 = (U0) obj;
                C4866d a10 = u02.a();
                if (a10 == null || !a10.b()) {
                    i10 = -1;
                } else {
                    i11 = f1Var.F(a10);
                    i10 = f1Var.g0() - f1Var.e1(i11);
                }
                s02.b(u02.b(), g02, i11, i10);
            }
            if (obj instanceof L0) {
                ((L0) obj).x();
            }
        }
        f1Var.O0();
    }

    private static final void N(C4874f1 f1Var, int i10, int i11, Object obj) {
        if (!(obj == f1Var.U0(i10, i11, C4889m.f14007a.a()))) {
            s("Slot table is out of sync");
        }
    }

    /* access modifiers changed from: private */
    public static final Y O(List<Y> list, int i10) {
        int y10 = y(list, i10);
        if (y10 >= 0) {
            return list.remove(y10);
        }
        return null;
    }

    /* access modifiers changed from: private */
    public static final void P(List<Y> list, int i10, int i11) {
        int x10 = x(list, i10);
        while (x10 < list.size() && list.get(x10).b() < i11) {
            list.remove(x10);
        }
    }

    public static final void Q(boolean z10) {
        if (!z10) {
            s("Check failed");
        }
    }

    public static final void R() {
    }

    public static final void S(int i10, int i11, int i12, String str) {
    }

    /* access modifiers changed from: private */
    public static final int b(Y y10, Y y11) {
        return C17542s.l(y10.b(), y11.b());
    }

    /* access modifiers changed from: private */
    public static final boolean o(int i10) {
        return i10 != 0;
    }

    /* access modifiers changed from: private */
    public static final int p(boolean z10) {
        return z10 ? 1 : 0;
    }

    /* access modifiers changed from: private */
    public static final List<Object> q(C4865c1 c1Var, C4866d dVar) {
        ArrayList arrayList = new ArrayList();
        C4862b1 I10 = c1Var.I();
        try {
            r(I10, arrayList, c1Var.i(dVar));
            C16807N n10 = C16807N.f139792a;
            return arrayList;
        } finally {
            I10.d();
        }
    }

    private static final void r(C4862b1 b1Var, List<Object> list, int i10) {
        if (b1Var.J(i10)) {
            list.add(b1Var.L(i10));
            return;
        }
        int i11 = i10 + 1;
        int E10 = i10 + b1Var.E(i10);
        while (i11 < E10) {
            r(b1Var, list, i11);
            i11 += b1Var.E(i11);
        }
    }

    public static final void s(String str) {
        throw new C4887l("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (" + str + "). Please report to Google or use https://goo.gle/compose-feedback");
    }

    public static final Void t(String str) {
        throw new C4887l("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (" + str + "). Please report to Google or use https://goo.gle/compose-feedback");
    }

    public static final void u(C4874f1 f1Var, S0 s02) {
        int i10;
        int i11;
        int c02 = f1Var.c0();
        int d02 = f1Var.d0();
        while (c02 < d02) {
            Object D02 = f1Var.D0(c02);
            if (D02 instanceof C4885k) {
                s02.c((C4885k) D02, f1Var.g0() - f1Var.g1(c02), -1, -1);
            }
            int A10 = f1Var.c1(f1Var.f13957b, f1Var.j0(c02));
            int i12 = c02 + 1;
            int c10 = f1Var.Q(f1Var.f13957b, f1Var.j0(i12));
            for (int i13 = A10; i13 < c10; i13++) {
                int i14 = i13 - A10;
                Object obj = f1Var.f13958c[f1Var.R(i13)];
                if (obj instanceof U0) {
                    U0 u02 = (U0) obj;
                    T0 b10 = u02.b();
                    if (!(b10 instanceof W0)) {
                        N(f1Var, c02, i14, obj);
                        int g02 = f1Var.g0() - i14;
                        C4866d a10 = u02.a();
                        if (a10 == null || !a10.b()) {
                            i11 = -1;
                            i10 = -1;
                        } else {
                            i11 = f1Var.F(a10);
                            i10 = f1Var.g0() - f1Var.e1(i11);
                        }
                        s02.b(b10, g02, i11, i10);
                    }
                } else if (obj instanceof L0) {
                    N(f1Var, c02, i14, obj);
                    ((L0) obj).x();
                }
            }
            c02 = i12;
        }
    }

    private static final int v(C4862b1 b1Var, int i10, int i11) {
        int i12 = 0;
        while (i10 > 0 && i10 != i11) {
            i10 = b1Var.P(i10);
            i12++;
        }
        return i12;
    }

    /* access modifiers changed from: private */
    public static final List<Y> w(List<Y> list, int i10, int i11) {
        ArrayList arrayList = new ArrayList();
        for (int x10 = x(list, i10); x10 < list.size(); x10++) {
            Y y10 = list.get(x10);
            if (y10.b() >= i11) {
                break;
            }
            arrayList.add(y10);
        }
        return arrayList;
    }

    private static final int x(List<Y> list, int i10) {
        int y10 = y(list, i10);
        return y10 < 0 ? -(y10 + 1) : y10;
    }

    private static final int y(List<Y> list, int i10) {
        int size = list.size() - 1;
        int i11 = 0;
        while (i11 <= size) {
            int i12 = (i11 + size) >>> 1;
            int l10 = C17542s.l(list.get(i12).b(), i10);
            if (l10 < 0) {
                i11 = i12 + 1;
            } else if (l10 <= 0) {
                return i12;
            } else {
                size = i12 - 1;
            }
        }
        return -(i11 + 1);
    }

    /* access modifiers changed from: private */
    public static final Y z(List<Y> list, int i10, int i11) {
        int x10 = x(list, i10);
        if (x10 >= list.size()) {
            return null;
        }
        Y y10 = list.get(x10);
        if (y10.b() < i11) {
            return y10;
        }
        return null;
    }
}
