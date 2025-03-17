package g6;

import YH.C16877v;
import YH.X;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000b2\u00020\u0001:\u0002\u0010\u000bB#\b\u0002\u0012\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\t\u001a\u0004\u0018\u00010\u00032\u0006\u0010\b\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00040\u0002¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fR&\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00040\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lg6/n;", "", "", "", "", "data", "<init>", "(Ljava/util/Map;)V", "key", "c", "(Ljava/lang/String;)Ljava/lang/String;", "b", "()Ljava/util/Map;", "Lg6/n$a;", "d", "()Lg6/n$a;", "a", "Ljava/util/Map;", "coil-network-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: g6.n  reason: case insensitive filesystem */
public final class C7886n {

    /* renamed from: b  reason: collision with root package name */
    public static final b f51326b = new b((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final C7886n f51327c = new a().b();
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, List<String>> f51328a;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lg6/n$b;", "", "<init>", "()V", "Lg6/n;", "EMPTY", "Lg6/n;", "coil-network-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: g6.n$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public /* synthetic */ C7886n(Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(map);
    }

    public final Map<String, List<String>> b() {
        return this.f51328a;
    }

    public final String c(String str) {
        Map<String, List<String>> map = this.f51328a;
        String lowerCase = str.toLowerCase(Locale.ROOT);
        C17542s.i(lowerCase, "toLowerCase(...)");
        List list = map.get(lowerCase);
        if (list != null) {
            return (String) C16877v.K0(list);
        }
        return null;
    }

    public final a d() {
        return new a(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7886n) && C17542s.e(this.f51328a, ((C7886n) obj).f51328a);
    }

    public int hashCode() {
        return this.f51328a.hashCode();
    }

    public String toString() {
        return "NetworkHeaders(data=" + this.f51328a + ')';
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010%\n\u0002\u0010!\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006J \u0010\n\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\u000e\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0010\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\u0010\u0010\u000bJ\r\u0010\u0011\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0012R&\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00140\u00138\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0015¨\u0006\u0017"}, d2 = {"Lg6/n$a;", "", "<init>", "()V", "Lg6/n;", "headers", "(Lg6/n;)V", "", "key", "value", "c", "(Ljava/lang/String;Ljava/lang/String;)Lg6/n$a;", "", "values", "d", "(Ljava/lang/String;Ljava/util/List;)Lg6/n$a;", "a", "b", "()Lg6/n;", "", "", "Ljava/util/Map;", "data", "coil-network-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: g6.n$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final Map<String, List<String>> f51329a;

        public a() {
            this.f51329a = new LinkedHashMap();
        }

        public final a a(String str, String str2) {
            Map<String, List<String>> map = this.f51329a;
            String lowerCase = str.toLowerCase(Locale.ROOT);
            C17542s.i(lowerCase, "toLowerCase(...)");
            List<String> list = map.get(lowerCase);
            if (list == null) {
                list = new ArrayList<>();
                map.put(lowerCase, list);
            }
            list.add(str2);
            return this;
        }

        public final C7886n b() {
            return new C7886n(X.x(this.f51329a), (DefaultConstructorMarker) null);
        }

        public final a c(String str, String str2) {
            Map<String, List<String>> map = this.f51329a;
            String lowerCase = str.toLowerCase(Locale.ROOT);
            C17542s.i(lowerCase, "toLowerCase(...)");
            map.put(lowerCase, C16877v.t(str2));
            return this;
        }

        public final a d(String str, List<String> list) {
            Map<String, List<String>> map = this.f51329a;
            String lowerCase = str.toLowerCase(Locale.ROOT);
            C17542s.i(lowerCase, "toLowerCase(...)");
            map.put(lowerCase, C16877v.w1(list));
            return this;
        }

        public a(C7886n nVar) {
            Map a10 = nVar.f51328a;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : a10.entrySet()) {
                linkedHashMap.put(entry.getKey(), C16877v.w1((Collection) entry.getValue()));
            }
            this.f51329a = linkedHashMap;
        }
    }

    private C7886n(Map<String, ? extends List<String>> map) {
        this.f51328a = map;
    }
}
