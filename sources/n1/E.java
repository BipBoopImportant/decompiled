package N1;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0013\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0014\u0010\u0019¨\u0006\u001a"}, d2 = {"LN1/E;", "", "LN1/D;", "spanStyle", "LN1/C;", "paragraphStyle", "<init>", "(LN1/D;LN1/C;)V", "", "includeFontPadding", "(Z)V", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "", "toString", "()Ljava/lang/String;", "a", "LN1/D;", "b", "()LN1/D;", "LN1/C;", "()LN1/C;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class E {

    /* renamed from: a  reason: collision with root package name */
    private final D f9286a;

    /* renamed from: b  reason: collision with root package name */
    private final C f9287b;

    public E(D d10, C c10) {
        this.f9286a = d10;
        this.f9287b = c10;
    }

    public final C a() {
        return this.f9287b;
    }

    public final D b() {
        return this.f9286a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E)) {
            return false;
        }
        E e10 = (E) obj;
        return C17542s.e(this.f9287b, e10.f9287b) && C17542s.e(this.f9286a, e10.f9286a);
    }

    public int hashCode() {
        D d10 = this.f9286a;
        int i10 = 0;
        int hashCode = (d10 != null ? d10.hashCode() : 0) * 31;
        C c10 = this.f9287b;
        if (c10 != null) {
            i10 = c10.hashCode();
        }
        return hashCode + i10;
    }

    public String toString() {
        return "PlatformTextStyle(spanStyle=" + this.f9286a + ", paragraphSyle=" + this.f9287b + ')';
    }

    public E(boolean z10) {
        this((D) null, new C(z10));
    }
}
