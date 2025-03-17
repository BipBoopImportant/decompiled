package cp;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\u0006J\u001e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcp/e;", "", "", "uriString", "LXH/x;", "Lcp/e$a;", "a", "(Ljava/lang/String;)Ljava/lang/Object;", "core-android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface e {

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0013\u0010\u000bR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0017\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcp/e$a;", "", "", "originalValue", "path", "authority", "", "queries", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "getPath", "c", "d", "Ljava/util/Map;", "()Ljava/util/Map;", "core-android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final String f96745a;

        /* renamed from: b  reason: collision with root package name */
        private final String f96746b;

        /* renamed from: c  reason: collision with root package name */
        private final String f96747c;

        /* renamed from: d  reason: collision with root package name */
        private final Map<String, String> f96748d;

        public a(String str, String str2, String str3, Map<String, String> map) {
            C17542s.j(str, "originalValue");
            C17542s.j(str2, "path");
            C17542s.j(str3, "authority");
            C17542s.j(map, "queries");
            this.f96745a = str;
            this.f96746b = str2;
            this.f96747c = str3;
            this.f96748d = map;
        }

        public final String a() {
            return this.f96747c;
        }

        public final String b() {
            return this.f96745a;
        }

        public final Map<String, String> c() {
            return this.f96748d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f96745a, aVar.f96745a) && C17542s.e(this.f96746b, aVar.f96746b) && C17542s.e(this.f96747c, aVar.f96747c) && C17542s.e(this.f96748d, aVar.f96748d);
        }

        public int hashCode() {
            return (((((this.f96745a.hashCode() * 31) + this.f96746b.hashCode()) * 31) + this.f96747c.hashCode()) * 31) + this.f96748d.hashCode();
        }

        public String toString() {
            String str = this.f96745a;
            String str2 = this.f96746b;
            String str3 = this.f96747c;
            Map<String, String> map = this.f96748d;
            return "UriResult(originalValue=" + str + ", path=" + str2 + ", authority=" + str3 + ", queries=" + map + ")";
        }
    }

    Object a(String str);
}
