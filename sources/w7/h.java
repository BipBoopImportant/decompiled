package w7;

import HJ.C15854t;
import YH.X;
import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\b\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\b0\u0006¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0017\u0010\u001cR)\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\b0\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001d\u001a\u0004\b\u001a\u0010\u001e¨\u0006\u001f"}, d2 = {"Lw7/h;", "", "", "statusCode", "Ljava/io/InputStream;", "body", "", "", "", "headers", "<init>", "(ILjava/io/InputStream;Ljava/util/Map;)V", "", "e", "()Z", "d", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "I", "c", "b", "Ljava/io/InputStream;", "()Ljava/io/InputStream;", "Ljava/util/Map;", "()Ljava/util/Map;", "auth0_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class h {

    /* renamed from: a  reason: collision with root package name */
    private final int f57345a;

    /* renamed from: b  reason: collision with root package name */
    private final InputStream f57346b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, List<String>> f57347c;

    public h(int i10, InputStream inputStream, Map<String, ? extends List<String>> map) {
        C17542s.j(inputStream, "body");
        C17542s.j(map, "headers");
        this.f57345a = i10;
        this.f57346b = inputStream;
        this.f57347c = map;
    }

    public final InputStream a() {
        return this.f57346b;
    }

    public final Map<String, List<String>> b() {
        return this.f57347c;
    }

    public final int c() {
        return this.f57345a;
    }

    public final boolean d() {
        Map<String, List<String>> map = this.f57347c;
        LinkedHashMap linkedHashMap = new LinkedHashMap(X.e(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            Locale locale = Locale.getDefault();
            C17542s.i(locale, "getDefault()");
            String lowerCase = ((String) entry.getKey()).toLowerCase(locale);
            C17542s.i(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            linkedHashMap.put(lowerCase, entry.getValue());
        }
        List<String> list = (List) linkedHashMap.get("content-type");
        if (list == null) {
            return false;
        }
        for (String b02 : list) {
            if (C15854t.b0(b02, "application/json", true)) {
                return true;
            }
        }
        return false;
    }

    public final boolean e() {
        int i10 = this.f57345a;
        return 200 <= i10 && i10 < 300;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f57345a == hVar.f57345a && C17542s.e(this.f57346b, hVar.f57346b) && C17542s.e(this.f57347c, hVar.f57347c);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f57345a) * 31) + this.f57346b.hashCode()) * 31) + this.f57347c.hashCode();
    }

    public String toString() {
        return "ServerResponse(statusCode=" + this.f57345a + ", body=" + this.f57346b + ", headers=" + this.f57347c + ')';
    }
}
