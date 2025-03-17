package Rl;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0012\u0010\nR#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"LRl/a;", "", "", "domain", "clientId", "", "parameters", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "Ljava/util/Map;", "()Ljava/util/Map;", "appconfig_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final String f86539a;

    /* renamed from: b  reason: collision with root package name */
    private final String f86540b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, String> f86541c;

    public a(String str, String str2, Map<String, String> map) {
        C17542s.j(str, "domain");
        C17542s.j(str2, "clientId");
        C17542s.j(map, "parameters");
        this.f86539a = str;
        this.f86540b = str2;
        this.f86541c = map;
    }

    public final String a() {
        return this.f86540b;
    }

    public final String b() {
        return this.f86539a;
    }

    public final Map<String, String> c() {
        return this.f86541c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return C17542s.e(this.f86539a, aVar.f86539a) && C17542s.e(this.f86540b, aVar.f86540b) && C17542s.e(this.f86541c, aVar.f86541c);
    }

    public int hashCode() {
        return (((this.f86539a.hashCode() * 31) + this.f86540b.hashCode()) * 31) + this.f86541c.hashCode();
    }

    public String toString() {
        String str = this.f86539a;
        String str2 = this.f86540b;
        Map<String, String> map = this.f86541c;
        return "HostedLandingPage(domain=" + str + ", clientId=" + str2 + ", parameters=" + map + ")";
    }
}
