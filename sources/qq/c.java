package Qq;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0013\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u0017\u0010\u000bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0014\u001a\u0004\b\u0016\u0010\u000b¨\u0006\u001b"}, d2 = {"LQq/c;", "", "", "id", "amount", "datetime", "title", "subtitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "b", "c", "getDatetime", "d", "e", "familyrewards-datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final String f86116a;

    /* renamed from: b  reason: collision with root package name */
    private final String f86117b;

    /* renamed from: c  reason: collision with root package name */
    private final String f86118c;

    /* renamed from: d  reason: collision with root package name */
    private final String f86119d;

    /* renamed from: e  reason: collision with root package name */
    private final String f86120e;

    public c(String str, String str2, String str3, String str4, String str5) {
        C17542s.j(str, "id");
        C17542s.j(str2, "amount");
        C17542s.j(str3, "datetime");
        C17542s.j(str4, "title");
        this.f86116a = str;
        this.f86117b = str2;
        this.f86118c = str3;
        this.f86119d = str4;
        this.f86120e = str5;
    }

    public final String a() {
        return this.f86117b;
    }

    public final String b() {
        return this.f86120e;
    }

    public final String c() {
        return this.f86119d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return C17542s.e(this.f86116a, cVar.f86116a) && C17542s.e(this.f86117b, cVar.f86117b) && C17542s.e(this.f86118c, cVar.f86118c) && C17542s.e(this.f86119d, cVar.f86119d) && C17542s.e(this.f86120e, cVar.f86120e);
    }

    public int hashCode() {
        int hashCode = ((((((this.f86116a.hashCode() * 31) + this.f86117b.hashCode()) * 31) + this.f86118c.hashCode()) * 31) + this.f86119d.hashCode()) * 31;
        String str = this.f86120e;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.f86116a;
        String str2 = this.f86117b;
        String str3 = this.f86118c;
        String str4 = this.f86119d;
        String str5 = this.f86120e;
        return "Event(id=" + str + ", amount=" + str2 + ", datetime=" + str3 + ", title=" + str4 + ", subtitle=" + str5 + ")";
    }
}
