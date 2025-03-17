package gB;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"LgB/h;", "", "LgB/g;", "item", "", "LgB/d;", "salesPrices", "<init>", "(LgB/g;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LgB/g;", "()LgB/g;", "b", "Ljava/util/List;", "()Ljava/util/List;", "shoppinglist-datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: gB.h  reason: case insensitive filesystem */
public final class C14506h {

    /* renamed from: a  reason: collision with root package name */
    private final C14505g f127287a;

    /* renamed from: b  reason: collision with root package name */
    private final List<C14502d> f127288b;

    public C14506h(C14505g gVar, List<C14502d> list) {
        C17542s.j(gVar, "item");
        C17542s.j(list, "salesPrices");
        this.f127287a = gVar;
        this.f127288b = list;
    }

    public final C14505g a() {
        return this.f127287a;
    }

    public final List<C14502d> b() {
        return this.f127288b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14506h)) {
            return false;
        }
        C14506h hVar = (C14506h) obj;
        return C17542s.e(this.f127287a, hVar.f127287a) && C17542s.e(this.f127288b, hVar.f127288b);
    }

    public int hashCode() {
        return (this.f127287a.hashCode() * 31) + this.f127288b.hashCode();
    }

    public String toString() {
        C14505g gVar = this.f127287a;
        List<C14502d> list = this.f127288b;
        return "ShoppingListItemWithPrices(item=" + gVar + ", salesPrices=" + list + ")";
    }
}
