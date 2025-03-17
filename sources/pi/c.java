package pi;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0013\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\f¨\u0006\u0016"}, d2 = {"Lpi/c;", "", "", "productNo", "productType", "", "quantity", "<init>", "(Ljava/lang/String;Ljava/lang/String;I)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "I", "cart-data-layer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final String f75961a;

    /* renamed from: b  reason: collision with root package name */
    private final String f75962b;

    /* renamed from: c  reason: collision with root package name */
    private final int f75963c;

    public c(String str, String str2, int i10) {
        C17542s.j(str, "productNo");
        C17542s.j(str2, "productType");
        this.f75961a = str;
        this.f75962b = str2;
        this.f75963c = i10;
    }

    public final String a() {
        return this.f75961a;
    }

    public final String b() {
        return this.f75962b;
    }

    public final int c() {
        return this.f75963c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return C17542s.e(this.f75961a, cVar.f75961a) && C17542s.e(this.f75962b, cVar.f75962b) && this.f75963c == cVar.f75963c;
    }

    public int hashCode() {
        return (((this.f75961a.hashCode() * 31) + this.f75962b.hashCode()) * 31) + Integer.hashCode(this.f75963c);
    }

    public String toString() {
        String str = this.f75961a;
        String str2 = this.f75962b;
        int i10 = this.f75963c;
        return "CartItemEntity(productNo=" + str + ", productType=" + str2 + ", quantity=" + i10 + ")";
    }
}
