package g1;

import X0.d;
import X0.f;
import XH.C16796C;
import XH.C16807N;
import XH.C16820k;
import XH.v;
import YH.C16877v;
import YH.X;
import g1.C5355x;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.W;
import tI.C17978n;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010'\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022 \u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0003B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\u000b\u001a\u00020\n2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u000f\u001a\u00020\n2\u0018\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\"\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0015\u001a\u00020\u00142\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J)\u0010\u0017\u001a\u00020\u00142\u0018\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\rH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J)\u0010\u0019\u001a\u00020\u00142\u0018\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\rH\u0016¢\u0006\u0004\b\u0019\u0010\u0018J$\u0010\u001a\u001a\u00020\u00142\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0002¢\u0006\u0004\b\u001a\u0010\u0016J)\u0010\u001b\u001a\u00020\u00142\u0018\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\rH\u0016¢\u0006\u0004\b\u001b\u0010\u0018¨\u0006\u001c"}, d2 = {"Lg1/q;", "K", "V", "Lg1/s;", "", "Lg1/x;", "map", "<init>", "(Lg1/x;)V", "element", "", "i", "(Ljava/util/Map$Entry;)Ljava/lang/Void;", "", "elements", "k", "(Ljava/util/Collection;)Ljava/lang/Void;", "", "iterator", "()Ljava/util/Iterator;", "", "p", "(Ljava/util/Map$Entry;)Z", "removeAll", "(Ljava/util/Collection;)Z", "retainAll", "m", "containsAll", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: g1.q  reason: case insensitive filesystem */
final class C5348q<K, V> extends C5350s<K, V, Map.Entry<K, V>> {
    public C5348q(C5355x<K, V> xVar) {
        super(xVar);
    }

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return ((Boolean) i((Map.Entry) obj)).booleanValue();
    }

    public /* bridge */ /* synthetic */ boolean addAll(Collection collection) {
        return ((Boolean) k(collection)).booleanValue();
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!W.r(obj)) {
            return false;
        }
        return m((Map.Entry) obj);
    }

    public boolean containsAll(Collection<? extends Object> collection) {
        Iterable<Map.Entry> iterable = collection;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return true;
        }
        for (Map.Entry contains : iterable) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public Void i(Map.Entry<K, V> entry) {
        C5356y.b();
        throw new C16820k();
    }

    public Iterator<Map.Entry<K, V>> iterator() {
        return new C5322C(b(), ((d) b().f().i().entrySet()).iterator());
    }

    public Void k(Collection<? extends Map.Entry<K, V>> collection) {
        C5356y.b();
        throw new C16820k();
    }

    public boolean m(Map.Entry<K, V> entry) {
        return C17542s.e(b().get(entry.getKey()), entry.getValue());
    }

    public boolean p(Map.Entry<K, V> entry) {
        return b().remove(entry.getKey()) != null;
    }

    public final /* bridge */ boolean remove(Object obj) {
        if (!W.r(obj)) {
            return false;
        }
        return p((Map.Entry) obj);
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        Iterator<? extends Object> it = collection.iterator();
        while (true) {
            boolean z10 = false;
            while (true) {
                if (!it.hasNext()) {
                    return z10;
                }
                if (b().remove(((Map.Entry) it.next()).getKey()) != null || z10) {
                    z10 = true;
                }
            }
        }
    }

    public boolean retainAll(Collection<? extends Object> collection) {
        f i10;
        int j10;
        boolean z10;
        C5342k c10;
        Iterable<Map.Entry> iterable = collection;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C17978n.e(X.e(C16877v.y(iterable, 10)), 16));
        for (Map.Entry entry : iterable) {
            v a10 = C16796C.a(entry.getKey(), entry.getValue());
            linkedHashMap.put(a10.c(), a10.d());
        }
        C5355x b10 = b();
        boolean z11 = false;
        do {
            synchronized (C5356y.f23454a) {
                C5328I m10 = b10.m();
                C17542s.h(m10, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                C5355x.a aVar = (C5355x.a) C5347p.F((C5355x.a) m10);
                i10 = aVar.i();
                j10 = aVar.j();
                C16807N n10 = C16807N.f139792a;
            }
            C17542s.g(i10);
            f.a e10 = i10.e();
            Iterator it = b10.entrySet().iterator();
            while (true) {
                z10 = true;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry2 = (Map.Entry) it.next();
                if (!linkedHashMap.containsKey(entry2.getKey()) || !C17542s.e(linkedHashMap.get(entry2.getKey()), entry2.getValue())) {
                    e10.remove(entry2.getKey());
                    z11 = true;
                }
            }
            C16807N n11 = C16807N.f139792a;
            f g10 = e10.g();
            if (C17542s.e(g10, i10)) {
                break;
            }
            C5328I m11 = b10.m();
            C17542s.h(m11, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            C5355x.a aVar2 = (C5355x.a) m11;
            C5347p.J();
            synchronized (C5347p.I()) {
                c10 = C5342k.f23395e.c();
                C5355x.a aVar3 = (C5355x.a) C5347p.h0(aVar2, b10, c10);
                synchronized (C5356y.f23454a) {
                    if (aVar3.j() == j10) {
                        aVar3.k(g10);
                        aVar3.l(aVar3.j() + 1);
                    } else {
                        z10 = false;
                    }
                }
            }
            C5347p.Q(c10, b10);
        } while (!z10);
        return z11;
    }
}
