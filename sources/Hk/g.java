package hk;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\t\u0006B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b\u0001\u0002\n\u000b¨\u0006\f"}, d2 = {"Lhk/g;", "", "", "name", "<init>", "(Ljava/lang/String;)V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "b", "Lhk/g$a;", "Lhk/g$b;", "shareprovider_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class g {

    /* renamed from: a  reason: collision with root package name */
    private final String f98072a;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0015\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0014\u0010\t¨\u0006\u0016"}, d2 = {"Lhk/g$a;", "Lhk/g;", "", "link", "productName", "productDescription", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "c", "d", "shareprovider_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends g {

        /* renamed from: e  reason: collision with root package name */
        public static final int f98073e = 0;

        /* renamed from: b  reason: collision with root package name */
        private final String f98074b;

        /* renamed from: c  reason: collision with root package name */
        private final String f98075c;

        /* renamed from: d  reason: collision with root package name */
        private final String f98076d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, String str3) {
            super(str2, (DefaultConstructorMarker) null);
            C17542s.j(str, "link");
            C17542s.j(str2, "productName");
            this.f98074b = str;
            this.f98075c = str2;
            this.f98076d = str3;
        }

        public final String b() {
            return this.f98074b;
        }

        public final String c() {
            return this.f98076d;
        }

        public final String d() {
            return this.f98075c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f98074b, aVar.f98074b) && C17542s.e(this.f98075c, aVar.f98075c) && C17542s.e(this.f98076d, aVar.f98076d);
        }

        public int hashCode() {
            int hashCode = ((this.f98074b.hashCode() * 31) + this.f98075c.hashCode()) * 31;
            String str = this.f98076d;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            String str = this.f98074b;
            String str2 = this.f98075c;
            String str3 = this.f98076d;
            return "ShareItem(link=" + str + ", productName=" + str2 + ", productDescription=" + str3 + ")";
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Lhk/g$b;", "Lhk/g;", "", "link", "listName", "", "isCart", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "c", "d", "Z", "()Z", "shareprovider_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends g {

        /* renamed from: e  reason: collision with root package name */
        public static final int f98077e = 0;

        /* renamed from: b  reason: collision with root package name */
        private final String f98078b;

        /* renamed from: c  reason: collision with root package name */
        private final String f98079c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f98080d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(String str, String str2, boolean z10) {
            super(str2, (DefaultConstructorMarker) null);
            C17542s.j(str, "link");
            C17542s.j(str2, "listName");
            this.f98078b = str;
            this.f98079c = str2;
            this.f98080d = z10;
        }

        public final String b() {
            return this.f98078b;
        }

        public final String c() {
            return this.f98079c;
        }

        public final boolean d() {
            return this.f98080d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return C17542s.e(this.f98078b, bVar.f98078b) && C17542s.e(this.f98079c, bVar.f98079c) && this.f98080d == bVar.f98080d;
        }

        public int hashCode() {
            return (((this.f98078b.hashCode() * 31) + this.f98079c.hashCode()) * 31) + Boolean.hashCode(this.f98080d);
        }

        public String toString() {
            String str = this.f98078b;
            String str2 = this.f98079c;
            boolean z10 = this.f98080d;
            return "ShareList(link=" + str + ", listName=" + str2 + ", isCart=" + z10 + ")";
        }
    }

    public /* synthetic */ g(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public final String a() {
        return this.f98072a;
    }

    private g(String str) {
        this.f98072a = str;
    }
}
