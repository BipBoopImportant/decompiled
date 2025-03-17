package cE;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u0014\u0010\fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0017\u0010\fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u001a\u0010\fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u0019\u0010\f¨\u0006\u001b"}, d2 = {"LcE/b;", "", "", "messageId", "title", "body", "imageUrl", "videoUrl", "mediaContentDescription", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "d", "b", "e", "c", "f", "whatsnew-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: cE.b  reason: case insensitive filesystem */
public final class C14034b {

    /* renamed from: a  reason: collision with root package name */
    private final String f119121a;

    /* renamed from: b  reason: collision with root package name */
    private final String f119122b;

    /* renamed from: c  reason: collision with root package name */
    private final String f119123c;

    /* renamed from: d  reason: collision with root package name */
    private final String f119124d;

    /* renamed from: e  reason: collision with root package name */
    private final String f119125e;

    /* renamed from: f  reason: collision with root package name */
    private final String f119126f;

    public C14034b(String str, String str2, String str3, String str4, String str5, String str6) {
        C17542s.j(str, "messageId");
        C17542s.j(str2, "title");
        C17542s.j(str3, "body");
        this.f119121a = str;
        this.f119122b = str2;
        this.f119123c = str3;
        this.f119124d = str4;
        this.f119125e = str5;
        this.f119126f = str6;
    }

    public final String a() {
        return this.f119123c;
    }

    public final String b() {
        return this.f119124d;
    }

    public final String c() {
        return this.f119126f;
    }

    public final String d() {
        return this.f119121a;
    }

    public final String e() {
        return this.f119122b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14034b)) {
            return false;
        }
        C14034b bVar = (C14034b) obj;
        return C17542s.e(this.f119121a, bVar.f119121a) && C17542s.e(this.f119122b, bVar.f119122b) && C17542s.e(this.f119123c, bVar.f119123c) && C17542s.e(this.f119124d, bVar.f119124d) && C17542s.e(this.f119125e, bVar.f119125e) && C17542s.e(this.f119126f, bVar.f119126f);
    }

    public final String f() {
        return this.f119125e;
    }

    public int hashCode() {
        int hashCode = ((((this.f119121a.hashCode() * 31) + this.f119122b.hashCode()) * 31) + this.f119123c.hashCode()) * 31;
        String str = this.f119124d;
        int i10 = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f119125e;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f119126f;
        if (str3 != null) {
            i10 = str3.hashCode();
        }
        return hashCode3 + i10;
    }

    public String toString() {
        String str = this.f119121a;
        String str2 = this.f119122b;
        String str3 = this.f119123c;
        String str4 = this.f119124d;
        String str5 = this.f119125e;
        String str6 = this.f119126f;
        return "WhatsNewMessageUiModel(messageId=" + str + ", title=" + str2 + ", body=" + str3 + ", imageUrl=" + str4 + ", videoUrl=" + str5 + ", mediaContentDescription=" + str6 + ")";
    }
}
