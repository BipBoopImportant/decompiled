package BJ;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import uI.C18055d;

public abstract class z<K, V> {

    /* renamed from: a  reason: collision with root package name */
    private final ConcurrentHashMap<String, Integer> f133411a = new ConcurrentHashMap<>();

    /* renamed from: b  reason: collision with root package name */
    private final AtomicInteger f133412b = new AtomicInteger(0);

    /* access modifiers changed from: private */
    public static final int g(z zVar, String str) {
        C17542s.j(str, "it");
        return zVar.f133412b.getAndIncrement();
    }

    public final Map<String, Integer> b() {
        return this.f133411a;
    }

    public abstract int c(ConcurrentHashMap<String, Integer> concurrentHashMap, String str, C17642l<? super String, Integer> lVar);

    public final <T extends V, KK extends K> C15479n<K, V, T> d(C18055d<KK> dVar) {
        C17542s.j(dVar, "kClass");
        return new C15479n<>(f(dVar));
    }

    public final int e(String str) {
        C17542s.j(str, "keyQualifiedName");
        return c(this.f133411a, str, new y(this));
    }

    public final <T extends K> int f(C18055d<T> dVar) {
        C17542s.j(dVar, "kClass");
        String u10 = dVar.u();
        C17542s.g(u10);
        return e(u10);
    }

    /* access modifiers changed from: protected */
    public final Collection<Integer> h() {
        Collection<Integer> values = this.f133411a.values();
        C17542s.i(values, "<get-values>(...)");
        return values;
    }
}
