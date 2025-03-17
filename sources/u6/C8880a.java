package u6;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001a\u0010\fR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u001b\u0010\fR\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u0017\u0010\f¨\u0006\u001d"}, d2 = {"Lu6/a;", "", "", "amount", "", "redirectUri", "merchantId", "brandId", "jwt", "<init>", "(DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "D", "()D", "b", "Ljava/lang/String;", "d", "c", "getBrandId", "e", "afterpay_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* renamed from: u6.a  reason: case insensitive filesystem */
public final class C8880a {

    /* renamed from: a  reason: collision with root package name */
    private final double f56845a;

    /* renamed from: b  reason: collision with root package name */
    private final String f56846b;

    /* renamed from: c  reason: collision with root package name */
    private final String f56847c;

    /* renamed from: d  reason: collision with root package name */
    private final String f56848d;

    /* renamed from: e  reason: collision with root package name */
    private final String f56849e;

    public C8880a(double d10, String str, String str2, String str3, String str4) {
        C17542s.j(str, "redirectUri");
        C17542s.j(str2, "merchantId");
        C17542s.j(str3, "brandId");
        C17542s.j(str4, "jwt");
        this.f56845a = d10;
        this.f56846b = str;
        this.f56847c = str2;
        this.f56848d = str3;
        this.f56849e = str4;
    }

    public final double a() {
        return this.f56845a;
    }

    public final String b() {
        return this.f56849e;
    }

    public final String c() {
        return this.f56847c;
    }

    public final String d() {
        return this.f56846b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8880a)) {
            return false;
        }
        C8880a aVar = (C8880a) obj;
        return Double.compare(this.f56845a, aVar.f56845a) == 0 && C17542s.e(this.f56846b, aVar.f56846b) && C17542s.e(this.f56847c, aVar.f56847c) && C17542s.e(this.f56848d, aVar.f56848d) && C17542s.e(this.f56849e, aVar.f56849e);
    }

    public int hashCode() {
        return (((((((Double.hashCode(this.f56845a) * 31) + this.f56846b.hashCode()) * 31) + this.f56847c.hashCode()) * 31) + this.f56848d.hashCode()) * 31) + this.f56849e.hashCode();
    }

    public String toString() {
        return "AfterpayCashApp(amount=" + this.f56845a + ", redirectUri=" + this.f56846b + ", merchantId=" + this.f56847c + ", brandId=" + this.f56848d + ", jwt=" + this.f56849e + ')';
    }
}
