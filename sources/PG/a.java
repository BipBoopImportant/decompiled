package Pg;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0013\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0016\u0010\u000b¨\u0006\u001a"}, d2 = {"LPg/a;", "", "", "itemNo", "imageUrl", "", "timestamp", "productName", "<init>", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "J", "d", "()J", "localhistory_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final String f62798a;

    /* renamed from: b  reason: collision with root package name */
    private final String f62799b;

    /* renamed from: c  reason: collision with root package name */
    private final long f62800c;

    /* renamed from: d  reason: collision with root package name */
    private final String f62801d;

    public a(String str, String str2, long j10, String str3) {
        C17542s.j(str, "itemNo");
        C17542s.j(str2, "imageUrl");
        C17542s.j(str3, "productName");
        this.f62798a = str;
        this.f62799b = str2;
        this.f62800c = j10;
        this.f62801d = str3;
    }

    public final String a() {
        return this.f62799b;
    }

    public final String b() {
        return this.f62798a;
    }

    public final String c() {
        return this.f62801d;
    }

    public final long d() {
        return this.f62800c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return C17542s.e(this.f62798a, aVar.f62798a) && C17542s.e(this.f62799b, aVar.f62799b) && this.f62800c == aVar.f62800c && C17542s.e(this.f62801d, aVar.f62801d);
    }

    public int hashCode() {
        return (((((this.f62798a.hashCode() * 31) + this.f62799b.hashCode()) * 31) + Long.hashCode(this.f62800c)) * 31) + this.f62801d.hashCode();
    }

    public String toString() {
        String str = this.f62798a;
        String str2 = this.f62799b;
        long j10 = this.f62800c;
        String str3 = this.f62801d;
        return "LocalRecentProductEntity(itemNo=" + str + ", imageUrl=" + str2 + ", timestamp=" + j10 + ", productName=" + str3 + ")";
    }
}
