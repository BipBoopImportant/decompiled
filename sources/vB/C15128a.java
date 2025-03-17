package vB;

import IC.C13020b;
import IC.C13023e;
import IC.C13026h;
import KJ.C15985a;
import KJ.C15987c;
import QA.C13350b;
import QA.C13351c;
import YH.C16877v;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\b\u0018\u0000 \u001e2\u00020\u0001:\u0002\u0017\u0015B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0018\u0010\u000eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0017\u0010\u000eR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001bR\u0011\u0010\"\u001a\u00020 8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010!¨\u0006#"}, d2 = {"LvB/a;", "", "", "id", "name", "imageUrl", "LKJ/c;", "LvB/a$b;", "products", "", "showAvailability", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LKJ/c;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "d", "LKJ/c;", "()LKJ/c;", "e", "Z", "f", "thumbnails", "LIC/e;", "()LIC/e;", "productsLabel", "shoppinglist_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: vB.a  reason: case insensitive filesystem */
public final class C15128a {

    /* renamed from: f  reason: collision with root package name */
    private static final C3257a f131410f = new C3257a((DefaultConstructorMarker) null);

    /* renamed from: g  reason: collision with root package name */
    public static final int f131411g = 0;

    /* renamed from: a  reason: collision with root package name */
    private final String f131412a;

    /* renamed from: b  reason: collision with root package name */
    private final String f131413b;

    /* renamed from: c  reason: collision with root package name */
    private final String f131414c;

    /* renamed from: d  reason: collision with root package name */
    private final C15987c<b> f131415d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f131416e;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LvB/a$a;", "", "<init>", "()V", "", "THUMBNAILS_QUANTITY", "I", "shoppinglist_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: vB.a$a  reason: collision with other inner class name */
    private static final class C3257a {
        public /* synthetic */ C3257a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C3257a() {
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\r\b\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\nR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0011\u0010\nR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0014\u0010\u0017¨\u0006\u0018"}, d2 = {"LvB/a$b;", "", "", "itemNo", "imageUrl", "", "isAvailable", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getItemNo", "b", "c", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "shoppinglist_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: vB.a$b */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final String f131417a;

        /* renamed from: b  reason: collision with root package name */
        private final String f131418b;

        /* renamed from: c  reason: collision with root package name */
        private final Boolean f131419c;

        public b(String str, String str2, Boolean bool) {
            C17542s.j(str, "itemNo");
            this.f131417a = str;
            this.f131418b = str2;
            this.f131419c = bool;
        }

        public final String a() {
            return this.f131418b;
        }

        public final Boolean b() {
            return this.f131419c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return C17542s.e(this.f131417a, bVar.f131417a) && C17542s.e(this.f131418b, bVar.f131418b) && C17542s.e(this.f131419c, bVar.f131419c);
        }

        public int hashCode() {
            int hashCode = this.f131417a.hashCode() * 31;
            String str = this.f131418b;
            int i10 = 0;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            Boolean bool = this.f131419c;
            if (bool != null) {
                i10 = bool.hashCode();
            }
            return hashCode2 + i10;
        }

        public String toString() {
            String str = this.f131417a;
            String str2 = this.f131418b;
            Boolean bool = this.f131419c;
            return "Product(itemNo=" + str + ", imageUrl=" + str2 + ", isAvailable=" + bool + ")";
        }
    }

    public C15128a(String str, String str2, String str3, C15987c<b> cVar, boolean z10) {
        C17542s.j(str, "id");
        C17542s.j(str2, "name");
        C17542s.j(cVar, "products");
        this.f131412a = str;
        this.f131413b = str2;
        this.f131414c = str3;
        this.f131415d = cVar;
        this.f131416e = z10;
    }

    public final String a() {
        return this.f131412a;
    }

    public final String b() {
        return this.f131414c;
    }

    public final String c() {
        return this.f131413b;
    }

    public final C15987c<b> d() {
        return this.f131415d;
    }

    public final C13023e e() {
        if (this.f131415d.isEmpty()) {
            return C13026h.a(C13351c.f114050b);
        }
        if (!this.f131416e) {
            return C13026h.d(C13350b.f114048a, C13020b.a(this.f131415d.size()), Integer.valueOf(this.f131415d.size()));
        }
        C15987c<b> cVar = this.f131415d;
        if (cVar == null || !cVar.isEmpty()) {
            for (b b10 : cVar) {
                if (b10.b() != null) {
                    C15987c<b> cVar2 = this.f131415d;
                    int i10 = 0;
                    if (cVar2 == null || !cVar2.isEmpty()) {
                        for (b b11 : cVar2) {
                            if (C17542s.e(b11.b(), Boolean.TRUE) && (i10 = i10 + 1) < 0) {
                                C16877v.w();
                            }
                        }
                    }
                    return C13026h.b(C13351c.f114051c, Integer.valueOf(i10), Integer.valueOf(this.f131415d.size()));
                }
            }
        }
        return C13026h.a(C13351c.f114052d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15128a)) {
            return false;
        }
        C15128a aVar = (C15128a) obj;
        return C17542s.e(this.f131412a, aVar.f131412a) && C17542s.e(this.f131413b, aVar.f131413b) && C17542s.e(this.f131414c, aVar.f131414c) && C17542s.e(this.f131415d, aVar.f131415d) && this.f131416e == aVar.f131416e;
    }

    public final C15987c<String> f() {
        List list = this.f131415d;
        if (this.f131416e) {
            List arrayList = new ArrayList();
            for (T next : list) {
                if (C17542s.e(((b) next).b(), Boolean.TRUE)) {
                    arrayList.add(next);
                }
            }
            if (arrayList.isEmpty()) {
                arrayList = null;
            }
            if (arrayList != null) {
                list = arrayList;
            }
        }
        Iterable<b> k12 = C16877v.k1(list, 3);
        ArrayList arrayList2 = new ArrayList(C16877v.y(k12, 10));
        for (b a10 : k12) {
            String a11 = a10.a();
            if (a11 == null) {
                a11 = "";
            }
            arrayList2.add(a11);
        }
        return C15985a.l(arrayList2);
    }

    public int hashCode() {
        int hashCode = ((this.f131412a.hashCode() * 31) + this.f131413b.hashCode()) * 31;
        String str = this.f131414c;
        return ((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f131415d.hashCode()) * 31) + Boolean.hashCode(this.f131416e);
    }

    public String toString() {
        String str = this.f131412a;
        String str2 = this.f131413b;
        String str3 = this.f131414c;
        C15987c<b> cVar = this.f131415d;
        boolean z10 = this.f131416e;
        return "CarouselShoppingList(id=" + str + ", name=" + str2 + ", imageUrl=" + str3 + ", products=" + cVar + ", showAvailability=" + z10 + ")";
    }
}
