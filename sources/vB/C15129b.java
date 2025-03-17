package vB;

import KJ.C15987c;
import fI.C17221b;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\f\b\b\u0018\u00002\u00020\u0001:\u0001\u0017B)\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u0004\u0018\u00010\u00072\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0006¢\u0006\f\n\u0004\b\r\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"LvB/b;", "", "LKJ/c;", "LvB/a;", "carouselShoppingList", "", "LvB/b$a;", "", "emptyStateImages", "<init>", "(LKJ/c;Ljava/util/Map;)V", "", "isCompact", "b", "(Z)Ljava/lang/String;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "LKJ/c;", "()LKJ/c;", "Ljava/util/Map;", "getEmptyStateImages", "()Ljava/util/Map;", "shoppinglist_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: vB.b  reason: case insensitive filesystem */
public final class C15129b {

    /* renamed from: c  reason: collision with root package name */
    public static final int f131420c = 8;

    /* renamed from: a  reason: collision with root package name */
    private final C15987c<C15128a> f131421a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<a, String> f131422b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"LvB/b$a;", "", "<init>", "(Ljava/lang/String;I)V", "PORTRAIT", "LANDSCAPE", "shoppinglist_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: vB.b$a */
    public enum a {
        PORTRAIT,
        LANDSCAPE;

        static {
            a[] a10;
            $ENTRIES = C17221b.a(a10);
        }
    }

    public C15129b(C15987c<C15128a> cVar, Map<a, String> map) {
        C17542s.j(cVar, "carouselShoppingList");
        C17542s.j(map, "emptyStateImages");
        this.f131421a = cVar;
        this.f131422b = map;
    }

    public final C15987c<C15128a> a() {
        return this.f131421a;
    }

    public final String b(boolean z10) {
        a aVar = a.PORTRAIT;
        if (!z10) {
            aVar = null;
        }
        if (aVar == null) {
            aVar = a.LANDSCAPE;
        }
        return this.f131422b.get(aVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15129b)) {
            return false;
        }
        C15129b bVar = (C15129b) obj;
        return C17542s.e(this.f131421a, bVar.f131421a) && C17542s.e(this.f131422b, bVar.f131422b);
    }

    public int hashCode() {
        return (this.f131421a.hashCode() * 31) + this.f131422b.hashCode();
    }

    public String toString() {
        C15987c<C15128a> cVar = this.f131421a;
        Map<a, String> map = this.f131422b;
        return "CarouselShoppingListState(carouselShoppingList=" + cVar + ", emptyStateImages=" + map + ")";
    }
}
