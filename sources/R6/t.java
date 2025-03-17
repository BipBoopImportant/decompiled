package r6;

import YH.C16877v;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010%\n\u0002\b\u0004\b\u0010\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0001H\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000e\u001a\u00020\u00042\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u000e\u0010\rJ)\u0010\u0012\u001a\u00020\u00112\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00028\u00012\b\u0010\u0010\u001a\u0004\u0018\u00018\u0001H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\u0004\u0018\u00018\u00012\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u0004\u0018\u00018\u00012\u0006\u0010\n\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u0004\u0018\u00018\u00012\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b\u0018\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0004¢\u0006\u0004\b\u001a\u0010\u0007J\r\u0010\u001b\u001a\u00020\u0011¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u001e\u0010\tR \u0010!\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010 R$\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00048F@BX\u000e¢\u0006\f\n\u0004\b\u0016\u0010\u001d\u001a\u0004\b\"\u0010\t¨\u0006#"}, d2 = {"Lr6/t;", "", "K", "V", "", "maxSize", "<init>", "(J)V", "g", "()J", "key", "value", "i", "(Ljava/lang/Object;Ljava/lang/Object;)J", "j", "oldValue", "newValue", "LXH/N;", "b", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "f", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "c", "(Ljava/lang/Object;)Ljava/lang/Object;", "h", "size", "k", "a", "()V", "J", "d", "", "Ljava/util/Map;", "map", "e", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class t<K, V> {

    /* renamed from: a  reason: collision with root package name */
    private final long f55712a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<K, V> f55713b = C8695c.b(0, 0.0f, 3, (Object) null);

    /* renamed from: c  reason: collision with root package name */
    private long f55714c;

    public t(long j10) {
        this.f55712a = j10;
        if (j10 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
    }

    private final long g() {
        long j10 = 0;
        for (Map.Entry entry : this.f55713b.entrySet()) {
            j10 += i(entry.getKey(), entry.getValue());
        }
        return j10;
    }

    private final long i(K k10, V v10) {
        try {
            long j10 = j(k10, v10);
            if (j10 >= 0) {
                return j10;
            }
            throw new IllegalStateException(("sizeOf(" + k10 + ", " + v10 + ") returned a negative value: " + j10).toString());
        } catch (Exception e10) {
            this.f55714c = -1;
            throw e10;
        }
    }

    public final void a() {
        k(-1);
    }

    public void b(K k10, V v10, V v11) {
        throw null;
    }

    public final V c(K k10) {
        return this.f55713b.get(k10);
    }

    public final long d() {
        return this.f55712a;
    }

    public final long e() {
        if (this.f55714c == -1) {
            this.f55714c = g();
        }
        return this.f55714c;
    }

    public final V f(K k10, V v10) {
        V put = this.f55713b.put(k10, v10);
        this.f55714c = e() + i(k10, v10);
        if (put != null) {
            this.f55714c = e() - i(k10, put);
            b(k10, put, v10);
        }
        k(this.f55712a);
        return put;
    }

    public final V h(K k10) {
        V remove = this.f55713b.remove(k10);
        if (remove != null) {
            this.f55714c = e() - i(k10, remove);
            b(k10, remove, (V) null);
        }
        return remove;
    }

    public long j(K k10, V v10) {
        throw null;
    }

    public final void k(long j10) {
        while (e() > j10) {
            if (!this.f55713b.isEmpty()) {
                Map.Entry entry = (Map.Entry) C16877v.v0(this.f55713b.entrySet());
                Object key = entry.getKey();
                Object value = entry.getValue();
                this.f55713b.remove(key);
                this.f55714c = e() - i(key, value);
                b(key, value, (Object) null);
            } else if (e() != 0) {
                throw new IllegalStateException("sizeOf() is returning inconsistent values");
            } else {
                return;
            }
        }
    }
}
