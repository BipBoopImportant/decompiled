package eo;

import Op.a1;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0010\b\b\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0018\u0010\u000fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0013\u0010\u001a¨\u0006\u001b"}, d2 = {"Leo/c;", "", "", "LOp/a1;", "products", "", "totalQuantity", "", "defaultExpandedState", "<init>", "(Ljava/util/List;IZ)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "I", "c", "Z", "()Z", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final List<a1> f97159a;

    /* renamed from: b  reason: collision with root package name */
    private final int f97160b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f97161c;

    public c(List<a1> list, int i10, boolean z10) {
        C17542s.j(list, "products");
        this.f97159a = list;
        this.f97160b = i10;
        this.f97161c = z10;
    }

    public final boolean a() {
        return this.f97161c;
    }

    public final List<a1> b() {
        return this.f97159a;
    }

    public final int c() {
        return this.f97160b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return C17542s.e(this.f97159a, cVar.f97159a) && this.f97160b == cVar.f97160b && this.f97161c == cVar.f97161c;
    }

    public int hashCode() {
        return (((this.f97159a.hashCode() * 31) + Integer.hashCode(this.f97160b)) * 31) + Boolean.hashCode(this.f97161c);
    }

    public String toString() {
        List<a1> list = this.f97159a;
        int i10 = this.f97160b;
        boolean z10 = this.f97161c;
        return "OrderSummaryData(products=" + list + ", totalQuantity=" + i10 + ", defaultExpandedState=" + z10 + ")";
    }
}
