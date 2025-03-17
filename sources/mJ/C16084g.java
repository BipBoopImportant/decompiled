package MJ;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.W;
import oI.C17693a;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\b\u0012\u0004\u0012\u00028\u00020\u00042\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0005B;\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u001e\u0010\n\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ7\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\u000e\u0010\u0010\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000f2\u0006\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00028\u0002H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001b\u0010\u0017J\u001d\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u001c\u001a\u00028\u0001¢\u0006\u0004\b\u001d\u0010\u001eR \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010#\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010'\u001a\u00020$8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010*\u001a\u00020\r8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006+"}, d2 = {"LMJ/g;", "K", "V", "T", "", "LMJ/e;", "LMJ/f;", "builder", "", "LMJ/u;", "path", "<init>", "(LMJ/f;[LMJ/u;)V", "", "keyHash", "LMJ/t;", "node", "key", "pathIndex", "LXH/N;", "n", "(ILMJ/t;Ljava/lang/Object;I)V", "m", "()V", "l", "next", "()Ljava/lang/Object;", "remove", "newValue", "o", "(Ljava/lang/Object;Ljava/lang/Object;)V", "d", "LMJ/f;", "e", "Ljava/lang/Object;", "lastIteratedKey", "", "f", "Z", "nextWasInvoked", "g", "I", "expectedModCount", "kotlinx-collections-immutable"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: MJ.g  reason: case insensitive filesystem */
public class C16084g<K, V, T> extends C16082e<K, V, T> implements Iterator<T>, C17693a {

    /* renamed from: d  reason: collision with root package name */
    private final C16083f<K, V> f136432d;

    /* renamed from: e  reason: collision with root package name */
    private K f136433e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f136434f;

    /* renamed from: g  reason: collision with root package name */
    private int f136435g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16084g(C16083f<K, V> fVar, u<K, V, T>[] uVarArr) {
        super(fVar.k(), uVarArr);
        C17542s.j(fVar, "builder");
        C17542s.j(uVarArr, "path");
        this.f136432d = fVar;
        this.f136435g = fVar.i();
    }

    private final void l() {
        if (this.f136432d.i() != this.f136435g) {
            throw new ConcurrentModificationException();
        }
    }

    private final void m() {
        if (!this.f136434f) {
            throw new IllegalStateException();
        }
    }

    private final void n(int i10, t<?, ?> tVar, K k10, int i11) {
        int i12 = i11 * 5;
        if (i12 > 30) {
            h()[i11].o(tVar.m(), tVar.m().length, 0);
            while (!C17542s.e(h()[i11].c(), k10)) {
                h()[i11].l();
            }
            k(i11);
            return;
        }
        int e10 = 1 << x.e(i10, i12);
        if (tVar.n(e10)) {
            h()[i11].o(tVar.m(), tVar.i() * 2, tVar.j(e10));
            k(i11);
            return;
        }
        int J10 = tVar.J(e10);
        t<?, ?> I10 = tVar.I(J10);
        h()[i11].o(tVar.m(), tVar.i() * 2, J10);
        n(i10, I10, k10, i11 + 1);
    }

    public T next() {
        l();
        this.f136433e = d();
        this.f136434f = true;
        return super.next();
    }

    public final void o(K k10, V v10) {
        if (this.f136432d.containsKey(k10)) {
            if (hasNext()) {
                Object d10 = d();
                this.f136432d.put(k10, v10);
                n(d10 != null ? d10.hashCode() : 0, this.f136432d.k(), d10, 0);
            } else {
                this.f136432d.put(k10, v10);
            }
            this.f136435g = this.f136432d.i();
        }
    }

    public void remove() {
        m();
        if (hasNext()) {
            Object d10 = d();
            W.d(this.f136432d).remove(this.f136433e);
            n(d10 != null ? d10.hashCode() : 0, this.f136432d.k(), d10, 0);
        } else {
            W.d(this.f136432d).remove(this.f136433e);
        }
        this.f136433e = null;
        this.f136434f = false;
        this.f136435g = this.f136432d.i();
    }
}
