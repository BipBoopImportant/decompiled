package W0;

import j0.N;
import j0.O;
import j0.Y;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0001¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\f\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0001¢\u0006\u0004\b\f\u0010\nJ\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u0011\u0010\u0005J\u001d\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0001¢\u0006\u0004\b\u0014\u0010\u0015R#\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u00168\u0006¢\u0006\f\n\u0004\b\t\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001e\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"LW0/f;", "", "Key", "Scope", "<init>", "()V", "key", "scope", "LXH/N;", "a", "(Ljava/lang/Object;Ljava/lang/Object;)V", "value", "h", "element", "", "c", "(Ljava/lang/Object;)Z", "b", "f", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "g", "(Ljava/lang/Object;)V", "Lj0/N;", "Lj0/N;", "d", "()Lj0/N;", "map", "", "e", "()I", "size", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class f<Key, Scope> {

    /* renamed from: a  reason: collision with root package name */
    private final N<Object, Object> f14643a = Y.d();

    public final void a(Key key, Scope scope) {
        N<Object, Object> n10 = this.f14643a;
        int l10 = n10.l(key);
        boolean z10 = l10 < 0;
        Scope scope2 = z10 ? null : n10.f24570c[l10];
        if (scope2 != null) {
            if (scope2 instanceof O) {
                C17542s.h(scope2, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap.add$lambda$0>");
                ((O) scope2).h(scope);
            } else if (scope2 != scope) {
                Scope o10 = new O(0, 1, (DefaultConstructorMarker) null);
                C17542s.h(scope2, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap.add$lambda$0");
                o10.h(scope2);
                o10.h(scope);
                scope = o10;
            }
            scope = scope2;
        }
        if (z10) {
            int i10 = ~l10;
            n10.f24569b[i10] = key;
            n10.f24570c[i10] = scope;
            return;
        }
        n10.f24570c[l10] = scope;
    }

    public final void b() {
        this.f14643a.i();
    }

    public final boolean c(Key key) {
        return this.f14643a.b(key);
    }

    public final N<Object, Object> d() {
        return this.f14643a;
    }

    public final int e() {
        return this.f14643a.e();
    }

    public final boolean f(Key key, Scope scope) {
        Object c10 = this.f14643a.c(key);
        if (c10 == null) {
            return false;
        }
        if (c10 instanceof O) {
            O o10 = (O) c10;
            boolean x10 = o10.x(scope);
            if (x10 && o10.d()) {
                this.f14643a.p(key);
            }
            return x10;
        } else if (!C17542s.e(c10, scope)) {
            return false;
        } else {
            this.f14643a.p(key);
            return true;
        }
    }

    public final void g(Scope scope) {
        boolean z10;
        N<Object, Object> n10 = this.f14643a;
        long[] jArr = n10.f24568a;
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
                            Object obj = n10.f24569b[i13];
                            Scope scope2 = n10.f24570c[i13];
                            if (scope2 instanceof O) {
                                C17542s.h(scope2, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap.removeScope$lambda$3>");
                                O o10 = (O) scope2;
                                o10.x(scope);
                                z10 = o10.d();
                            } else {
                                z10 = scope2 == scope;
                            }
                            if (z10) {
                                n10.q(i13);
                            }
                        }
                        j10 >>= 8;
                    }
                    if (i11 != 8) {
                        return;
                    }
                }
                if (i10 != length) {
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public final void h(Key key, Scope scope) {
        this.f14643a.s(key, scope);
    }
}
