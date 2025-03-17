package Yn;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0011\u0010\n¨\u0006\u0016"}, d2 = {"LYn/F;", "", "", "productNumber", "", "quantity", "imageUrl", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "I", "c", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class F {

    /* renamed from: a  reason: collision with root package name */
    private final String f89338a;

    /* renamed from: b  reason: collision with root package name */
    private final int f89339b;

    /* renamed from: c  reason: collision with root package name */
    private final String f89340c;

    public F(String str, int i10, String str2) {
        C17542s.j(str, "productNumber");
        this.f89338a = str;
        this.f89339b = i10;
        this.f89340c = str2;
    }

    public final String a() {
        return this.f89340c;
    }

    public final String b() {
        return this.f89338a;
    }

    public final int c() {
        return this.f89339b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F)) {
            return false;
        }
        F f10 = (F) obj;
        return C17542s.e(this.f89338a, f10.f89338a) && this.f89339b == f10.f89339b && C17542s.e(this.f89340c, f10.f89340c);
    }

    public int hashCode() {
        int hashCode = ((this.f89338a.hashCode() * 31) + Integer.hashCode(this.f89339b)) * 31;
        String str = this.f89340c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.f89338a;
        int i10 = this.f89339b;
        String str2 = this.f89340c;
        return "DeliveryArrangementItem(productNumber=" + str + ", quantity=" + i10 + ", imageUrl=" + str2 + ")";
    }
}
