package Z0;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.W;
import oI.C17693a;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\b\u0012\u0004\u0012\u00028\u00020\u00042\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0005B;\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u001e\u0010\n\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ7\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\u000e\u0010\u0010\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000f2\u0006\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00028\u0002H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001b\u0010\u0017J\u001d\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u001c\u001a\u00028\u0001¢\u0006\u0004\b\u001d\u0010\u001eR \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010#\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010'\u001a\u00020$8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010*\u001a\u00020\r8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006+"}, d2 = {"LZ0/g;", "K", "V", "T", "", "LZ0/e;", "LZ0/f;", "builder", "", "LZ0/u;", "path", "<init>", "(LZ0/f;[LZ0/u;)V", "", "keyHash", "LZ0/t;", "node", "key", "pathIndex", "LXH/N;", "n", "(ILZ0/t;Ljava/lang/Object;I)V", "m", "()V", "l", "next", "()Ljava/lang/Object;", "remove", "newValue", "o", "(Ljava/lang/Object;Ljava/lang/Object;)V", "d", "LZ0/f;", "e", "Ljava/lang/Object;", "lastIteratedKey", "", "f", "Z", "nextWasInvoked", "g", "I", "expectedModCount", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class g<K, V, T> extends e<K, V, T> implements Iterator<T>, C17693a {

    /* renamed from: d  reason: collision with root package name */
    private final f<K, V> f14929d;

    /* renamed from: e  reason: collision with root package name */
    private K f14930e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f14931f;

    /* renamed from: g  reason: collision with root package name */
    private int f14932g;

    public g(f<K, V> fVar, u<K, V, T>[] uVarArr) {
        super(fVar.i(), uVarArr);
        this.f14929d = fVar;
        this.f14932g = fVar.h();
    }

    private final void l() {
        if (this.f14929d.h() != this.f14932g) {
            throw new ConcurrentModificationException();
        }
    }

    private final void m() {
        if (!this.f14931f) {
            throw new IllegalStateException();
        }
    }

    private final void n(int i10, t<?, ?> tVar, K k10, int i11) {
        int i12 = i11 * 5;
        if (i12 > 30) {
            h()[i11].o(tVar.p(), tVar.p().length, 0);
            while (!C17542s.e(h()[i11].c(), k10)) {
                h()[i11].l();
            }
            k(i11);
            return;
        }
        int f10 = 1 << x.f(i10, i12);
        if (tVar.q(f10)) {
            h()[i11].o(tVar.p(), tVar.m() * 2, tVar.n(f10));
            k(i11);
            return;
        }
        int O10 = tVar.O(f10);
        t<?, ?> N10 = tVar.N(O10);
        h()[i11].o(tVar.p(), tVar.m() * 2, O10);
        n(i10, N10, k10, i11 + 1);
    }

    public T next() {
        l();
        this.f14930e = d();
        this.f14931f = true;
        return super.next();
    }

    public final void o(K k10, V v10) {
        if (this.f14929d.containsKey(k10)) {
            if (hasNext()) {
                Object d10 = d();
                this.f14929d.put(k10, v10);
                n(d10 != null ? d10.hashCode() : 0, this.f14929d.i(), d10, 0);
            } else {
                this.f14929d.put(k10, v10);
            }
            this.f14932g = this.f14929d.h();
        }
    }

    public void remove() {
        m();
        if (hasNext()) {
            Object d10 = d();
            W.d(this.f14929d).remove(this.f14930e);
            n(d10 != null ? d10.hashCode() : 0, this.f14929d.i(), d10, 0);
        } else {
            W.d(this.f14929d).remove(this.f14930e);
        }
        this.f14930e = null;
        this.f14931f = false;
        this.f14932g = this.f14929d.h();
    }
}
