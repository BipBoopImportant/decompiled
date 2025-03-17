package xI;

import II.C15902k;
import JI.C15965f;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0002\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\"&\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00060\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0007¨\u0006\t"}, d2 = {"Ljava/lang/Class;", "LII/k;", "a", "(Ljava/lang/Class;)LII/k;", "Ljava/util/concurrent/ConcurrentMap;", "LxI/k1;", "Ljava/lang/ref/WeakReference;", "Ljava/util/concurrent/ConcurrentMap;", "moduleByClassLoader", "kotlin-reflection"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class Z0 {

    /* renamed from: a  reason: collision with root package name */
    private static final ConcurrentMap<k1, WeakReference<C15902k>> f152380a = new ConcurrentHashMap();

    public static final C15902k a(Class<?> cls) {
        C17542s.j(cls, "<this>");
        ClassLoader j10 = C15965f.j(cls);
        k1 k1Var = new k1(j10);
        ConcurrentMap<k1, WeakReference<C15902k>> concurrentMap = f152380a;
        WeakReference weakReference = concurrentMap.get(k1Var);
        if (weakReference != null) {
            C15902k kVar = (C15902k) weakReference.get();
            if (kVar != null) {
                return kVar;
            }
            concurrentMap.remove(k1Var, weakReference);
        }
        C15902k a10 = C15902k.f135490c.a(j10);
        while (true) {
            try {
                ConcurrentMap<k1, WeakReference<C15902k>> concurrentMap2 = f152380a;
                WeakReference putIfAbsent = concurrentMap2.putIfAbsent(k1Var, new WeakReference(a10));
                if (putIfAbsent == null) {
                    k1Var.a((ClassLoader) null);
                    return a10;
                }
                C15902k kVar2 = (C15902k) putIfAbsent.get();
                if (kVar2 != null) {
                    return kVar2;
                }
                concurrentMap2.remove(k1Var, putIfAbsent);
            } finally {
                k1Var.a((ClassLoader) null);
            }
        }
    }
}
