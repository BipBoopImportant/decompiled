package I7;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class k implements i {

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, List<j>> f37018c;

    /* renamed from: d  reason: collision with root package name */
    private volatile Map<String, String> f37019d;

    public static final class a {

        /* renamed from: d  reason: collision with root package name */
        private static final String f37020d;

        /* renamed from: e  reason: collision with root package name */
        private static final Map<String, List<j>> f37021e;

        /* renamed from: a  reason: collision with root package name */
        private boolean f37022a = true;

        /* renamed from: b  reason: collision with root package name */
        private Map<String, List<j>> f37023b = f37021e;

        /* renamed from: c  reason: collision with root package name */
        private boolean f37024c = true;

        static {
            String g10 = g();
            f37020d = g10;
            HashMap hashMap = new HashMap(2);
            if (!TextUtils.isEmpty(g10)) {
                hashMap.put("User-Agent", Collections.singletonList(new b(g10)));
            }
            f37021e = Collections.unmodifiableMap(hashMap);
        }

        private Map<String, List<j>> d() {
            HashMap hashMap = new HashMap(this.f37023b.size());
            for (Map.Entry next : this.f37023b.entrySet()) {
                hashMap.put(next.getKey(), new ArrayList((Collection) next.getValue()));
            }
            return hashMap;
        }

        private void e() {
            if (this.f37022a) {
                this.f37022a = false;
                this.f37023b = d();
            }
        }

        private List<j> f(String str) {
            List<j> list = this.f37023b.get(str);
            if (list != null) {
                return list;
            }
            ArrayList arrayList = new ArrayList();
            this.f37023b.put(str, arrayList);
            return arrayList;
        }

        static String g() {
            String property = System.getProperty("http.agent");
            if (TextUtils.isEmpty(property)) {
                return property;
            }
            int length = property.length();
            StringBuilder sb2 = new StringBuilder(property.length());
            for (int i10 = 0; i10 < length; i10++) {
                char charAt = property.charAt(i10);
                if ((charAt > 31 || charAt == 9) && charAt < 127) {
                    sb2.append(charAt);
                } else {
                    sb2.append('?');
                }
            }
            return sb2.toString();
        }

        public a a(String str, j jVar) {
            if (this.f37024c && "User-Agent".equalsIgnoreCase(str)) {
                return h(str, jVar);
            }
            e();
            f(str).add(jVar);
            return this;
        }

        public a b(String str, String str2) {
            return a(str, new b(str2));
        }

        public k c() {
            this.f37022a = true;
            return new k(this.f37023b);
        }

        public a h(String str, j jVar) {
            e();
            if (jVar == null) {
                this.f37023b.remove(str);
            } else {
                List<j> f10 = f(str);
                f10.clear();
                f10.add(jVar);
            }
            if (this.f37024c && "User-Agent".equalsIgnoreCase(str)) {
                this.f37024c = false;
            }
            return this;
        }
    }

    static final class b implements j {

        /* renamed from: a  reason: collision with root package name */
        private final String f37025a;

        b(String str) {
            this.f37025a = str;
        }

        public String a() {
            return this.f37025a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.f37025a.equals(((b) obj).f37025a);
            }
            return false;
        }

        public int hashCode() {
            return this.f37025a.hashCode();
        }

        public String toString() {
            return "StringHeaderFactory{value='" + this.f37025a + '\'' + '}';
        }
    }

    k(Map<String, List<j>> map) {
        this.f37018c = Collections.unmodifiableMap(map);
    }

    private String b(List<j> list) {
        StringBuilder sb2 = new StringBuilder();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            String a10 = list.get(i10).a();
            if (!TextUtils.isEmpty(a10)) {
                sb2.append(a10);
                if (i10 != list.size() - 1) {
                    sb2.append(',');
                }
            }
        }
        return sb2.toString();
    }

    private Map<String, String> c() {
        HashMap hashMap = new HashMap();
        for (Map.Entry next : this.f37018c.entrySet()) {
            String b10 = b((List) next.getValue());
            if (!TextUtils.isEmpty(b10)) {
                hashMap.put(next.getKey(), b10);
            }
        }
        return hashMap;
    }

    public Map<String, String> a() {
        if (this.f37019d == null) {
            synchronized (this) {
                try {
                    if (this.f37019d == null) {
                        this.f37019d = Collections.unmodifiableMap(c());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f37019d;
    }

    public boolean equals(Object obj) {
        if (obj instanceof k) {
            return this.f37018c.equals(((k) obj).f37018c);
        }
        return false;
    }

    public int hashCode() {
        return this.f37018c.hashCode();
    }

    public String toString() {
        return "LazyHeaders{headers=" + this.f37018c + '}';
    }
}
