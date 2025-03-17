package pk;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0014¨\u0006\u0015"}, d2 = {"Lpk/n;", "", "", "storeName", "", "inStoreModeEnabled", "<init>", "(Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Z", "()Z", "shoppinglist-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class n {

    /* renamed from: a  reason: collision with root package name */
    private final String f101012a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f101013b;

    public n(String str, boolean z10) {
        this.f101012a = str;
        this.f101013b = z10;
    }

    public final boolean a() {
        return this.f101013b;
    }

    public final String b() {
        return this.f101012a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return C17542s.e(this.f101012a, nVar.f101012a) && this.f101013b == nVar.f101013b;
    }

    public int hashCode() {
        String str = this.f101012a;
        return ((str == null ? 0 : str.hashCode()) * 31) + Boolean.hashCode(this.f101013b);
    }

    public String toString() {
        String str = this.f101012a;
        boolean z10 = this.f101013b;
        return "OnlineOrInStoreToggle(storeName=" + str + ", inStoreModeEnabled=" + z10 + ")";
    }
}
