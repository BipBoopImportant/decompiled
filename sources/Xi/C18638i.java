package xI;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001f\u0012\u0016\u0010\u0005\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\t\u001a\u00028\u00002\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016¢\u0006\u0004\b\t\u0010\nR$\u0010\u0005\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000bR$\u0010\u000f\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0004\u0012\u00028\u00000\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"LxI/i;", "V", "LxI/a;", "Lkotlin/Function1;", "Ljava/lang/Class;", "compute", "<init>", "(LnI/l;)V", "key", "a", "(Ljava/lang/Class;)Ljava/lang/Object;", "LnI/l;", "Ljava/util/concurrent/ConcurrentHashMap;", "b", "Ljava/util/concurrent/ConcurrentHashMap;", "cache", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: xI.i  reason: case insensitive filesystem */
final class C18638i<V> extends C18622a<V> {

    /* renamed from: a  reason: collision with root package name */
    private final C17642l<Class<?>, V> f152418a;

    /* renamed from: b  reason: collision with root package name */
    private final ConcurrentHashMap<Class<?>, V> f152419b = new ConcurrentHashMap<>();

    public C18638i(C17642l<? super Class<?>, ? extends V> lVar) {
        C17542s.j(lVar, "compute");
        this.f152418a = lVar;
    }

    public V a(Class<?> cls) {
        C17542s.j(cls, "key");
        ConcurrentHashMap<Class<?>, V> concurrentHashMap = this.f152419b;
        V v10 = concurrentHashMap.get(cls);
        if (v10 != null) {
            return v10;
        }
        V invoke = this.f152418a.invoke(cls);
        V putIfAbsent = concurrentHashMap.putIfAbsent(cls, invoke);
        return putIfAbsent == null ? invoke : putIfAbsent;
    }
}
