package BJ;

import java.util.Iterator;
import kotlin.jvm.internal.C17542s;
import oI.C17693a;
import uI.C18055d;

/* renamed from: BJ.a  reason: case insensitive filesystem */
public abstract class C15466a<K, V> implements Iterable<V>, C17693a {

    /* renamed from: BJ.a$a  reason: collision with other inner class name */
    public static abstract class C3288a<K, V, T extends V> {

        /* renamed from: a  reason: collision with root package name */
        private final int f133302a;

        public C3288a(int i10) {
            this.f133302a = i10;
        }

        /* JADX WARNING: type inference failed for: r2v0, types: [BJ.a, java.lang.Object, BJ.a<K, V>] */
        /* access modifiers changed from: protected */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final T c(BJ.C15466a<K, V> r2) {
            /*
                r1 = this;
                java.lang.String r0 = "thisRef"
                kotlin.jvm.internal.C17542s.j(r2, r0)
                BJ.c r2 = r2.b()
                int r0 = r1.f133302a
                java.lang.Object r2 = r2.get(r0)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: BJ.C15466a.C3288a.c(BJ.a):java.lang.Object");
        }
    }

    /* access modifiers changed from: protected */
    public abstract C15468c<V> b();

    /* access modifiers changed from: protected */
    public abstract z<K, V> i();

    public final boolean isEmpty() {
        return b().a() == 0;
    }

    public final Iterator<V> iterator() {
        return b().iterator();
    }

    /* access modifiers changed from: protected */
    public abstract void k(String str, V v10);

    /* access modifiers changed from: protected */
    public final void m(C18055d<? extends K> dVar, V v10) {
        C17542s.j(dVar, "tClass");
        C17542s.j(v10, "value");
        String u10 = dVar.u();
        C17542s.g(u10);
        k(u10, v10);
    }
}
