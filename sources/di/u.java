package di;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u0019\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u001a\u0010\fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u0014\u0010\fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0017\u0010\f¨\u0006\u001b"}, d2 = {"Ldi/u;", "", "", "header", "title", "description", "productNo", "aisle", "bin", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "d", "b", "f", "c", "e", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class u {

    /* renamed from: a  reason: collision with root package name */
    private final String f72536a;

    /* renamed from: b  reason: collision with root package name */
    private final String f72537b;

    /* renamed from: c  reason: collision with root package name */
    private final String f72538c;

    /* renamed from: d  reason: collision with root package name */
    private final String f72539d;

    /* renamed from: e  reason: collision with root package name */
    private final String f72540e;

    /* renamed from: f  reason: collision with root package name */
    private final String f72541f;

    public u(String str, String str2, String str3, String str4, String str5, String str6) {
        C17542s.j(str, "header");
        C17542s.j(str2, "title");
        C17542s.j(str4, "productNo");
        this.f72536a = str;
        this.f72537b = str2;
        this.f72538c = str3;
        this.f72539d = str4;
        this.f72540e = str5;
        this.f72541f = str6;
    }

    public final String a() {
        return this.f72540e;
    }

    public final String b() {
        return this.f72541f;
    }

    public final String c() {
        return this.f72538c;
    }

    public final String d() {
        return this.f72536a;
    }

    public final String e() {
        return this.f72539d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return C17542s.e(this.f72536a, uVar.f72536a) && C17542s.e(this.f72537b, uVar.f72537b) && C17542s.e(this.f72538c, uVar.f72538c) && C17542s.e(this.f72539d, uVar.f72539d) && C17542s.e(this.f72540e, uVar.f72540e) && C17542s.e(this.f72541f, uVar.f72541f);
    }

    public final String f() {
        return this.f72537b;
    }

    public int hashCode() {
        int hashCode = ((this.f72536a.hashCode() * 31) + this.f72537b.hashCode()) * 31;
        String str = this.f72538c;
        int i10 = 0;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f72539d.hashCode()) * 31;
        String str2 = this.f72540e;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f72541f;
        if (str3 != null) {
            i10 = str3.hashCode();
        }
        return hashCode3 + i10;
    }

    public String toString() {
        String str = this.f72536a;
        String str2 = this.f72537b;
        String str3 = this.f72538c;
        String str4 = this.f72539d;
        String str5 = this.f72540e;
        String str6 = this.f72541f;
        return "Location(header=" + str + ", title=" + str2 + ", description=" + str3 + ", productNo=" + str4 + ", aisle=" + str5 + ", bin=" + str6 + ")";
    }
}
