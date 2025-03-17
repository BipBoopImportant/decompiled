package uk;

import De.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0018\u001a\u0004\b\u0015\u0010\u0019¨\u0006\u001a"}, d2 = {"Luk/C1;", "", "", "itemNo", "LDe/a;", "component", "", "fromShoppingList", "<init>", "(Ljava/lang/String;LDe/a;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "LDe/a;", "()LDe/a;", "Z", "()Z", "shoppinglist-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class C1 {

    /* renamed from: a  reason: collision with root package name */
    private final String f103439a;

    /* renamed from: b  reason: collision with root package name */
    private final a f103440b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f103441c;

    public C1(String str, a aVar, boolean z10) {
        C17542s.j(str, "itemNo");
        C17542s.j(aVar, "component");
        this.f103439a = str;
        this.f103440b = aVar;
        this.f103441c = z10;
    }

    public final a a() {
        return this.f103440b;
    }

    public final boolean b() {
        return this.f103441c;
    }

    public final String c() {
        return this.f103439a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1)) {
            return false;
        }
        C1 c12 = (C1) obj;
        return C17542s.e(this.f103439a, c12.f103439a) && C17542s.e(this.f103440b, c12.f103440b) && this.f103441c == c12.f103441c;
    }

    public int hashCode() {
        return (((this.f103439a.hashCode() * 31) + this.f103440b.hashCode()) * 31) + Boolean.hashCode(this.f103441c);
    }

    public String toString() {
        String str = this.f103439a;
        a aVar = this.f103440b;
        boolean z10 = this.f103441c;
        return "PipNavigationData(itemNo=" + str + ", component=" + aVar + ", fromShoppingList=" + z10 + ")";
    }
}
