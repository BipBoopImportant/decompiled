package YH;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00028\u0000HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000f\u0010\tJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\tR\u0017\u0010\u0005\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u000b¨\u0006\u0018"}, d2 = {"LYH/Q;", "T", "", "", "index", "value", "<init>", "(ILjava/lang/Object;)V", "a", "()I", "b", "()Ljava/lang/Object;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "c", "Ljava/lang/Object;", "d", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Q<T> {

    /* renamed from: a  reason: collision with root package name */
    private final int f140421a;

    /* renamed from: b  reason: collision with root package name */
    private final T f140422b;

    public Q(int i10, T t10) {
        this.f140421a = i10;
        this.f140422b = t10;
    }

    public final int a() {
        return this.f140421a;
    }

    public final T b() {
        return this.f140422b;
    }

    public final int c() {
        return this.f140421a;
    }

    public final T d() {
        return this.f140422b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Q)) {
            return false;
        }
        Q q10 = (Q) obj;
        return this.f140421a == q10.f140421a && C17542s.e(this.f140422b, q10.f140422b);
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.f140421a) * 31;
        T t10 = this.f140422b;
        return hashCode + (t10 == null ? 0 : t10.hashCode());
    }

    public String toString() {
        return "IndexedValue(index=" + this.f140421a + ", value=" + this.f140422b + ')';
    }
}
