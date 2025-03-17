package Vi;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0014\u001a\u0004\b\u0010\u0010\t¨\u0006\u0015"}, d2 = {"LVi/C;", "", "", "hasTerms", "", "currentEmailAddress", "<init>", "(ZLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "b", "()Z", "Ljava/lang/String;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class C {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f88483a;

    /* renamed from: b  reason: collision with root package name */
    private final String f88484b;

    public C(boolean z10, String str) {
        C17542s.j(str, "currentEmailAddress");
        this.f88483a = z10;
        this.f88484b = str;
    }

    public final String a() {
        return this.f88484b;
    }

    public final boolean b() {
        return this.f88483a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C)) {
            return false;
        }
        C c10 = (C) obj;
        return this.f88483a == c10.f88483a && C17542s.e(this.f88484b, c10.f88484b);
    }

    public int hashCode() {
        return (Boolean.hashCode(this.f88483a) * 31) + this.f88484b.hashCode();
    }

    public String toString() {
        boolean z10 = this.f88483a;
        String str = this.f88484b;
        return "EmailAndTermsDelegateModel(hasTerms=" + z10 + ", currentEmailAddress=" + str + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C(boolean z10, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, (i10 & 2) != 0 ? "" : str);
    }
}
