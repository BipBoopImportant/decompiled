package Nn;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"LNn/S;", "", "<init>", "()V", "a", "b", "LNn/S$a;", "LNn/S$b;", "onlinecheckout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class S {

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B)\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R&\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00058\u0016X\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"LNn/S$a;", "LNn/S;", "", "", "displayTexts", "", "data", "<init>", "(Ljava/util/List;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "Ljava/util/Map;", "()Ljava/util/Map;", "onlinecheckout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends S {

        /* renamed from: a  reason: collision with root package name */
        private final List<String> f84011a;

        /* renamed from: b  reason: collision with root package name */
        private final Map<String, String> f84012b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(List<String> list, Map<String, String> map) {
            super((DefaultConstructorMarker) null);
            C17542s.j(list, "displayTexts");
            C17542s.j(map, "data");
            this.f84011a = list;
            this.f84012b = map;
        }

        public Map<String, String> a() {
            return this.f84012b;
        }

        public List<String> b() {
            return this.f84011a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f84011a, aVar.f84011a) && C17542s.e(this.f84012b, aVar.f84012b);
        }

        public int hashCode() {
            return (this.f84011a.hashCode() * 31) + this.f84012b.hashCode();
        }

        public String toString() {
            List<String> list = this.f84011a;
            Map<String, String> map = this.f84012b;
            return "Add(displayTexts=" + list + ", data=" + map + ")";
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B1\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R&\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00058\u0016X\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001b\u001a\u0004\b\u0014\u0010\u000b¨\u0006\u001c"}, d2 = {"LNn/S$b;", "LNn/S;", "", "", "displayTexts", "", "data", "addressId", "<init>", "(Ljava/util/List;Ljava/util/Map;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "c", "()Ljava/util/List;", "b", "Ljava/util/Map;", "()Ljava/util/Map;", "Ljava/lang/String;", "onlinecheckout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends S {

        /* renamed from: a  reason: collision with root package name */
        private final List<String> f84013a;

        /* renamed from: b  reason: collision with root package name */
        private final Map<String, String> f84014b;

        /* renamed from: c  reason: collision with root package name */
        private final String f84015c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(List<String> list, Map<String, String> map, String str) {
            super((DefaultConstructorMarker) null);
            C17542s.j(list, "displayTexts");
            C17542s.j(map, "data");
            C17542s.j(str, "addressId");
            this.f84013a = list;
            this.f84014b = map;
            this.f84015c = str;
        }

        public final String a() {
            return this.f84015c;
        }

        public Map<String, String> b() {
            return this.f84014b;
        }

        public List<String> c() {
            return this.f84013a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return C17542s.e(this.f84013a, bVar.f84013a) && C17542s.e(this.f84014b, bVar.f84014b) && C17542s.e(this.f84015c, bVar.f84015c);
        }

        public int hashCode() {
            return (((this.f84013a.hashCode() * 31) + this.f84014b.hashCode()) * 31) + this.f84015c.hashCode();
        }

        public String toString() {
            List<String> list = this.f84013a;
            Map<String, String> map = this.f84014b;
            String str = this.f84015c;
            return "Update(displayTexts=" + list + ", data=" + map + ", addressId=" + str + ")";
        }
    }

    public /* synthetic */ S(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private S() {
    }
}
