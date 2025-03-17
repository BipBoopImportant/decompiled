package Mi;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0014\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0013\u0010\t¨\u0006\u0015"}, d2 = {"LMi/d;", "", "", "noticeLinkText", "noticeTitle", "noticeText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "ratingsandreviews-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Mi.d  reason: case insensitive filesystem */
public final class C10769d {

    /* renamed from: a  reason: collision with root package name */
    private final String f83382a;

    /* renamed from: b  reason: collision with root package name */
    private final String f83383b;

    /* renamed from: c  reason: collision with root package name */
    private final String f83384c;

    public C10769d(String str, String str2, String str3) {
        C17542s.j(str, "noticeLinkText");
        C17542s.j(str2, "noticeTitle");
        C17542s.j(str3, "noticeText");
        this.f83382a = str;
        this.f83383b = str2;
        this.f83384c = str3;
    }

    public final String a() {
        return this.f83382a;
    }

    public final String b() {
        return this.f83384c;
    }

    public final String c() {
        return this.f83383b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10769d)) {
            return false;
        }
        C10769d dVar = (C10769d) obj;
        return C17542s.e(this.f83382a, dVar.f83382a) && C17542s.e(this.f83383b, dVar.f83383b) && C17542s.e(this.f83384c, dVar.f83384c);
    }

    public int hashCode() {
        return (((this.f83382a.hashCode() * 31) + this.f83383b.hashCode()) * 31) + this.f83384c.hashCode();
    }

    public String toString() {
        String str = this.f83382a;
        String str2 = this.f83383b;
        String str3 = this.f83384c;
        return "LegalInfo(noticeLinkText=" + str + ", noticeTitle=" + str2 + ", noticeText=" + str3 + ")";
    }
}
