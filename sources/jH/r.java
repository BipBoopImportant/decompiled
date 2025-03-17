package JH;

import XH.C16807N;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010&\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003B9\b\u0000\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\fH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0012\u001a\u00028\u00012\u0006\u0010\u0011\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0012\u0010\u0013R \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"LJH/r;", "K", "V", "Ljava/util/LinkedHashMap;", "Lkotlin/Function1;", "supplier", "LXH/N;", "close", "", "maxSize", "<init>", "(LnI/l;LnI/l;I)V", "", "eldest", "", "removeEldestEntry", "(Ljava/util/Map$Entry;)Z", "key", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "a", "LnI/l;", "b", "c", "I", "ktor-utils"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class r<K, V> extends LinkedHashMap<K, V> {

    /* renamed from: a  reason: collision with root package name */
    private final C17642l<K, V> f135731a;

    /* renamed from: b  reason: collision with root package name */
    private final C17642l<V, C16807N> f135732b;

    /* renamed from: c  reason: collision with root package name */
    private final int f135733c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r(C17642l<? super K, ? extends V> lVar, C17642l<? super V, C16807N> lVar2, int i10) {
        super(10, 0.75f, true);
        C17542s.j(lVar, "supplier");
        C17542s.j(lVar2, "close");
        this.f135731a = lVar;
        this.f135732b = lVar2;
        this.f135733c = i10;
    }

    public /* bridge */ Set<Map.Entry<Object, Object>> a() {
        return super.entrySet();
    }

    public /* bridge */ Set<Object> b() {
        return super.keySet();
    }

    public /* bridge */ int c() {
        return super.size();
    }

    public /* bridge */ Collection<Object> d() {
        return super.values();
    }

    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return a();
    }

    public V get(Object obj) {
        if (this.f135733c == 0) {
            return this.f135731a.invoke(obj);
        }
        synchronized (this) {
            V v10 = super.get(obj);
            if (v10 != null) {
                return v10;
            }
            V invoke = this.f135731a.invoke(obj);
            put(obj, invoke);
            return invoke;
        }
    }

    public final /* bridge */ Set<K> keySet() {
        return b();
    }

    /* access modifiers changed from: protected */
    public boolean removeEldestEntry(Map.Entry<? extends K, ? extends V> entry) {
        C17542s.j(entry, "eldest");
        boolean z10 = size() > this.f135733c;
        if (z10) {
            this.f135732b.invoke(entry.getValue());
        }
        return z10;
    }

    public final /* bridge */ int size() {
        return c();
    }

    public final /* bridge */ Collection<V> values() {
        return d();
    }
}
