package x3;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class n implements l {

    /* renamed from: c  reason: collision with root package name */
    public static final n f31943c = new n(Collections.emptyMap());

    /* renamed from: a  reason: collision with root package name */
    private int f31944a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, byte[]> f31945b;

    public n() {
        this(Collections.emptyMap());
    }

    private static void e(HashMap<String, byte[]> hashMap, Map<String, Object> map) {
        for (Map.Entry next : map.entrySet()) {
            hashMap.put((String) next.getKey(), i(next.getValue()));
        }
    }

    private static Map<String, byte[]> f(Map<String, byte[]> map, m mVar) {
        HashMap hashMap = new HashMap(map);
        k(hashMap, mVar.c());
        e(hashMap, mVar.b());
        return hashMap;
    }

    private static byte[] i(Object obj) {
        if (obj instanceof Long) {
            return ByteBuffer.allocate(8).putLong(((Long) obj).longValue()).array();
        }
        if (obj instanceof String) {
            return ((String) obj).getBytes(StandardCharsets.UTF_8);
        }
        if (obj instanceof byte[]) {
            return (byte[]) obj;
        }
        throw new IllegalArgumentException();
    }

    private static boolean j(Map<String, byte[]> map, Map<String, byte[]> map2) {
        if (map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry next : map.entrySet()) {
            if (!Arrays.equals((byte[]) next.getValue(), map2.get(next.getKey()))) {
                return false;
            }
        }
        return true;
    }

    private static void k(HashMap<String, byte[]> hashMap, List<String> list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            hashMap.remove(list.get(i10));
        }
    }

    public final long b(String str, long j10) {
        byte[] bArr = this.f31945b.get(str);
        return bArr != null ? ByteBuffer.wrap(bArr).getLong() : j10;
    }

    public final String d(String str, String str2) {
        byte[] bArr = this.f31945b.get(str);
        return bArr != null ? new String(bArr, StandardCharsets.UTF_8) : str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n.class != obj.getClass()) {
            return false;
        }
        return j(this.f31945b, ((n) obj).f31945b);
    }

    public n g(m mVar) {
        Map<String, byte[]> f10 = f(this.f31945b, mVar);
        return j(this.f31945b, f10) ? this : new n(f10);
    }

    public Set<Map.Entry<String, byte[]>> h() {
        return this.f31945b.entrySet();
    }

    public int hashCode() {
        if (this.f31944a == 0) {
            int i10 = 0;
            for (Map.Entry next : this.f31945b.entrySet()) {
                i10 += Arrays.hashCode((byte[]) next.getValue()) ^ ((String) next.getKey()).hashCode();
            }
            this.f31944a = i10;
        }
        return this.f31944a;
    }

    public n(Map<String, byte[]> map) {
        this.f31945b = Collections.unmodifiableMap(map);
    }
}
