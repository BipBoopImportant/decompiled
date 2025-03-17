package Sx;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0017\u0010\u001aR#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0014\u0010\u001d¨\u0006\u001e"}, d2 = {"LSx/c;", "", "", "id", "type", "", "timeSent", "", "data", "<init>", "(Ljava/lang/String;Ljava/lang/String;JLjava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "b", "c", "J", "()J", "d", "Ljava/util/Map;", "()Ljava/util/Map;", "pushnotification-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final String f116630a;

    /* renamed from: b  reason: collision with root package name */
    private final String f116631b;

    /* renamed from: c  reason: collision with root package name */
    private final long f116632c;

    /* renamed from: d  reason: collision with root package name */
    private final Map<String, String> f116633d;

    public c(String str, String str2, long j10, Map<String, String> map) {
        C17542s.j(str, "id");
        C17542s.j(str2, "type");
        C17542s.j(map, "data");
        this.f116630a = str;
        this.f116631b = str2;
        this.f116632c = j10;
        this.f116633d = map;
    }

    public final Map<String, String> a() {
        return this.f116633d;
    }

    public final long b() {
        return this.f116632c;
    }

    public final String c() {
        return this.f116631b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return C17542s.e(this.f116630a, cVar.f116630a) && C17542s.e(this.f116631b, cVar.f116631b) && this.f116632c == cVar.f116632c && C17542s.e(this.f116633d, cVar.f116633d);
    }

    public int hashCode() {
        return (((((this.f116630a.hashCode() * 31) + this.f116631b.hashCode()) * 31) + Long.hashCode(this.f116632c)) * 31) + this.f116633d.hashCode();
    }

    public String toString() {
        String str = this.f116630a;
        String str2 = this.f116631b;
        long j10 = this.f116632c;
        Map<String, String> map = this.f116633d;
        return "PushMessage(id=" + str + ", type=" + str2 + ", timeSent=" + j10 + ", data=" + map + ")";
    }
}
