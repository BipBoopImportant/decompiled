package p000if;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0012\u0010\b¨\u0006\u0013"}, d2 = {"Lif/a;", "", "", "title", "url", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "profile-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: if.a  reason: invalid package */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final String f74286a;

    /* renamed from: b  reason: collision with root package name */
    private final String f74287b;

    public a(String str, String str2) {
        C17542s.j(str, "title");
        C17542s.j(str2, "url");
        this.f74286a = str;
        this.f74287b = str2;
    }

    public final String a() {
        return this.f74286a;
    }

    public final String b() {
        return this.f74287b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return C17542s.e(this.f74286a, aVar.f74286a) && C17542s.e(this.f74287b, aVar.f74287b);
    }

    public int hashCode() {
        return (this.f74286a.hashCode() * 31) + this.f74287b.hashCode();
    }

    public String toString() {
        String str = this.f74286a;
        String str2 = this.f74287b;
        return "Link(title=" + str + ", url=" + str2 + ")";
    }
}
