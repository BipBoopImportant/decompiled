package Gx;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u0012\u0010\u000b¨\u0006\u0016"}, d2 = {"LGx/b;", "", "", "approved", "", "callbackUrl", "<init>", "(ZLjava/lang/String;)V", "b", "()Z", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "getApproved", "Ljava/lang/String;", "purchasehistorydata_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f110515a;

    /* renamed from: b  reason: collision with root package name */
    private final String f110516b;

    public b(boolean z10, String str) {
        this.f110515a = z10;
        this.f110516b = str;
    }

    public final String a() {
        return this.f110516b;
    }

    public final boolean b() {
        return this.f110515a && this.f110516b != null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f110515a == bVar.f110515a && C17542s.e(this.f110516b, bVar.f110516b);
    }

    public int hashCode() {
        int hashCode = Boolean.hashCode(this.f110515a) * 31;
        String str = this.f110516b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        boolean z10 = this.f110515a;
        String str = this.f110516b;
        return "ReturnAuthorization(approved=" + z10 + ", callbackUrl=" + str + ")";
    }
}
