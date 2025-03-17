package L1;

import XH.C16818i;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\n\b\u0007\u0018\u0000*\u000e\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0004B\u001b\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0011R\u0019\u0010\u0007\u001a\u0004\u0018\u00018\u00008\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0016¨\u0006\u0017"}, d2 = {"LL1/a;", "LXH/i;", "", "T", "", "", "label", "action", "<init>", "(Ljava/lang/String;LXH/i;)V", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "LXH/i;", "()LXH/i;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class a<T extends C16818i<? extends Boolean>> {

    /* renamed from: a  reason: collision with root package name */
    private final String f8914a;

    /* renamed from: b  reason: collision with root package name */
    private final T f8915b;

    public a(String str, T t10) {
        this.f8914a = str;
        this.f8915b = t10;
    }

    public final T a() {
        return this.f8915b;
    }

    public final String b() {
        return this.f8914a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return C17542s.e(this.f8914a, aVar.f8914a) && C17542s.e(this.f8915b, aVar.f8915b);
    }

    public int hashCode() {
        String str = this.f8914a;
        int i10 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        T t10 = this.f8915b;
        if (t10 != null) {
            i10 = t10.hashCode();
        }
        return hashCode + i10;
    }

    public String toString() {
        return "AccessibilityAction(label=" + this.f8914a + ", action=" + this.f8915b + ')';
    }
}
