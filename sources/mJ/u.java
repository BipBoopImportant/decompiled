package MJ;

import PJ.C16207a;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import oI.C17693a;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\b \u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u0001*\u0006\b\u0002\u0010\u0003 \u00012\b\u0012\u0004\u0012\u00028\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J-\u0010\u000e\u001a\u00020\r2\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0010\u001a\u00020\r2\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00072\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00028\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\r¢\u0006\u0004\b\u0017\u0010\u0006J\r\u0010\u0018\u001a\u00020\u0012¢\u0006\u0004\b\u0018\u0010\u0014J\u001d\u0010\u001a\u001a\u0012\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00028\u00010\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\r¢\u0006\u0004\b\u001c\u0010\u0006J\u0010\u0010\u001d\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001d\u0010\u0014R4\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00072\u000e\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00078\u0004@BX\u000e¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\"\u0010\f\u001a\u00020\n8\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(¨\u0006)"}, d2 = {"LMJ/u;", "K", "V", "T", "", "<init>", "()V", "", "", "buffer", "", "dataSize", "index", "LXH/N;", "o", "([Ljava/lang/Object;II)V", "n", "([Ljava/lang/Object;I)V", "", "i", "()Z", "c", "()Ljava/lang/Object;", "l", "k", "LMJ/t;", "d", "()LMJ/t;", "m", "hasNext", "<set-?>", "a", "[Ljava/lang/Object;", "f", "()[Ljava/lang/Object;", "b", "I", "h", "()I", "p", "(I)V", "kotlinx-collections-immutable"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class u<K, V, T> implements Iterator<T>, C17693a {

    /* renamed from: a  reason: collision with root package name */
    private Object[] f136449a = t.f136443e.a().m();

    /* renamed from: b  reason: collision with root package name */
    private int f136450b;

    /* renamed from: c  reason: collision with root package name */
    private int f136451c;

    public final K c() {
        C16207a.a(i());
        return this.f136449a[this.f136451c];
    }

    public final t<? extends K, ? extends V> d() {
        C16207a.a(k());
        Object obj = this.f136449a[this.f136451c];
        C17542s.h(obj, "null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator, V of kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator>");
        return (t) obj;
    }

    /* access modifiers changed from: protected */
    public final Object[] f() {
        return this.f136449a;
    }

    /* access modifiers changed from: protected */
    public final int h() {
        return this.f136451c;
    }

    public boolean hasNext() {
        return i();
    }

    public final boolean i() {
        return this.f136451c < this.f136450b;
    }

    public final boolean k() {
        C16207a.a(this.f136451c >= this.f136450b);
        return this.f136451c < this.f136449a.length;
    }

    public final void l() {
        C16207a.a(i());
        this.f136451c += 2;
    }

    public final void m() {
        C16207a.a(k());
        this.f136451c++;
    }

    public final void n(Object[] objArr, int i10) {
        C17542s.j(objArr, "buffer");
        o(objArr, i10, 0);
    }

    public final void o(Object[] objArr, int i10, int i11) {
        C17542s.j(objArr, "buffer");
        this.f136449a = objArr;
        this.f136450b = i10;
        this.f136451c = i11;
    }

    /* access modifiers changed from: protected */
    public final void p(int i10) {
        this.f136451c = i10;
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
