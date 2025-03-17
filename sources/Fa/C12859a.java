package FA;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0016¨\u0006\u0017"}, d2 = {"LFA/a;", "", "", "listName", "", "LFA/a$a;", "items", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Ljava/util/List;", "()Ljava/util/List;", "shareprovider_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: FA.a  reason: case insensitive filesystem */
public final class C12859a {

    /* renamed from: a  reason: collision with root package name */
    private final String f109741a;

    /* renamed from: b  reason: collision with root package name */
    private final List<C2618a> f109742b;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0013\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\f¨\u0006\u0016"}, d2 = {"LFA/a$a;", "", "", "itemNo", "itemType", "", "quantity", "<init>", "(Ljava/lang/String;Ljava/lang/String;I)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "I", "shareprovider_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: FA.a$a  reason: collision with other inner class name */
    public static final class C2618a {

        /* renamed from: a  reason: collision with root package name */
        private final String f109743a;

        /* renamed from: b  reason: collision with root package name */
        private final String f109744b;

        /* renamed from: c  reason: collision with root package name */
        private final int f109745c;

        public C2618a(String str, String str2, int i10) {
            C17542s.j(str, "itemNo");
            C17542s.j(str2, "itemType");
            this.f109743a = str;
            this.f109744b = str2;
            this.f109745c = i10;
        }

        public final String a() {
            return this.f109743a;
        }

        public final String b() {
            return this.f109744b;
        }

        public final int c() {
            return this.f109745c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2618a)) {
                return false;
            }
            C2618a aVar = (C2618a) obj;
            return C17542s.e(this.f109743a, aVar.f109743a) && C17542s.e(this.f109744b, aVar.f109744b) && this.f109745c == aVar.f109745c;
        }

        public int hashCode() {
            return (((this.f109743a.hashCode() * 31) + this.f109744b.hashCode()) * 31) + Integer.hashCode(this.f109745c);
        }

        public String toString() {
            String str = this.f109743a;
            String str2 = this.f109744b;
            int i10 = this.f109745c;
            return "SharedItem(itemNo=" + str + ", itemType=" + str2 + ", quantity=" + i10 + ")";
        }
    }

    public C12859a(String str, List<C2618a> list) {
        C17542s.j(str, "listName");
        C17542s.j(list, "items");
        this.f109741a = str;
        this.f109742b = list;
    }

    public final List<C2618a> a() {
        return this.f109742b;
    }

    public final String b() {
        return this.f109741a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12859a)) {
            return false;
        }
        C12859a aVar = (C12859a) obj;
        return C17542s.e(this.f109741a, aVar.f109741a) && C17542s.e(this.f109742b, aVar.f109742b);
    }

    public int hashCode() {
        return (this.f109741a.hashCode() * 31) + this.f109742b.hashCode();
    }

    public String toString() {
        String str = this.f109741a;
        List<C2618a> list = this.f109742b;
        return "SharedListHolder(listName=" + str + ", items=" + list + ")";
    }
}
