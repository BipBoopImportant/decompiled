package g1;

import X0.d;
import X0.f;
import XH.C16807N;
import XH.C16820k;
import YH.C16877v;
import g1.C5355x;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\u0003B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000e\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001c\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0016\u001a\u00020\u00132\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u0018\u001a\u00020\u00132\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0016¢\u0006\u0004\b\u0018\u0010\u0017J\u0018\u0010\u0019\u001a\u00020\u00132\u0006\u0010\b\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0019\u0010\u0015J\u001d\u0010\u001a\u001a\u00020\u00132\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0016¢\u0006\u0004\b\u001a\u0010\u0017¨\u0006\u001b"}, d2 = {"Lg1/r;", "K", "V", "Lg1/s;", "Lg1/x;", "map", "<init>", "(Lg1/x;)V", "element", "", "i", "(Ljava/lang/Object;)Ljava/lang/Void;", "", "elements", "k", "(Ljava/util/Collection;)Ljava/lang/Void;", "Lg1/E;", "m", "()Lg1/E;", "", "remove", "(Ljava/lang/Object;)Z", "removeAll", "(Ljava/util/Collection;)Z", "retainAll", "contains", "containsAll", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: g1.r  reason: case insensitive filesystem */
final class C5349r<K, V> extends C5350s<K, V, K> {
    public C5349r(C5355x<K, V> xVar) {
        super(xVar);
    }

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return ((Boolean) i(obj)).booleanValue();
    }

    public /* bridge */ /* synthetic */ boolean addAll(Collection collection) {
        return ((Boolean) k(collection)).booleanValue();
    }

    public boolean contains(Object obj) {
        return b().containsKey(obj);
    }

    public boolean containsAll(Collection<? extends Object> collection) {
        Iterable<Object> iterable = collection;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return true;
        }
        for (Object containsKey : iterable) {
            if (!b().containsKey(containsKey)) {
                return false;
            }
        }
        return true;
    }

    public Void i(K k10) {
        C5356y.b();
        throw new C16820k();
    }

    public Void k(Collection<? extends K> collection) {
        C5356y.b();
        throw new C16820k();
    }

    /* renamed from: m */
    public C5324E<K, V> iterator() {
        return new C5324E<>(b(), ((d) b().f().i().entrySet()).iterator());
    }

    public boolean remove(Object obj) {
        return b().remove(obj) != null;
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        Iterator it = collection.iterator();
        while (true) {
            boolean z10 = false;
            while (true) {
                if (!it.hasNext()) {
                    return z10;
                }
                if (b().remove(it.next()) != null || z10) {
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
        Set y12 = C16877v.y1(collection);
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
                Map.Entry entry = (Map.Entry) it.next();
                if (!y12.contains(entry.getKey())) {
                    e10.remove(entry.getKey());
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
