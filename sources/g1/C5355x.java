package g1;

import X0.f;
import XH.C16807N;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import oI.C17697e;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u000b\n\u0002\u0010#\n\u0002\u0010'\n\u0002\b\u0006\n\u0002\u0010\u001f\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004:\u0001\"B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\b\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u001a\u0010\u0011\u001a\u0004\u0018\u00018\u00012\u0006\u0010\f\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0018\u0010\u0006J!\u0010\u0019\u001a\u0004\u0018\u00018\u00012\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\b\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ%\u0010\u001d\u001a\u00020\t2\u0014\u0010\u001c\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010\u001f\u001a\u0004\u0018\u00018\u00012\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001f\u0010\u0012J\u0017\u0010 \u001a\u00020\r2\u0006\u0010\b\u001a\u00028\u0001H\u0000¢\u0006\u0004\b \u0010\u000fR$\u0010&\u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u00078\u0016@RX\u000e¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R,\u0010,\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010(0'8\u0016X\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b)\u0010+R \u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000'8\u0016X\u0004¢\u0006\f\n\u0004\b-\u0010*\u001a\u0004\b-\u0010+R \u00104\u001a\b\u0012\u0004\u0012\u00028\u00010/8\u0016X\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0014\u00107\u001a\u0002058VX\u0004¢\u0006\u0006\u001a\u0004\b\"\u00106R\u0014\u00108\u001a\u0002058@X\u0004¢\u0006\u0006\u001a\u0004\b0\u00106R&\u0010=\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001098@X\u0004¢\u0006\f\u0012\u0004\b<\u0010\u0006\u001a\u0004\b:\u0010;¨\u0006>"}, d2 = {"Lg1/x;", "K", "V", "Lg1/G;", "", "<init>", "()V", "Lg1/I;", "value", "LXH/N;", "p", "(Lg1/I;)V", "key", "", "containsKey", "(Ljava/lang/Object;)Z", "containsValue", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "isEmpty", "()Z", "", "toString", "()Ljava/lang/String;", "clear", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "", "from", "putAll", "(Ljava/util/Map;)V", "remove", "k", "<set-?>", "a", "Lg1/I;", "m", "()Lg1/I;", "firstStateRecord", "", "", "b", "Ljava/util/Set;", "()Ljava/util/Set;", "entries", "c", "keys", "", "d", "Ljava/util/Collection;", "h", "()Ljava/util/Collection;", "values", "", "()I", "size", "modification", "Lg1/x$a;", "f", "()Lg1/x$a;", "getReadable$runtime_release$annotations", "readable", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: g1.x  reason: case insensitive filesystem */
public final class C5355x<K, V> implements C5326G, Map<K, V>, C17697e {

    /* renamed from: a  reason: collision with root package name */
    private C5328I f23448a;

    /* renamed from: b  reason: collision with root package name */
    private final Set<Map.Entry<K, V>> f23449b;

    /* renamed from: c  reason: collision with root package name */
    private final Set<K> f23450c;

    /* renamed from: d  reason: collision with root package name */
    private final Collection<V> f23451d;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u00020\u0003B\u001d\b\u0000\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\f\u0010\rR.\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00048\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0007R\"\u0010\u0018\u001a\u00020\u00128\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lg1/x$a;", "K", "V", "Lg1/I;", "LX0/f;", "map", "<init>", "(LX0/f;)V", "value", "LXH/N;", "c", "(Lg1/I;)V", "d", "()Lg1/I;", "LX0/f;", "i", "()LX0/f;", "k", "", "I", "j", "()I", "l", "(I)V", "modification", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: g1.x$a */
    public static final class a<K, V> extends C5328I {

        /* renamed from: c  reason: collision with root package name */
        private f<K, ? extends V> f23452c;

        /* renamed from: d  reason: collision with root package name */
        private int f23453d;

        public a(f<K, ? extends V> fVar) {
            this.f23452c = fVar;
        }

        public void c(C5328I i10) {
            C17542s.h(i10, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord, V of androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord>");
            a aVar = (a) i10;
            synchronized (C5356y.f23454a) {
                this.f23452c = aVar.f23452c;
                this.f23453d = aVar.f23453d;
                C16807N n10 = C16807N.f139792a;
            }
        }

        public C5328I d() {
            return new a(this.f23452c);
        }

        public final f<K, V> i() {
            return this.f23452c;
        }

        public final int j() {
            return this.f23453d;
        }

        public final void k(f<K, ? extends V> fVar) {
            this.f23452c = fVar;
        }

        public final void l(int i10) {
            this.f23453d = i10;
        }
    }

    public C5355x() {
        f a10 = X0.a.a();
        a aVar = new a(a10);
        if (C5342k.f23395e.e()) {
            a aVar2 = new a(a10);
            aVar2.h(1);
            aVar.g(aVar2);
        }
        this.f23448a = aVar;
        this.f23449b = new C5348q(this);
        this.f23450c = new C5349r(this);
        this.f23451d = new C5351t(this);
    }

    public int a() {
        return f().i().size();
    }

    public Set<Map.Entry<K, V>> b() {
        return this.f23449b;
    }

    public Set<K> c() {
        return this.f23450c;
    }

    public void clear() {
        C5342k c10;
        C5328I m10 = m();
        C17542s.h(m10, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        a aVar = (a) C5347p.F((a) m10);
        aVar.i();
        f a10 = X0.a.a();
        if (a10 != aVar.i()) {
            C5328I m11 = m();
            C17542s.h(m11, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            a aVar2 = (a) m11;
            C5347p.J();
            synchronized (C5347p.I()) {
                c10 = C5342k.f23395e.c();
                a aVar3 = (a) C5347p.h0(aVar2, this, c10);
                synchronized (C5356y.f23454a) {
                    aVar3.k(a10);
                    aVar3.l(aVar3.j() + 1);
                }
            }
            C5347p.Q(c10, this);
        }
    }

    public boolean containsKey(Object obj) {
        return f().i().containsKey(obj);
    }

    public boolean containsValue(Object obj) {
        return f().i().containsValue(obj);
    }

    public final int d() {
        return f().j();
    }

    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return b();
    }

    public final a<K, V> f() {
        C5328I m10 = m();
        C17542s.h(m10, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        return (a) C5347p.X((a) m10, this);
    }

    public V get(Object obj) {
        return f().i().get(obj);
    }

    public Collection<V> h() {
        return this.f23451d;
    }

    public boolean isEmpty() {
        return f().i().isEmpty();
    }

    public final boolean k(V v10) {
        Object obj;
        Iterator it = entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C17542s.e(((Map.Entry) obj).getValue(), v10)) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry == null) {
            return false;
        }
        remove(entry.getKey());
        return true;
    }

    public final /* bridge */ Set<K> keySet() {
        return c();
    }

    public C5328I m() {
        return this.f23448a;
    }

    public void p(C5328I i10) {
        C17542s.h(i10, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        this.f23448a = (a) i10;
    }

    public V put(K k10, V v10) {
        f i10;
        int j10;
        V put;
        C5342k c10;
        boolean z10;
        do {
            synchronized (C5356y.f23454a) {
                C5328I m10 = m();
                C17542s.h(m10, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                a aVar = (a) C5347p.F((a) m10);
                i10 = aVar.i();
                j10 = aVar.j();
                C16807N n10 = C16807N.f139792a;
            }
            C17542s.g(i10);
            f.a e10 = i10.e();
            put = e10.put(k10, v10);
            f g10 = e10.g();
            if (C17542s.e(g10, i10)) {
                break;
            }
            C5328I m11 = m();
            C17542s.h(m11, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            a aVar2 = (a) m11;
            C5347p.J();
            synchronized (C5347p.I()) {
                c10 = C5342k.f23395e.c();
                a aVar3 = (a) C5347p.h0(aVar2, this, c10);
                synchronized (C5356y.f23454a) {
                    if (aVar3.j() == j10) {
                        aVar3.k(g10);
                        z10 = true;
                        aVar3.l(aVar3.j() + 1);
                    } else {
                        z10 = false;
                    }
                }
            }
            C5347p.Q(c10, this);
        } while (!z10);
        return put;
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        f i10;
        int j10;
        C5342k c10;
        boolean z10;
        do {
            synchronized (C5356y.f23454a) {
                C5328I m10 = m();
                C17542s.h(m10, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                a aVar = (a) C5347p.F((a) m10);
                i10 = aVar.i();
                j10 = aVar.j();
                C16807N n10 = C16807N.f139792a;
            }
            C17542s.g(i10);
            f.a e10 = i10.e();
            e10.putAll(map);
            f g10 = e10.g();
            if (!C17542s.e(g10, i10)) {
                C5328I m11 = m();
                C17542s.h(m11, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                a aVar2 = (a) m11;
                C5347p.J();
                synchronized (C5347p.I()) {
                    c10 = C5342k.f23395e.c();
                    a aVar3 = (a) C5347p.h0(aVar2, this, c10);
                    synchronized (C5356y.f23454a) {
                        if (aVar3.j() == j10) {
                            aVar3.k(g10);
                            z10 = true;
                            aVar3.l(aVar3.j() + 1);
                        } else {
                            z10 = false;
                        }
                    }
                }
                C5347p.Q(c10, this);
            } else {
                return;
            }
        } while (!z10);
    }

    public V remove(Object obj) {
        f i10;
        int j10;
        V remove;
        C5342k c10;
        boolean z10;
        do {
            synchronized (C5356y.f23454a) {
                C5328I m10 = m();
                C17542s.h(m10, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                a aVar = (a) C5347p.F((a) m10);
                i10 = aVar.i();
                j10 = aVar.j();
                C16807N n10 = C16807N.f139792a;
            }
            C17542s.g(i10);
            f.a e10 = i10.e();
            remove = e10.remove(obj);
            f g10 = e10.g();
            if (C17542s.e(g10, i10)) {
                break;
            }
            C5328I m11 = m();
            C17542s.h(m11, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            a aVar2 = (a) m11;
            C5347p.J();
            synchronized (C5347p.I()) {
                c10 = C5342k.f23395e.c();
                a aVar3 = (a) C5347p.h0(aVar2, this, c10);
                synchronized (C5356y.f23454a) {
                    if (aVar3.j() == j10) {
                        aVar3.k(g10);
                        z10 = true;
                        aVar3.l(aVar3.j() + 1);
                    } else {
                        z10 = false;
                    }
                }
            }
            C5347p.Q(c10, this);
        } while (!z10);
        return remove;
    }

    public final /* bridge */ int size() {
        return a();
    }

    public String toString() {
        C5328I m10 = m();
        C17542s.h(m10, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        return "SnapshotStateMap(value=" + ((a) C5347p.F((a) m10)).i() + ")@" + hashCode();
    }

    public final /* bridge */ Collection<V> values() {
        return h();
    }
}
