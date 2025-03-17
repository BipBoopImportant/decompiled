package U0;

import YH.C16877v;
import j0.N;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.W;
import mI.C17604b;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b@\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0002B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\u0001\u0005\u0001\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u0004¨\u0006\u001d"}, d2 = {"LU0/q0;", "K", "", "V", "Lj0/N;", "map", "b", "(Lj0/N;)Lj0/N;", "key", "value", "LXH/N;", "f", "(Lj0/N;Ljava/lang/Object;Ljava/lang/Object;)V", "e", "(Lj0/N;Ljava/lang/Object;)Ljava/lang/Object;", "", "g", "(Lj0/N;)Ljava/lang/String;", "", "d", "(Lj0/N;)I", "other", "", "c", "(Lj0/N;Ljava/lang/Object;)Z", "a", "Lj0/N;", "getMap", "()Lj0/N;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@C17604b
/* renamed from: U0.q0  reason: case insensitive filesystem */
final class C4898q0<K, V> {

    /* renamed from: a  reason: collision with root package name */
    private final N<K, Object> f14093a;

    private /* synthetic */ C4898q0(N n10) {
        this.f14093a = n10;
    }

    public static final /* synthetic */ C4898q0 a(N n10) {
        return new C4898q0(n10);
    }

    public static <K, V> N<K, Object> b(N<K, Object> n10) {
        return n10;
    }

    public static boolean c(N<K, Object> n10, Object obj) {
        return (obj instanceof C4898q0) && C17542s.e(n10, ((C4898q0) obj).h());
    }

    public static int d(N<K, Object> n10) {
        return n10.hashCode();
    }

    public static final V e(N<K, Object> n10, K k10) {
        V c10 = n10.c(k10);
        if (c10 == null) {
            return null;
        }
        if (W.p(c10)) {
            List c11 = W.c(c10);
            V remove = c11.remove(0);
            if (c11.isEmpty()) {
                n10.p(k10);
            }
            c10 = remove;
        } else {
            n10.p(k10);
        }
        C17542s.h(c10, "null cannot be cast to non-null type V of androidx.compose.runtime.MutableScatterMultiMap.pop_impl$lambda$1");
        return c10;
    }

    public static final void f(N<K, Object> n10, K k10, V v10) {
        int l10 = n10.l(k10);
        boolean z10 = l10 < 0;
        Object obj = z10 ? null : n10.f24570c[l10];
        if (obj != null) {
            if (W.p(obj)) {
                C17542s.h(obj, "null cannot be cast to non-null type kotlin.collections.MutableList<V of androidx.compose.runtime.MutableScatterMultiMap.put_impl$lambda$0>");
                V c10 = W.c(obj);
                c10.add(v10);
                v10 = c10;
            } else {
                v10 = C16877v.t(obj, v10);
            }
        }
        if (z10) {
            int i10 = ~l10;
            n10.f24569b[i10] = k10;
            n10.f24570c[i10] = v10;
            return;
        }
        n10.f24570c[l10] = v10;
    }

    public static String g(N<K, Object> n10) {
        return "MutableScatterMultiMap(map=" + n10 + ')';
    }

    public boolean equals(Object obj) {
        return c(this.f14093a, obj);
    }

    public final /* synthetic */ N h() {
        return this.f14093a;
    }

    public int hashCode() {
        return d(this.f14093a);
    }

    public String toString() {
        return g(this.f14093a);
    }
}
