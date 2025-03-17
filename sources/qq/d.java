package Qq;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0014\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0019\u0010\u000fR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0017\u0010\u001c¨\u0006\u001d"}, d2 = {"LQq/d;", "", "", "title", "description", "", "amount", "", "LQq/f;", "expiringKeys", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/util/List;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "I", "getAmount", "d", "Ljava/util/List;", "()Ljava/util/List;", "familyrewards-datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final String f86121a;

    /* renamed from: b  reason: collision with root package name */
    private final String f86122b;

    /* renamed from: c  reason: collision with root package name */
    private final int f86123c;

    /* renamed from: d  reason: collision with root package name */
    private final List<f> f86124d;

    public d(String str, String str2, int i10, List<f> list) {
        C17542s.j(str, "title");
        C17542s.j(str2, "description");
        C17542s.j(list, "expiringKeys");
        this.f86121a = str;
        this.f86122b = str2;
        this.f86123c = i10;
        this.f86124d = list;
    }

    public final String a() {
        return this.f86122b;
    }

    public final List<f> b() {
        return this.f86124d;
    }

    public final String c() {
        return this.f86121a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return C17542s.e(this.f86121a, dVar.f86121a) && C17542s.e(this.f86122b, dVar.f86122b) && this.f86123c == dVar.f86123c && C17542s.e(this.f86124d, dVar.f86124d);
    }

    public int hashCode() {
        return (((((this.f86121a.hashCode() * 31) + this.f86122b.hashCode()) * 31) + Integer.hashCode(this.f86123c)) * 31) + this.f86124d.hashCode();
    }

    public String toString() {
        String str = this.f86121a;
        String str2 = this.f86122b;
        int i10 = this.f86123c;
        List<f> list = this.f86124d;
        return "ExpirationDetails(title=" + str + ", description=" + str2 + ", amount=" + i10 + ", expiringKeys=" + list + ")";
    }
}
