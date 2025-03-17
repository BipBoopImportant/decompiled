package Ys;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0017\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0018\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0013\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0016\u0010\u000b¨\u0006\u0019"}, d2 = {"LYs/j;", "", "", "utmId", "utmSource", "utmMedium", "utmCampaign", "utmContent", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "e", "d", "installreferrer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class j {

    /* renamed from: a  reason: collision with root package name */
    private final String f89750a;

    /* renamed from: b  reason: collision with root package name */
    private final String f89751b;

    /* renamed from: c  reason: collision with root package name */
    private final String f89752c;

    /* renamed from: d  reason: collision with root package name */
    private final String f89753d;

    /* renamed from: e  reason: collision with root package name */
    private final String f89754e;

    public j(String str, String str2, String str3, String str4, String str5) {
        C17542s.j(str, "utmId");
        C17542s.j(str2, "utmSource");
        C17542s.j(str3, "utmMedium");
        C17542s.j(str4, "utmCampaign");
        C17542s.j(str5, "utmContent");
        this.f89750a = str;
        this.f89751b = str2;
        this.f89752c = str3;
        this.f89753d = str4;
        this.f89754e = str5;
    }

    public final String a() {
        return this.f89753d;
    }

    public final String b() {
        return this.f89754e;
    }

    public final String c() {
        return this.f89750a;
    }

    public final String d() {
        return this.f89752c;
    }

    public final String e() {
        return this.f89751b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return C17542s.e(this.f89750a, jVar.f89750a) && C17542s.e(this.f89751b, jVar.f89751b) && C17542s.e(this.f89752c, jVar.f89752c) && C17542s.e(this.f89753d, jVar.f89753d) && C17542s.e(this.f89754e, jVar.f89754e);
    }

    public int hashCode() {
        return (((((((this.f89750a.hashCode() * 31) + this.f89751b.hashCode()) * 31) + this.f89752c.hashCode()) * 31) + this.f89753d.hashCode()) * 31) + this.f89754e.hashCode();
    }

    public String toString() {
        String str = this.f89750a;
        String str2 = this.f89751b;
        String str3 = this.f89752c;
        String str4 = this.f89753d;
        String str5 = this.f89754e;
        return "UtmParameters(utmId=" + str + ", utmSource=" + str2 + ", utmMedium=" + str3 + ", utmCampaign=" + str4 + ", utmContent=" + str5 + ")";
    }
}
