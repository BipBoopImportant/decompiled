package T5;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\u0018\u00002\u00020\u0001BK\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0018\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u0019\u0010\u0014R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0015\u0010\u0014R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u0017\u0010\u0014R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u0014R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0016\u001a\u0004\b\u001e\u0010\u0014¨\u0006\u001f"}, d2 = {"LT5/G;", "", "", "data", "separator", "scheme", "authority", "path", "query", "fragment", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "d", "c", "e", "f", "getQuery", "g", "getFragment", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class G {

    /* renamed from: a  reason: collision with root package name */
    private final String f40015a;

    /* renamed from: b  reason: collision with root package name */
    private final String f40016b;

    /* renamed from: c  reason: collision with root package name */
    private final String f40017c;

    /* renamed from: d  reason: collision with root package name */
    private final String f40018d;

    /* renamed from: e  reason: collision with root package name */
    private final String f40019e;

    /* renamed from: f  reason: collision with root package name */
    private final String f40020f;

    /* renamed from: g  reason: collision with root package name */
    private final String f40021g;

    public G(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f40015a = str;
        this.f40016b = str2;
        this.f40017c = str3;
        this.f40018d = str4;
        this.f40019e = str5;
        this.f40020f = str6;
        this.f40021g = str7;
    }

    public final String a() {
        return this.f40018d;
    }

    public final String b() {
        return this.f40019e;
    }

    public final String c() {
        return this.f40017c;
    }

    public final String d() {
        return this.f40016b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof G) && C17542s.e(((G) obj).f40015a, this.f40015a);
    }

    public int hashCode() {
        return this.f40015a.hashCode();
    }

    public String toString() {
        return this.f40015a;
    }
}
